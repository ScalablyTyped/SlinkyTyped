package typingsSlinky.rollup

import typingsSlinky.rollup.mod.RollupWatcherEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChange extends js.Object {
  def change(id: String): Unit = js.native
  def event(event: RollupWatcherEvent): Unit = js.native
  def restart(): Unit = js.native
}

object AnonChange {
  @scala.inline
  def apply(change: String => Unit, event: RollupWatcherEvent => Unit, restart: () => Unit): AnonChange = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction1(change), event = js.Any.fromFunction1(event), restart = js.Any.fromFunction0(restart))
    __obj.asInstanceOf[AnonChange]
  }
  @scala.inline
  implicit class AnonChangeOps[Self <: AnonChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEvent(value: RollupWatcherEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRestart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

