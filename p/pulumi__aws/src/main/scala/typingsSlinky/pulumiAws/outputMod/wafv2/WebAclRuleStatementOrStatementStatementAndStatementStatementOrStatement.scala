package typingsSlinky.pulumiAws.outputMod.wafv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatement extends js.Object {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatement] = js.native
}
object WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatement {
  
  @scala.inline
  def apply(
    statements: js.Array[WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatement]
  ): WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementOps[Self <: WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatement] (val x: Self) extends AnyVal {
    
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
    def setStatementsVarargs(value: WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatement*): Self = this.set("statements", js.Array(value :_*))
    
    @scala.inline
    def setStatements(value: js.Array[WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatement]): Self = this.set("statements", value.asInstanceOf[js.Any])
  }
}
