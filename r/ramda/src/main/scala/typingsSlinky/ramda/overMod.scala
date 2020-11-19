package typingsSlinky.ramda

import typingsSlinky.ramda.toolsMod.Arity1Fn
import typingsSlinky.ramda.toolsMod.Lens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/over", JSImport.Namespace)
@js.native
object overMod extends js.Object {
  
  def default(lens: Lens): js.Function2[/* fn */ Arity1Fn, /* value */ js.Array[_], js.Array[_]] = js.native
  def default(lens: Lens, fn: Arity1Fn): js.Function1[/* value */ js.Array[_], js.Array[_]] = js.native
  def default[T](lens: Lens, fn: Arity1Fn, value: T): T = js.native
  def default[T](lens: Lens, fn: Arity1Fn, value: js.Array[T]): js.Array[T] = js.native
}
