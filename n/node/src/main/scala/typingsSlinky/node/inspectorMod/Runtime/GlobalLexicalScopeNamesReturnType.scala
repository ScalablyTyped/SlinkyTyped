package typingsSlinky.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalLexicalScopeNamesReturnType extends StObject {
  
  var names: js.Array[String] = js.native
}
object GlobalLexicalScopeNamesReturnType {
  
  @scala.inline
  def apply(names: js.Array[String]): GlobalLexicalScopeNamesReturnType = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalLexicalScopeNamesReturnType]
  }
  
  @scala.inline
  implicit class GlobalLexicalScopeNamesReturnTypeMutableBuilder[Self <: GlobalLexicalScopeNamesReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
  }
}
