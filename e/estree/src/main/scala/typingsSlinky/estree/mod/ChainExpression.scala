package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChainExpression
  extends BaseNode
     with Expression {
  
  var expression: ChainElement = js.native
  
  @JSName("type")
  var type_ChainExpression: typingsSlinky.estree.estreeStrings.ChainExpression = js.native
}
object ChainExpression {
  
  @scala.inline
  def apply(expression: ChainElement, `type`: typingsSlinky.estree.estreeStrings.ChainExpression): ChainExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainExpression]
  }
  
  @scala.inline
  implicit class ChainExpressionOps[Self <: ChainExpression] (val x: Self) extends AnyVal {
    
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
    def setExpression(value: ChainElement): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.ChainExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
