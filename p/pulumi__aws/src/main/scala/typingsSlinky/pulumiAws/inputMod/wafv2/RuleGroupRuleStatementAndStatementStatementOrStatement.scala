package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleStatementAndStatementStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: Input[js.Array[Input[RuleGroupRuleStatementAndStatementStatementOrStatementStatement]]] = js.native
}
object RuleGroupRuleStatementAndStatementStatementOrStatement {
  
  @scala.inline
  def apply(
    statements: Input[js.Array[Input[RuleGroupRuleStatementAndStatementStatementOrStatementStatement]]]
  ): RuleGroupRuleStatementAndStatementStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementAndStatementStatementOrStatement]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementAndStatementStatementOrStatementMutableBuilder[Self <: RuleGroupRuleStatementAndStatementStatementOrStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: Input[js.Array[Input[RuleGroupRuleStatementAndStatementStatementOrStatementStatement]]]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: Input[RuleGroupRuleStatementAndStatementStatementOrStatementStatement]*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
