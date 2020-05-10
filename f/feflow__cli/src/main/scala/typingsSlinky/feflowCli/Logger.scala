package typingsSlinky.feflowCli

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  /**
    * Print trace level log, The Color is gray
    * @param desc log detail
    */
  def debug(desc: String): Unit = js.native
  /**
    * Print trace level log, The Color is red
    * @param desc log detail
    */
  def error(desc: String): Unit = js.native
  /**
    * Print trace level log, The Color is red
    * @param desc log detail
    */
  def fatal(desc: String): Unit = js.native
  /**
    * Print trace level log, The Color is green
    * @param desc log detail
    */
  def info(desc: String): Unit = js.native
  /**
    * Print trace level log, The Color is gray
    * @param desc log detail
    */
  def trace(desc: String): Unit = js.native
  /**
    * Print trace level log, The Color is yellow
    * @param desc log detail
    */
  def warn(desc: String): Unit = js.native
}

object Logger {
  @scala.inline
  def apply(
    debug: String => Unit,
    error: String => Unit,
    fatal: String => Unit,
    info: String => Unit,
    trace: String => Unit,
    warn: String => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), fatal = js.Any.fromFunction1(fatal), info = js.Any.fromFunction1(info), trace = js.Any.fromFunction1(trace), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
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

