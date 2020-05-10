package typingsSlinky.flight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLogAll extends js.Object {
  def logAll(): Unit = js.native
  def logByAction(action: String): Unit = js.native
  def logByName(name: String): Unit = js.native
  def logNone(): Unit = js.native
}

object AnonLogAll {
  @scala.inline
  def apply(logAll: () => Unit, logByAction: String => Unit, logByName: String => Unit, logNone: () => Unit): AnonLogAll = {
    val __obj = js.Dynamic.literal(logAll = js.Any.fromFunction0(logAll), logByAction = js.Any.fromFunction1(logByAction), logByName = js.Any.fromFunction1(logByName), logNone = js.Any.fromFunction0(logNone))
    __obj.asInstanceOf[AnonLogAll]
  }
  @scala.inline
  implicit class AnonLogAllOps[Self <: AnonLogAll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogByAction(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logByAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogByName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogNone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logNone")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

