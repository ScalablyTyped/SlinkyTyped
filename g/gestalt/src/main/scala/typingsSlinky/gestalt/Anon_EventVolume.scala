package typingsSlinky.gestalt

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventVolume extends js.Object {
  var event: SyntheticEvent[Event, HTMLDivElement]
  var volume: Double
}

object Anon_EventVolume {
  @scala.inline
  def apply(event: SyntheticEvent[Event, HTMLDivElement], volume: Double): Anon_EventVolume = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventVolume]
  }
}

