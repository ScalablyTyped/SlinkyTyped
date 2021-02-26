package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithStatement
  extends BaseNode
     with Statement {
  
  var body: Statement = js.native
  
  var `object`: Expression = js.native
  
  @JSName("type")
  var type_WithStatement: typingsSlinky.estree.estreeStrings.WithStatement = js.native
}
object WithStatement {
  
  @scala.inline
  def apply(body: Statement, `object`: Expression, `type`: typingsSlinky.estree.estreeStrings.WithStatement): WithStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStatement]
  }
  
  @scala.inline
  implicit class WithStatementMutableBuilder[Self <: WithStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Expression): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.WithStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
