package typingsSlinky.reduxForm.actionTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionTypes_ extends js.Object {
  
  var ARRAY_INSERT: String = js.native
  
  var ARRAY_MOVE: String = js.native
  
  var ARRAY_POP: String = js.native
  
  var ARRAY_PUSH: String = js.native
  
  var ARRAY_REMOVE: String = js.native
  
  var ARRAY_REMOVE_ALL: String = js.native
  
  var ARRAY_SHIFT: String = js.native
  
  var ARRAY_SPLICE: String = js.native
  
  var ARRAY_SWAP: String = js.native
  
  var ARRAY_UNSHIFT: String = js.native
  
  var AUTOFILL: String = js.native
  
  var BLUR: String = js.native
  
  var CHANGE: String = js.native
  
  var CLEAR_ASYNC_ERROR: String = js.native
  
  var CLEAR_FIELDS: String = js.native
  
  var CLEAR_SUBMIT: String = js.native
  
  var CLEAR_SUBMIT_ERRORS: String = js.native
  
  var DESTROY: String = js.native
  
  var FOCUS: String = js.native
  
  var INITIALIZE: String = js.native
  
  var REGISTER_FIELD: String = js.native
  
  var RESET: String = js.native
  
  var RESET_SECTION: String = js.native
  
  var SET_SUBMIT_FAILED: String = js.native
  
  var SET_SUBMIT_SUCCEEDED: String = js.native
  
  var START_ASYNC_VALIDATION: String = js.native
  
  var START_SUBMIT: String = js.native
  
  var STOP_ASYNC_VALIDATION: String = js.native
  
  var STOP_SUBMIT: String = js.native
  
  var SUBMIT: String = js.native
  
  var TOUCH: String = js.native
  
  var UNREGISTER_FIELD: String = js.native
  
  var UNTOUCH: String = js.native
  
  var UPDATE_SYNC_ERRORS: String = js.native
  
  var UPDATE_SYNC_WARNINGS: String = js.native
}
object ActionTypes_ {
  
  @scala.inline
  def apply(
    ARRAY_INSERT: String,
    ARRAY_MOVE: String,
    ARRAY_POP: String,
    ARRAY_PUSH: String,
    ARRAY_REMOVE: String,
    ARRAY_REMOVE_ALL: String,
    ARRAY_SHIFT: String,
    ARRAY_SPLICE: String,
    ARRAY_SWAP: String,
    ARRAY_UNSHIFT: String,
    AUTOFILL: String,
    BLUR: String,
    CHANGE: String,
    CLEAR_ASYNC_ERROR: String,
    CLEAR_FIELDS: String,
    CLEAR_SUBMIT: String,
    CLEAR_SUBMIT_ERRORS: String,
    DESTROY: String,
    FOCUS: String,
    INITIALIZE: String,
    REGISTER_FIELD: String,
    RESET: String,
    RESET_SECTION: String,
    SET_SUBMIT_FAILED: String,
    SET_SUBMIT_SUCCEEDED: String,
    START_ASYNC_VALIDATION: String,
    START_SUBMIT: String,
    STOP_ASYNC_VALIDATION: String,
    STOP_SUBMIT: String,
    SUBMIT: String,
    TOUCH: String,
    UNREGISTER_FIELD: String,
    UNTOUCH: String,
    UPDATE_SYNC_ERRORS: String,
    UPDATE_SYNC_WARNINGS: String
  ): ActionTypes_ = {
    val __obj = js.Dynamic.literal(ARRAY_INSERT = ARRAY_INSERT.asInstanceOf[js.Any], ARRAY_MOVE = ARRAY_MOVE.asInstanceOf[js.Any], ARRAY_POP = ARRAY_POP.asInstanceOf[js.Any], ARRAY_PUSH = ARRAY_PUSH.asInstanceOf[js.Any], ARRAY_REMOVE = ARRAY_REMOVE.asInstanceOf[js.Any], ARRAY_REMOVE_ALL = ARRAY_REMOVE_ALL.asInstanceOf[js.Any], ARRAY_SHIFT = ARRAY_SHIFT.asInstanceOf[js.Any], ARRAY_SPLICE = ARRAY_SPLICE.asInstanceOf[js.Any], ARRAY_SWAP = ARRAY_SWAP.asInstanceOf[js.Any], ARRAY_UNSHIFT = ARRAY_UNSHIFT.asInstanceOf[js.Any], AUTOFILL = AUTOFILL.asInstanceOf[js.Any], BLUR = BLUR.asInstanceOf[js.Any], CHANGE = CHANGE.asInstanceOf[js.Any], CLEAR_ASYNC_ERROR = CLEAR_ASYNC_ERROR.asInstanceOf[js.Any], CLEAR_FIELDS = CLEAR_FIELDS.asInstanceOf[js.Any], CLEAR_SUBMIT = CLEAR_SUBMIT.asInstanceOf[js.Any], CLEAR_SUBMIT_ERRORS = CLEAR_SUBMIT_ERRORS.asInstanceOf[js.Any], DESTROY = DESTROY.asInstanceOf[js.Any], FOCUS = FOCUS.asInstanceOf[js.Any], INITIALIZE = INITIALIZE.asInstanceOf[js.Any], REGISTER_FIELD = REGISTER_FIELD.asInstanceOf[js.Any], RESET = RESET.asInstanceOf[js.Any], RESET_SECTION = RESET_SECTION.asInstanceOf[js.Any], SET_SUBMIT_FAILED = SET_SUBMIT_FAILED.asInstanceOf[js.Any], SET_SUBMIT_SUCCEEDED = SET_SUBMIT_SUCCEEDED.asInstanceOf[js.Any], START_ASYNC_VALIDATION = START_ASYNC_VALIDATION.asInstanceOf[js.Any], START_SUBMIT = START_SUBMIT.asInstanceOf[js.Any], STOP_ASYNC_VALIDATION = STOP_ASYNC_VALIDATION.asInstanceOf[js.Any], STOP_SUBMIT = STOP_SUBMIT.asInstanceOf[js.Any], SUBMIT = SUBMIT.asInstanceOf[js.Any], TOUCH = TOUCH.asInstanceOf[js.Any], UNREGISTER_FIELD = UNREGISTER_FIELD.asInstanceOf[js.Any], UNTOUCH = UNTOUCH.asInstanceOf[js.Any], UPDATE_SYNC_ERRORS = UPDATE_SYNC_ERRORS.asInstanceOf[js.Any], UPDATE_SYNC_WARNINGS = UPDATE_SYNC_WARNINGS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTypes_]
  }
  
  @scala.inline
  implicit class ActionTypes_Ops[Self <: ActionTypes_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setARRAY_INSERT(value: String): Self = this.set("ARRAY_INSERT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARRAY_MOVE(value: String): Self = this.set("ARRAY_MOVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARRAY_POP(value: String): Self = this.set("ARRAY_POP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARRAY_PUSH(value: String): Self = this.set("ARRAY_PUSH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARRAY_REMOVE(value: String): Self = this.set("ARRAY_REMOVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARRAY_REMOVE_ALL(value: String): Self = this.set("ARRAY_REMOVE_ALL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARRAY_SHIFT(value: String): Self = this.set("ARRAY_SHIFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARRAY_SPLICE(value: String): Self = this.set("ARRAY_SPLICE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARRAY_SWAP(value: String): Self = this.set("ARRAY_SWAP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARRAY_UNSHIFT(value: String): Self = this.set("ARRAY_UNSHIFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUTOFILL(value: String): Self = this.set("AUTOFILL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBLUR(value: String): Self = this.set("BLUR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCHANGE(value: String): Self = this.set("CHANGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEAR_ASYNC_ERROR(value: String): Self = this.set("CLEAR_ASYNC_ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEAR_FIELDS(value: String): Self = this.set("CLEAR_FIELDS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEAR_SUBMIT(value: String): Self = this.set("CLEAR_SUBMIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCLEAR_SUBMIT_ERRORS(value: String): Self = this.set("CLEAR_SUBMIT_ERRORS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDESTROY(value: String): Self = this.set("DESTROY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFOCUS(value: String): Self = this.set("FOCUS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINITIALIZE(value: String): Self = this.set("INITIALIZE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREGISTER_FIELD(value: String): Self = this.set("REGISTER_FIELD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRESET(value: String): Self = this.set("RESET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRESET_SECTION(value: String): Self = this.set("RESET_SECTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSET_SUBMIT_FAILED(value: String): Self = this.set("SET_SUBMIT_FAILED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSET_SUBMIT_SUCCEEDED(value: String): Self = this.set("SET_SUBMIT_SUCCEEDED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTART_ASYNC_VALIDATION(value: String): Self = this.set("START_ASYNC_VALIDATION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTART_SUBMIT(value: String): Self = this.set("START_SUBMIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTOP_ASYNC_VALIDATION(value: String): Self = this.set("STOP_ASYNC_VALIDATION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTOP_SUBMIT(value: String): Self = this.set("STOP_SUBMIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUBMIT(value: String): Self = this.set("SUBMIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOUCH(value: String): Self = this.set("TOUCH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNREGISTER_FIELD(value: String): Self = this.set("UNREGISTER_FIELD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNTOUCH(value: String): Self = this.set("UNTOUCH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUPDATE_SYNC_ERRORS(value: String): Self = this.set("UPDATE_SYNC_ERRORS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUPDATE_SYNC_WARNINGS(value: String): Self = this.set("UPDATE_SYNC_WARNINGS", value.asInstanceOf[js.Any])
  }
}
