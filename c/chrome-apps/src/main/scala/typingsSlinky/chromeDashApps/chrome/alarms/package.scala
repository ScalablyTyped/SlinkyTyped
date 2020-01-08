package typingsSlinky.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object alarms {
  import typingsSlinky.chromeDashApps.chrome.events.Event

  type AlarmEvent = Event[js.Function1[/* alarm */ Alarm, Unit]]
}
