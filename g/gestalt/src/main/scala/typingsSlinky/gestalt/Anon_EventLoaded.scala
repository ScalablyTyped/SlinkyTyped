package typingsSlinky.gestalt

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLVideoElement
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventLoaded extends js.Object {
  var event: SyntheticEvent[Event, HTMLVideoElement]
  var loaded: Double
}

object Anon_EventLoaded {
  @scala.inline
  def apply(event: SyntheticEvent[Event, HTMLVideoElement], loaded: Double): Anon_EventLoaded = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventLoaded]
  }
}

