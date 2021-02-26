package typingsSlinky.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableKeyString
  extends Base[typingsSlinky.luaparse.luaparseStrings.TableKeyString]
     with _Node {
  
  var key: Identifier = js.native
  
  var value: Expression = js.native
}
object TableKeyString {
  
  @scala.inline
  def apply(key: Identifier, `type`: typingsSlinky.luaparse.luaparseStrings.TableKeyString, value: Expression): TableKeyString = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableKeyString]
  }
  
  @scala.inline
  implicit class TableKeyStringMutableBuilder[Self <: TableKeyString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Identifier): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
