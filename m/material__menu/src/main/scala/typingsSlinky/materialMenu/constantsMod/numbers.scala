package typingsSlinky.materialMenu.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCNumbers
import typingsSlinky.materialMenu.materialMenuNumbers.`0.1`
import typingsSlinky.materialMenu.materialMenuNumbers.`0.67`
import typingsSlinky.materialMenu.materialMenuNumbers.`120`
import typingsSlinky.materialMenu.materialMenuNumbers.`32`
import typingsSlinky.materialMenu.materialMenuNumbers.`50`
import typingsSlinky.materialMenu.materialMenuNumbers.`75`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait numbers extends MDCNumbers {
  // Ratio of anchor width to menu width for switching from corner positioning to center positioning.
  var ANCHOR_TO_MENU_WIDTH_RATIO: `0.67` = js.native
  // Margin left to the edge of the viewport when menu is at maximum possible height.
  var MARGIN_TO_EDGE: `32` = js.native
  // Ratio of vertical offset to menu height for switching from corner to mid-way origin positioning.
  var OFFSET_TO_MENU_HEIGHT_RATIO: `0.1` = js.native
  // Amount of time to wait before triggering a selected event on the menu. Note that this time
  // will most likely be bumped up once interactive lists are supported to allow for the ripple to
  // animate before closing the menu
  var SELECTED_TRIGGER_DELAY: `50` = js.native
  // Total duration of menu close animation.
  var TRANSITION_CLOSE_DURATION: `75` = js.native
  // Total duration of menu open animation.
  var TRANSITION_OPEN_DURATION: `120` = js.native
}

object numbers {
  @scala.inline
  def apply(
    ANCHOR_TO_MENU_WIDTH_RATIO: `0.67`,
    MARGIN_TO_EDGE: `32`,
    OFFSET_TO_MENU_HEIGHT_RATIO: `0.1`,
    SELECTED_TRIGGER_DELAY: `50`,
    TRANSITION_CLOSE_DURATION: `75`,
    TRANSITION_OPEN_DURATION: `120`
  ): numbers = {
    val __obj = js.Dynamic.literal(ANCHOR_TO_MENU_WIDTH_RATIO = ANCHOR_TO_MENU_WIDTH_RATIO.asInstanceOf[js.Any], MARGIN_TO_EDGE = MARGIN_TO_EDGE.asInstanceOf[js.Any], OFFSET_TO_MENU_HEIGHT_RATIO = OFFSET_TO_MENU_HEIGHT_RATIO.asInstanceOf[js.Any], SELECTED_TRIGGER_DELAY = SELECTED_TRIGGER_DELAY.asInstanceOf[js.Any], TRANSITION_CLOSE_DURATION = TRANSITION_CLOSE_DURATION.asInstanceOf[js.Any], TRANSITION_OPEN_DURATION = TRANSITION_OPEN_DURATION.asInstanceOf[js.Any])
    __obj.asInstanceOf[numbers]
  }
  @scala.inline
  implicit class numbersOps[Self <: numbers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withANCHOR_TO_MENU_WIDTH_RATIO(value: `0.67`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANCHOR_TO_MENU_WIDTH_RATIO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMARGIN_TO_EDGE(value: `32`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MARGIN_TO_EDGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOFFSET_TO_MENU_HEIGHT_RATIO(value: `0.1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OFFSET_TO_MENU_HEIGHT_RATIO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSELECTED_TRIGGER_DELAY(value: `50`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SELECTED_TRIGGER_DELAY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRANSITION_CLOSE_DURATION(value: `75`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_CLOSE_DURATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRANSITION_OPEN_DURATION(value: `120`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_OPEN_DURATION")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

