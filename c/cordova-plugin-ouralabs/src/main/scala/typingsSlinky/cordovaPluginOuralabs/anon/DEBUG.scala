package typingsSlinky.cordovaPluginOuralabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DEBUG extends js.Object {
  var DEBUG: Double = js.native
  var ERROR: Double = js.native
  var FATAL: Double = js.native
  var INFO: Double = js.native
  var TRACE: Double = js.native
  var WARN: Double = js.native
}

object DEBUG {
  @scala.inline
  def apply(DEBUG: Double, ERROR: Double, FATAL: Double, INFO: Double, TRACE: Double, WARN: Double): DEBUG = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FATAL = FATAL.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEBUG]
  }
  @scala.inline
  implicit class DEBUGOps[Self <: DEBUG] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEBUG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFATAL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FATAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINFO(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INFO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRACE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRACE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWARN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WARN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

