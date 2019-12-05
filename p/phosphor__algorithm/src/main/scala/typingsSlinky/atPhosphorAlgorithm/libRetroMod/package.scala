package typingsSlinky.atPhosphorAlgorithm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRetroMod {
  import typingsSlinky.std.ArrayLike

  type RetroableOrArrayLike[T] = IRetroable[T] | ArrayLike[T]
}
