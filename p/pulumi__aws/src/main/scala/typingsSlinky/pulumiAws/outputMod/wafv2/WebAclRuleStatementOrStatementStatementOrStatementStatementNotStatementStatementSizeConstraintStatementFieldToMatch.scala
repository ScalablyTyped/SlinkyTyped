package typingsSlinky.pulumiAws.outputMod.wafv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch extends js.Object {
  
  /**
    * Inspect all query arguments.
    */
  var allQueryArguments: js.UndefOr[
    WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments
  ] = js.native
  
  /**
    * Inspect the request body, which immediately follows the request headers.
    */
  var body: js.UndefOr[
    WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody
  ] = js.native
  
  /**
    * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
    */
  var method: js.UndefOr[
    WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod
  ] = js.native
  
  /**
    * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
    */
  var queryString: js.UndefOr[
    WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString
  ] = js.native
  
  /**
    * Inspect a single header. See Single Header below for details.
    */
  var singleHeader: js.UndefOr[
    WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader
  ] = js.native
  
  /**
    * Inspect a single query argument. See Single Query Argument below for details.
    */
  var singleQueryArgument: js.UndefOr[
    WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument
  ] = js.native
  
  /**
    * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
    */
  var uriPath: js.UndefOr[
    WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath
  ] = js.native
}
object WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch {
  
  @scala.inline
  def apply(): WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchOps[Self <: WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllQueryArguments(
      value: WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments
    ): Self = this.set("allQueryArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllQueryArguments: Self = this.set("allQueryArguments", js.undefined)
    
    @scala.inline
    def setBody(
      value: WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody
    ): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setMethod(
      value: WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod
    ): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setQueryString(
      value: WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString
    ): Self = this.set("queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryString: Self = this.set("queryString", js.undefined)
    
    @scala.inline
    def setSingleHeader(
      value: WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader
    ): Self = this.set("singleHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleHeader: Self = this.set("singleHeader", js.undefined)
    
    @scala.inline
    def setSingleQueryArgument(
      value: WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument
    ): Self = this.set("singleQueryArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleQueryArgument: Self = this.set("singleQueryArgument", js.undefined)
    
    @scala.inline
    def setUriPath(
      value: WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath
    ): Self = this.set("uriPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUriPath: Self = this.set("uriPath", js.undefined)
  }
}
