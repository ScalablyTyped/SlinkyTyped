package typingsSlinky.officeUiFabricReact.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "on")
@js.native
object on extends js.Object {
  def apply(element: Element, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = js.native
  def apply(
    element: Element,
    eventName: String,
    callback: js.Function1[/* ev */ Event, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def apply(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = js.native
  def apply(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit], options: Boolean): js.Function0[Unit] = js.native
}

