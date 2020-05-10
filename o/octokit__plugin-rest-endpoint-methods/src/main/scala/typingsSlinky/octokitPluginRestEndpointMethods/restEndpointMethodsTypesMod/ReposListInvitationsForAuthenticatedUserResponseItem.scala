package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposListInvitationsForAuthenticatedUserResponseItem extends js.Object {
  var created_at: String = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var invitee: ReposListInvitationsForAuthenticatedUserResponseItemInvitee = js.native
  var inviter: ReposListInvitationsForAuthenticatedUserResponseItemInviter = js.native
  var permissions: String = js.native
  var repository: ReposListInvitationsForAuthenticatedUserResponseItemRepository = js.native
  var url: String = js.native
}

object ReposListInvitationsForAuthenticatedUserResponseItem {
  @scala.inline
  def apply(
    created_at: String,
    html_url: String,
    id: Double,
    invitee: ReposListInvitationsForAuthenticatedUserResponseItemInvitee,
    inviter: ReposListInvitationsForAuthenticatedUserResponseItemInviter,
    permissions: String,
    repository: ReposListInvitationsForAuthenticatedUserResponseItemRepository,
    url: String
  ): ReposListInvitationsForAuthenticatedUserResponseItem = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invitee = invitee.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListInvitationsForAuthenticatedUserResponseItem]
  }
  @scala.inline
  implicit class ReposListInvitationsForAuthenticatedUserResponseItemOps[Self <: ReposListInvitationsForAuthenticatedUserResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvitee(value: ReposListInvitationsForAuthenticatedUserResponseItemInvitee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInviter(value: ReposListInvitationsForAuthenticatedUserResponseItemInviter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepository(value: ReposListInvitationsForAuthenticatedUserResponseItemRepository): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

