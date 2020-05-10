package typingsSlinky.humanizeDuration.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * String to include before the final unit. You can also set serialComma to false to eliminate the final comma.
    */
  var conjunction: js.UndefOr[String] = js.native
  /**
    * String to substitute for the decimal point in a decimal fraction.
    */
  var decimal: js.UndefOr[String] = js.native
  /**
    * String to display between the previous unit and the next value.
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * Fallback languages if the provided language cannot be found (accepts an ISO 639-1 code from one of the supported languages). It works from left to right.
    */
  var fallbacks: js.UndefOr[js.Array[String]] = js.native
  /**
    * Language for unit display (accepts an ISO 639-1 code from one of the supported languages).
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Number representing the maximum number of units to display for the duration.
    */
  var largest: js.UndefOr[Double] = js.native
  /**
    * Number that defines a maximal decimal points for float values.
    */
  var maxDecimalPoints: js.UndefOr[Double] = js.native
  /**
    * Boolean value. Use true to round the smallest unit displayed (can be combined with largest and units).
    */
  var round: js.UndefOr[Boolean] = js.native
  var serialComma: js.UndefOr[Boolean] = js.native
  /**
    * String to display between each value and unit.
    */
  var spacer: js.UndefOr[String] = js.native
  /**
    * Customize the value used to calculate each unit of time.
    */
  var unitMeasures: js.UndefOr[UnitMeasuresOptions] = js.native
  /**
    * Array of strings to define which units are used to display the duration (if needed).
    */
  var units: js.UndefOr[js.Array[Unit]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConjunction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConjunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjunction")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbacks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLargest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largest")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDecimalPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDecimalPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDecimalPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDecimalPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withRound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialComma(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialComma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialComma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialComma")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacer")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitMeasures(value: UnitMeasuresOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitMeasures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitMeasures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitMeasures")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: js.Array[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
  }
  
}

