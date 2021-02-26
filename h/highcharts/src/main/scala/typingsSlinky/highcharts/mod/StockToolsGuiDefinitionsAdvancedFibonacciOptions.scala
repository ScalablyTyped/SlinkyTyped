package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockToolsGuiDefinitionsAdvancedFibonacciOptions extends StObject {
  
  /**
    * (Highstock) A predefined background symbol for the button.
    */
  var symbol: js.UndefOr[String] = js.native
}
object StockToolsGuiDefinitionsAdvancedFibonacciOptions {
  
  @scala.inline
  def apply(): StockToolsGuiDefinitionsAdvancedFibonacciOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsAdvancedFibonacciOptions]
  }
  
  @scala.inline
  implicit class StockToolsGuiDefinitionsAdvancedFibonacciOptionsMutableBuilder[Self <: StockToolsGuiDefinitionsAdvancedFibonacciOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
