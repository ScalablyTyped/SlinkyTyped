package typingsSlinky.d3Array.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-array", "map")
@js.native
object map extends js.Object {
  
  def apply[T, U](
    iterable: js.Iterable[T],
    mapper: js.Function3[/* value */ T, /* index */ Double, /* iterable */ js.Iterable[T], U]
  ): js.Array[U] = js.native
}
