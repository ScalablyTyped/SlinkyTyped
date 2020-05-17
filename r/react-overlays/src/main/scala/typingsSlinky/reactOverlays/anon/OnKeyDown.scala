package typingsSlinky.reactOverlays.anon

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnKeyDown extends js.Object {
  def onKeyDown(event: SyntheticEvent[Event, _]): Unit = js.native
}

object OnKeyDown {
  @scala.inline
  def apply(onKeyDown: SyntheticEvent[Event, _] => Unit): OnKeyDown = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[OnKeyDown]
  }
  @scala.inline
  implicit class OnKeyDownOps[Self <: OnKeyDown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnKeyDown(value: SyntheticEvent[Event, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

