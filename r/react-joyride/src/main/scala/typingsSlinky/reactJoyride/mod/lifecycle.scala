package typingsSlinky.reactJoyride.mod

import typingsSlinky.reactJoyride.reactJoyrideStrings.beacon
import typingsSlinky.reactJoyride.reactJoyrideStrings.complete
import typingsSlinky.reactJoyride.reactJoyrideStrings.error
import typingsSlinky.reactJoyride.reactJoyrideStrings.init
import typingsSlinky.reactJoyride.reactJoyrideStrings.ready
import typingsSlinky.reactJoyride.reactJoyrideStrings.tooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait lifecycle extends js.Object {
  var BEACON: beacon = js.native
  var COMPLETE: complete = js.native
  var ERROR: error = js.native
  var INIT: init = js.native
  var READY: ready = js.native
  var TOOLTIP: tooltip = js.native
}

object lifecycle {
  @scala.inline
  def apply(BEACON: beacon, COMPLETE: complete, ERROR: error, INIT: init, READY: ready, TOOLTIP: tooltip): lifecycle = {
    val __obj = js.Dynamic.literal(BEACON = BEACON.asInstanceOf[js.Any], COMPLETE = COMPLETE.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INIT = INIT.asInstanceOf[js.Any], READY = READY.asInstanceOf[js.Any], TOOLTIP = TOOLTIP.asInstanceOf[js.Any])
    __obj.asInstanceOf[lifecycle]
  }
  @scala.inline
  implicit class lifecycleOps[Self <: lifecycle] (val x: Self) extends AnyVal {
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
    def withCOMPLETE(value: complete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMPLETE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR(value: error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINIT(value: init): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREADY(value: ready): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("READY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOOLTIP(value: tooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOOLTIP")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

