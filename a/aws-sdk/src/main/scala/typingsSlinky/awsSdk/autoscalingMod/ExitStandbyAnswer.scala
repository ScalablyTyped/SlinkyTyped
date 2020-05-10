package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExitStandbyAnswer extends js.Object {
  /**
    * The activities related to moving instances out of Standby mode.
    */
  var Activities: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.Activities] = js.native
}

object ExitStandbyAnswer {
  @scala.inline
  def apply(): ExitStandbyAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExitStandbyAnswer]
  }
  @scala.inline
  implicit class ExitStandbyAnswerOps[Self <: ExitStandbyAnswer] (val x: Self) extends AnyVal {
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

