package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var duration: Double
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLVideoElement]
}

object Duration {
  @scala.inline
  def apply(duration: Double, event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLVideoElement]): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

