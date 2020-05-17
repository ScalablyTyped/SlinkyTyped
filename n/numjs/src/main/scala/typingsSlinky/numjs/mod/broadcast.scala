package typingsSlinky.numjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numjs", "broadcast")
@js.native
object broadcast extends js.Object {
  def apply[T, U](shape1: js.Array[T], shape2: js.Array[U]): js.Array[T | U] = js.native
}

