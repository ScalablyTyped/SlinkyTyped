package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityType extends js.Object {
  /**
    * A scaling activity.
    */
  var Activity: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.Activity] = js.native
}

object ActivityType {
  @scala.inline
  def apply(): ActivityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityType]
  }
  @scala.inline
  implicit class ActivityTypeOps[Self <: ActivityType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivity(value: Activity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activity")(js.undefined)
        ret
    }
  }
  
}

