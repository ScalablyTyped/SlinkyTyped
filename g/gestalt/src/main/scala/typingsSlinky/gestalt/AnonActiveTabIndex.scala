package typingsSlinky.gestalt

import org.scalajs.dom.raw.Element
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveTabIndex extends js.Object {
  var activeTabIndex: Double
  var event: SyntheticEvent[Event_, SyntheticMouseEvent[Element]]
}

object AnonActiveTabIndex {
  @scala.inline
  def apply(activeTabIndex: Double, event: SyntheticEvent[Event_, SyntheticMouseEvent[Element]]): AnonActiveTabIndex = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActiveTabIndex]
  }
}

