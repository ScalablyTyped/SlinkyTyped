package typingsSlinky.gestalt

import org.scalajs.dom.raw.Element
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveIndex extends js.Object {
  var activeIndex: Double
  var event: SyntheticEvent[Event_, SyntheticMouseEvent[Element]]
}

object AnonActiveIndex {
  @scala.inline
  def apply(activeIndex: Double, event: SyntheticEvent[Event_, SyntheticMouseEvent[Element]]): AnonActiveIndex = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActiveIndex]
  }
}

