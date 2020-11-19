package typingsSlinky.ramda

import typingsSlinky.ramda.toolsMod.PipeWithFns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/pipeWith", JSImport.Namespace)
@js.native
object pipeWithMod extends js.Object {
  
  def default(composer: js.Function1[/* a */ js.Any, _]): js.Function1[/* fns */ PipeWithFns[_, _], js.Function1[/* x0 */ _, _]] = js.native
  def default[V0, T](composer: js.Function1[/* a */ js.Any, _], fns: PipeWithFns[V0, T]): js.Function1[/* x0 */ V0, T] = js.native
}
