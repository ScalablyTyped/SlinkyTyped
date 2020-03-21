package typingsSlinky.gestalt

import org.scalajs.dom.raw.HTMLVideoElement
import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTime extends js.Object {
  var event: SyntheticEvent[Event_, HTMLVideoElement]
  var time: Double
}

object AnonTime {
  @scala.inline
  def apply(event: SyntheticEvent[Event_, HTMLVideoElement], time: Double): AnonTime = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTime]
  }
}

