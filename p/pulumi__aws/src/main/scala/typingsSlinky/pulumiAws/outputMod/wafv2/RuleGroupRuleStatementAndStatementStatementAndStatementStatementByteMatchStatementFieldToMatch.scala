package typingsSlinky.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatch extends StObject {
  
  /**
    * Inspect all query arguments.
    */
  var allQueryArguments: js.UndefOr[
    RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArguments
  ] = js.native
  
  /**
    * Inspect the request body, which immediately follows the request headers.
    */
  var body: js.UndefOr[
    RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBody
  ] = js.native
  
  /**
    * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
    */
  var method: js.UndefOr[
    RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod
  ] = js.native
  
  /**
    * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
    */
  var queryString: js.UndefOr[
    RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryString
  ] = js.native
  
  /**
    * Inspect a single header. See Single Header below for details.
    */
  var singleHeader: js.UndefOr[
    RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader
  ] = js.native
  
  /**
    * Inspect a single query argument. See Single Query Argument below for details.
    */
  var singleQueryArgument: js.UndefOr[
    RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument
  ] = js.native
  
  /**
    * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
    */
  var uriPath: js.UndefOr[
    RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath
  ] = js.native
}
object RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatch {
  
  @scala.inline
  def apply(): RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatch]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMutableBuilder[Self <: RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllQueryArguments(
      value: RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArguments
    ): Self = StObject.set(x, "allQueryArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllQueryArgumentsUndefined: Self = StObject.set(x, "allQueryArguments", js.undefined)
    
    @scala.inline
    def setBody(
      value: RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBody
    ): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setMethod(
      value: RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setQueryString(
      value: RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryString
    ): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    
    @scala.inline
    def setSingleHeader(
      value: RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader
    ): Self = StObject.set(x, "singleHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleHeaderUndefined: Self = StObject.set(x, "singleHeader", js.undefined)
    
    @scala.inline
    def setSingleQueryArgument(
      value: RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument
    ): Self = StObject.set(x, "singleQueryArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleQueryArgumentUndefined: Self = StObject.set(x, "singleQueryArgument", js.undefined)
    
    @scala.inline
    def setUriPath(
      value: RuleGroupRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath
    ): Self = StObject.set(x, "uriPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriPathUndefined: Self = StObject.set(x, "uriPath", js.undefined)
  }
}
