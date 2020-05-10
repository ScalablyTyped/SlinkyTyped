package typingsSlinky.oracleOraclejet.ojgaugeMod

import typingsSlinky.oracleOraclejet.Anon9
import typingsSlinky.oracleOraclejet.AnonLabelAndValue
import typingsSlinky.oracleOraclejet.AnonSource
import typingsSlinky.oracleOraclejet.ojgaugeMod.ojRatingGauge.Threshold
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`0.5`
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`1`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.meet
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojRatingGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  var changed: Boolean = js.native
  var changedState: AnonSource = js.native
  var hoverState: AnonSource = js.native
  var max: Double = js.native
  var min: Double = js.native
  var orientation: vertical | horizontal = js.native
  var preserveAspectRatio: none | meet = js.native
  var readonly: Boolean = js.native
  var selectedState: AnonSource = js.native
  var step: `0.5` | `1` = js.native
  var thresholds: js.Array[Threshold] = js.native
  var tooltip: Anon9 = js.native
  val transientValue: Double | Null = js.native
  var unselectedState: AnonSource = js.native
  var value: Double | Null = js.native
  var visualEffects: none | auto = js.native
}

object ojRatingGaugeSettableProperties {
  @scala.inline
  def apply(
    changed: Boolean,
    changedState: AnonSource,
    hoverState: AnonSource,
    max: Double,
    min: Double,
    orientation: vertical | horizontal,
    preserveAspectRatio: none | meet,
    readonly: Boolean,
    selectedState: AnonSource,
    step: `0.5` | `1`,
    thresholds: js.Array[Threshold],
    tooltip: Anon9,
    trackResize: on | off,
    translations: AnonLabelAndValue,
    unselectedState: AnonSource,
    visualEffects: none | auto
  ): ojRatingGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], changedState = changedState.asInstanceOf[js.Any], hoverState = hoverState.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], selectedState = selectedState.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], unselectedState = unselectedState.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojRatingGaugeSettableProperties]
  }
  @scala.inline
  implicit class ojRatingGaugeSettablePropertiesOps[Self <: ojRatingGaugeSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedState(value: AnonSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverState(value: AnonSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: vertical | horizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserveAspectRatio(value: none | meet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedState(value: AnonSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: `0.5` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThresholds(value: js.Array[Threshold]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: Anon9): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnselectedState(value: AnonSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectedState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisualEffects(value: none | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualEffects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransientValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transientValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransientValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transientValue")(null)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

