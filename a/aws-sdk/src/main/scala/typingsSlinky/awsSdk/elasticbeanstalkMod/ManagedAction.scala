package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedAction extends js.Object {
  /**
    * A description of the managed action.
    */
  var ActionDescription: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the managed action.
    */
  var ActionId: js.UndefOr[String] = js.native
  /**
    * The type of managed action.
    */
  var ActionType: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ActionType] = js.native
  /**
    * The status of the managed action. If the action is Scheduled, you can apply it immediately with ApplyEnvironmentManagedAction.
    */
  var Status: js.UndefOr[ActionStatus] = js.native
  /**
    * The start time of the maintenance window in which the managed action will execute.
    */
  var WindowStartTime: js.UndefOr[js.Date] = js.native
}

object ManagedAction {
  @scala.inline
  def apply(): ManagedAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAction]
  }
  @scala.inline
  implicit class ManagedActionOps[Self <: ManagedAction] (val x: Self) extends AnyVal {
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
    def withStatus(value: ActionStatus): Self = {
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
    @scala.inline
    def withWindowStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowStartTime")(js.undefined)
        ret
    }
  }
  
}

