package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatement extends StObject {
  
  /**
    * The statement to negate. You can use any statement that can be nested. See Statement above for details.
    */
  var statements: Input[
    js.Array[
      Input[
        WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatement
      ]
    ]
  ] = js.native
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatement {
  
  @scala.inline
  def apply(
    statements: Input[
      js.Array[
        Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatement
        ]
      ]
    ]
  ): WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementMutableBuilder[Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(
      value: Input[
          js.Array[
            Input[
              WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatement
            ]
          ]
        ]
    ): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(
      value: (Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatement
        ])*
    ): Self = StObject.set(x, "statements", js.Array(value :_*))
  }
}
