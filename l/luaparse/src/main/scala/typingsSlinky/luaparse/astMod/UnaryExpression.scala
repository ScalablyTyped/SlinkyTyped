package typingsSlinky.luaparse.astMod

import typingsSlinky.luaparse.luaparseStrings.Numbersign
import typingsSlinky.luaparse.luaparseStrings.Tilde
import typingsSlinky.luaparse.luaparseStrings.`-_`
import typingsSlinky.luaparse.luaparseStrings.not
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnaryExpression
  extends Expression
     with Base[typingsSlinky.luaparse.luaparseStrings.UnaryExpression] {
  
  var argument: Expression = js.native
  
  var operator: not | `-_` | Tilde | Numbersign = js.native
}
object UnaryExpression {
  
  @scala.inline
  def apply(
    argument: Expression,
    operator: not | `-_` | Tilde | Numbersign,
    `type`: typingsSlinky.luaparse.luaparseStrings.UnaryExpression
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryExpression]
  }
  
  @scala.inline
  implicit class UnaryExpressionMutableBuilder[Self <: UnaryExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: not | `-_` | Tilde | Numbersign): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
