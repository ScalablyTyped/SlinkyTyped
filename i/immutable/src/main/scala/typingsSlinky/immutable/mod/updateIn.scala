package typingsSlinky.immutable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("immutable", "updateIn")
@js.native
object updateIn extends js.Object {
  
  def apply[C](
    collection: C,
    keyPath: js.Iterable[_],
    notSetValue: js.Any,
    updater: js.Function1[/* value */ js.Any, _]
  ): C = js.native
  def apply[C](collection: C, keyPath: js.Iterable[_], updater: js.Function1[/* value */ js.Any, _]): C = js.native
}
