package typingsSlinky.luaparse.astMod

import typingsSlinky.luaparse.luaparseStrings.and
import typingsSlinky.luaparse.luaparseStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogicalExpression
  extends Expression
     with Base[typingsSlinky.luaparse.luaparseStrings.LogicalExpression] {
  
  var left: Expression = js.native
  
  var operator: or | and = js.native
  
  var right: Expression = js.native
}
object LogicalExpression {
  
  @scala.inline
  def apply(
    left: Expression,
    operator: or | and,
    right: Expression,
    `type`: typingsSlinky.luaparse.luaparseStrings.LogicalExpression
  ): LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalExpression]
  }
  
  @scala.inline
  implicit class LogicalExpressionMutableBuilder[Self <: LogicalExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: or | and): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
