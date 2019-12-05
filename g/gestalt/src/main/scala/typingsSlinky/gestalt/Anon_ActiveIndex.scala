package typingsSlinky.gestalt

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveIndex extends js.Object {
  var activeIndex: Double
  var event: SyntheticEvent[Event, SyntheticMouseEvent[Element]]
}

object Anon_ActiveIndex {
  @scala.inline
  def apply(activeIndex: Double, event: SyntheticEvent[Event, SyntheticMouseEvent[Element]]): Anon_ActiveIndex = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActiveIndex]
  }
}

