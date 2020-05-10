package typingsSlinky.aureliaLogging.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogLevel_
  extends /**
  * Additional log levels defined at runtime.
  */
/* level */ StringDictionary[Double] {
  /**
    * Log all messages.
    */
  var debug: Double = js.native
  /**
    * Log only error messages.
    */
  var error: Double = js.native
  /**
    * Log informational messages or above.
    */
  var info: Double = js.native
  /**
    * No logging.
    */
  var none: Double = js.native
  /**
    * Log warnings messages or above.
    */
  var warn: Double = js.native
}

object LogLevel_ {
  @scala.inline
  def apply(debug: Double, error: Double, info: Double, none: Double, warn: Double): LogLevel_ = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevel_]
  }
  @scala.inline
  implicit class LogLevel_Ops[Self <: LogLevel_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

