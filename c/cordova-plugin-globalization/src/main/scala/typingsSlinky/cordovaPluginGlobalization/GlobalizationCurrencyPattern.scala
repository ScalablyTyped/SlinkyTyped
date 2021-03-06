package typingsSlinky.cordovaPluginGlobalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pattern to format and parse currency values according
  * to the client's user preferences and ISO 4217 currency code.
  */
@js.native
trait GlobalizationCurrencyPattern extends StObject {
  
  /** The ISO 4217 currency code for the pattern. */
  var code: String = js.native
  
  /** The decimal symbol to use for parsing and formatting. */
  var decimal: String = js.native
  
  /** The number of fractional digits to use when parsing and formatting currency. */
  var fraction: Double = js.native
  
  /** The grouping symbol to use for parsing and formatting. */
  var grouping: String = js.native
  
  /** The currency pattern to format and parse currency values. The patterns follow Unicode Technical Standard #35. */
  var pattern: String = js.native
  
  /** The rounding increment to use when parsing and formatting. */
  var rounding: Double = js.native
}
object GlobalizationCurrencyPattern {
  
  @scala.inline
  def apply(
    code: String,
    decimal: String,
    fraction: Double,
    grouping: String,
    pattern: String,
    rounding: Double
  ): GlobalizationCurrencyPattern = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], fraction = fraction.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], rounding = rounding.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalizationCurrencyPattern]
  }
  
  @scala.inline
  implicit class GlobalizationCurrencyPatternMutableBuilder[Self <: GlobalizationCurrencyPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFraction(value: Double): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrouping(value: String): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRounding(value: Double): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
  }
}
