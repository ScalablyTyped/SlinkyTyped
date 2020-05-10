package typingsSlinky.braintree.mod

import typingsSlinky.braintree.AnonAllowVaulting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethodGateway extends js.Object {
  def create(request: PaymentMethodCreateRequest): js.Promise[ValidatedResponse[PaymentMethod]] = js.native
  def delete(token: String): js.Promise[Unit] = js.native
  def find(token: String): js.Promise[PaymentMethod] = js.native
  def grant(sharedPaymentMethodToken: String, options: AnonAllowVaulting): js.Promise[ValidatedResponse[PaymentMethodNonce]] = js.native
  def revoke(sharedPaymentMethodToken: String): js.Promise[Unit] = js.native
  def update(token: String, updates: PaymentMethodUpdateRequest): js.Promise[ValidatedResponse[PaymentMethod]] = js.native
}

object PaymentMethodGateway {
  @scala.inline
  def apply(
    create: PaymentMethodCreateRequest => js.Promise[ValidatedResponse[PaymentMethod]],
    delete: String => js.Promise[Unit],
    find: String => js.Promise[PaymentMethod],
    grant: (String, AnonAllowVaulting) => js.Promise[ValidatedResponse[PaymentMethodNonce]],
    revoke: String => js.Promise[Unit],
    update: (String, PaymentMethodUpdateRequest) => js.Promise[ValidatedResponse[PaymentMethod]]
  ): PaymentMethodGateway = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), find = js.Any.fromFunction1(find), grant = js.Any.fromFunction2(grant), revoke = js.Any.fromFunction1(revoke), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[PaymentMethodGateway]
  }
  @scala.inline
  implicit class PaymentMethodGatewayOps[Self <: PaymentMethodGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: PaymentMethodCreateRequest => js.Promise[ValidatedResponse[PaymentMethod]]): Self = {
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
    def withFind(value: String => js.Promise[PaymentMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGrant(value: (String, AnonAllowVaulting) => js.Promise[ValidatedResponse[PaymentMethodNonce]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grant")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRevoke(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revoke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (String, PaymentMethodUpdateRequest) => js.Promise[ValidatedResponse[PaymentMethod]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

