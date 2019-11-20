package typingsSlinky.d3DashArray.d3DashArrayMod

import typingsSlinky.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-array", "min")
@js.native
object min extends js.Object {
  def apply(array: Iterable[String]): js.UndefOr[String] = js.native
  def apply[T](
    array: Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ Double, 
      /* array */ js.Iterable[T], 
      js.UndefOr[String | Null]
    ]
  ): js.UndefOr[String] = js.native
}

