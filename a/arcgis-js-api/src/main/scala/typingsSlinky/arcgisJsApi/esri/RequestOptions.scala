package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.experimental.AbortSignal
import org.scalajs.dom.raw.FormData
import org.scalajs.dom.raw.HTMLFormElement
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`array-buffer`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`no-prompt`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.anonymous
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.auto
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.blob
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.document
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.image
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.immediate
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.json
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.post
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.text
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.xml
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestOptions extends Object {
  /**
    * Indicates if and how requests to ArcGIS Services are authenticated. Only applicable when [`esriConfig.request.useIdentity = true`](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request).
    *
    * | Known Value | Description |
    * |-------------|-------------|
    * | auto |  The user will be signed in when a secure resource is requested. |
    * | anonymous | An error will be returned when a secure resource is requested. |
    * | immediate | The user will be signed in before the resource is requested. |
    * | no-prompt | Checks for whether the user is already signed in. If so, no additional prompts display for sign-in. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var authMode: js.UndefOr[auto | anonymous | immediate | `no-prompt`] = js.native
  /**
    * If uploading a file, specify the form data or element used to submit the file here. If specified, the parameters of the `query` will be added to the URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var body: js.UndefOr[FormData | HTMLFormElement | String] = js.native
  /**
    * If `true`, the browser will send a request to the server instead of using the browser's local cache. If `false`, the browser's default cache handling will be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var cacheBust: js.UndefOr[Boolean] = js.native
  /**
    * Headers to use for the request. This is an object whose property names are header names.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var headers: js.UndefOr[js.Any] = js.native
  /**
    * Indicates if the request should be made using the HTTP POST method. By default, this is determined automatically based on the request size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var method: js.UndefOr[auto | post] = js.native
  /**
    * Query parameters for the request. The query parameters will be added to the URL if: a GET request is used, or if the `body` property is set. Otherwise, the query parameters will be added to the body request parameters if: the `body` property is not set, and a POST request is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var query: js.UndefOr[js.Any] = js.native
  /**
    * Response format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var responseType: js.UndefOr[json | xml | text | blob | `array-buffer` | document | image] = js.native
  /**
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).  Example:
    * ```js
    * const controller = new AbortController();
    * const signal = controller.signal;
    *
    * esriRequest(url, { signal })
    *   .then((response) => {
    *     // The request went OK
    *   })
    *   .catch((err) => {
    *     if (err.name === 'AbortError') {
    *       console.log('Request aborted');
    *     } else {
    *       console.error('Error encountered', err);
    *     }
    *   });
    *
    * // Abort requests that are aware of the controller's signal
    * controller.abort();
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  /**
    * Indicates the amount of time in milliseconds to wait for a response from the server. Set to `0` to wait for the response indefinitely.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * Indicates the request should use the proxy. By default this is determined automatically based on the domain of the request URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var useProxy: js.UndefOr[Boolean] = js.native
}

object RequestOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[RequestOptions]
  }
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthMode(value: auto | anonymous | immediate | `no-prompt`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMode")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyHTMLFormElement(value: HTMLFormElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyFormData(value: FormData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: FormData | HTMLFormElement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheBust(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheBust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheBust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheBust")(js.undefined)
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
    def withMethod(value: auto | post): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
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
    def withResponseType(value: json | xml | text | blob | `array-buffer` | document | image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
        ret
    }
    @scala.inline
    def withSignal(value: AbortSignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUseProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useProxy")(js.undefined)
        ret
    }
  }
  
}

