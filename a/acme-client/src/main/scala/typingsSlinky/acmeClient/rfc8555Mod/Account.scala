package typingsSlinky.acmeClient.rfc8555Mod

import typingsSlinky.acmeClient.acmeClientStrings.deactivated
import typingsSlinky.acmeClient.acmeClientStrings.revoked
import typingsSlinky.acmeClient.acmeClientStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  var contact: js.UndefOr[js.Array[String]] = js.native
  var externalAccountBinding: js.UndefOr[js.Object] = js.native
  var orders: String = js.native
  var status: valid | deactivated | revoked = js.native
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.native
}

object Account {
  @scala.inline
  def apply(orders: String, status: valid | deactivated | revoked): Account = {
    val __obj = js.Dynamic.literal(orders = orders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrders(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: valid | deactivated | revoked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContact(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalAccountBinding(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalAccountBinding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalAccountBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalAccountBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withTermsOfServiceAgreed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsOfServiceAgreed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTermsOfServiceAgreed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsOfServiceAgreed")(js.undefined)
        ret
    }
  }
  
}

