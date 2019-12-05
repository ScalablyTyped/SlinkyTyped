package typingsSlinky.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mongoMod {
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  // Based on https://github.com/microsoft/TypeScript/issues/28791#issuecomment-443520161
  type UnionOmit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
