package typingsSlinky.gestalt

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLVideoElement
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventTime extends js.Object {
  var event: SyntheticEvent[Event, HTMLVideoElement]
  var time: Double
}

object Anon_EventTime {
  @scala.inline
  def apply(event: SyntheticEvent[Event, HTMLVideoElement], time: Double): Anon_EventTime = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventTime]
  }
}

