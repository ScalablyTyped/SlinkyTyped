package typingsSlinky.braintreeWeb.applePayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdentifier(value: String): Self = this.set("merchantIdentifier", value.asInstanceOf[js.Any])
  }
}
