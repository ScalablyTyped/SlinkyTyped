package typingsSlinky.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatement extends StObject {
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[
    WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch
  ] = js.native
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: js.Array[
    WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformation
  ] = js.native
}
object WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatement {
  
  @scala.inline
  def apply(
    textTransformations: js.Array[
      WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformation
    ]
  ): WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatement = {
    val __obj = js.Dynamic.literal(textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementMutableBuilder[Self <: WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldToMatch(
      value: WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatch
    ): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatchUndefined: Self = StObject.set(x, "fieldToMatch", js.undefined)
    
    @scala.inline
    def setTextTransformations(
      value: js.Array[
          WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformation
        ]
    ): Self = StObject.set(x, "textTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformationsVarargs(
      value: WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementTextTransformation*
    ): Self = StObject.set(x, "textTransformations", js.Array(value :_*))
  }
}
