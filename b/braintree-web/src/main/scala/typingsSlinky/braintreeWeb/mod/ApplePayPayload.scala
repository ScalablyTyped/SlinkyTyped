package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplePayPayload extends js.Object {
  var displayName: String = js.native
  var domainName: String = js.native
  var merchantIdentifier: String = js.native
}

object ApplePayPayload {
  @scala.inline
  def apply(displayName: String, domainName: String, merchantIdentifier: String): ApplePayPayload = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], merchantIdentifier = merchantIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPayload]
  }
  @scala.inline
  implicit class ApplePayPayloadOps[Self <: ApplePayPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerchantIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

