package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliveryOptions extends StObject {
  
  /**
    * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is Require, messages are only delivered if a TLS connection can be established. If the value is Optional, messages can be delivered in plain text if a TLS connection can't be established.
    */
  var TlsPolicy: js.UndefOr[typingsSlinky.awsSdk.sesMod.TlsPolicy] = js.native
}
object DeliveryOptions {
  
  @scala.inline
  def apply(): DeliveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryOptions]
  }
  
  @scala.inline
  implicit class DeliveryOptionsMutableBuilder[Self <: DeliveryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTlsPolicy(value: TlsPolicy): Self = StObject.set(x, "TlsPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsPolicyUndefined: Self = StObject.set(x, "TlsPolicy", js.undefined)
  }
}
