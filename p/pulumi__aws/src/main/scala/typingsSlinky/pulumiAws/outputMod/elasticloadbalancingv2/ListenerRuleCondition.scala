package typingsSlinky.pulumiAws.outputMod.elasticloadbalancingv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleCondition extends js.Object {
  /**
    * The type of condition. Valid values are `host-header` or `path-pattern`. Must also set `values`.
    */
  var field: String = js.native
  /**
    * Contains a single `values` item which is a list of host header patterns to match. The maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied.
    */
  var hostHeader: ListenerRuleConditionHostHeader = js.native
  /**
    * HTTP headers to match. HTTP Header block fields documented below.
    */
  var httpHeader: js.UndefOr[ListenerRuleConditionHttpHeader] = js.native
  /**
    * Contains a single `values` item which is a list of HTTP request methods or verbs to match. Maximum size is 40 characters. Only allowed characters are A-Z, hyphen (-) and underscore (\_). Comparison is case sensitive. Wildcards are not supported. Only one needs to match for the condition to be satisfied. AWS recommends that GET and HEAD requests are routed in the same way because the response to a HEAD request may be cached.
    */
  var httpRequestMethod: js.UndefOr[ListenerRuleConditionHttpRequestMethod] = js.native
  /**
    * Contains a single `values` item which is a list of path patterns to match against the request URL. Maximum size of each pattern is 128 characters. Comparison is case sensitive. Wildcard charaters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied. Path pattern is compared only to the path of the URL, not to its query string. To compare against the query string, use a `query-string` condition.
    */
  var pathPattern: ListenerRuleConditionPathPattern = js.native
  /**
    * Query strings to match. Query String block fields documented below.
    */
  var queryStrings: js.UndefOr[js.Array[ListenerRuleConditionQueryString]] = js.native
  /**
    * Contains a single `values` item which is a list of source IP CIDR notations to match. You can use both IPv4 and IPv6 addresses. Wildcards are not supported. Condition is satisfied if the source IP address of the request matches one of the CIDR blocks. Condition is not satisfied by the addresses in the `X-Forwarded-For` header, use `http-header` condition instead.
    */
  var sourceIp: js.UndefOr[ListenerRuleConditionSourceIp] = js.native
  /**
    * Query string pairs or values to match. Query String Value blocks documented below. Multiple `values` blocks can be specified, see example above. Maximum size of each string is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). To search for a literal '\*' or '?' character in a query string, escape the character with a backslash (\\). Only one pair needs to match for the condition to be satisfied.
    */
  var values: String = js.native
}

object ListenerRuleCondition {
  @scala.inline
  def apply(
    field: String,
    hostHeader: ListenerRuleConditionHostHeader,
    pathPattern: ListenerRuleConditionPathPattern,
    values: String
  ): ListenerRuleCondition = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], hostHeader = hostHeader.asInstanceOf[js.Any], pathPattern = pathPattern.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleCondition]
  }
  @scala.inline
  implicit class ListenerRuleConditionOps[Self <: ListenerRuleCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostHeader(value: ListenerRuleConditionHostHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathPattern(value: ListenerRuleConditionPathPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpHeader(value: ListenerRuleConditionHttpHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpRequestMethod(value: ListenerRuleConditionHttpRequestMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpRequestMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpRequestMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpRequestMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryStrings(value: js.Array[ListenerRuleConditionQueryString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStrings")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceIp(value: ListenerRuleConditionSourceIp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIp")(js.undefined)
        ret
    }
  }
  
}

