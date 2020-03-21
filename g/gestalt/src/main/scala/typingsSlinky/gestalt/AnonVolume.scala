package typingsSlinky.gestalt

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVolume extends js.Object {
  var event: SyntheticEvent[Event_, HTMLDivElement]
  var volume: Double
}

object AnonVolume {
  @scala.inline
  def apply(event: SyntheticEvent[Event_, HTMLDivElement], volume: Double): AnonVolume = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonVolume]
  }
}

