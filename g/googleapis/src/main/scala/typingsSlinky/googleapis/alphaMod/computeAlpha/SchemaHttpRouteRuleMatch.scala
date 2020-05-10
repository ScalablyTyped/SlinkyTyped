package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HttpRouteRuleMatch specifies a set of criteria for matching requests to an
  * HttpRouteRule. All specified criteria must be satisfied for a match to
  * occur.
  */
@js.native
trait SchemaHttpRouteRuleMatch extends js.Object {
  /**
    * For satifying the matchRule condition, the path of the request must
    * exactly match the value specified in fullPathMatch after removing any
    * query parameters and anchor that may be part of the original URL.
    * FullPathMatch must be between 1 and 1024 characters. Only one of
    * prefixMatch, fullPathMatch or regexMatch must be specified.
    */
  var fullPathMatch: js.UndefOr[String] = js.native
  /**
    * Specifies a list of header match criteria, all of which must match
    * corresponding headers in the request.
    */
  var headerMatches: js.UndefOr[js.Array[SchemaHttpHeaderMatch]] = js.native
  /**
    * Specifies that prefixMatch and fullPathMatch matches are case sensitive.
    * The default value is false. caseSensitive must not be used with
    * regexMatch.
    */
  var ignoreCase: js.UndefOr[Boolean] = js.native
  /**
    * Opaque filter criteria used by Loadbalancer to restrict routing
    * configuration to a limited set xDS compliant clients. In their xDS
    * requests to Loadbalancer, xDS clients present node metadata. If a match
    * takes place, the relevant routing configuration is made available to
    * those proxies. For each metadataFilter in this list, if its
    * filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels
    * must match the corresponding label provided in the metadata. If its
    * filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels
    * must match with corresponding labels in the provided metadata.
    * metadataFilters specified here can be overrides those specified in
    * ForwardingRule that refers to this UrlMap. metadataFilters only applies
    * to Loadbalancers that have their loadBalancingScheme set to
    * INTERNAL_SELF_MANAGED.
    */
  var metadataFilters: js.UndefOr[js.Array[SchemaMetadataFilter]] = js.native
  /**
    * For satifying the matchRule condition, the request&#39;s path must begin
    * with the specified prefixMatch. prefixMatch must begin with a /. The
    * value must be between 1 and 1024 characters. Only one of prefixMatch,
    * fullPathMatch or regexMatch must be specified.
    */
  var prefixMatch: js.UndefOr[String] = js.native
  /**
    * Specifies a list of query parameter match criteria, all of which must
    * match corresponding query parameters in the request.
    */
  var queryParameterMatches: js.UndefOr[js.Array[SchemaHttpQueryParameterMatch]] = js.native
  /**
    * For satifying the matchRule condition, the path of the request must
    * satisfy the regular expression specified in regexMatch after removing any
    * query parameters and anchor supplied with the original URL. For regular
    * expression grammar please see en.cppreference.com/w/cpp/regex/ecmascript
    * Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
    */
  var regexMatch: js.UndefOr[String] = js.native
}

object SchemaHttpRouteRuleMatch {
  @scala.inline
  def apply(): SchemaHttpRouteRuleMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteRuleMatch]
  }
  @scala.inline
  implicit class SchemaHttpRouteRuleMatchOps[Self <: SchemaHttpRouteRuleMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullPathMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPathMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullPathMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullPathMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderMatches(value: js.Array[SchemaHttpHeaderMatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataFilters(value: js.Array[SchemaMetadataFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParameterMatches(value: js.Array[SchemaHttpQueryParameterMatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParameterMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParameterMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParameterMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withRegexMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexMatch")(js.undefined)
        ret
    }
  }
  
}

