package typingsSlinky.oracleOraclejet.ojgaugeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.anon.LabelAndValue
import typingsSlinky.oracleOraclejet.anon.Text
import typingsSlinky.oracleOraclejet.anon.TextType
import typingsSlinky.oracleOraclejet.anon.`8`
import typingsSlinky.oracleOraclejet.ojgaugeMod.ojLedGauge.Threshold
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`0`
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`180`
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`270`
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`90`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrow
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.human
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rectangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.square
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.star
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgauge.ojLedGaugeSettableProperties> */
@js.native
trait ojLedGaugeSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var borderColor: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var label: js.UndefOr[Text] = js.native
  var max: js.UndefOr[Double] = js.native
  var metricLabel: js.UndefOr[TextType] = js.native
  var min: js.UndefOr[Double] = js.native
  var rotation: js.UndefOr[`90` | `180` | `270` | `0`] = js.native
  var size: js.UndefOr[Double] = js.native
  var svgClassName: js.UndefOr[String] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
  var thresholds: js.UndefOr[js.Array[Threshold]] = js.native
  var tooltip: js.UndefOr[`8`] = js.native
  var trackResize: js.UndefOr[on | off] = js.native
  var translations: js.UndefOr[LabelAndValue] = js.native
  var `type`: js.UndefOr[arrow | diamond | square | rectangle | triangle | star | human | circle] = js.native
  var value: js.UndefOr[Double] = js.native
  var visualEffects: js.UndefOr[none | auto] = js.native
}

object ojLedGaugeSettablePropertiesLenient {
  @scala.inline
  def apply(): ojLedGaugeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojLedGaugeSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojLedGaugeSettablePropertiesLenientOps[Self <: ojLedGaugeSettablePropertiesLenient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: Text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricLabel(value: TextType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: `90` | `180` | `270` | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withThresholds(value: js.Array[Threshold]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: `8`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackResize(value: on | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: LabelAndValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: arrow | diamond | square | rectangle | triangle | star | human | circle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withVisualEffects(value: none | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualEffects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisualEffects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualEffects")(js.undefined)
        ret
    }
  }
  
}

