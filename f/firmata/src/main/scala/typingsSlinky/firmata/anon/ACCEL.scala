package typingsSlinky.firmata.anon

import typingsSlinky.firmata.mod.STEPPER_RUN_STATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ACCEL extends js.Object {
  var ACCEL: STEPPER_RUN_STATE = js.native
  var DECEL: STEPPER_RUN_STATE = js.native
  var RUN: STEPPER_RUN_STATE = js.native
  var STOP: STEPPER_RUN_STATE = js.native
}

object ACCEL {
  @scala.inline
  def apply(
    ACCEL: STEPPER_RUN_STATE,
    DECEL: STEPPER_RUN_STATE,
    RUN: STEPPER_RUN_STATE,
    STOP: STEPPER_RUN_STATE
  ): ACCEL = {
    val __obj = js.Dynamic.literal(ACCEL = ACCEL.asInstanceOf[js.Any], DECEL = DECEL.asInstanceOf[js.Any], RUN = RUN.asInstanceOf[js.Any], STOP = STOP.asInstanceOf[js.Any])
    __obj.asInstanceOf[ACCEL]
  }
  @scala.inline
  implicit class ACCELOps[Self <: ACCEL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACCEL(value: STEPPER_RUN_STATE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACCEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDECEL(value: STEPPER_RUN_STATE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DECEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRUN(value: STEPPER_RUN_STATE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RUN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTOP(value: STEPPER_RUN_STATE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STOP")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

