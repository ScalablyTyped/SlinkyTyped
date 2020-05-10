package typingsSlinky.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryConfig extends js.Object {
  var maxAttempts: Double = js.native
  var maxBackoff: String = js.native
  var maxDoublings: Double = js.native
  var maxRetryDuration: String = js.native
  var minBackoff: String = js.native
}

object RetryConfig {
  @scala.inline
  def apply(
    maxAttempts: Double,
    maxBackoff: String,
    maxDoublings: Double,
    maxRetryDuration: String,
    minBackoff: String
  ): RetryConfig = {
    val __obj = js.Dynamic.literal(maxAttempts = maxAttempts.asInstanceOf[js.Any], maxBackoff = maxBackoff.asInstanceOf[js.Any], maxDoublings = maxDoublings.asInstanceOf[js.Any], maxRetryDuration = maxRetryDuration.asInstanceOf[js.Any], minBackoff = minBackoff.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryConfig]
  }
  @scala.inline
  implicit class RetryConfigOps[Self <: RetryConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxBackoff(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBackoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDoublings(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDoublings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxRetryDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetryDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinBackoff(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minBackoff")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

