package typingsSlinky.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue extends js.Object {
  var appEngineHttpQueue: AppEngineHttpQueue = js.native
  var name: String = js.native
  var purgeTime: String = js.native
  var rateLimits: RateLimits = js.native
  var retryConfig: RetryConfig = js.native
  var state: String = js.native
}

object Queue {
  @scala.inline
  def apply(
    appEngineHttpQueue: AppEngineHttpQueue,
    name: String,
    purgeTime: String,
    rateLimits: RateLimits,
    retryConfig: RetryConfig,
    state: String
  ): Queue = {
    val __obj = js.Dynamic.literal(appEngineHttpQueue = appEngineHttpQueue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], purgeTime = purgeTime.asInstanceOf[js.Any], rateLimits = rateLimits.asInstanceOf[js.Any], retryConfig = retryConfig.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queue]
  }
  @scala.inline
  implicit class QueueOps[Self <: Queue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppEngineHttpQueue(value: AppEngineHttpQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineHttpQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurgeTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purgeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRateLimits(value: RateLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetryConfig(value: RetryConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

