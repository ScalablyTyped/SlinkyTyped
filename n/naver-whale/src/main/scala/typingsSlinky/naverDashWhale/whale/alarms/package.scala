package typingsSlinky.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object alarms {
  import typingsSlinky.chrome.chrome.events.Event

  type AlarmEvent = Event[js.Function1[/* alarm */ typingsSlinky.chrome.chrome.alarms.Alarm, Unit]]
}
