package typingsSlinky.pulumiAws.outputMod.lb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerRuleCondition extends StObject {
  
  /**
    * Contains a single `values` item which is a list of host header patterns to match. The maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied.
    */
  var hostHeader: js.UndefOr[ListenerRuleConditionHostHeader] = js.native
  
  /**
    * HTTP headers to match. HTTP Header block fields documented below.
    */
  var httpHeader: js.UndefOr[ListenerRuleConditionHttpHeader] = js.native
  
  /**
    * Contains a single `values` item which is a list of HTTP request methods or verbs to match. Maximum size is 40 characters. Only allowed characters are A-Z, hyphen (-) and underscore (\_). Comparison is case sensitive. Wildcards are not supported. Only one needs to match for the condition to be satisfied. AWS recommends that GET and HEAD requests are routed in the same way because the response to a HEAD request may be cached.
    */
  var httpRequestMethod: js.UndefOr[ListenerRuleConditionHttpRequestMethod] = js.native
  
  /**
    * Contains a single `values` item which is a list of path patterns to match against the request URL. Maximum size of each pattern is 128 characters. Comparison is case sensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied. Path pattern is compared only to the path of the URL, not to its query string. To compare against the query string, use a `queryString` condition.
    */
  var pathPattern: js.UndefOr[ListenerRuleConditionPathPattern] = js.native
  
  /**
    * Query strings to match. Query String block fields documented below.
    */
  var queryStrings: js.UndefOr[js.Array[ListenerRuleConditionQueryString]] = js.native
  
  /**
    * Contains a single `values` item which is a list of source IP CIDR notations to match. You can use both IPv4 and IPv6 addresses. Wildcards are not supported. Condition is satisfied if the source IP address of the request matches one of the CIDR blocks. Condition is not satisfied by the addresses in the `X-Forwarded-For` header, use `httpHeader` condition instead.
    */
  var sourceIp: js.UndefOr[ListenerRuleConditionSourceIp] = js.native
}
object ListenerRuleCondition {
  
  @scala.inline
  def apply(): ListenerRuleCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerRuleCondition]
  }
  
  @scala.inline
  implicit class ListenerRuleConditionMutableBuilder[Self <: ListenerRuleCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostHeader(value: ListenerRuleConditionHostHeader): Self = StObject.set(x, "hostHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostHeaderUndefined: Self = StObject.set(x, "hostHeader", js.undefined)
    
    @scala.inline
    def setHttpHeader(value: ListenerRuleConditionHttpHeader): Self = StObject.set(x, "httpHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpHeaderUndefined: Self = StObject.set(x, "httpHeader", js.undefined)
    
    @scala.inline
    def setHttpRequestMethod(value: ListenerRuleConditionHttpRequestMethod): Self = StObject.set(x, "httpRequestMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRequestMethodUndefined: Self = StObject.set(x, "httpRequestMethod", js.undefined)
    
    @scala.inline
    def setPathPattern(value: ListenerRuleConditionPathPattern): Self = StObject.set(x, "pathPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathPatternUndefined: Self = StObject.set(x, "pathPattern", js.undefined)
    
    @scala.inline
    def setQueryStrings(value: js.Array[ListenerRuleConditionQueryString]): Self = StObject.set(x, "queryStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringsUndefined: Self = StObject.set(x, "queryStrings", js.undefined)
    
    @scala.inline
    def setQueryStringsVarargs(value: ListenerRuleConditionQueryString*): Self = StObject.set(x, "queryStrings", js.Array(value :_*))
    
    @scala.inline
    def setSourceIp(value: ListenerRuleConditionSourceIp): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIpUndefined: Self = StObject.set(x, "sourceIp", js.undefined)
  }
}
