package typingsSlinky.cordovaPluginGlobalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Pattern to format and parse numbers according to the client's user preferences. */
@js.native
trait GlobalizationNumberPattern extends js.Object {
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
  implicit class GlobalizationNumberPatternOps[Self <: GlobalizationNumberPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFraction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrouping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegative(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRounding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rounding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

