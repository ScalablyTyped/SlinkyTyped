package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayExpression
  extends BaseNode
     with Expression {
  
  var elements: js.Array[Expression | SpreadElement] = js.native
  
  @JSName("type")
  var type_ArrayExpression: typingsSlinky.estree.estreeStrings.ArrayExpression = js.native
}
object ArrayExpression {
  
  @scala.inline
  def apply(
    elements: js.Array[Expression | SpreadElement],
    `type`: typingsSlinky.estree.estreeStrings.ArrayExpression
  ): ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayExpression]
  }
  
  @scala.inline
  implicit class ArrayExpressionMutableBuilder[Self <: ArrayExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[Expression | SpreadElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: (Expression | SpreadElement)*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.ArrayExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
