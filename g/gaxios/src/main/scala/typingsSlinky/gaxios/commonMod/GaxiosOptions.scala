package typingsSlinky.gaxios.commonMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.AbortSignal
import typingsSlinky.gaxios.gaxiosStrings.CONNECT
import typingsSlinky.gaxios.gaxiosStrings.DELETE
import typingsSlinky.gaxios.gaxiosStrings.GET
import typingsSlinky.gaxios.gaxiosStrings.HEAD
import typingsSlinky.gaxios.gaxiosStrings.OPTIONS
import typingsSlinky.gaxios.gaxiosStrings.PATCH
import typingsSlinky.gaxios.gaxiosStrings.POST
import typingsSlinky.gaxios.gaxiosStrings.PUT
import typingsSlinky.gaxios.gaxiosStrings.TRACE
import typingsSlinky.gaxios.gaxiosStrings.arraybuffer
import typingsSlinky.gaxios.gaxiosStrings.blob
import typingsSlinky.gaxios.gaxiosStrings.json
import typingsSlinky.gaxios.gaxiosStrings.stream
import typingsSlinky.gaxios.gaxiosStrings.text
import typingsSlinky.node.httpsMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GaxiosOptions extends js.Object {
  /**
    * Optional method to override making the actual HTTP request. Useful
    * for writing tests.
    */
  var adapter: js.UndefOr[js.Function1[/* options */ GaxiosOptions, GaxiosPromise[_]]] = js.native
  var agent: js.UndefOr[Agent] = js.native
  var baseURL: js.UndefOr[String] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var body: js.UndefOr[js.Any] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var follow: js.UndefOr[Double] = js.native
  var headers: js.UndefOr[Headers] = js.native
  /**
    * The maximum size of the http response content in bytes allowed.
    */
  var maxContentLength: js.UndefOr[Double] = js.native
  /**
    * The maximum number of redirects to follow. Defaults to 20.
    */
  var maxRedirects: js.UndefOr[Double] = js.native
  var method: js.UndefOr[GET | HEAD | POST | DELETE | PUT | CONNECT | OPTIONS | TRACE | PATCH] = js.native
  var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, Unit]] = js.native
  var params: js.UndefOr[js.Any] = js.native
  var paramsSerializer: js.UndefOr[js.Function1[/* params */ StringDictionary[String | Double], String]] = js.native
  var responseType: js.UndefOr[arraybuffer | blob | json | text | stream] = js.native
  var retry: js.UndefOr[Boolean] = js.native
  var retryConfig: js.UndefOr[RetryConfig] = js.native
  var signal: js.UndefOr[AbortSignal] = js.native
  var size: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
  var validateStatus: js.UndefOr[js.Function1[/* status */ Double, Boolean]] = js.native
}

object GaxiosOptions {
  @scala.inline
  def apply(): GaxiosOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaxiosOptions]
  }
  @scala.inline
  implicit class GaxiosOptionsOps[Self <: GaxiosOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: /* options */ GaxiosOptions => GaxiosPromise[_]): Self = {
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
    def withAgent(value: Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
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
    def withBody(value: js.Any): Self = {
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
    def withFollow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: Headers): Self = {
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
    def withMethod(value: GET | HEAD | POST | DELETE | PUT | CONNECT | OPTIONS | TRACE | PATCH): Self = {
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
    def withParamsSerializer(value: /* params */ StringDictionary[String | Double] => String): Self = {
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
    def withResponseType(value: arraybuffer | blob | json | text | stream): Self = {
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
    def withRetry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryConfig(value: RetryConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryConfig")(js.undefined)
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
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
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
  }
  
}

