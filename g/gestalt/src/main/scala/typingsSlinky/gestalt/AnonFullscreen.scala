package typingsSlinky.gestalt

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFullscreen extends js.Object {
  var event: SyntheticEvent[Event_, HTMLDivElement]
  var fullscreen: Boolean
}

object AnonFullscreen {
  @scala.inline
  def apply(event: SyntheticEvent[Event_, HTMLDivElement], fullscreen: Boolean): AnonFullscreen = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], fullscreen = fullscreen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFullscreen]
  }
}

