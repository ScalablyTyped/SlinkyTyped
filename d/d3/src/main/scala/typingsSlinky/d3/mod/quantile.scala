package typingsSlinky.d3.mod

import typingsSlinky.d3Array.mod.Numeric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "quantile")
@js.native
object quantile extends js.Object {
  def apply[T /* <: Numeric */](array: js.Iterable[js.UndefOr[T | Null]], p: Double): js.UndefOr[Double] = js.native
  def apply[T](
    array: js.Iterable[T],
    p: Double,
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ js.Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
}

