package typingsSlinky.d3.mod

import typingsSlinky.d3Array.mod.Numeric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "variance")
@js.native
object variance extends js.Object {
  
  def apply[T /* <: Numeric */](array: js.Iterable[js.UndefOr[T | Null]]): js.UndefOr[Double] = js.native
  def apply[T](
    array: js.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ Double, 
      /* array */ js.Iterable[T], 
      js.UndefOr[Double | Null]
    ]
  ): js.UndefOr[Double] = js.native
}
