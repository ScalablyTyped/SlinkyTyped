package typingsSlinky.googleDriveRealtimeApi.gapi.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object realtime {
  type GoogEventHandler = (js.Function1[
    (/* e */ typingsSlinky.std.Event_) | (/* evt */ typingsSlinky.googleDriveRealtimeApi.gapi.drive.realtime.ObjectChangedEvent), 
    scala.Unit
  ]) | typingsSlinky.std.EventListener
}
