package typingsSlinky.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleStatementAndStatement extends StObject {
  
  /**
    * The statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[RuleGroupRuleStatementAndStatementStatement] = js.native
}
object RuleGroupRuleStatementAndStatement {
  
  @scala.inline
  def apply(statements: js.Array[RuleGroupRuleStatementAndStatementStatement]): RuleGroupRuleStatementAndStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementAndStatement]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementAndStatementMutableBuilder[Self <: RuleGroupRuleStatementAndStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: js.Array[RuleGroupRuleStatementAndStatementStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: RuleGroupRuleStatementAndStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
