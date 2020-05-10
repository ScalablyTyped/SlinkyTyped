package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreditCardGateway extends js.Object {
  def create(request: CreditCardCreateRequest): js.Promise[ValidatedResponse[CreditCard]] = js.native
  def delete(creditCardToken: String): js.Promise[Unit] = js.native
  def expiringBetween(startDate: js.Date, endDate: js.Date): js.Promise[CreditCard] = js.native
  def find(creditCardToken: String): js.Promise[CreditCard] = js.native
  def update(creditCardToken: String, updates: CreditCardUpdateRequest): js.Promise[ValidatedResponse[CreditCard]] = js.native
}

object CreditCardGateway {
  @scala.inline
  def apply(
    create: CreditCardCreateRequest => js.Promise[ValidatedResponse[CreditCard]],
    delete: String => js.Promise[Unit],
    expiringBetween: (js.Date, js.Date) => js.Promise[CreditCard],
    find: String => js.Promise[CreditCard],
    update: (String, CreditCardUpdateRequest) => js.Promise[ValidatedResponse[CreditCard]]
  ): CreditCardGateway = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), expiringBetween = js.Any.fromFunction2(expiringBetween), find = js.Any.fromFunction1(find), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[CreditCardGateway]
  }
  @scala.inline
  implicit class CreditCardGatewayOps[Self <: CreditCardGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: CreditCardCreateRequest => js.Promise[ValidatedResponse[CreditCard]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpiringBetween(value: (js.Date, js.Date) => js.Promise[CreditCard]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiringBetween")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFind(value: String => js.Promise[CreditCard]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (String, CreditCardUpdateRequest) => js.Promise[ValidatedResponse[CreditCard]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

