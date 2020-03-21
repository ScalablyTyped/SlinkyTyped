package typingsSlinky.d3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "cross")
@js.native
object cross extends js.Object {
  def apply[S, T](a: js.Iterable[S], b: js.Iterable[T]): js.Array[js.Tuple2[S, T]] = js.native
  def apply[S, T, U](a: js.Iterable[S], b: js.Iterable[T], reducer: js.Function2[/* a */ S, /* b */ T, U]): js.Array[U] = js.native
}

