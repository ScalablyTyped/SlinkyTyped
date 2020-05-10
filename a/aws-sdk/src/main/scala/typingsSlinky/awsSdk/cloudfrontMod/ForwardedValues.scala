package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardedValues extends js.Object {
  /**
    * A complex type that specifies whether you want CloudFront to forward cookies to the origin and, if so, which ones. For more information about forwarding cookies to the origin, see How CloudFront Forwards, Caches, and Logs Cookies in the Amazon CloudFront Developer Guide.
    */
  var Cookies: CookiePreference = js.native
  /**
    * A complex type that specifies the Headers, if any, that you want CloudFront to forward to the origin for this cache behavior (whitelisted headers). For the headers that you specify, CloudFront also caches separate versions of a specified object that is based on the header values in viewer requests. For more information, see  Caching Content Based on Request Headers in the Amazon CloudFront Developer Guide.
    */
  var Headers: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.Headers] = js.native
  /**
    * Indicates whether you want CloudFront to forward query strings to the origin that is associated with this cache behavior and cache based on the query string parameters. CloudFront behavior depends on the value of QueryString and on the values that you specify for QueryStringCacheKeys, if any: If you specify true for QueryString and you don't specify any values for QueryStringCacheKeys, CloudFront forwards all query string parameters to the origin and caches based on all query string parameters. Depending on how many query string parameters and values you have, this can adversely affect performance because CloudFront must forward more requests to the origin. If you specify true for QueryString and you specify one or more values for QueryStringCacheKeys, CloudFront forwards all query string parameters to the origin, but it only caches based on the query string parameters that you specify. If you specify false for QueryString, CloudFront doesn't forward any query string parameters to the origin, and doesn't cache based on query string parameters. For more information, see Configuring CloudFront to Cache Based on Query String Parameters in the Amazon CloudFront Developer Guide.
    */
  var QueryString: Boolean = js.native
  /**
    * A complex type that contains information about the query string parameters that you want CloudFront to use for caching for this cache behavior.
    */
  var QueryStringCacheKeys: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.QueryStringCacheKeys] = js.native
}

object ForwardedValues {
  @scala.inline
  def apply(Cookies: CookiePreference, QueryString: Boolean): ForwardedValues = {
    val __obj = js.Dynamic.literal(Cookies = Cookies.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardedValues]
  }
  @scala.inline
  implicit class ForwardedValuesOps[Self <: ForwardedValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookies(value: CookiePreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Headers")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryStringCacheKeys(value: QueryStringCacheKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryStringCacheKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryStringCacheKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryStringCacheKeys")(js.undefined)
        ret
    }
  }
  
}

