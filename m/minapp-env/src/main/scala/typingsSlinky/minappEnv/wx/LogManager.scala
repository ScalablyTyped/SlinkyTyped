package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogManager extends js.Object {
  /** [LogManager.debug()](LogManager.debug.md)
    *
    * 写 debug 日志 */
  def debug(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过100Kb */
  args: js.Any*): Unit = js.native
  /** [LogManager.info()](LogManager.info.md)
    *
    * 写 info 日志 */
  def info(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过100Kb */
  args: js.Any*): Unit = js.native
  /** [LogManager.log()](LogManager.log.md)
    *
    * 写 log 日志 */
  def log(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过100Kb */
  args: js.Any*): Unit = js.native
  /** [LogManager.warn()](LogManager.warn.md)
    *
    * 写 warn 日志 */
  def warn(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过100Kb */
  args: js.Any*): Unit = js.native
}

object LogManager {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit,
    info: /* repeated */ js.Any => Unit,
    log: /* repeated */ js.Any => Unit,
    warn: /* repeated */ js.Any => Unit
  ): LogManager = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[LogManager]
  }
  @scala.inline
  implicit class LogManagerOps[Self <: LogManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInfo(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLog(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWarn(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

