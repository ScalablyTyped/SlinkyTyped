package typingsSlinky.gestalt

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Checked extends js.Object {
  var checked: Boolean
  var event: SyntheticEvent[Event, HTMLInputElement]
}

object Anon_Checked {
  @scala.inline
  def apply(checked: Boolean, event: SyntheticEvent[Event, HTMLInputElement]): Anon_Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Checked]
  }
}

