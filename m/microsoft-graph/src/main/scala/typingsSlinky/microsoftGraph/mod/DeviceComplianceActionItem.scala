package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceComplianceActionItem extends Entity {
  /**
    * What action to take. Possible values are: noAction, notification, block, retire, wipe, removeResourceAccessProfiles,
    * pushNotification.
    */
  var actionType: js.UndefOr[DeviceComplianceActionType] = js.native
  // Number of hours to wait till the action will be enforced. Valid values 0 to 8760
  var gracePeriodHours: js.UndefOr[Double] = js.native
  // A list of group IDs to speicify who to CC this notification message to.
  var notificationMessageCCList: js.UndefOr[js.Array[String]] = js.native
  // What notification Message template to use
  var notificationTemplateId: js.UndefOr[String] = js.native
}

object DeviceComplianceActionItem {
  @scala.inline
  def apply(): DeviceComplianceActionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceComplianceActionItem]
  }
  @scala.inline
  implicit class DeviceComplianceActionItemOps[Self <: DeviceComplianceActionItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionType(value: DeviceComplianceActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(js.undefined)
        ret
    }
    @scala.inline
    def withGracePeriodHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gracePeriodHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGracePeriodHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gracePeriodHours")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationMessageCCList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationMessageCCList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationMessageCCList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationMessageCCList")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTemplateId")(js.undefined)
        ret
    }
  }
  
}

