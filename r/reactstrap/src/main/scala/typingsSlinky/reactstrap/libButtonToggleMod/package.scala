package typingsSlinky.reactstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libButtonToggleMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type ButtonToggle[T] = ReactComponentClass[ButtonToggleProps]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
}
