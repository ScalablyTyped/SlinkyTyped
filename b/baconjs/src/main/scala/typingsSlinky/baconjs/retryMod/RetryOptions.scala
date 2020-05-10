package typingsSlinky.baconjs.retryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryOptions[V] extends js.Object {
  /**
    *  Optional. A function that returns the time in milliseconds to wait before retrying. Defaults to `0`. The function is given a context object with the keys ```error``` (the error that occurred) and `retriesDone` (the number of retries already performed) to help determine the appropriate delay e.g. for an incremental backoff.
    */
  var delay: js.UndefOr[js.Function1[/* context */ RetryContext, Double]] = js.native
  /**
    * Optional. A function returning `true` to continue retrying, `false` to stop. Defaults to `true`. The error that occurred is given as a parameter. For example, there is usually no reason to retry a 404 HTTP error, whereas a 500 or a timeout might work on the next attempt.
    */
  var isRetryable: js.UndefOr[js.Function1[/* error */ js.Any, Boolean]] = js.native
  /**
    * Required. The number of times to retry the `source` function _in addition to the initial attempt_. The default value is 0 (zero) for retrying indefinitely.
    */
  var retries: js.UndefOr[Double] = js.native
  /**
    * Required. A function that produces an Observable. The function gets attempt number (starting from zero) as its argument.
    */
  def source(attemptNumber: Double): typingsSlinky.baconjs.observableMod.default[V] = js.native
}

object RetryOptions {
  @scala.inline
  def apply[V](source: Double => typingsSlinky.baconjs.observableMod.default[V]): RetryOptions[V] = {
    val __obj = js.Dynamic.literal(source = js.Any.fromFunction1(source))
    __obj.asInstanceOf[RetryOptions[V]]
  }
  @scala.inline
  implicit class RetryOptionsOps[Self[v] <: RetryOptions[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withSource(value: Double => typingsSlinky.baconjs.observableMod.default[V]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelay(value: /* context */ RetryContext => Double): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDelay: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRetryable(value: /* error */ js.Any => Boolean): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRetryable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsRetryable: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRetryable")(js.undefined)
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetries: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(js.undefined)
        ret
    }
  }
  
}

