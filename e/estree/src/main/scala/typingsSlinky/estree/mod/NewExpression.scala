package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.estree.mod.Node because Already inherited
- typingsSlinky.estree.mod.Expression because Already inherited */ @js.native
trait NewExpression
  extends BaseCallExpression
     with CallExpression {
  
  @JSName("type")
  var type_NewExpression: typingsSlinky.estree.estreeStrings.NewExpression = js.native
}
object NewExpression {
  
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    `type`: typingsSlinky.estree.estreeStrings.NewExpression
  ): NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewExpression]
  }
  
  @scala.inline
  implicit class NewExpressionMutableBuilder[Self <: NewExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.NewExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
