package typingsSlinky.cordovaPluginGlobalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Pattern to format and parse numbers according to the client's user preferences. */
@js.native
trait GlobalizationNumberPattern extends StObject {
  
  /* The decimal symbol to use for parsing and formatting. */
  var decimal: String = js.native
  
  /* The number of fractional digits to use when parsing and formatting numbers. */
  var fraction: Double = js.native
  
  /* The grouping symbol to use for parsing and formatting. */
  var grouping: String = js.native
  
  /* The symbol to use for negative numbers when parsing and formatting. */
  var negative: String = js.native
  
  /* The number pattern to format and parse numbers. The patterns follow Unicode Technical Standard #35. */
  var pattern: String = js.native
  
  /* The symbol to use for positive numbers when parsing and formatting. */
  var positive: String = js.native
  
  /* The rounding increment to use when parsing and formatting. */
  var rounding: Double = js.native
  
  /* The symbol to use when formatting and parsing, such as a percent or currency symbol. */
  var symbol: String = js.native
}
object GlobalizationNumberPattern {
  
  @scala.inline
  def apply(
    decimal: String,
    fraction: Double,
    grouping: String,
    negative: String,
    pattern: String,
    positive: String,
    rounding: Double,
    symbol: String
  ): GlobalizationNumberPattern = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], fraction = fraction.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], rounding = rounding.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalizationNumberPattern]
  }
  
  @scala.inline
  implicit class GlobalizationNumberPatternMutableBuilder[Self <: GlobalizationNumberPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFraction(value: Double): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrouping(value: String): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegative(value: String): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositive(value: String): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRounding(value: Double): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
