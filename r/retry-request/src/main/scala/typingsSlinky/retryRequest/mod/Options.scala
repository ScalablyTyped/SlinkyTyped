package typingsSlinky.retryRequest.mod

import typingsSlinky.request.mod.CoreOptions
import typingsSlinky.request.mod.Request
import typingsSlinky.request.mod.RequestAPI
import typingsSlinky.request.mod.RequestResponse
import typingsSlinky.request.mod.RequiredUriUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var currentRetryAttempt: js.UndefOr[Double] = js.native
  var noResponseRetries: js.UndefOr[Double] = js.native
  var objectMode: js.UndefOr[Boolean] = js.native
  var request: js.UndefOr[RequestAPI[Request, CoreOptions, RequiredUriUrl]] = js.native
  var retries: js.UndefOr[Double] = js.native
  var shouldRetryFn: js.UndefOr[js.Function1[/* response */ RequestResponse, Boolean]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentRetryAttempt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRetryAttempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentRetryAttempt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRetryAttempt")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResponseRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResponseRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoResponseRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResponseRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: RequestAPI[Request, CoreOptions, RequiredUriUrl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldRetryFn(value: /* response */ RequestResponse => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRetryFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldRetryFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRetryFn")(js.undefined)
        ret
    }
  }
  
}

