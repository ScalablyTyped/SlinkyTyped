package typingsSlinky.d3Array.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "quantile")
@js.native
object quantile extends js.Object {
  
  def apply[T /* <: Numeric */](iterable: js.Iterable[js.UndefOr[T | Null]], p: Double): js.UndefOr[Double] = js.native
  def apply[T](
    iterable: js.Iterable[T],
    p: Double,
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ js.Iterable[T], js.UndefOr[Double | Null]]
  ): js.UndefOr[Double] = js.native
}
