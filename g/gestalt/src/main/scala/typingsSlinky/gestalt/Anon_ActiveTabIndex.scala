package typingsSlinky.gestalt

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveTabIndex extends js.Object {
  var activeTabIndex: Double
  var event: SyntheticEvent[Event, SyntheticMouseEvent[Element]]
}

object Anon_ActiveTabIndex {
  @scala.inline
  def apply(activeTabIndex: Double, event: SyntheticEvent[Event, SyntheticMouseEvent[Element]]): Anon_ActiveTabIndex = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActiveTabIndex]
  }
}

