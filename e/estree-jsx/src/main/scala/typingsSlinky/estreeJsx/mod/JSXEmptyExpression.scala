package typingsSlinky.estreeJsx.mod

import typingsSlinky.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXEmptyExpression
  extends BaseNode
     with _Node {
  
  @JSName("type")
  var type_JSXEmptyExpression: typingsSlinky.estreeJsx.estreeJsxStrings.JSXEmptyExpression = js.native
}
object JSXEmptyExpression {
  
  @scala.inline
  def apply(`type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXEmptyExpression): JSXEmptyExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXEmptyExpression]
  }
  
  @scala.inline
  implicit class JSXEmptyExpressionMutableBuilder[Self <: JSXEmptyExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.estreeJsx.estreeJsxStrings.JSXEmptyExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
