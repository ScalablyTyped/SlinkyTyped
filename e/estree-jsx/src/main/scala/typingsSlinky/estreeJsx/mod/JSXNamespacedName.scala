package typingsSlinky.estreeJsx.mod

import typingsSlinky.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXNamespacedName
  extends BaseNode
     with _Node {
  
  @JSName("type")
  var type_JSXNamespacedName: typingsSlinky.estreeJsx.estreeJsxStrings.JSXNamespacedName = js.native
}
object JSXNamespacedName {
  
  @scala.inline
  def apply(`type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXNamespacedName): JSXNamespacedName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXNamespacedName]
  }
  
  @scala.inline
  implicit class JSXNamespacedNameMutableBuilder[Self <: JSXNamespacedName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.estreeJsx.estreeJsxStrings.JSXNamespacedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
