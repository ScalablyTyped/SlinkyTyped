package typingsSlinky.d3Array.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "greatestIndex")
@js.native
object greatestIndex extends js.Object {
  
  def apply[T](iterable: js.Iterable[T]): js.UndefOr[Double] = js.native
  def apply[T](iterable: js.Iterable[T], comparator: js.Function2[/* a */ T, /* b */ T, Double]): js.UndefOr[Double] = js.native
  def apply[T, U](iterable: js.Iterable[T], accessor: js.Function1[/* a */ T, U]): js.UndefOr[Double] = js.native
}
