package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement extends StObject {
  
  /**
    * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
    */
  var andStatement: js.UndefOr[
    Input[
      WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatement
    ]
  ] = js.native
  
  /**
    * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
    */
  var byteMatchStatement: js.UndefOr[
    Input[
      WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatement
    ]
  ] = js.native
  
  /**
    * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
    */
  var geoMatchStatement: js.UndefOr[
    Input[
      WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatement
    ]
  ] = js.native
  
  /**
    * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
    */
  var ipSetReferenceStatement: js.UndefOr[
    Input[
      WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatement
    ]
  ] = js.native
  
  /**
    * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
    */
  var notStatement: js.UndefOr[
    Input[
      WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatement
    ]
  ] = js.native
  
  /**
    * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
    */
  var orStatement: js.UndefOr[
    Input[
      WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatement
    ]
  ] = js.native
  
  /**
    * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
    */
  var regexPatternSetReferenceStatement: js.UndefOr[
    Input[
      WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatement
    ]
  ] = js.native
  
  /**
    * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
    */
  var sizeConstraintStatement: js.UndefOr[
    Input[
      WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatement
    ]
  ] = js.native
  
  /**
    * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
    */
  var sqliMatchStatement: js.UndefOr[
    Input[
      WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatement
    ]
  ] = js.native
  
  /**
    * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
    */
  var xssMatchStatement: js.UndefOr[
    Input[
      WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatement
    ]
  ] = js.native
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement {
  
  @scala.inline
  def apply(): WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementMutableBuilder[Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndStatement(
      value: Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatement
        ]
    ): Self = StObject.set(x, "andStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndStatementUndefined: Self = StObject.set(x, "andStatement", js.undefined)
    
    @scala.inline
    def setByteMatchStatement(
      value: Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementByteMatchStatement
        ]
    ): Self = StObject.set(x, "byteMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteMatchStatementUndefined: Self = StObject.set(x, "byteMatchStatement", js.undefined)
    
    @scala.inline
    def setGeoMatchStatement(
      value: Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementGeoMatchStatement
        ]
    ): Self = StObject.set(x, "geoMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoMatchStatementUndefined: Self = StObject.set(x, "geoMatchStatement", js.undefined)
    
    @scala.inline
    def setIpSetReferenceStatement(
      value: Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementIpSetReferenceStatement
        ]
    ): Self = StObject.set(x, "ipSetReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetReferenceStatementUndefined: Self = StObject.set(x, "ipSetReferenceStatement", js.undefined)
    
    @scala.inline
    def setNotStatement(
      value: Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatement
        ]
    ): Self = StObject.set(x, "notStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotStatementUndefined: Self = StObject.set(x, "notStatement", js.undefined)
    
    @scala.inline
    def setOrStatement(
      value: Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatement
        ]
    ): Self = StObject.set(x, "orStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrStatementUndefined: Self = StObject.set(x, "orStatement", js.undefined)
    
    @scala.inline
    def setRegexPatternSetReferenceStatement(
      value: Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexPatternSetReferenceStatement
        ]
    ): Self = StObject.set(x, "regexPatternSetReferenceStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexPatternSetReferenceStatementUndefined: Self = StObject.set(x, "regexPatternSetReferenceStatement", js.undefined)
    
    @scala.inline
    def setSizeConstraintStatement(
      value: Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSizeConstraintStatement
        ]
    ): Self = StObject.set(x, "sizeConstraintStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeConstraintStatementUndefined: Self = StObject.set(x, "sizeConstraintStatement", js.undefined)
    
    @scala.inline
    def setSqliMatchStatement(
      value: Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementSqliMatchStatement
        ]
    ): Self = StObject.set(x, "sqliMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqliMatchStatementUndefined: Self = StObject.set(x, "sqliMatchStatement", js.undefined)
    
    @scala.inline
    def setXssMatchStatement(
      value: Input[
          WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementXssMatchStatement
        ]
    ): Self = StObject.set(x, "xssMatchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXssMatchStatementUndefined: Self = StObject.set(x, "xssMatchStatement", js.undefined)
  }
}
