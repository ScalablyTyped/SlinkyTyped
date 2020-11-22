package typingsSlinky.d3Array.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "extent")
@js.native
object extent extends js.Object {
  
  def apply(iterable: js.Iterable[String]): js.Tuple2[js.UndefOr[String], js.UndefOr[String]] = js.native
  def apply[T](
    iterable: js.Iterable[T],
    accessor: js.Function3[
      /* datum */ T, 
      /* index */ Double, 
      /* array */ js.Iterable[T], 
      js.UndefOr[String | Null]
    ]
  ): js.Tuple2[js.UndefOr[String], js.UndefOr[String]] = js.native
}
