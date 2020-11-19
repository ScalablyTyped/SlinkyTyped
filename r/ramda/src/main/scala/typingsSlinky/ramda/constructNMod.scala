package typingsSlinky.ramda

import typingsSlinky.ramda.anon.Instantiable
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/constructN", JSImport.Namespace)
@js.native
object constructNMod extends js.Object {
  
  def default[A /* <: js.Array[_] */, T](n: Double, constructor: js.Function1[/* a */ A, T]): js.Function1[/* a */ Partial[A], T] = js.native
  def default[A /* <: js.Array[_] */, T](n: Double, constructor: Instantiable[A, T]): js.Function1[/* a */ Partial[A], T] = js.native
}
