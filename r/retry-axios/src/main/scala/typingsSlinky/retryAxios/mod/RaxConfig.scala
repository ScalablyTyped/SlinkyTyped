package typingsSlinky.retryAxios.mod

import typingsSlinky.axios.mod.AxiosAdapter
import typingsSlinky.axios.mod.AxiosBasicCredentials
import typingsSlinky.axios.mod.AxiosPromise
import typingsSlinky.axios.mod.AxiosProxyConfig
import typingsSlinky.axios.mod.AxiosRequestConfig
import typingsSlinky.axios.mod.AxiosTransformer
import typingsSlinky.axios.mod.CancelToken
import typingsSlinky.axios.mod.Method
import typingsSlinky.axios.mod.ResponseType
import typingsSlinky.retryAxios.retryAxiosBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  raxConfig  :retry-axios.retry-axios.RetryConfig} & axios.axios.AxiosRequestConfig */
@js.native
trait RaxConfig extends js.Object {
  var adapter: js.UndefOr[AxiosAdapter] = js.native
  var auth: js.UndefOr[AxiosBasicCredentials] = js.native
  var baseURL: js.UndefOr[String] = js.native
  var cancelToken: js.UndefOr[CancelToken] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var httpAgent: js.UndefOr[js.Any] = js.native
  var httpsAgent: js.UndefOr[js.Any] = js.native
  var maxContentLength: js.UndefOr[Double] = js.native
  var maxRedirects: js.UndefOr[Double] = js.native
  var method: js.UndefOr[Method] = js.native
  var onDownloadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, Unit]] = js.native
  var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, Unit]] = js.native
  var params: js.UndefOr[js.Any] = js.native
  var paramsSerializer: js.UndefOr[js.Function1[/* params */ js.Any, String]] = js.native
  var proxy: js.UndefOr[AxiosProxyConfig | `false`] = js.native
  var raxConfig: RetryConfig = js.native
  var responseType: js.UndefOr[ResponseType] = js.native
  var socketPath: js.UndefOr[String | Null] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var timeoutErrorMessage: js.UndefOr[String] = js.native
  var transformRequest: js.UndefOr[AxiosTransformer | js.Array[AxiosTransformer]] = js.native
  var transformResponse: js.UndefOr[AxiosTransformer | js.Array[AxiosTransformer]] = js.native
  var url: js.UndefOr[String] = js.native
  var validateStatus: js.UndefOr[js.Function1[/* status */ Double, Boolean]] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
  var xsrfCookieName: js.UndefOr[String] = js.native
  var xsrfHeaderName: js.UndefOr[String] = js.native
}

object RaxConfig {
  @scala.inline
  def apply(raxConfig: RetryConfig): RaxConfig = {
    val __obj = js.Dynamic.literal(raxConfig = raxConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxConfig]
  }
  @scala.inline
  implicit class RaxConfigOps[Self <: RaxConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRaxConfig(value: RetryConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raxConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdapter(value: /* config */ AxiosRequestConfig => AxiosPromise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdapter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: AxiosBasicCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseURL")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelToken(value: CancelToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelToken")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
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
    def withHttpAgent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpsAgent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpsAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxContentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxContentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxContentLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxContentLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRedirects(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRedirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRedirects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRedirects")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: Method): Self = {
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
    def withOnDownloadProgress(value: /* progressEvent */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDownloadProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDownloadProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDownloadProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUploadProgress(value: /* progressEvent */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploadProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUploadProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploadProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withParamsSerializer(value: /* params */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsSerializer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParamsSerializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsSerializer")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: AxiosProxyConfig | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseType(value: ResponseType): Self = {
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
    def withSocketPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketPathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(null)
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
    def withTimeoutErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformRequestFunction2(value: (/* data */ js.Any, /* headers */ js.UndefOr[js.Any]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTransformRequest(value: AxiosTransformer | js.Array[AxiosTransformer]): Self = {
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
    def withTransformResponseFunction2(value: (/* data */ js.Any, /* headers */ js.UndefOr[js.Any]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformResponse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTransformResponse(value: AxiosTransformer | js.Array[AxiosTransformer]): Self = {
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
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateStatus(value: /* status */ Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateStatus")(js.undefined)
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

