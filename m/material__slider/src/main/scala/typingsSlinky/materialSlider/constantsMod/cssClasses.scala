package typingsSlinky.materialSlider.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialSlider.materialSliderStrings.`mdc-slider--active`
import typingsSlinky.materialSlider.materialSliderStrings.`mdc-slider--disabled`
import typingsSlinky.materialSlider.materialSliderStrings.`mdc-slider--discrete`
import typingsSlinky.materialSlider.materialSliderStrings.`mdc-slider--display-markers`
import typingsSlinky.materialSlider.materialSliderStrings.`mdc-slider--focus`
import typingsSlinky.materialSlider.materialSliderStrings.`mdc-slider--in-transit`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var ACTIVE: `mdc-slider--active` = js.native
  var DISABLED: `mdc-slider--disabled` = js.native
  var DISCRETE: `mdc-slider--discrete` = js.native
  var FOCUS: `mdc-slider--focus` = js.native
  var HAS_TRACK_MARKER: `mdc-slider--display-markers` = js.native
  var IN_TRANSIT: `mdc-slider--in-transit` = js.native
  var IS_DISCRETE: `mdc-slider--discrete` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    ACTIVE: `mdc-slider--active`,
    DISABLED: `mdc-slider--disabled`,
    DISCRETE: `mdc-slider--discrete`,
    FOCUS: `mdc-slider--focus`,
    HAS_TRACK_MARKER: `mdc-slider--display-markers`,
    IN_TRANSIT: `mdc-slider--in-transit`,
    IS_DISCRETE: `mdc-slider--discrete`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any], DISCRETE = DISCRETE.asInstanceOf[js.Any], FOCUS = FOCUS.asInstanceOf[js.Any], HAS_TRACK_MARKER = HAS_TRACK_MARKER.asInstanceOf[js.Any], IN_TRANSIT = IN_TRANSIT.asInstanceOf[js.Any], IS_DISCRETE = IS_DISCRETE.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACTIVE(value: `mdc-slider--active`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDISABLED(value: `mdc-slider--disabled`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDISCRETE(value: `mdc-slider--discrete`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISCRETE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFOCUS(value: `mdc-slider--focus`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FOCUS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHAS_TRACK_MARKER(value: `mdc-slider--display-markers`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HAS_TRACK_MARKER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIN_TRANSIT(value: `mdc-slider--in-transit`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IN_TRANSIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIS_DISCRETE(value: `mdc-slider--discrete`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IS_DISCRETE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

