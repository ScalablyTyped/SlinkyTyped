package typingsSlinky.durandal.serializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plugins/serializer", "reviver")
@js.native
object reviver extends js.Object {
  
  def apply(
    key: String,
    value: js.Any,
    getTypeId: js.Function1[/* value */ js.Any, String],
    getConstructor: js.Function1[/* id */ String, js.Function0[_]]
  ): js.Any = js.native
}
