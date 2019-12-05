package typingsSlinky.reactDashOverlays

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  def onKeyDown(event: SyntheticEvent[Event, _]): Unit
}

object Anon_Event {
  @scala.inline
  def apply(onKeyDown: SyntheticEvent[Event, _] => Unit): Anon_Event = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
  
    __obj.asInstanceOf[Anon_Event]
  }
}

