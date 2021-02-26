package typingsSlinky.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentPortal extends StObject {
  
  /** The HTTP method to use for the payment portal. */
  var Method: String = js.native
  
  /** The payment portal URL. */
  var Url: js.UndefOr[String] = js.native
}
object PaymentPortal {
  
  @scala.inline
  def apply(Method: String): PaymentPortal = {
    val __obj = js.Dynamic.literal(Method = Method.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentPortal]
  }
  
  @scala.inline
  implicit class PaymentPortalMutableBuilder[Self <: PaymentPortal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "Method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
