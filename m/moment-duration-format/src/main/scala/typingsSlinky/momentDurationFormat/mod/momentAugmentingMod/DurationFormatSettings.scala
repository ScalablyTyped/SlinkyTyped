package typingsSlinky.momentDurationFormat.mod.momentAugmentingMod

import typingsSlinky.momentDurationFormat.momentDurationFormatBooleans.`false`
import typingsSlinky.momentDurationFormat.momentDurationFormatBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurationFormatSettings extends js.Object {
  var decimalSeparator: js.UndefOr[String] = js.native
  var forceLength: js.UndefOr[Boolean] = js.native
  var grouping: js.UndefOr[js.Array[Double]] = js.native
  var groupingSeparator: js.UndefOr[String] = js.native
  var largest: js.UndefOr[Double] = js.native
  var maxValue: js.UndefOr[Double] = js.native
  var minValue: js.UndefOr[Double] = js.native
  var precision: js.UndefOr[Double] = js.native
  var stopTrim: js.UndefOr[String] = js.native
  var template: js.UndefOr[String | TemplateFunction] = js.native
  var trim: js.UndefOr[`false` | UnitOfTrimV1 | UnitOfTrim | String | (js.Array[UnitOfTrim | String])] = js.native
  var trunc: js.UndefOr[`true`] = js.native
  var useGrouping: js.UndefOr[Boolean] = js.native
  var useLeftUnits: js.UndefOr[Boolean] = js.native
  var usePlural: js.UndefOr[Boolean] = js.native
  var useSignificantDigits: js.UndefOr[`true`] = js.native
  var useToLocaleString: js.UndefOr[Boolean] = js.native
  var userLocale: js.UndefOr[String] = js.native
}

object DurationFormatSettings {
  @scala.inline
  def apply(): DurationFormatSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationFormatSettings]
  }
  @scala.inline
  implicit class DurationFormatSettingsOps[Self <: DurationFormatSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withForceLength(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceLength")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouping(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupingSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupingSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingSeparator")(js.undefined)
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
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withStopTrim(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTrim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTrim")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String | TemplateFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: `false` | UnitOfTrimV1 | UnitOfTrim | String | (js.Array[UnitOfTrim | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
    @scala.inline
    def withTrunc(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trunc")(js.undefined)
        ret
    }
    @scala.inline
    def withUseGrouping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLeftUnits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLeftUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLeftUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLeftUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePlural(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePlural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePlural: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePlural")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSignificantDigits(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSignificantDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSignificantDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSignificantDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withUseToLocaleString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useToLocaleString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseToLocaleString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useToLocaleString")(js.undefined)
        ret
    }
    @scala.inline
    def withUserLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLocale")(js.undefined)
        ret
    }
  }
  
}

