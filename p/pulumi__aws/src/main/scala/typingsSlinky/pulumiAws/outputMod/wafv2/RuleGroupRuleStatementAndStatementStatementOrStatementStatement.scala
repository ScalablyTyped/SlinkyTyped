package typingsSlinky.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleStatementAndStatementStatementOrStatementStatement extends StObject {
  
  /**
    * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
    */
  var byteMatchStatement: js.UndefOr[
    RuleGroupRuleStatementAndStatementStatementOrStatementStatementByteMatchStatement
  ] = js.native
  
  /**
    * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
    */
  var geoMatchStatement: js.UndefOr[RuleGroupRuleStatementAndStatementStatementOrStatementStatementGeoMatchStatement] = js.native
  
  /**
    * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
    */
  var ipSetReferenceStatement: js.UndefOr[
    RuleGroupRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatement
  ] = js.native
  
  /**
    * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
    */
  var regexPatternSetReferenceStatement: js.UndefOr[
    RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatement
  ] = js.native
  
  /**
    * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
    */
  var sizeConstraintStatement: js.UndefOr[
    RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatement
  ] = js.native
  
  /**
    * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
    */
  var sqliMatchStatement: js.UndefOr[
    RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatement
  ] = js.native
  
  /**
    * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
    */
  var xssMatchStatement: js.UndefOr[RuleGroupRuleStatementAndStatementStatementOrStatementStatementXssMatchStatement] = js.native
}
object RuleGroupRuleStatementAndStatementStatementOrStatementStatement {
  
  @scala.inline
  def apply(): RuleGroupRuleStatementAndStatementStatementOrStatementStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupRuleStatementAndStatementStatementOrStatementStatement]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementAndStatementStatementOrStatementStatementMutableBuilder[Self <: RuleGroupRuleStatementAndStatementStatementOrStatementStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteMatchStatement(value: RuleGroupRuleStatementAndStatementStatementOrStatementStatementByteMatchStatement): Self = StObject.set(x, "byteMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteMatchStatementUndefined: Self = StObject.set(x, "byteMatchStatement", js.undefined)
    
    @scala.inline
    def setGeoMatchStatement(value: RuleGroupRuleStatementAndStatementStatementOrStatementStatementGeoMatchStatement): Self = StObject.set(x, "geoMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoMatchStatementUndefined: Self = StObject.set(x, "geoMatchStatement", js.undefined)
    
    @scala.inline
    def setIpSetReferenceStatement(value: RuleGroupRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatement): Self = StObject.set(x, "ipSetReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetReferenceStatementUndefined: Self = StObject.set(x, "ipSetReferenceStatement", js.undefined)
    
    @scala.inline
    def setRegexPatternSetReferenceStatement(
      value: RuleGroupRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatement
    ): Self = StObject.set(x, "regexPatternSetReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexPatternSetReferenceStatementUndefined: Self = StObject.set(x, "regexPatternSetReferenceStatement", js.undefined)
    
    @scala.inline
    def setSizeConstraintStatement(value: RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatement): Self = StObject.set(x, "sizeConstraintStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeConstraintStatementUndefined: Self = StObject.set(x, "sizeConstraintStatement", js.undefined)
    
    @scala.inline
    def setSqliMatchStatement(value: RuleGroupRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatement): Self = StObject.set(x, "sqliMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqliMatchStatementUndefined: Self = StObject.set(x, "sqliMatchStatement", js.undefined)
    
    @scala.inline
    def setXssMatchStatement(value: RuleGroupRuleStatementAndStatementStatementOrStatementStatementXssMatchStatement): Self = StObject.set(x, "xssMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXssMatchStatementUndefined: Self = StObject.set(x, "xssMatchStatement", js.undefined)
  }
}
