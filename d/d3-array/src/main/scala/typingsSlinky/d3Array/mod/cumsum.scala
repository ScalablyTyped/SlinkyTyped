package typingsSlinky.d3Array.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "cumsum")
@js.native
object cumsum extends js.Object {
  
  def apply[T /* <: Numeric */](iterable: js.Iterable[js.UndefOr[T | Null]]): js.typedarray.Float64Array = js.native
  def apply[T](
    iterable: js.Iterable[T],
    accessor: js.Function3[/* element */ T, /* i */ Double, /* array */ js.Iterable[T], js.UndefOr[Double | Null]]
  ): js.typedarray.Float64Array = js.native
}
