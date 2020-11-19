package typingsSlinky.ramda

import typingsSlinky.ramda.toolsMod.Lens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/view", JSImport.Namespace)
@js.native
object viewMod extends js.Object {
  
  def default[T, U](lens: Lens): js.Function1[/* obj */ T, U] = js.native
  def default[T, U](lens: Lens, obj: T): U = js.native
}
