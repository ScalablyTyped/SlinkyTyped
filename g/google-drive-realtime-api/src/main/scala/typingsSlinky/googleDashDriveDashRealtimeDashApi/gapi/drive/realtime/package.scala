package typingsSlinky.googleDashDriveDashRealtimeDashApi.gapi.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object realtime {
  import org.scalajs.dom.raw.Event
  import typingsSlinky.std.EventListener

  type GoogEventHandler = (js.Function1[(/* e */ Event) | (/* evt */ ObjectChangedEvent), Unit]) | EventListener
}
