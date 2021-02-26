package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassExpression
  extends BaseClass
     with Class
     with Expression {
  
  var id: js.UndefOr[Identifier | Null] = js.native
  
  @JSName("type")
  var type_ClassExpression: typingsSlinky.estree.estreeStrings.ClassExpression = js.native
}
object ClassExpression {
  
  @scala.inline
  def apply(body: ClassBody, `type`: typingsSlinky.estree.estreeStrings.ClassExpression): ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassExpression]
  }
  
  @scala.inline
  implicit class ClassExpressionMutableBuilder[Self <: ClassExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.ClassExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
