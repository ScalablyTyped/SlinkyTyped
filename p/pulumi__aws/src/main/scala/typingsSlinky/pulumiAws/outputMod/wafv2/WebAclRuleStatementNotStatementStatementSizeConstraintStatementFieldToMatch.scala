package typingsSlinky.pulumiAws.outputMod.wafv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatch extends js.Object {
  
  /**
    * Inspect all query arguments.
    */
  var allQueryArguments: js.UndefOr[
    WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments
  ] = js.native
  
  /**
    * Inspect the request body, which immediately follows the request headers.
    */
  var body: js.UndefOr[WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody] = js.native
  
  /**
    * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
    */
  var method: js.UndefOr[
    WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod
  ] = js.native
  
  /**
    * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
    */
  var queryString: js.UndefOr[
    WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString
  ] = js.native
  
  /**
    * Inspect a single header. See Single Header below for details.
    */
  var singleHeader: js.UndefOr[
    WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader
  ] = js.native
  
  /**
    * Inspect a single query argument. See Single Query Argument below for details.
    */
  var singleQueryArgument: js.UndefOr[
    WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument
  ] = js.native
  
  /**
    * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
    */
  var uriPath: js.UndefOr[
    WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath
  ] = js.native
}
object WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatch {
  
  @scala.inline
  def apply(): WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatch]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchOps[Self <: WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatch] (val x: Self) extends AnyVal {
    
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
      value: WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments
    ): Self = this.set("allQueryArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllQueryArguments: Self = this.set("allQueryArguments", js.undefined)
    
    @scala.inline
    def setBody(value: WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setMethod(value: WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setQueryString(value: WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString): Self = this.set("queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryString: Self = this.set("queryString", js.undefined)
    
    @scala.inline
    def setSingleHeader(value: WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader): Self = this.set("singleHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleHeader: Self = this.set("singleHeader", js.undefined)
    
    @scala.inline
    def setSingleQueryArgument(
      value: WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument
    ): Self = this.set("singleQueryArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleQueryArgument: Self = this.set("singleQueryArgument", js.undefined)
    
    @scala.inline
    def setUriPath(value: WebAclRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath): Self = this.set("uriPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUriPath: Self = this.set("uriPath", js.undefined)
  }
}
