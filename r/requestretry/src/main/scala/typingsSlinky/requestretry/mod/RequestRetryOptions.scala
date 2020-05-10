package typingsSlinky.requestretry.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.request.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestRetryOptions extends CoreOptions {
  var delayStrategy: js.UndefOr[DelayStrategy] = js.native
  var fullResponse: js.UndefOr[Boolean] = js.native
  var maxAttempts: js.UndefOr[Double] = js.native
  var promiseFactory: js.UndefOr[js.Function1[/* resolver */ js.Any, _]] = js.native
  var retryDelay: js.UndefOr[Double] = js.native
  var retryStrategy: js.UndefOr[RetryStrategy] = js.native
}

object RequestRetryOptions {
  @scala.inline
  def apply(): RequestRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestRetryOptions]
  }
  @scala.inline
  implicit class RequestRetryOptionsOps[Self <: RequestRetryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelayStrategy(value: (/* err */ js.Error, /* response */ IncomingMessage, /* body */ js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayStrategy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDelayStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withFullResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withPromiseFactory(value: /* resolver */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseFactory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPromiseFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryStrategy(value: (/* err */ js.Error, /* response */ IncomingMessage, /* body */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryStrategy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRetryStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryStrategy")(js.undefined)
        ret
    }
  }
  
}

