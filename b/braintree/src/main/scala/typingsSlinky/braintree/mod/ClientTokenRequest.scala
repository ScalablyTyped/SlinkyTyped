package typingsSlinky.braintree.mod

import typingsSlinky.braintree.AnonFailOnDuplicatePaymentMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientTokenRequest extends js.Object {
  var customerId: js.UndefOr[String] = js.native
  var merchantAccountId: js.UndefOr[String] = js.native
  var options: js.UndefOr[AnonFailOnDuplicatePaymentMethod] = js.native
  var version: js.UndefOr[String] = js.native
}

object ClientTokenRequest {
  @scala.inline
  def apply(): ClientTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientTokenRequest]
  }
  @scala.inline
  implicit class ClientTokenRequestOps[Self <: ClientTokenRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: AnonFailOnDuplicatePaymentMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

