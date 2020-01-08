package typingsSlinky.googleapis.buildSrcApisServicebrokerV1beta1Mod.servicebroker_v1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.AbortSignal
import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosOptions
import typingsSlinky.gaxios.buildSrcCommonMod.GaxiosPromise
import typingsSlinky.gaxios.buildSrcCommonMod.Headers
import typingsSlinky.gaxios.buildSrcCommonMod.RetryConfig
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
import typingsSlinky.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typingsSlinky.googleapis.googleapisStrings.v1beta1
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.UserAgentDirective
import typingsSlinky.node.httpsMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends GlobalOptions {
  var version: v1beta1 = js.native
}

object Options {
  @scala.inline
  def apply(
    version: v1beta1,
    adapter: /* options */ GaxiosOptions => GaxiosPromise[_] = null,
    agent: Agent = null,
    auth: OAuth2Client | String = null,
    baseURL: String = null,
    baseUrl: String = null,
    body: js.Any = null,
    data: js.Any = null,
    follow: Int | Double = null,
    headers: Headers = null,
    maxContentLength: Int | Double = null,
    maxRedirects: Int | Double = null,
    method: GET | HEAD | POST | DELETE | PUT | CONNECT | OPTIONS | TRACE | PATCH = null,
    onUploadProgress: /* progressEvent */ js.Any => Unit = null,
    params: js.Any = null,
    paramsSerializer: /* params */ StringDictionary[String | Double] => String = null,
    responseType: arraybuffer | blob | json | text | stream = null,
    retry: js.UndefOr[Boolean] = js.undefined,
    retryConfig: RetryConfig = null,
    rootUrl: String = null,
    signal: AbortSignal = null,
    size: Int | Double = null,
    timeout: Int | Double = null,
    url: String = null,
    userAgentDirectives: js.Array[UserAgentDirective] = null,
    validateStatus: /* status */ Double => Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (adapter != null) __obj.updateDynamic("adapter")(js.Any.fromFunction1(adapter))
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (follow != null) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (maxContentLength != null) __obj.updateDynamic("maxContentLength")(maxContentLength.asInstanceOf[js.Any])
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onUploadProgress != null) __obj.updateDynamic("onUploadProgress")(js.Any.fromFunction1(onUploadProgress))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (paramsSerializer != null) __obj.updateDynamic("paramsSerializer")(js.Any.fromFunction1(paramsSerializer))
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(retry)) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (retryConfig != null) __obj.updateDynamic("retryConfig")(retryConfig.asInstanceOf[js.Any])
    if (rootUrl != null) __obj.updateDynamic("rootUrl")(rootUrl.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (userAgentDirectives != null) __obj.updateDynamic("userAgentDirectives")(userAgentDirectives.asInstanceOf[js.Any])
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(js.Any.fromFunction1(validateStatus))
    __obj.asInstanceOf[Options]
  }
}

