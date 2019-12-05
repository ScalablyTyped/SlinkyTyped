package typingsSlinky.retryDashRequest.retryDashRequestMod

import typingsSlinky.request.requestMod.CoreOptions
import typingsSlinky.request.requestMod.Request
import typingsSlinky.request.requestMod.RequestAPI
import typingsSlinky.request.requestMod.RequestResponse
import typingsSlinky.request.requestMod.RequiredUriUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var currentRetryAttempt: js.UndefOr[Double] = js.undefined
  var noResponseRetries: js.UndefOr[Double] = js.undefined
  var objectMode: js.UndefOr[Boolean] = js.undefined
  var request: js.UndefOr[RequestAPI[Request, CoreOptions, RequiredUriUrl]] = js.undefined
  var retries: js.UndefOr[Double] = js.undefined
  var shouldRetryFn: js.UndefOr[js.Function1[/* response */ RequestResponse, Boolean]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    currentRetryAttempt: Int | Double = null,
    noResponseRetries: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    request: RequestAPI[Request, CoreOptions, RequiredUriUrl] = null,
    retries: Int | Double = null,
    shouldRetryFn: /* response */ RequestResponse => Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (currentRetryAttempt != null) __obj.updateDynamic("currentRetryAttempt")(currentRetryAttempt.asInstanceOf[js.Any])
    if (noResponseRetries != null) __obj.updateDynamic("noResponseRetries")(noResponseRetries.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (shouldRetryFn != null) __obj.updateDynamic("shouldRetryFn")(js.Any.fromFunction1(shouldRetryFn))
    __obj.asInstanceOf[Options]
  }
}

