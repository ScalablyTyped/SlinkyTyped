package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.JSXAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait JSXAttribute_
  extends Immutable
     with BaseNode
     with JSX {
  
  var name: JSXIdentifier_ | JSXNamespacedName_ = js.native
  
  @JSName("type")
  var type_JSXAttribute_ : JSXAttribute = js.native
  
  var value: JSXElement_ | JSXFragment_ | StringLiteral_ | JSXExpressionContainer_ | Null = js.native
}
object JSXAttribute_ {
  
  @scala.inline
  def apply(name: JSXIdentifier_ | JSXNamespacedName_, `type`: JSXAttribute): JSXAttribute_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXAttribute_]
  }
  
  @scala.inline
  implicit class JSXAttribute_MutableBuilder[Self <: JSXAttribute_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: JSXIdentifier_ | JSXNamespacedName_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: JSXElement_ | JSXFragment_ | StringLiteral_ | JSXExpressionContainer_): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
  }
}
