package typingsSlinky.d3DashArray.d3DashArrayMod

import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-array", "pairs")
@js.native
object pairs extends js.Object {
  def apply[T](array: Iterable[T]): js.Array[js.Tuple2[T, T]] = js.native
  def apply[T, U](array: Iterable[T], reducer: js.Function2[/* a */ T, /* b */ T, U]): js.Array[U] = js.native
}

