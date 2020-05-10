package typingsSlinky.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object that controls the defaults for $http provider. Not all fields of IRequestShortcutConfig can be configured
  * via defaults and the docs do not say which. The following is based on the inspection of the source code.
  * https://docs.angularjs.org/api/ng/service/$http#defaults
  * https://docs.angularjs.org/api/ng/service/$http#usage
  * https://docs.angularjs.org/api/ng/provider/$httpProvider The properties section
  */
@js.native
trait IHttpProviderDefaults extends js.Object {
  /**
    * {boolean|Cache}
    * If true, a default $http cache will be used to cache the GET request, otherwise if a cache instance built with $cacheFactory, this cache will be used for caching.
    */
  var cache: js.UndefOr[js.Any] = js.native
  /**
    * Map of strings or functions which return strings representing HTTP headers to send to the server. If the
    * return value of a function is null, the header will not be sent.
    * The key of the map is the request verb in lower case. The "common" key applies to all requests.
    * @see {@link https://docs.angularjs.org/api/ng/service/$http#setting-http-headers}
    */
  var headers: js.UndefOr[IHttpRequestConfigHeaders] = js.native
  /**
    * A function used to the prepare string representation of request parameters (specified as an object). If
    * specified as string, it is interpreted as a function registered with the $injector. Defaults to
    * $httpParamSerializer.
    */
  var paramSerializer: js.UndefOr[String | (js.Function1[/* obj */ js.Any, String])] = js.native
  /**
    * Transform function or an array of such functions. The transform function takes the http request body and
    * headers and returns its transformed (typically serialized) version.
    * @see {@link https://docs.angularjs.org/api/ng/service/$http#transforming-requests-and-responses}
    */
  var transformRequest: js.UndefOr[IHttpRequestTransformer | js.Array[IHttpRequestTransformer]] = js.native
  /**
    * Transform function or an array of such functions. The transform function takes the http response body and
    * headers and returns its transformed (typically deserialized) version.
    */
  var transformResponse: js.UndefOr[IHttpResponseTransformer | js.Array[IHttpResponseTransformer]] = js.native
  /**
    * whether to to set the withCredentials flag on the XHR object. See [requests with credentials]https://developer.mozilla.org/en/http_access_control#section_5 for more information.
    */
  var withCredentials: js.UndefOr[Boolean] = js.native
  /** Name of cookie containing the XSRF token. */
  var xsrfCookieName: js.UndefOr[String] = js.native
  /** Name of HTTP header to populate with the XSRF token. */
  var xsrfHeaderName: js.UndefOr[String] = js.native
}

object IHttpProviderDefaults {
  @scala.inline
  def apply(): IHttpProviderDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHttpProviderDefaults]
  }
  @scala.inline
  implicit class IHttpProviderDefaultsOps[Self <: IHttpProviderDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: IHttpRequestConfigHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withParamSerializerFunction1(value: /* obj */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramSerializer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParamSerializer(value: String | (js.Function1[/* obj */ js.Any, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramSerializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamSerializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramSerializer")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformRequestFunction2(value: (/* data */ js.Any, /* headersGetter */ IHttpHeadersGetter) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTransformRequest(value: IHttpRequestTransformer | js.Array[IHttpRequestTransformer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformResponseFunction3(value: (/* data */ js.Any, /* headersGetter */ IHttpHeadersGetter, /* status */ Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformResponse")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTransformResponse(value: IHttpResponseTransformer | js.Array[IHttpResponseTransformer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withXsrfCookieName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsrfCookieName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXsrfCookieName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsrfCookieName")(js.undefined)
        ret
    }
    @scala.inline
    def withXsrfHeaderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsrfHeaderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXsrfHeaderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsrfHeaderName")(js.undefined)
        ret
    }
  }
  
}

