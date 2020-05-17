package typingsSlinky.googleDriveRealtimeApi.gapi.drive.realtime

import org.scalajs.dom.raw.Event
import typingsSlinky.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
(/ * e * / typingsSlinky.std.Event) | (/ * evt * / typingsSlinky.googleDriveRealtimeApi.gapi.drive.realtime.ObjectChangedEvent), 
scala.Unit]
  - typingsSlinky.std.EventListener
*/
trait GoogEventHandler extends js.Object

object GoogEventHandler {
  @scala.inline
  implicit def apply(value: EventListener | (js.Function1[(/* e */ Event) | (/* evt */ ObjectChangedEvent), Unit])): GoogEventHandler = value.asInstanceOf[GoogEventHandler]
}

