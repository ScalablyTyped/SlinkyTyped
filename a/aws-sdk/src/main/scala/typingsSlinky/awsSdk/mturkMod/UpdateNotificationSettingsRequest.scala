package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNotificationSettingsRequest extends js.Object {
  /**
    *  Specifies whether notifications are sent for HITs of this HIT type, according to the notification specification. You must specify either the Notification parameter or the Active parameter for the call to UpdateNotificationSettings to succeed. 
    */
  var Active: js.UndefOr[Boolean] = js.native
  /**
    *  The ID of the HIT type whose notification specification is being updated. 
    */
  var HITTypeId: EntityId = js.native
  /**
    *  The notification specification for the HIT type. 
    */
  var Notification: js.UndefOr[NotificationSpecification] = js.native
}

object UpdateNotificationSettingsRequest {
  @scala.inline
  def apply(HITTypeId: EntityId): UpdateNotificationSettingsRequest = {
    val __obj = js.Dynamic.literal(HITTypeId = HITTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotificationSettingsRequest]
  }
  @scala.inline
  implicit class UpdateNotificationSettingsRequestOps[Self <: UpdateNotificationSettingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHITTypeId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification(value: NotificationSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(js.undefined)
        ret
    }
  }
  
}

