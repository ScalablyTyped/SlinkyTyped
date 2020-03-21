package typingsSlinky.gestalt

import org.scalajs.dom.raw.HTMLVideoElement
import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoaded extends js.Object {
  var event: SyntheticEvent[Event_, HTMLVideoElement]
  var loaded: Double
}

object AnonLoaded {
  @scala.inline
  def apply(event: SyntheticEvent[Event_, HTMLVideoElement], loaded: Double): AnonLoaded = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLoaded]
  }
}

