package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkteamRequest extends js.Object {
  /**
    * An updated description for the work team.
    */
  var Description: js.UndefOr[String200] = js.native
  /**
    * A list of MemberDefinition objects that contain the updated work team members.
    */
  var MemberDefinitions: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MemberDefinitions] = js.native
  /**
    * Configures SNS topic notifications for available or expiring work items
    */
  var NotificationConfiguration: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NotificationConfiguration] = js.native
  /**
    * The name of the work team to update.
    */
  var WorkteamName: typingsSlinky.awsSdk.sagemakerMod.WorkteamName = js.native
}

object UpdateWorkteamRequest {
  @scala.inline
  def apply(WorkteamName: WorkteamName): UpdateWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkteamRequest]
  }
  @scala.inline
  implicit class UpdateWorkteamRequestOps[Self <: UpdateWorkteamRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkteamName(value: WorkteamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkteamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String200): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberDefinitions(value: MemberDefinitions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationConfiguration(value: NotificationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationConfiguration")(js.undefined)
        ret
    }
  }
  
}

