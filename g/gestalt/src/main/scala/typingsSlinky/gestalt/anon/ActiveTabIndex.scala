package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveTabIndex extends js.Object {
  var activeTabIndex: Double = js.native
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[Element]] = js.native
}

object ActiveTabIndex {
  @scala.inline
  def apply(
    activeTabIndex: Double,
    event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[Element]]
  ): ActiveTabIndex = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTabIndex]
  }
  @scala.inline
  implicit class ActiveTabIndexOps[Self <: ActiveTabIndex] (val x: Self) extends AnyVal {
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
    def withEvent(value: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, SyntheticMouseEvent[Element]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

