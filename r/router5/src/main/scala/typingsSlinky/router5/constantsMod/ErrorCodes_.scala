package typingsSlinky.router5.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorCodes_ extends js.Object {
  var CANNOT_ACTIVATE: String = js.native
  var CANNOT_DEACTIVATE: String = js.native
  var NO_START_PATH_OR_STATE: String = js.native
  var ROUTER_ALREADY_STARTED: String = js.native
  var ROUTER_NOT_STARTED: String = js.native
  var ROUTE_NOT_FOUND: String = js.native
  var SAME_STATES: String = js.native
  var TRANSITION_CANCELLED: String = js.native
  var TRANSITION_ERR: String = js.native
}

object ErrorCodes_ {
  @scala.inline
  def apply(
    CANNOT_ACTIVATE: String,
    CANNOT_DEACTIVATE: String,
    NO_START_PATH_OR_STATE: String,
    ROUTER_ALREADY_STARTED: String,
    ROUTER_NOT_STARTED: String,
    ROUTE_NOT_FOUND: String,
    SAME_STATES: String,
    TRANSITION_CANCELLED: String,
    TRANSITION_ERR: String
  ): ErrorCodes_ = {
    val __obj = js.Dynamic.literal(CANNOT_ACTIVATE = CANNOT_ACTIVATE.asInstanceOf[js.Any], CANNOT_DEACTIVATE = CANNOT_DEACTIVATE.asInstanceOf[js.Any], NO_START_PATH_OR_STATE = NO_START_PATH_OR_STATE.asInstanceOf[js.Any], ROUTER_ALREADY_STARTED = ROUTER_ALREADY_STARTED.asInstanceOf[js.Any], ROUTER_NOT_STARTED = ROUTER_NOT_STARTED.asInstanceOf[js.Any], ROUTE_NOT_FOUND = ROUTE_NOT_FOUND.asInstanceOf[js.Any], SAME_STATES = SAME_STATES.asInstanceOf[js.Any], TRANSITION_CANCELLED = TRANSITION_CANCELLED.asInstanceOf[js.Any], TRANSITION_ERR = TRANSITION_ERR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCodes_]
  }
  @scala.inline
  implicit class ErrorCodes_Ops[Self <: ErrorCodes_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCANNOT_ACTIVATE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CANNOT_ACTIVATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCANNOT_DEACTIVATE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CANNOT_DEACTIVATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNO_START_PATH_OR_STATE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO_START_PATH_OR_STATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROUTER_ALREADY_STARTED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROUTER_ALREADY_STARTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROUTER_NOT_STARTED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROUTER_NOT_STARTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROUTE_NOT_FOUND(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROUTE_NOT_FOUND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSAME_STATES(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SAME_STATES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRANSITION_CANCELLED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_CANCELLED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRANSITION_ERR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_ERR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

