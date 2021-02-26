package typingsSlinky.braintreeWebDropIn.mod

import typingsSlinky.braintreeWebDropIn.anon.PartialButtonStyle
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.checkout
import typingsSlinky.braintreeWebDropIn.braintreeWebDropInStrings.vault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait paypalCreateOptions extends StObject {
  
  var amount: js.UndefOr[String | Double] = js.native
  
  var buttonStyle: js.UndefOr[PartialButtonStyle] = js.native
  
  var commit: js.UndefOr[Boolean] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var flow: checkout | vault = js.native
}
object paypalCreateOptions {
  
  @scala.inline
  def apply(flow: checkout | vault): paypalCreateOptions = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[paypalCreateOptions]
  }
  
  @scala.inline
  implicit class paypalCreateOptionsMutableBuilder[Self <: paypalCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String | Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setButtonStyle(value: PartialButtonStyle): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
    
    @scala.inline
    def setCommit(value: Boolean): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setFlow(value: checkout | vault): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
  }
}
