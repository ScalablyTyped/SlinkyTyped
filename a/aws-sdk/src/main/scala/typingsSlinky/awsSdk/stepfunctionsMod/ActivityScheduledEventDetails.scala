package typingsSlinky.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityScheduledEventDetails extends js.Object {
  /**
    * The maximum allowed duration between two heartbeats for the activity task.
    */
  var heartbeatInSeconds: js.UndefOr[TimeoutInSeconds] = js.native
  /**
    * The JSON data input to the activity task.
    */
  var input: js.UndefOr[SensitiveData] = js.native
  /**
    * The Amazon Resource Name (ARN) of the scheduled activity.
    */
  var resource: Arn = js.native
  /**
    * The maximum allowed duration of the activity task.
    */
  var timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.native
}

object ActivityScheduledEventDetails {
  @scala.inline
  def apply(resource: Arn): ActivityScheduledEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityScheduledEventDetails]
  }
  @scala.inline
  implicit class ActivityScheduledEventDetailsOps[Self <: ActivityScheduledEventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResource(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeartbeatInSeconds(value: TimeoutInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeartbeatInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heartbeatInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: SensitiveData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutInSeconds(value: TimeoutInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInSeconds")(js.undefined)
        ret
    }
  }
  
}

