package typingsSlinky.gestalt

import org.scalajs.dom.raw.HTMLVideoElement
import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  var duration: Double
  var event: SyntheticEvent[Event_, HTMLVideoElement]
}

object AnonDuration {
  @scala.inline
  def apply(duration: Double, event: SyntheticEvent[Event_, HTMLVideoElement]): AnonDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDuration]
  }
}

