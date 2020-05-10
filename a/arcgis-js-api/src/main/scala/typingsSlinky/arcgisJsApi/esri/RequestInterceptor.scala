package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestInterceptor extends Object {
  /**
    * Makes changes to the response after the request is sent, but before it's returned to the caller.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var after: js.UndefOr[AfterInterceptorCallback] = js.native
  /**
    * Make changes to the request URL or options before the request is sent. A returned value will be used as the response data, which would prevent the request from being sent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var before: js.UndefOr[BeforeInterceptorCallback] = js.native
  /**
    * When an error occurs during the request processing, this function is called with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) object giving the details about what happened. For example, this could be used to log specific errors occurring with layers or services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var error: js.UndefOr[ErrorCallback] = js.native
  /**
    * Sets or adds headers into `requestOptions.headers`. See also: [requestOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var headers: js.UndefOr[js.Any] = js.native
  /**
    * Sets or adds query parameters into `requestOptions.query`. See also: [requestOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var query: js.UndefOr[js.Any] = js.native
  /**
    * Hardcodes the [response](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestResponse). The request will not be sent. This is resolved as the response `data`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var responseData: js.UndefOr[js.Any] = js.native
  /**
    * Specifies the URL(s) to apply to the interceptors. If the value is type `String`, then it matches if the request URL starts with that string. If null or undefined, the interceptor will apply to all relevant requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#RequestInterceptor)
    */
  var urls: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.native
}

object RequestInterceptor {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): RequestInterceptor = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[RequestInterceptor]
  }
  @scala.inline
  implicit class RequestInterceptorOps[Self <: RequestInterceptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: /* response */ RequestResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: /* params */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* error */ Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
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
    def withQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseData")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlsRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrls(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(js.undefined)
        ret
    }
  }
  
}

