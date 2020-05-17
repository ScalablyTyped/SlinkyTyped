package typingsSlinky.ibmMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class which defines instances created via:  WL.Logger.create({pkg: 'something'});
  * Actual definition is outside of WL namespace. For easier d.ts file compiling it is here
  */
@js.native
trait LogInstance extends js.Object {
  def debug(message: String): Unit = js.native
  def error(message: String): Unit = js.native
  def fatal(message: String): Unit = js.native
  def info(message: String): Unit = js.native
  def trace(message: String): Unit = js.native
  def warn(message: String): Unit = js.native
}

object LogInstance {
  @scala.inline
  def apply(
    debug: String => Unit,
    error: String => Unit,
    fatal: String => Unit,
    info: String => Unit,
    trace: String => Unit,
    warn: String => Unit
  ): LogInstance = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), fatal = js.Any.fromFunction1(fatal), info = js.Any.fromFunction1(info), trace = js.Any.fromFunction1(trace), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[LogInstance]
  }
  @scala.inline
  implicit class LogInstanceOps[Self <: LogInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withError(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFatal(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInfo(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrace(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWarn(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

