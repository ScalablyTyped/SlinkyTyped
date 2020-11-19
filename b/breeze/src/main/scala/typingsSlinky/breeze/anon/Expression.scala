package typingsSlinky.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expression extends js.Object {
  
  var expression: js.RegExp = js.native
  
  var messageTemplate: js.UndefOr[String] = js.native
}
object Expression {
  
  @scala.inline
  def apply(expression: js.RegExp): Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  
  @scala.inline
  implicit class ExpressionOps[Self <: Expression] (val x: Self) extends AnyVal {
    
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
    def setExpression(value: js.RegExp): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTemplate(value: String): Self = this.set("messageTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageTemplate: Self = this.set("messageTemplate", js.undefined)
  }
}
