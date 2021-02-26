package typingsSlinky.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleStatementRegexPatternSetReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
    */
  var arn: String = js.native
  
  /**
    * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
    */
  var fieldToMatch: js.UndefOr[RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatch] = js.native
  
  /**
    * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
    */
  var textTransformations: js.Array[RuleGroupRuleStatementRegexPatternSetReferenceStatementTextTransformation] = js.native
}
object RuleGroupRuleStatementRegexPatternSetReferenceStatement {
  
  @scala.inline
  def apply(
    arn: String,
    textTransformations: js.Array[RuleGroupRuleStatementRegexPatternSetReferenceStatementTextTransformation]
  ): RuleGroupRuleStatementRegexPatternSetReferenceStatement = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], textTransformations = textTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementRegexPatternSetReferenceStatement]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementRegexPatternSetReferenceStatementMutableBuilder[Self <: RuleGroupRuleStatementRegexPatternSetReferenceStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatch(value: RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatch): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatchUndefined: Self = StObject.set(x, "fieldToMatch", js.undefined)
    
    @scala.inline
    def setTextTransformations(value: js.Array[RuleGroupRuleStatementRegexPatternSetReferenceStatementTextTransformation]): Self = StObject.set(x, "textTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransformationsVarargs(value: RuleGroupRuleStatementRegexPatternSetReferenceStatementTextTransformation*): Self = StObject.set(x, "textTransformations", js.Array(value :_*))
  }
}
