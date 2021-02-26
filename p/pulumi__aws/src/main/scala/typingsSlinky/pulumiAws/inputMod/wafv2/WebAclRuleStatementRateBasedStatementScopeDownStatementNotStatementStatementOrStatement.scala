package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatement extends StObject {
  
  /**
    * The statements to combine with `OR` logic. You can use any statements that can be nested. See Statement above for details.
    */
  var statements: Input[
    js.Array[
      Input[
        WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatement
      ]
    ]
  ] = js.native
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatement {
  
  @scala.inline
  def apply(
    statements: Input[
      js.Array[
        Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatement
        ]
      ]
    ]
  ): WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementMutableBuilder[Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(
      value: Input[
          js.Array[
            Input[
              WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatement
            ]
          ]
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(
      value: (Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatement
        ])*
    ): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
