package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveIndex extends js.Object {
  var activeIndex: Double = js.native
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[Element]] = js.native
}

object ActiveIndex {
  @scala.inline
  def apply(
    activeIndex: Double,
    event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[Element]]
  ): ActiveIndex = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveIndex]
  }
  @scala.inline
  implicit class ActiveIndexOps[Self <: ActiveIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[Element]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

