package typingsSlinky.ramda

import typingsSlinky.ramda.anon.Fn0
import typingsSlinky.ramda.anon.FnCallValObj
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/propEq", JSImport.Namespace)
@js.native
object propEqMod extends js.Object {
  
  def default(name: String): FnCallValObj = js.native
  def default(name: Double): Fn0 = js.native
  def default[V](name: String, `val`: V): js.Function1[/* obj */ Record[String, V], Boolean] = js.native
  def default[V](name: String, `val`: V, obj: Record[String, V]): Boolean = js.native
  def default[V](name: Double, `val`: V): js.Function1[/* obj */ Record[Double, V], Boolean] = js.native
  def default[V](name: Double, `val`: V, obj: Record[Double, V]): Boolean = js.native
}
