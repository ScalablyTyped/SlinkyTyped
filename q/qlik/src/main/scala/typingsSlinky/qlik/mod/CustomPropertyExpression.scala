package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.StringExpr
import typingsSlinky.qlik.qlikStrings.StringExpression
import typingsSlinky.qlik.qlikStrings.ValueExpression
import typingsSlinky.qlik.qlikStrings.dimension
import typingsSlinky.qlik.qlikStrings.expression
import typingsSlinky.qlik.qlikStrings.measure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPropertyExpression
  extends CustomPropertyCommon
     with CustomProperty {
  
  var component: expression = js.native
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var expressionType: dimension | measure | StringExpr | typingsSlinky.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression = js.native
  
  @JSName("type")
  var type_CustomPropertyExpression: js.UndefOr[scala.Nothing] = js.native
}
object CustomPropertyExpression {
  
  @scala.inline
  def apply(
    component: expression,
    expressionType: dimension | measure | StringExpr | typingsSlinky.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression
  ): CustomPropertyExpression = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], expressionType = expressionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyExpression]
  }
  
  @scala.inline
  implicit class CustomPropertyExpressionOps[Self <: CustomPropertyExpression] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: expression): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionType(
      value: dimension | measure | StringExpr | typingsSlinky.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression
    ): Self = this.set("expressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
  }
}
