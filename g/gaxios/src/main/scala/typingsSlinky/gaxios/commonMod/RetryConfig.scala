package typingsSlinky.gaxios.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryConfig extends js.Object {
  /**
    * The number of retries already attempted.
    */
  var currentRetryAttempt: js.UndefOr[Double] = js.native
  /**
    * The HTTP Methods that will be automatically retried.
    * Defaults to ['GET','PUT','HEAD','OPTIONS','DELETE']
    */
  var httpMethodsToRetry: js.UndefOr[js.Array[String]] = js.native
  /**
    * When there is no response, the number of retries to attempt. Defaults to 2.
    */
  var noResponseRetries: js.UndefOr[Double] = js.native
  /**
    * Function to invoke when a retry attempt is made.
    */
  var onRetryAttempt: js.UndefOr[js.Function1[/* err */ GaxiosError[_], Unit]] = js.native
  /**
    * The number of times to retry the request.  Defaults to 3.
    */
  var retry: js.UndefOr[Double] = js.native
  /**
    * The amount of time to initially delay the retry.  Defaults to 100.
    */
  var retryDelay: js.UndefOr[Double] = js.native
  /**
    * Function to invoke which determines if you should retry
    */
  var shouldRetry: js.UndefOr[js.Function1[/* err */ GaxiosError[_], Boolean]] = js.native
  /**
    * The HTTP response status codes that will automatically be retried.
    * Defaults to: [[100, 199], [429, 429], [500, 599]]
    */
  var statusCodesToRetry: js.UndefOr[js.Array[js.Array[Double]]] = js.native
}

object RetryConfig {
  @scala.inline
  def apply(): RetryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryConfig]
  }
  @scala.inline
  implicit class RetryConfigOps[Self <: RetryConfig] (val x: Self) extends AnyVal {
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
    def withHttpMethodsToRetry(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethodsToRetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpMethodsToRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethodsToRetry")(js.undefined)
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
    def withOnRetryAttempt(value: /* err */ GaxiosError[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRetryAttempt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRetryAttempt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRetryAttempt")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: Double): Self = {
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
    def withShouldRetry(value: /* err */ GaxiosError[_] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRetry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRetry")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCodesToRetry(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCodesToRetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCodesToRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCodesToRetry")(js.undefined)
        ret
    }
  }
  
}

