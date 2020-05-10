package typingsSlinky.lambdaLog.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.lambdaLog.lambdaLogBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogLevels
  extends /* key */ StringDictionary[js.Any] {
  var debug: typingsSlinky.lambdaLog.lambdaLogStrings.log | `false` = js.native
  var error: typingsSlinky.lambdaLog.lambdaLogStrings.error = js.native
  var info: typingsSlinky.lambdaLog.lambdaLogStrings.info = js.native
  var warn: typingsSlinky.lambdaLog.lambdaLogStrings.warn = js.native
}

object LogLevels {
  @scala.inline
  def apply(
    debug: typingsSlinky.lambdaLog.lambdaLogStrings.log | `false`,
    error: typingsSlinky.lambdaLog.lambdaLogStrings.error,
    info: typingsSlinky.lambdaLog.lambdaLogStrings.info,
    warn: typingsSlinky.lambdaLog.lambdaLogStrings.warn
  ): LogLevels = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevels]
  }
  @scala.inline
  implicit class LogLevelsOps[Self <: LogLevels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: typingsSlinky.lambdaLog.lambdaLogStrings.log | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: typingsSlinky.lambdaLog.lambdaLogStrings.error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: typingsSlinky.lambdaLog.lambdaLogStrings.info): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarn(value: typingsSlinky.lambdaLog.lambdaLogStrings.warn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

