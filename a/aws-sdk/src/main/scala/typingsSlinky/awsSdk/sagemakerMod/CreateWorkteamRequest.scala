package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWorkteamRequest extends js.Object {
  /**
    * A description of the work team.
    */
  var Description: String200 = js.native
  /**
    * A list of MemberDefinition objects that contains objects that identify the Amazon Cognito user pool that makes up the work team. For more information, see Amazon Cognito User Pools. All of the CognitoMemberDefinition objects that make up the member definition must have the same ClientId and UserPool values.
    */
  var MemberDefinitions: typingsSlinky.awsSdk.sagemakerMod.MemberDefinitions = js.native
  /**
    * Configures notification of workers regarding available or expiring work items.
    */
  var NotificationConfiguration: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NotificationConfiguration] = js.native
  /**
    * An array of key-value pairs. For more information, see Resource Tag and Using Cost Allocation Tags in the  AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The name of the work team. Use this name to identify the work team.
    */
  var WorkteamName: typingsSlinky.awsSdk.sagemakerMod.WorkteamName = js.native
}

object CreateWorkteamRequest {
  @scala.inline
  def apply(Description: String200, MemberDefinitions: MemberDefinitions, WorkteamName: WorkteamName): CreateWorkteamRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], MemberDefinitions = MemberDefinitions.asInstanceOf[js.Any], WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkteamRequest]
  }
  @scala.inline
  implicit class CreateWorkteamRequestOps[Self <: CreateWorkteamRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String200): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberDefinitions(value: MemberDefinitions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkteamName(value: WorkteamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkteamName")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

