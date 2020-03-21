package typingsSlinky.gestalt

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.SyntheticEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var event: SyntheticEvent[
    Event_, 
    SyntheticKeyboardEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement]
  ]
}

object Anon1 {
  @scala.inline
  def apply(
    event: SyntheticEvent[
      Event_, 
      SyntheticKeyboardEvent[HTMLDivElement] | SyntheticMouseEvent[HTMLDivElement]
    ]
  ): Anon1 = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon1]
  }
}

