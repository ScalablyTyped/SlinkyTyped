package typingsSlinky.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  var enableDebugLog: Boolean = js.native
  def annotate(fn: js.Function, msg: String): Logger = js.native
  def debug(msg: String): Logger = js.native
  def deprecate(fn: js.Function, msg: String): Unit = js.native
  def warn(msg: String): Logger = js.native
  def warnOnce(msg: String): Logger = js.native
}

object Logger {
  @scala.inline
  def apply(
    annotate: (js.Function, String) => Logger,
    debug: String => Logger,
    deprecate: (js.Function, String) => Unit,
    enableDebugLog: Boolean,
    warn: String => Logger,
    warnOnce: String => Logger
  ): Logger = {
    val __obj = js.Dynamic.literal(annotate = js.Any.fromFunction2(annotate), debug = js.Any.fromFunction1(debug), deprecate = js.Any.fromFunction2(deprecate), enableDebugLog = enableDebugLog.asInstanceOf[js.Any], warn = js.Any.fromFunction1(warn), warnOnce = js.Any.fromFunction1(warnOnce))
    __obj.asInstanceOf[Logger]
  }
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotate(value: (js.Function, String) => Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDebug(value: String => Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeprecate(value: (js.Function, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEnableDebugLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDebugLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarn(value: String => Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWarnOnce(value: String => Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnOnce")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

