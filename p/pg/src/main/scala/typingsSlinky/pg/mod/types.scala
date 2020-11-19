package typingsSlinky.pg.mod

import typingsSlinky.pgTypes.mod.TypeFormat
import typingsSlinky.pgTypes.mod.TypeId
import typingsSlinky.pgTypes.mod.TypesBuiltins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg", "types")
@js.native
object types extends js.Object {
  
  def arrayParser(source: String, transform: js.Function1[/* entry */ js.Any, _]): js.Array[_] = js.native
  
  val builtins: TypesBuiltins = js.native
  
  def getTypeParser(id: TypeId): js.Any = js.native
  def getTypeParser(id: TypeId, format: TypeFormat): js.Any = js.native
  
  def setTypeParser(id: TypeId, format: TypeFormat, parseFn: js.Function1[/* value */ String, _]): Unit = js.native
  def setTypeParser(id: TypeId, parseFn: js.Function1[/* value */ String, _]): Unit = js.native
}
