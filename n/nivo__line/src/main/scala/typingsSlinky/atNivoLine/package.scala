package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoLine {
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
