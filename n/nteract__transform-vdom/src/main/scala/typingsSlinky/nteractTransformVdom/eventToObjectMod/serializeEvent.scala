package typingsSlinky.nteractTransformVdom.eventToObjectMod

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nteract/transform-vdom/lib/event-to-object", "serializeEvent")
@js.native
object serializeEvent extends js.Object {
  def apply[T](event: SyntheticEvent[Event, T]): SerializedEvent[T] = js.native
}

