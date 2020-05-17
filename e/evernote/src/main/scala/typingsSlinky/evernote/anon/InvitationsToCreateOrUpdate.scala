package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.NoteStore.InvitationShareRelationship
import typingsSlinky.evernote.mod.NoteStore.MemberShareRelationship
import typingsSlinky.evernote.mod.Types.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvitationsToCreateOrUpdate extends js.Object {
  var invitationsToCreateOrUpdate: js.UndefOr[js.Array[InvitationShareRelationship]] = js.native
  var inviteMessage: js.UndefOr[String] = js.native
  var membershipsToUpdate: js.UndefOr[js.Array[MemberShareRelationship]] = js.native
  var notebookGuid: js.UndefOr[String] = js.native
  var unshares: js.UndefOr[js.Array[UserIdentity]] = js.native
}

object InvitationsToCreateOrUpdate {
  @scala.inline
  def apply(): InvitationsToCreateOrUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitationsToCreateOrUpdate]
  }
  @scala.inline
  implicit class InvitationsToCreateOrUpdateOps[Self <: InvitationsToCreateOrUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvitationsToCreateOrUpdate(value: js.Array[InvitationShareRelationship]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationsToCreateOrUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitationsToCreateOrUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationsToCreateOrUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withInviteMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviteMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInviteMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviteMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMembershipsToUpdate(value: js.Array[MemberShareRelationship]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("membershipsToUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembershipsToUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("membershipsToUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebookGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookGuid")(js.undefined)
        ret
    }
    @scala.inline
    def withUnshares(value: js.Array[UserIdentity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unshares")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnshares: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unshares")(js.undefined)
        ret
    }
  }
  
}

