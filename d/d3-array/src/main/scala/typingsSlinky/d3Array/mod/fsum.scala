package typingsSlinky.d3Array.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "fsum")
@js.native
object fsum extends js.Object {
  
  def apply[T /* <: Numeric */](values: js.Iterable[js.UndefOr[T | Null]]): Double = js.native
  def apply[T](
    values: js.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ Double, 
      /* array */ js.Iterable[T], 
      js.UndefOr[Double | Null]
    ]
  ): Double = js.native
}
