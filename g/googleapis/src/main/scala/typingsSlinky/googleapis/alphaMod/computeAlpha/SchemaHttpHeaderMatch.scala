package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * matchRule criteria for request header matches.
  */
@js.native
trait SchemaHttpHeaderMatch extends js.Object {
  /**
    * The value should exactly match contents of exactMatch. Only one of
    * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
    * rangeMatch must be set.
    */
  var exactMatch: js.UndefOr[String] = js.native
  /**
    * The name of the HTTP header to match. For matching against the HTTP
    * request&#39;s authority, use a headerMatch with the header name
    * &quot;:authority&quot;. For matching a request&#39;s method, use the
    * headerName &quot;:method&quot;.
    */
  var headerName: js.UndefOr[String] = js.native
  /**
    * If set to false, the headerMatch is considered a match if the match
    * criteria above are met. If set to true, the headerMatch is considered a
    * match if the match criteria above are NOT met. The default setting is
    * false.
    */
  var invertMatch: js.UndefOr[Boolean] = js.native
  /**
    * The value of the header must start with the contents of prefixMatch. Only
    * one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
    * rangeMatch must be set.
    */
  var prefixMatch: js.UndefOr[String] = js.native
  /**
    * A header with the contents of headerName must exist. The match takes
    * place whether or not the request&#39;s header has a value or not. Only
    * one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
    * rangeMatch must be set.
    */
  var presentMatch: js.UndefOr[Boolean] = js.native
  /**
    * The header value must be an integer and its value must be in the range
    * specified in rangeMatch. If the header does not contain an integer,
    * number or is empty, the match fails. For example for a range [-5, 0]   -
    * -3 will match.  - 0 will not match.  - 0.25 will not match.  -
    * -3someString will not match.   Only one of exactMatch, prefixMatch,
    * suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
    */
  var rangeMatch: js.UndefOr[SchemaInt64RangeMatch] = js.native
  /**
    * The value of the header must match the regualar expression specified in
    * regexMatch. For regular expression grammar, please see:
    * en.cppreference.com/w/cpp/regex/ecmascript  For matching against a port
    * specified in the HTTP request, use a headerMatch with headerName set to
    * PORT and a regular expression that satisfies the RFC2616 Host
    * header&#39;s port specifier. Only one of exactMatch, prefixMatch,
    * suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
    */
  var regexMatch: js.UndefOr[String] = js.native
  /**
    * The value of the header must end with the contents of suffixMatch. Only
    * one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
    * rangeMatch must be set.
    */
  var suffixMatch: js.UndefOr[String] = js.native
}

object SchemaHttpHeaderMatch {
  @scala.inline
  def apply(): SchemaHttpHeaderMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpHeaderMatch]
  }
  @scala.inline
  implicit class SchemaHttpHeaderMatchOps[Self <: SchemaHttpHeaderMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExactMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExactMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exactMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerName")(js.undefined)
        ret
    }
    @scala.inline
    def withInvertMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvertMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertMatch")(js.undefined)
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
    def withPresentMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresentMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeMatch(value: SchemaInt64RangeMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeMatch")(js.undefined)
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
    @scala.inline
    def withSuffixMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffixMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixMatch")(js.undefined)
        ret
    }
  }
  
}

