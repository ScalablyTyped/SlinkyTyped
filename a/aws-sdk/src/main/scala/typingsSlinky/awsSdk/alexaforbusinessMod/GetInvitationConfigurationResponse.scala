package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInvitationConfigurationResponse extends js.Object {
  /**
    * The email ID of the organization or individual contact that the enrolled user can use. 
    */
  var ContactEmail: js.UndefOr[Email] = js.native
  /**
    * The name of the organization sending the enrollment invite to a user.
    */
  var OrganizationName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.OrganizationName] = js.native
  /**
    * The list of private skill IDs that you want to recommend to the user to enable in the invitation.
    */
  var PrivateSkillIds: js.UndefOr[ShortSkillIdList] = js.native
}

object GetInvitationConfigurationResponse {
  @scala.inline
  def apply(): GetInvitationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInvitationConfigurationResponse]
  }
  @scala.inline
  implicit class GetInvitationConfigurationResponseOps[Self <: GetInvitationConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactEmail(value: Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationName(value: OrganizationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationName")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateSkillIds(value: ShortSkillIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateSkillIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateSkillIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateSkillIds")(js.undefined)
        ret
    }
  }
  
}

