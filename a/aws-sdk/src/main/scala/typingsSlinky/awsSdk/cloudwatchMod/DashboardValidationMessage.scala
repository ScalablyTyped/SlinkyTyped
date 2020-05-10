package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardValidationMessage extends js.Object {
  /**
    * The data path related to the message.
    */
  var DataPath: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.DataPath] = js.native
  /**
    * A message describing the error or warning.
    */
  var Message: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.Message] = js.native
}

object DashboardValidationMessage {
  @scala.inline
  def apply(): DashboardValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardValidationMessage]
  }
  @scala.inline
  implicit class DashboardValidationMessageOps[Self <: DashboardValidationMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataPath(value: DataPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataPath")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
  }
  
}

