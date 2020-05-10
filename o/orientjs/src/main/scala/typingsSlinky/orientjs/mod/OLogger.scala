package typingsSlinky.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OLogger extends js.Object {
  def debug(args: js.Any*): Unit = js.native
  def error(args: js.Any*): Unit = js.native
  def log(args: js.Any*): Unit = js.native
}

object OLogger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit,
    error: /* repeated */ js.Any => Unit,
    log: /* repeated */ js.Any => Unit
  ): OLogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[OLogger]
  }
  @scala.inline
  implicit class OLoggerOps[Self <: OLogger] (val x: Self) extends AnyVal {
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
    def withError(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLog(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

