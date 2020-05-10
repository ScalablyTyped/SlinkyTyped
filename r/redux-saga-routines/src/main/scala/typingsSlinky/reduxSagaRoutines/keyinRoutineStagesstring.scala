package typingsSlinky.reduxSagaRoutines

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in redux-saga-routines.redux-saga-routines.RoutineStages ]: string} */
@js.native
trait keyinRoutineStagesstring extends js.Object {
  var FAILURE: String = js.native
  var FULFILL: String = js.native
  var REQUEST: String = js.native
  var SUCCESS: String = js.native
  var TRIGGER: String = js.native
}

object keyinRoutineStagesstring {
  @scala.inline
  def apply(FAILURE: String, FULFILL: String, REQUEST: String, SUCCESS: String, TRIGGER: String): keyinRoutineStagesstring = {
    val __obj = js.Dynamic.literal(FAILURE = FAILURE.asInstanceOf[js.Any], FULFILL = FULFILL.asInstanceOf[js.Any], REQUEST = REQUEST.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any], TRIGGER = TRIGGER.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinRoutineStagesstring]
  }
  @scala.inline
  implicit class keyinRoutineStagesstringOps[Self <: keyinRoutineStagesstring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFAILURE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAILURE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFULFILL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FULFILL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREQUEST(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REQUEST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUCCESS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRIGGER(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRIGGER")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

