package typingsSlinky.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignmentStatement
  extends _Statement
     with Base[typingsSlinky.luaparse.luaparseStrings.AssignmentStatement] {
  
  var init: js.Array[Expression] = js.native
  
  var variables: js.Array[IndexExpression | MemberExpression | Identifier] = js.native
}
object AssignmentStatement {
  
  @scala.inline
  def apply(
    init: js.Array[Expression],
    `type`: typingsSlinky.luaparse.luaparseStrings.AssignmentStatement,
    variables: js.Array[IndexExpression | MemberExpression | Identifier]
  ): AssignmentStatement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentStatement]
  }
  
  @scala.inline
  implicit class AssignmentStatementMutableBuilder[Self <: AssignmentStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: js.Array[Expression]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitVarargs(value: Expression*): Self = StObject.set(x, "init", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: js.Array[IndexExpression | MemberExpression | Identifier]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: (IndexExpression | MemberExpression | Identifier)*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
