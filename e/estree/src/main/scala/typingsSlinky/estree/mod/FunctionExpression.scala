package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionExpression
  extends BaseFunction
     with Expression
     with Function {
  
  @JSName("body")
  var body_FunctionExpression: BlockStatement = js.native
  
  var id: js.UndefOr[Identifier | Null] = js.native
  
  @JSName("type")
  var type_FunctionExpression: typingsSlinky.estree.estreeStrings.FunctionExpression = js.native
}
object FunctionExpression {
  
  @scala.inline
  def apply(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typingsSlinky.estree.estreeStrings.FunctionExpression
  ): FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionExpression]
  }
  
  @scala.inline
  implicit class FunctionExpressionMutableBuilder[Self <: FunctionExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BlockStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.FunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
