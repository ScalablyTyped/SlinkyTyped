package typingsSlinky.ramda

import typingsSlinky.ramda.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/construct", JSImport.Namespace)
@js.native
object constructMod extends js.Object {
  
  def default[A /* <: js.Array[_] */, T](constructor: js.Function1[/* a */ A, T]): js.Function1[/* a */ A, T] = js.native
  def default[A /* <: js.Array[_] */, T](constructor: Instantiable[A, T]): js.Function1[/* a */ A, T] = js.native
}
