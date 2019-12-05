package typingsSlinky.gestalt

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventFullscreen extends js.Object {
  var event: SyntheticEvent[Event, HTMLDivElement]
  var fullscreen: Boolean
}

object Anon_EventFullscreen {
  @scala.inline
  def apply(event: SyntheticEvent[Event, HTMLDivElement], fullscreen: Boolean): Anon_EventFullscreen = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], fullscreen = fullscreen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventFullscreen]
  }
}

