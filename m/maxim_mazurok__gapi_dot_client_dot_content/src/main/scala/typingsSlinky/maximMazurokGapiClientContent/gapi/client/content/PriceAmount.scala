package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PriceAmount extends StObject {
  
  /** The currency of the price. */
  var currency: js.UndefOr[String] = js.native
  
  /** The price represented as a number. */
  var value: js.UndefOr[String] = js.native
}
object PriceAmount {
  
  @scala.inline
  def apply(): PriceAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriceAmount]
  }
  
  @scala.inline
  implicit class PriceAmountMutableBuilder[Self <: PriceAmount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
