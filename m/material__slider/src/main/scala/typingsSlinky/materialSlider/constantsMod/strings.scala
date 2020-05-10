package typingsSlinky.materialSlider.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialSlider.materialSliderStrings.MDCSliderColonchange
import typingsSlinky.materialSlider.materialSliderStrings.MDCSliderColoninput
import typingsSlinky.materialSlider.materialSliderStrings.`Dotmdc-slider__pin-value-marker`
import typingsSlinky.materialSlider.materialSliderStrings.`Dotmdc-slider__thumb-container`
import typingsSlinky.materialSlider.materialSliderStrings.`Dotmdc-slider__track-marker-container`
import typingsSlinky.materialSlider.materialSliderStrings.`Dotmdc-slider__track-markerColonlast-child`
import typingsSlinky.materialSlider.materialSliderStrings.`Dotmdc-slider__track`
import typingsSlinky.materialSlider.materialSliderStrings.`aria-disabled`
import typingsSlinky.materialSlider.materialSliderStrings.`aria-valuemax`
import typingsSlinky.materialSlider.materialSliderStrings.`aria-valuemin`
import typingsSlinky.materialSlider.materialSliderStrings.`aria-valuenow`
import typingsSlinky.materialSlider.materialSliderStrings.`data-step`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var ARIA_DISABLED: `aria-disabled` = js.native
  var ARIA_VALUEMAX: `aria-valuemax` = js.native
  var ARIA_VALUEMIN: `aria-valuemin` = js.native
  var ARIA_VALUENOW: `aria-valuenow` = js.native
  var CHANGE_EVENT: MDCSliderColonchange = js.native
  var INPUT_EVENT: MDCSliderColoninput = js.native
  var LAST_TRACK_MARKER_SELECTOR: `Dotmdc-slider__track-markerColonlast-child` = js.native
  var PIN_VALUE_MARKER_SELECTOR: `Dotmdc-slider__pin-value-marker` = js.native
  var STEP_DATA_ATTR: `data-step` = js.native
  var THUMB_CONTAINER_SELECTOR: `Dotmdc-slider__thumb-container` = js.native
  var TRACK_MARKER_CONTAINER_SELECTOR: `Dotmdc-slider__track-marker-container` = js.native
  var TRACK_SELECTOR: `Dotmdc-slider__track` = js.native
}

object strings {
  @scala.inline
  def apply(
    ARIA_DISABLED: `aria-disabled`,
    ARIA_VALUEMAX: `aria-valuemax`,
    ARIA_VALUEMIN: `aria-valuemin`,
    ARIA_VALUENOW: `aria-valuenow`,
    CHANGE_EVENT: MDCSliderColonchange,
    INPUT_EVENT: MDCSliderColoninput,
    LAST_TRACK_MARKER_SELECTOR: `Dotmdc-slider__track-markerColonlast-child`,
    PIN_VALUE_MARKER_SELECTOR: `Dotmdc-slider__pin-value-marker`,
    STEP_DATA_ATTR: `data-step`,
    THUMB_CONTAINER_SELECTOR: `Dotmdc-slider__thumb-container`,
    TRACK_MARKER_CONTAINER_SELECTOR: `Dotmdc-slider__track-marker-container`,
    TRACK_SELECTOR: `Dotmdc-slider__track`
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_DISABLED = ARIA_DISABLED.asInstanceOf[js.Any], ARIA_VALUEMAX = ARIA_VALUEMAX.asInstanceOf[js.Any], ARIA_VALUEMIN = ARIA_VALUEMIN.asInstanceOf[js.Any], ARIA_VALUENOW = ARIA_VALUENOW.asInstanceOf[js.Any], CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], INPUT_EVENT = INPUT_EVENT.asInstanceOf[js.Any], LAST_TRACK_MARKER_SELECTOR = LAST_TRACK_MARKER_SELECTOR.asInstanceOf[js.Any], PIN_VALUE_MARKER_SELECTOR = PIN_VALUE_MARKER_SELECTOR.asInstanceOf[js.Any], STEP_DATA_ATTR = STEP_DATA_ATTR.asInstanceOf[js.Any], THUMB_CONTAINER_SELECTOR = THUMB_CONTAINER_SELECTOR.asInstanceOf[js.Any], TRACK_MARKER_CONTAINER_SELECTOR = TRACK_MARKER_CONTAINER_SELECTOR.asInstanceOf[js.Any], TRACK_SELECTOR = TRACK_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARIA_DISABLED(value: `aria-disabled`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARIA_DISABLED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARIA_VALUEMAX(value: `aria-valuemax`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARIA_VALUEMAX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARIA_VALUEMIN(value: `aria-valuemin`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARIA_VALUEMIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARIA_VALUENOW(value: `aria-valuenow`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARIA_VALUENOW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCHANGE_EVENT(value: MDCSliderColonchange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINPUT_EVENT(value: MDCSliderColoninput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INPUT_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLAST_TRACK_MARKER_SELECTOR(value: `Dotmdc-slider__track-markerColonlast-child`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LAST_TRACK_MARKER_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPIN_VALUE_MARKER_SELECTOR(value: `Dotmdc-slider__pin-value-marker`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PIN_VALUE_MARKER_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTEP_DATA_ATTR(value: `data-step`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STEP_DATA_ATTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTHUMB_CONTAINER_SELECTOR(value: `Dotmdc-slider__thumb-container`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THUMB_CONTAINER_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRACK_MARKER_CONTAINER_SELECTOR(value: `Dotmdc-slider__track-marker-container`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRACK_MARKER_CONTAINER_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRACK_SELECTOR(value: `Dotmdc-slider__track`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRACK_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

