package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatement extends StObject {
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[
    Input[
      WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch
    ]
  ] = js.native
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: Input[
    js.Array[
      Input[
        WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformation
      ]
    ]
  ] = js.native
}
object WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatement {
  
  @scala.inline
  def apply(
    textTransformations: Input[
      js.Array[
        Input[
          WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformation
        ]
      ]
    ]
  ): WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatement = {
    val __obj = js.Dynamic.literal(textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementMutableBuilder[Self <: WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldToMatch(
      value: Input[
          WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch
        ]
    ): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatchUndefined: Self = StObject.set(x, "fieldToMatch", js.undefined)
    
    @scala.inline
    def setTextTransformations(
      value: Input[
          js.Array[
            Input[
              WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformation
            ]
          ]
        ]
    ): Self = StObject.set(x, "textTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformationsVarargs(
      value: (Input[
          WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformation
        ])*
    ): Self = StObject.set(x, "textTransformations", js.Array(value :_*))
  }
}
