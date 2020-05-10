package typingsSlinky.router5.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constants_ extends js.Object {
  var ROUTER_START: String = js.native
  var ROUTER_STOP: String = js.native
  var TRANSITION_CANCEL: String = js.native
  var TRANSITION_ERROR: String = js.native
  var TRANSITION_START: String = js.native
  var TRANSITION_SUCCESS: String = js.native
  var UNKNOWN_ROUTE: String = js.native
}

object Constants_ {
  @scala.inline
  def apply(
    ROUTER_START: String,
    ROUTER_STOP: String,
    TRANSITION_CANCEL: String,
    TRANSITION_ERROR: String,
    TRANSITION_START: String,
    TRANSITION_SUCCESS: String,
    UNKNOWN_ROUTE: String
  ): Constants_ = {
    val __obj = js.Dynamic.literal(ROUTER_START = ROUTER_START.asInstanceOf[js.Any], ROUTER_STOP = ROUTER_STOP.asInstanceOf[js.Any], TRANSITION_CANCEL = TRANSITION_CANCEL.asInstanceOf[js.Any], TRANSITION_ERROR = TRANSITION_ERROR.asInstanceOf[js.Any], TRANSITION_START = TRANSITION_START.asInstanceOf[js.Any], TRANSITION_SUCCESS = TRANSITION_SUCCESS.asInstanceOf[js.Any], UNKNOWN_ROUTE = UNKNOWN_ROUTE.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constants_]
  }
  @scala.inline
  implicit class Constants_Ops[Self <: Constants_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withROUTER_START(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROUTER_START")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROUTER_STOP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROUTER_STOP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRANSITION_CANCEL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_CANCEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRANSITION_ERROR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRANSITION_START(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_START")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRANSITION_SUCCESS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_SUCCESS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNKNOWN_ROUTE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ROUTE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

