package typingsSlinky.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object permissions {
  import typingsSlinky.chromeDashApps.chrome.events.Event

  type PermissionEvent = Event[js.Function1[/* permissions */ Permissions, Unit]]
}
