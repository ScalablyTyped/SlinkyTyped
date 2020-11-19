package typingsSlinky.ramda

import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/pick", JSImport.Namespace)
@js.native
object pickMod extends js.Object {
  
  def default[K /* <: String | Double | js.Symbol */](names: js.Array[K]): js.Function1[
    /* obj */ js.Any, 
    Pick[_, Exclude[/* keyof any */ String, Exclude[/* keyof any */ String, K]]]
  ] = js.native
  def default[T, K /* <: String | Double | js.Symbol */](names: js.Array[K], obj: T): Pick[T, Exclude[/* keyof T */ String, Exclude[/* keyof T */ String, K]]] = js.native
}
