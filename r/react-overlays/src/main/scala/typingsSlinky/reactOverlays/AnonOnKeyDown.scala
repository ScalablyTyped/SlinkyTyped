package typingsSlinky.reactOverlays

import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnKeyDown extends js.Object {
  def onKeyDown(event: SyntheticEvent[Event_, _]): Unit = js.native
}

object AnonOnKeyDown {
  @scala.inline
  def apply(onKeyDown: SyntheticEvent[Event_, _] => Unit): AnonOnKeyDown = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[AnonOnKeyDown]
  }
  @scala.inline
  implicit class AnonOnKeyDownOps[Self <: AnonOnKeyDown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnKeyDown(value: SyntheticEvent[Event_, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

