package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwaitExpression
  extends BaseNode
     with Expression {
  
  var argument: Expression = js.native
  
  @JSName("type")
  var type_AwaitExpression: typingsSlinky.estree.estreeStrings.AwaitExpression = js.native
}
object AwaitExpression {
  
  @scala.inline
  def apply(argument: Expression, `type`: typingsSlinky.estree.estreeStrings.AwaitExpression): AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwaitExpression]
  }
  
  @scala.inline
  implicit class AwaitExpressionMutableBuilder[Self <: AwaitExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.AwaitExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
