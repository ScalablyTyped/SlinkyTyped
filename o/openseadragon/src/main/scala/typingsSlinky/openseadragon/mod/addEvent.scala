package typingsSlinky.openseadragon.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "addEvent")
@js.native
object addEvent extends js.Object {
  
  def apply(element: String, eventName: String, handler: js.Function1[/* event */ Event, Unit]): Unit = js.native
  def apply(
    element: String,
    eventName: String,
    handler: js.Function1[/* event */ Event, Unit],
    useCapture: Boolean
  ): Unit = js.native
  def apply(element: Element, eventName: String, handler: js.Function1[/* event */ Event, Unit]): Unit = js.native
  def apply(
    element: Element,
    eventName: String,
    handler: js.Function1[/* event */ Event, Unit],
    useCapture: Boolean
  ): Unit = js.native
}
