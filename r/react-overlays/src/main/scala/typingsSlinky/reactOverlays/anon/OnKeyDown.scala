package typingsSlinky.reactOverlays.anon

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnKeyDown extends js.Object {
  def onKeyDown(event: SyntheticEvent[Event, _]): Unit
}

object OnKeyDown {
  @scala.inline
  def apply(onKeyDown: SyntheticEvent[Event, _] => Unit): OnKeyDown = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[OnKeyDown]
  }
}

