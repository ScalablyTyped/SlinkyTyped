package typingsSlinky.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.ObjC.SimpleProtocolMethodSpec
  - typingsSlinky.fridaGum.ObjC.DetailedProtocolMethodSpec
*/
trait ProtocolMethodSpec extends js.Object
object ProtocolMethodSpec {
  
  @scala.inline
  def SimpleProtocolMethodSpec(argTypes: js.Array[String], retType: String): ProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolMethodSpec]
  }
  
  @scala.inline
  def DetailedProtocolMethodSpec(types: String): ProtocolMethodSpec = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolMethodSpec]
  }
}
