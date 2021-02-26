package typingsSlinky.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceAssignmentExpression extends BaseElement {
  
  var expression: Expression = js.native
}
object ResourceAssignmentExpression {
  
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, expression: Expression, id: String): ResourceAssignmentExpression = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceAssignmentExpression]
  }
  
  @scala.inline
  implicit class ResourceAssignmentExpressionMutableBuilder[Self <: ResourceAssignmentExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
  }
}
