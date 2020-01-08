package typingsSlinky.atRebassForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atRebassFormsMod {
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type Omit[T, K] = Pick[T, Exclude[String, K]]
}
