package typingsSlinky.openseadragon.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "addEvent")
@js.native
object addEvent extends js.Object {
  def apply(element: String, eventName: String, handler: js.Function1[/* event */ Event_, Unit]): Unit = js.native
  def apply(
    element: String,
    eventName: String,
    handler: js.Function1[/* event */ Event_, Unit],
    useCapture: Boolean
  ): Unit = js.native
  def apply(element: Element, eventName: String, handler: js.Function1[/* event */ Event_, Unit]): Unit = js.native
  def apply(
    element: Element,
    eventName: String,
    handler: js.Function1[/* event */ Event_, Unit],
    useCapture: Boolean
  ): Unit = js.native
}

