package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payment extends StObject {
  
  /**
    * The identifier of the purchased product.
    */
  var productIdentifier: String = js.native
  
  /**
    * The quantity purchased.
    */
  var quantity: Double = js.native
}
object Payment {
  
  @scala.inline
  def apply(productIdentifier: String, quantity: Double): Payment = {
    val __obj = js.Dynamic.literal(productIdentifier = productIdentifier.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payment]
  }
  
  @scala.inline
  implicit class PaymentMutableBuilder[Self <: Payment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductIdentifier(value: String): Self = StObject.set(x, "productIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
  }
}
