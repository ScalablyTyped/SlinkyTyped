package typingsSlinky.redis.mod

import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryStrategyOptions extends js.Object {
  var attempt: Double = js.native
  var error: ErrnoException = js.native
  var times_connected: Double = js.native
  var total_retry_time: Double = js.native
}

object RetryStrategyOptions {
  @scala.inline
  def apply(attempt: Double, error: ErrnoException, times_connected: Double, total_retry_time: Double): RetryStrategyOptions = {
    val __obj = js.Dynamic.literal(attempt = attempt.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], times_connected = times_connected.asInstanceOf[js.Any], total_retry_time = total_retry_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryStrategyOptions]
  }
  @scala.inline
  implicit class RetryStrategyOptionsOps[Self <: RetryStrategyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttempt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attempt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: ErrnoException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimes_connected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("times_connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_retry_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_retry_time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

