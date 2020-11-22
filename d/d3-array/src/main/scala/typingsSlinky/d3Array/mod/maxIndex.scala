package typingsSlinky.d3Array.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "maxIndex")
@js.native
object maxIndex extends js.Object {
  
  def apply[T](iterable: js.Iterable[T]): Double = js.native
  def apply[TDatum, U](
    iterable: js.Iterable[TDatum],
    accessor: js.Function3[
      /* datum */ TDatum, 
      /* index */ Double, 
      /* array */ js.Iterable[TDatum], 
      js.UndefOr[U | Null]
    ]
  ): Double = js.native
}
