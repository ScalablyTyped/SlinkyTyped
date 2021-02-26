package typingsSlinky.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.ObjC.SimpleBlockSignature
  - typingsSlinky.fridaGum.ObjC.DetailedBlockSignature
*/
trait BlockSignature extends StObject
object BlockSignature {
  
  @scala.inline
  def DetailedBlockSignature(types: String): typingsSlinky.fridaGum.ObjC.DetailedBlockSignature = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.ObjC.DetailedBlockSignature]
  }
  
  @scala.inline
  def SimpleBlockSignature(argTypes: js.Array[String], retType: String): typingsSlinky.fridaGum.ObjC.SimpleBlockSignature = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.fridaGum.ObjC.SimpleBlockSignature]
  }
}
