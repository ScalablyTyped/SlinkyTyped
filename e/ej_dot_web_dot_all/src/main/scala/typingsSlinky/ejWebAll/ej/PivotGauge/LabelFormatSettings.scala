package typingsSlinky.ejWebAll.ej.PivotGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelFormatSettings extends js.Object {
  /** Allows you to set the number of digits displayed after decimal point.
    * @Default {5}
    */
  var decimalPlaces: js.UndefOr[Double] = js.native
  /** Allows the user to change the number format of the label values in PivotGauge.
    * @Default {ej.PivotGauge.NumberFormat.Default}
    */
  var numberFormat: js.UndefOr[NumberFormat | String] = js.native
  /** Allows you to add a text at the beginning of the label.
    */
  var prefixText: js.UndefOr[String] = js.native
  /** Allows you to add text at the end of the label.
    */
  var suffixText: js.UndefOr[String] = js.native
}

object LabelFormatSettings {
  @scala.inline
  def apply(): LabelFormatSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelFormatSettings]
  }
  @scala.inline
  implicit class LabelFormatSettingsOps[Self <: LabelFormatSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimalPlaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalPlaces")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFormat(value: NumberFormat | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixText")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffixText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffixText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixText")(js.undefined)
        ret
    }
  }
  
}

