package typingsSlinky.pulumiAws.inputMod.wafv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch extends StObject {
  
  /**
    * Inspect all query arguments.
    */
  var allQueryArguments: js.UndefOr[
    Input[
      RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments
    ]
  ] = js.native
  
  /**
    * Inspect the request body, which immediately follows the request headers.
    */
  var body: js.UndefOr[
    Input[
      RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody
    ]
  ] = js.native
  
  /**
    * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
    */
  var method: js.UndefOr[
    Input[
      RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod
    ]
  ] = js.native
  
  /**
    * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
    */
  var queryString: js.UndefOr[
    Input[
      RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString
    ]
  ] = js.native
  
  /**
    * Inspect a single header. See Single Header below for details.
    */
  var singleHeader: js.UndefOr[
    Input[
      RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader
    ]
  ] = js.native
  
  /**
    * Inspect a single query argument. See Single Query Argument below for details.
    */
  var singleQueryArgument: js.UndefOr[
    Input[
      RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument
    ]
  ] = js.native
  
  /**
    * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
    */
  var uriPath: js.UndefOr[
    Input[
      RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath
    ]
  ] = js.native
}
object RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch {
  
  @scala.inline
  def apply(): RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMutableBuilder[Self <: RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllQueryArguments(
      value: Input[
          RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments
        ]
    ): Self = StObject.set(x, "allQueryArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllQueryArgumentsUndefined: Self = StObject.set(x, "allQueryArguments", js.undefined)
    
    @scala.inline
    def setBody(
      value: Input[
          RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody
        ]
    ): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setMethod(
      value: Input[
          RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod
        ]
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setQueryString(
      value: Input[
          RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString
        ]
    ): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    
    @scala.inline
    def setSingleHeader(
      value: Input[
          RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader
        ]
    ): Self = StObject.set(x, "singleHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleHeaderUndefined: Self = StObject.set(x, "singleHeader", js.undefined)
    
    @scala.inline
    def setSingleQueryArgument(
      value: Input[
          RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument
        ]
    ): Self = StObject.set(x, "singleQueryArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleQueryArgumentUndefined: Self = StObject.set(x, "singleQueryArgument", js.undefined)
    
    @scala.inline
    def setUriPath(
      value: Input[
          RuleGroupRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath
        ]
    ): Self = StObject.set(x, "uriPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriPathUndefined: Self = StObject.set(x, "uriPath", js.undefined)
  }
}
