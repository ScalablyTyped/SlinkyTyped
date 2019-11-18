package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object electron {
  import typingsSlinky.std.Event

  type GlobalEvent = Event
  type NodeRequireFunction = js.Function1[typingsSlinky.electron.electronStrings.electron, TypeofElectron]
}
