package typingsSlinky.estreeJsx.mod

import typingsSlinky.estree.mod.BaseNode
import typingsSlinky.estree.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXSpreadChild extends BaseNode {
  
  var expression: Expression = js.native
  
  @JSName("type")
  var type_JSXSpreadChild: typingsSlinky.estreeJsx.estreeJsxStrings.JSXSpreadChild = js.native
}
object JSXSpreadChild {
  
  @scala.inline
  def apply(expression: Expression, `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXSpreadChild): JSXSpreadChild = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXSpreadChild]
  }
  
  @scala.inline
  implicit class JSXSpreadChildMutableBuilder[Self <: JSXSpreadChild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.estreeJsx.estreeJsxStrings.JSXSpreadChild): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
