package typingsSlinky.formatjsEcma402Abstract.utilsMod

import typingsSlinky.std.Pick
import typingsSlinky.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/lib/utils", "getMultiInternalSlots")
@js.native
object getMultiInternalSlots extends js.Object {
  
  def apply[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, fields: Field*): Pick[Internal, Field] = js.native
}
