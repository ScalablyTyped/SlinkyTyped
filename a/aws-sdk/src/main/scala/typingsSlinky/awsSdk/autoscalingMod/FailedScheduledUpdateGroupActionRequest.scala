package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedScheduledUpdateGroupActionRequest extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[XmlStringMaxLen64] = js.native
  /**
    * The error message accompanying the error code.
    */
  var ErrorMessage: js.UndefOr[XmlString] = js.native
  /**
    * The name of the scheduled action.
    */
  var ScheduledActionName: XmlStringMaxLen255 = js.native
}

object FailedScheduledUpdateGroupActionRequest {
  @scala.inline
  def apply(ScheduledActionName: XmlStringMaxLen255): FailedScheduledUpdateGroupActionRequest = {
    val __obj = js.Dynamic.literal(ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedScheduledUpdateGroupActionRequest]
  }
  @scala.inline
  implicit class FailedScheduledUpdateGroupActionRequestOps[Self <: FailedScheduledUpdateGroupActionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScheduledActionName(value: XmlStringMaxLen255): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledActionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorCode(value: XmlStringMaxLen64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
  }
  
}

