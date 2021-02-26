package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForStatement
  extends BaseNode
     with Statement {
  
  var body: Statement = js.native
  
  var init: js.UndefOr[VariableDeclaration | Expression | Null] = js.native
  
  var test: js.UndefOr[Expression | Null] = js.native
  
  @JSName("type")
  var type_ForStatement: typingsSlinky.estree.estreeStrings.ForStatement = js.native
  
  var update: js.UndefOr[Expression | Null] = js.native
}
object ForStatement {
  
  @scala.inline
  def apply(body: Statement, `type`: typingsSlinky.estree.estreeStrings.ForStatement): ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForStatement]
  }
  
  @scala.inline
  implicit class ForStatementMutableBuilder[Self <: ForStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: VariableDeclaration | Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitNull: Self = StObject.set(x, "init", null)
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestNull: Self = StObject.set(x, "test", null)
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.ForStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: Expression): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateNull: Self = StObject.set(x, "update", null)
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
