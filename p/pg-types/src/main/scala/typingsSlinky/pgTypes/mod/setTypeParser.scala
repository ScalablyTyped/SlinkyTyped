package typingsSlinky.pgTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg-types", "setTypeParser")
@js.native
object setTypeParser extends js.Object {
  
  def apply(id: TypeId, format: TypeFormat, parseFn: js.Function1[/* value */ String, _]): Unit = js.native
  def apply(id: TypeId, parseFn: js.Function1[/* value */ String, _]): Unit = js.native
}
