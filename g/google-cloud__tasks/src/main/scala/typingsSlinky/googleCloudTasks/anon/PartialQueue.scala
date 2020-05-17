package typingsSlinky.googleCloudTasks.anon

import typingsSlinky.googleCloudTasks.mod.AppEngineHttpQueue
import typingsSlinky.googleCloudTasks.mod.RateLimits
import typingsSlinky.googleCloudTasks.mod.RetryConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@google-cloud/tasks.@google-cloud/tasks.Queue> */
@js.native
trait PartialQueue extends js.Object {
  var appEngineHttpQueue: js.UndefOr[AppEngineHttpQueue] = js.native
  var name: js.UndefOr[String] = js.native
  var purgeTime: js.UndefOr[String] = js.native
  var rateLimits: js.UndefOr[RateLimits] = js.native
  var retryConfig: js.UndefOr[RetryConfig] = js.native
  var state: js.UndefOr[String] = js.native
}

object PartialQueue {
  @scala.inline
  def apply(): PartialQueue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialQueue]
  }
  @scala.inline
  implicit class PartialQueueOps[Self <: PartialQueue] (val x: Self) extends AnyVal {
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
    def withoutAppEngineHttpQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineHttpQueue")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPurgeTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purgeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurgeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purgeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRateLimits(value: RateLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRateLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rateLimits")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryConfig(value: RetryConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

