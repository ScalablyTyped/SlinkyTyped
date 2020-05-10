package typingsSlinky.gestalt

import org.scalajs.dom.raw.Element
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActiveTabIndex extends js.Object {
  var activeTabIndex: Double = js.native
  var event: SyntheticEvent[Event_, SyntheticMouseEvent[Element]] = js.native
}

object AnonActiveTabIndex {
  @scala.inline
  def apply(activeTabIndex: Double, event: SyntheticEvent[Event_, SyntheticMouseEvent[Element]]): AnonActiveTabIndex = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActiveTabIndex]
  }
  @scala.inline
  implicit class AnonActiveTabIndexOps[Self <: AnonActiveTabIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: SyntheticEvent[Event_, SyntheticMouseEvent[Element]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

