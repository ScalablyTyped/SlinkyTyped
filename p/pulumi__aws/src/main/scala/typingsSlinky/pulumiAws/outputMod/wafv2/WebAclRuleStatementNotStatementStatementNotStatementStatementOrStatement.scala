package typingsSlinky.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: js.Array[
    WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatement
  ] = js.native
}
object WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatement {
  
  @scala.inline
  def apply(
    statements: js.Array[
      WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatement
    ]
  ): WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementMutableBuilder[Self <: WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(
      value: js.Array[
          WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatement
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
