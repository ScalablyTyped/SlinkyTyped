package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedActionHistoryItem extends js.Object {
  /**
    * A description of the managed action.
    */
  var ActionDescription: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the managed action.
    */
  var ActionId: js.UndefOr[String] = js.native
  /**
    * The type of the managed action.
    */
  var ActionType: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ActionType] = js.native
  /**
    * The date and time that the action started executing.
    */
  var ExecutedTime: js.UndefOr[js.Date] = js.native
  /**
    * If the action failed, a description of the failure.
    */
  var FailureDescription: js.UndefOr[String] = js.native
  /**
    * If the action failed, the type of failure.
    */
  var FailureType: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.FailureType] = js.native
  /**
    * The date and time that the action finished executing.
    */
  var FinishedTime: js.UndefOr[js.Date] = js.native
  /**
    * The status of the action.
    */
  var Status: js.UndefOr[ActionHistoryStatus] = js.native
}

object ManagedActionHistoryItem {
  @scala.inline
  def apply(): ManagedActionHistoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedActionHistoryItem]
  }
  @scala.inline
  implicit class ManagedActionHistoryItemOps[Self <: ManagedActionHistoryItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withActionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionId")(js.undefined)
        ret
    }
    @scala.inline
    def withActionType(value: ActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionType")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureType(value: FailureType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureType")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinishedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FinishedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ActionHistoryStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

