package typingsSlinky.powerappsComponentFramework.ComponentFramework.UserSettingApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The interface for the Org System Settings Number Format Info exposed to a custom control
		 * Comments indicate example values
		 */
@js.native
trait NumberFormattingInfo extends js.Object {
  /**
  			 * @example 2
  			 */
  var currencyDecimalDigits: Double = js.native
  /**
  			 * @example "."
  			 */
  var currencyDecimalSeparator: String = js.native
  /**
  			 * @example ","
  			 */
  var currencyGroupSeparator: String = js.native
  /**
  			 * @example [ 3 ]
  			 */
  var currencyGroupSizes: js.Array[Double] = js.native
  /**
  			 * @example 0
  			 */
  var currencyNegativePattern: Double = js.native
  /**
  			 * @example 0
  			 */
  var currencyPositivePattern: Double = js.native
  /**
  			 * @example "$"
  			 */
  var currencySymbol: String = js.native
  /**
  			 * @example "NaN"
  			 */
  var nanSymbol: String = js.native
  /**
  			 * @example { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}
  			 */
  var nativeDigits: js.Array[String] = js.native
  /**
  			 * @example "-Infinity"
  			 */
  var negativeInfinitySymbol: String = js.native
  /**
  			 * @example "-"
  			 */
  var negativeSign: String = js.native
  /**
  			 * @example 2
  			 */
  var numberDecimalDigits: Double = js.native
  /**
  			 * @example "."
  			 */
  var numberDecimalSeparator: String = js.native
  /**
  			 * @example ","
  			 */
  var numberGroupSeparator: String = js.native
  /**
  			 * @example [3]
  			 */
  var numberGroupSizes: js.Array[Double] = js.native
  /**
  			 * @example 1
  			 */
  var numberNegativePattern: Double = js.native
  /**
  			 * @example ""
  			 */
  var perMilleSymbol: String = js.native
  /**
  			 * @example 2
  			 */
  var percentDecimalDigits: Double = js.native
  /**
  			 * @example "."
  			 */
  var percentDecimalSeparator: String = js.native
  /**
  			 * @example ","
  			 */
  var percentGroupSeparator: String = js.native
  /**
  			 * @example [3]
  			 */
  var percentGroupSizes: js.Array[Double] = js.native
  /**
  			 * @example 0
  			 */
  var percentNegativePattern: Double = js.native
  /**
  			 * @example 0
  			 */
  var percentPositivePattern: Double = js.native
  /**
  			 * @example "%"
  			 */
  var percentSymbol: String = js.native
  /**
  			 * @example "Infinity"
  			 */
  var positiveInfinitySymbol: String = js.native
  /**
  			 * @example "+"
  			 */
  var positiveSign: String = js.native
}

object NumberFormattingInfo {
  @scala.inline
  def apply(
    currencyDecimalDigits: Double,
    currencyDecimalSeparator: String,
    currencyGroupSeparator: String,
    currencyGroupSizes: js.Array[Double],
    currencyNegativePattern: Double,
    currencyPositivePattern: Double,
    currencySymbol: String,
    nanSymbol: String,
    nativeDigits: js.Array[String],
    negativeInfinitySymbol: String,
    negativeSign: String,
    numberDecimalDigits: Double,
    numberDecimalSeparator: String,
    numberGroupSeparator: String,
    numberGroupSizes: js.Array[Double],
    numberNegativePattern: Double,
    perMilleSymbol: String,
    percentDecimalDigits: Double,
    percentDecimalSeparator: String,
    percentGroupSeparator: String,
    percentGroupSizes: js.Array[Double],
    percentNegativePattern: Double,
    percentPositivePattern: Double,
    percentSymbol: String,
    positiveInfinitySymbol: String,
    positiveSign: String
  ): NumberFormattingInfo = {
    val __obj = js.Dynamic.literal(currencyDecimalDigits = currencyDecimalDigits.asInstanceOf[js.Any], currencyDecimalSeparator = currencyDecimalSeparator.asInstanceOf[js.Any], currencyGroupSeparator = currencyGroupSeparator.asInstanceOf[js.Any], currencyGroupSizes = currencyGroupSizes.asInstanceOf[js.Any], currencyNegativePattern = currencyNegativePattern.asInstanceOf[js.Any], currencyPositivePattern = currencyPositivePattern.asInstanceOf[js.Any], currencySymbol = currencySymbol.asInstanceOf[js.Any], nanSymbol = nanSymbol.asInstanceOf[js.Any], nativeDigits = nativeDigits.asInstanceOf[js.Any], negativeInfinitySymbol = negativeInfinitySymbol.asInstanceOf[js.Any], negativeSign = negativeSign.asInstanceOf[js.Any], numberDecimalDigits = numberDecimalDigits.asInstanceOf[js.Any], numberDecimalSeparator = numberDecimalSeparator.asInstanceOf[js.Any], numberGroupSeparator = numberGroupSeparator.asInstanceOf[js.Any], numberGroupSizes = numberGroupSizes.asInstanceOf[js.Any], numberNegativePattern = numberNegativePattern.asInstanceOf[js.Any], perMilleSymbol = perMilleSymbol.asInstanceOf[js.Any], percentDecimalDigits = percentDecimalDigits.asInstanceOf[js.Any], percentDecimalSeparator = percentDecimalSeparator.asInstanceOf[js.Any], percentGroupSeparator = percentGroupSeparator.asInstanceOf[js.Any], percentGroupSizes = percentGroupSizes.asInstanceOf[js.Any], percentNegativePattern = percentNegativePattern.asInstanceOf[js.Any], percentPositivePattern = percentPositivePattern.asInstanceOf[js.Any], percentSymbol = percentSymbol.asInstanceOf[js.Any], positiveInfinitySymbol = positiveInfinitySymbol.asInstanceOf[js.Any], positiveSign = positiveSign.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormattingInfo]
  }
  @scala.inline
  implicit class NumberFormattingInfoOps[Self <: NumberFormattingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencyDecimalDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyDecimalDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencyDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyDecimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencyGroupSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyGroupSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencyGroupSizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyGroupSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencyNegativePattern(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyNegativePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencyPositivePattern(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyPositivePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrencySymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNanSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nanSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeDigits(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegativeInfinitySymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeInfinitySymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegativeSign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeSign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberDecimalDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberDecimalDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberDecimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberGroupSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberGroupSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberGroupSizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberGroupSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberNegativePattern(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberNegativePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerMilleSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perMilleSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentDecimalDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentDecimalDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentDecimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentGroupSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentGroupSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentGroupSizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentGroupSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentNegativePattern(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentNegativePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentPositivePattern(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentPositivePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositiveInfinitySymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveInfinitySymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositiveSign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveSign")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

