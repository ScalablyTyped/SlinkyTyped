package typingsSlinky.gestalt

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLVideoElement
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: Double
  var event: SyntheticEvent[Event, HTMLVideoElement]
}

object Anon_Duration {
  @scala.inline
  def apply(duration: Double, event: SyntheticEvent[Event, HTMLVideoElement]): Anon_Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Duration]
  }
}

