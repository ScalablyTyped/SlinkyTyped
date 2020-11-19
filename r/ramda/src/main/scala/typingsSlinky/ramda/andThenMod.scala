package typingsSlinky.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/andThen", JSImport.Namespace)
@js.native
object andThenMod extends js.Object {
  
  def default[A, B](onSuccess: js.Function1[/* a */ A, B | js.Promise[B]]): js.Function1[/* promise */ js.Promise[A], js.Promise[B]] = js.native
  def default[A, B](onSuccess: js.Function1[/* a */ A, B | js.Promise[B]], promise: js.Promise[A]): js.Promise[B] = js.native
}
