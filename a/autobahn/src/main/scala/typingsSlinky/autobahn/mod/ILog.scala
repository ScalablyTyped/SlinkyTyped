package typingsSlinky.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILog extends js.Object {
  def debug(args: js.Any*): Unit = js.native
}

object ILog {
  @scala.inline
  def apply(debug: /* repeated */ js.Any => Unit): ILog = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug))
    __obj.asInstanceOf[ILog]
  }
  @scala.inline
  implicit class ILogOps[Self <: ILog] (val x: Self) extends AnyVal {
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
  }
  
}

