package typingsSlinky.d3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "count")
@js.native
object count extends js.Object {
  
  def apply[TObject](iterable: js.Iterable[TObject]): Double = js.native
  def apply[TObject](
    iterable: js.Iterable[TObject],
    accessor: js.Function2[/* a */ TObject, /* b */ TObject, js.UndefOr[Double | Null]]
  ): Double = js.native
}
