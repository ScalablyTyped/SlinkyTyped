package typingsSlinky.loglevel.mod

import typingsSlinky.loglevel.loglevelNumbers.`0`
import typingsSlinky.loglevel.loglevelNumbers.`1`
import typingsSlinky.loglevel.loglevelNumbers.`2`
import typingsSlinky.loglevel.loglevelNumbers.`3`
import typingsSlinky.loglevel.loglevelNumbers.`4`
import typingsSlinky.loglevel.loglevelNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Log levels
  */
@js.native
trait LogLevel extends js.Object {
  var DEBUG: `1` = js.native
  var ERROR: `4` = js.native
  var INFO: `2` = js.native
  var SILENT: `5` = js.native
  var TRACE: `0` = js.native
  var WARN: `3` = js.native
}

object LogLevel {
  @scala.inline
  def apply(DEBUG: `1`, ERROR: `4`, INFO: `2`, SILENT: `5`, TRACE: `0`, WARN: `3`): LogLevel = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SILENT = SILENT.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevel]
  }
  @scala.inline
  implicit class LogLevelOps[Self <: LogLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEBUG(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR(value: `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINFO(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INFO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSILENT(value: `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SILENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRACE(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRACE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWARN(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WARN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

