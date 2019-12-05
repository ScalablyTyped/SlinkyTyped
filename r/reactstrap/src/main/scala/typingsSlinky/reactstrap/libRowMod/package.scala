package typingsSlinky.reactstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRowMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type Row[T] = ReactComponentClass[RowProps]
}
