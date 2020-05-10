package typingsSlinky.reactJoyride.mod

import typingsSlinky.reactJoyride.reactJoyrideStrings.beacon
import typingsSlinky.reactJoyride.reactJoyrideStrings.close
import typingsSlinky.reactJoyride.reactJoyrideStrings.error
import typingsSlinky.reactJoyride.reactJoyrideStrings.errorColontarget_not_found
import typingsSlinky.reactJoyride.reactJoyrideStrings.stepColonafter
import typingsSlinky.reactJoyride.reactJoyrideStrings.stepColonbefore
import typingsSlinky.reactJoyride.reactJoyrideStrings.tooltip
import typingsSlinky.reactJoyride.reactJoyrideStrings.tourColonend
import typingsSlinky.reactJoyride.reactJoyrideStrings.tourColonstart
import typingsSlinky.reactJoyride.reactJoyrideStrings.tourColonstatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait events extends js.Object {
  var BEACON: beacon = js.native
  var ERROR: error = js.native
  var STEP_AFTER: stepColonafter = js.native
  var STEP_BEFORE: stepColonbefore = js.native
  var TARGET_NOT_FOUND: errorColontarget_not_found = js.native
  var TOOLTIP: tooltip = js.native
  var TOOLTIP_CLOSE: close = js.native
  var TOUR_END: tourColonend = js.native
  var TOUR_START: tourColonstart = js.native
  var TOUR_STATUS: tourColonstatus = js.native
}

object events {
  @scala.inline
  def apply(
    BEACON: beacon,
    ERROR: error,
    STEP_AFTER: stepColonafter,
    STEP_BEFORE: stepColonbefore,
    TARGET_NOT_FOUND: errorColontarget_not_found,
    TOOLTIP: tooltip,
    TOOLTIP_CLOSE: close,
    TOUR_END: tourColonend,
    TOUR_START: tourColonstart,
    TOUR_STATUS: tourColonstatus
  ): events = {
    val __obj = js.Dynamic.literal(BEACON = BEACON.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], STEP_AFTER = STEP_AFTER.asInstanceOf[js.Any], STEP_BEFORE = STEP_BEFORE.asInstanceOf[js.Any], TARGET_NOT_FOUND = TARGET_NOT_FOUND.asInstanceOf[js.Any], TOOLTIP = TOOLTIP.asInstanceOf[js.Any], TOOLTIP_CLOSE = TOOLTIP_CLOSE.asInstanceOf[js.Any], TOUR_END = TOUR_END.asInstanceOf[js.Any], TOUR_START = TOUR_START.asInstanceOf[js.Any], TOUR_STATUS = TOUR_STATUS.asInstanceOf[js.Any])
    __obj.asInstanceOf[events]
  }
  @scala.inline
  implicit class eventsOps[Self <: events] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBEACON(value: beacon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BEACON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR(value: error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTEP_AFTER(value: stepColonafter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STEP_AFTER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTEP_BEFORE(value: stepColonbefore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STEP_BEFORE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTARGET_NOT_FOUND(value: errorColontarget_not_found): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TARGET_NOT_FOUND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOOLTIP(value: tooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOOLTIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOOLTIP_CLOSE(value: close): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOOLTIP_CLOSE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOUR_END(value: tourColonend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOUR_END")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOUR_START(value: tourColonstart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOUR_START")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOUR_STATUS(value: tourColonstatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOUR_STATUS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

