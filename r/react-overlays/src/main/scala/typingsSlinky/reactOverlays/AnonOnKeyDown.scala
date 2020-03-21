package typingsSlinky.reactOverlays

import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnKeyDown extends js.Object {
  def onKeyDown(event: SyntheticEvent[Event_, _]): Unit
}

object AnonOnKeyDown {
  @scala.inline
  def apply(onKeyDown: SyntheticEvent[Event_, _] => Unit): AnonOnKeyDown = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
  
    __obj.asInstanceOf[AnonOnKeyDown]
  }
}

