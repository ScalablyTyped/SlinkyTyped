package typingsSlinky.jestRunner.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatcherState extends js.Object {
  var interrupted: Boolean = js.native
}

object WatcherState {
  @scala.inline
  def apply(interrupted: Boolean): WatcherState = {
    val __obj = js.Dynamic.literal(interrupted = interrupted.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherState]
  }
  @scala.inline
  implicit class WatcherStateOps[Self <: WatcherState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterrupted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interrupted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

