package typingsSlinky.pulumiAws.inputMod.glue

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobNotificationProperty extends js.Object {
  /**
    * After a job run starts, the number of minutes to wait before sending a job run delay notification.
    */
  var notifyDelayAfter: js.UndefOr[Input[Double]] = js.native
}

object JobNotificationProperty {
  @scala.inline
  def apply(): JobNotificationProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobNotificationProperty]
  }
  @scala.inline
  implicit class JobNotificationPropertyOps[Self <: JobNotificationProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifyDelayAfter(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyDelayAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifyDelayAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyDelayAfter")(js.undefined)
        ret
    }
  }
  
}

