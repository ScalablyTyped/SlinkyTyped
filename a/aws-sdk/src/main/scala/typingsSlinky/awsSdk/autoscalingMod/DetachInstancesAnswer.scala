package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachInstancesAnswer extends js.Object {
  /**
    * The activities related to detaching the instances from the Auto Scaling group.
    */
  var Activities: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.Activities] = js.native
}

object DetachInstancesAnswer {
  @scala.inline
  def apply(): DetachInstancesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachInstancesAnswer]
  }
  @scala.inline
  implicit class DetachInstancesAnswerOps[Self <: DetachInstancesAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivities(value: Activities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Activities")(js.undefined)
        ret
    }
  }
  
}

