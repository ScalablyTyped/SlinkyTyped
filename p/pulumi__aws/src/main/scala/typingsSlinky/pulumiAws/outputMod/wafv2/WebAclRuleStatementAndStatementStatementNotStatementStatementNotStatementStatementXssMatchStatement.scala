package typingsSlinky.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatement extends StObject {
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[
    WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatch
  ] = js.native
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: js.Array[
    WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformation
  ] = js.native
}
object WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatement {
  
  @scala.inline
  def apply(
    textTransformations: js.Array[
      WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformation
    ]
  ): WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatement = {
    val __obj = js.Dynamic.literal(textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementMutableBuilder[Self <: WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldToMatch(
      value: WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementFieldToMatch
    ): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatchUndefined: Self = StObject.set(x, "fieldToMatch", js.undefined)
    
    @scala.inline
    def setTextTransformations(
      value: js.Array[
          WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformation
        ]
    ): Self = StObject.set(x, "textTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformationsVarargs(
      value: WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatementTextTransformation*
    ): Self = StObject.set(x, "textTransformations", js.Array(value :_*))
  }
}
