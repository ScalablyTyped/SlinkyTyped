package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryOptions extends js.Object {
  /** Fixed retry interval in milliseconds to wait between each retry ignoring the retryAfter returned as part of the response. */
  var FixedRetryIntervalInMilliseconds: js.UndefOr[Double] = js.native
  /** Max number of retries to be performed for a request. Default value 9. */
  var MaxRetryAttemptCount: js.UndefOr[Double] = js.native
  /** Max wait time in seconds to wait for a request while the retries are happening. Default value 30 seconds. */
  var MaxWaitTimeInSeconds: js.UndefOr[Double] = js.native
}

object RetryOptions {
  @scala.inline
  def apply(): RetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryOptions]
  }
  @scala.inline
  implicit class RetryOptionsOps[Self <: RetryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixedRetryIntervalInMilliseconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedRetryIntervalInMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedRetryIntervalInMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FixedRetryIntervalInMilliseconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetryAttemptCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRetryAttemptCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetryAttemptCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxRetryAttemptCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWaitTimeInSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxWaitTimeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWaitTimeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxWaitTimeInSeconds")(js.undefined)
        ret
    }
  }
  
}

