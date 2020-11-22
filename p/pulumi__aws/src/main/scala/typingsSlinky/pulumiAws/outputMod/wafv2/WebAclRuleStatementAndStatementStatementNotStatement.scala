package typingsSlinky.pulumiAws.outputMod.wafv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementAndStatementStatementNotStatement extends js.Object {
  
  /**
    * The statement to negate. You can use any statement that can be nested. See Statement above for details.
    */
  var statements: js.Array[WebAclRuleStatementAndStatementStatementNotStatementStatement] = js.native
}
object WebAclRuleStatementAndStatementStatementNotStatement {
  
  @scala.inline
  def apply(statements: js.Array[WebAclRuleStatementAndStatementStatementNotStatementStatement]): WebAclRuleStatementAndStatementStatementNotStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementAndStatementStatementNotStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementAndStatementStatementNotStatementOps[Self <: WebAclRuleStatementAndStatementStatementNotStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStatementsVarargs(value: WebAclRuleStatementAndStatementStatementNotStatementStatement*): Self = this.set("statements", js.Array(value :_*))
    
    @scala.inline
    def setStatements(value: js.Array[WebAclRuleStatementAndStatementStatementNotStatementStatement]): Self = this.set("statements", value.asInstanceOf[js.Any])
  }
}
