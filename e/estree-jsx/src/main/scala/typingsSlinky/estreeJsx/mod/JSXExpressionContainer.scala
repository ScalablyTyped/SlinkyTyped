package typingsSlinky.estreeJsx.mod

import typingsSlinky.estree.mod.BaseNode
import typingsSlinky.estree.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXExpressionContainer
  extends BaseNode
     with _Node {
  
  var expression: Expression | JSXEmptyExpression = js.native
  
  @JSName("type")
  var type_JSXExpressionContainer: typingsSlinky.estreeJsx.estreeJsxStrings.JSXExpressionContainer = js.native
}
object JSXExpressionContainer {
  
  @scala.inline
  def apply(
    expression: Expression | JSXEmptyExpression,
    `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXExpressionContainer
  ): JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXExpressionContainer]
  }
  
  @scala.inline
  implicit class JSXExpressionContainerOps[Self <: JSXExpressionContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExpression(value: Expression | JSXEmptyExpression): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.estreeJsx.estreeJsxStrings.JSXExpressionContainer): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
