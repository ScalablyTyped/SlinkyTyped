package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notifications extends js.Object {
  /**
    * The Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing the job.
    */
  var Completed: js.UndefOr[SnsTopic] = js.native
  /**
    * The Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition.
    */
  var Error: js.UndefOr[SnsTopic] = js.native
  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has started to process the job.
    */
  var Progressing: js.UndefOr[SnsTopic] = js.native
  /**
    * The Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition.
    */
  var Warning: js.UndefOr[SnsTopic] = js.native
}

object Notifications {
  @scala.inline
  def apply(): Notifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notifications]
  }
  @scala.inline
  implicit class NotificationsOps[Self <: Notifications] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompleted(value: SnsTopic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Completed")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: SnsTopic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressing(value: SnsTopic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Progressing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Progressing")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: SnsTopic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Warning")(js.undefined)
        ret
    }
  }
  
}

