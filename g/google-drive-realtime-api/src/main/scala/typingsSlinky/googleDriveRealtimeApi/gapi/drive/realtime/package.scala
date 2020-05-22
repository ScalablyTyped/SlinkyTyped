package typingsSlinky.googleDriveRealtimeApi.gapi.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object realtime {
  type GoogEventHandler = (js.Function1[
    (/* e */ org.scalajs.dom.raw.Event) | (/* evt */ typingsSlinky.googleDriveRealtimeApi.gapi.drive.realtime.ObjectChangedEvent), 
    scala.Unit
  ]) | typingsSlinky.std.EventListener
}
