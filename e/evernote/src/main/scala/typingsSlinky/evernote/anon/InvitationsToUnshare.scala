package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.NoteStore.NoteInvitationShareRelationship
import typingsSlinky.evernote.mod.NoteStore.NoteMemberShareRelationship
import typingsSlinky.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvitationsToUnshare extends js.Object {
  var invitationsToUnshare: js.UndefOr[js.Array[typingsSlinky.evernote.mod.Types.IdentityID]] = js.native
  var invitationsToUpdate: js.UndefOr[js.Array[NoteInvitationShareRelationship]] = js.native
  var membershipsToUnshare: js.UndefOr[js.Array[UserID]] = js.native
  var membershipsToUpdate: js.UndefOr[js.Array[NoteMemberShareRelationship]] = js.native
  var noteGuid: js.UndefOr[String] = js.native
}

object InvitationsToUnshare {
  @scala.inline
  def apply(): InvitationsToUnshare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitationsToUnshare]
  }
  @scala.inline
  implicit class InvitationsToUnshareOps[Self <: InvitationsToUnshare] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvitationsToUnshare(value: js.Array[typingsSlinky.evernote.mod.Types.IdentityID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationsToUnshare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitationsToUnshare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationsToUnshare")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitationsToUpdate(value: js.Array[NoteInvitationShareRelationship]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationsToUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitationsToUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationsToUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withMembershipsToUnshare(value: js.Array[UserID]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("membershipsToUnshare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembershipsToUnshare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("membershipsToUnshare")(js.undefined)
        ret
    }
    @scala.inline
    def withMembershipsToUpdate(value: js.Array[NoteMemberShareRelationship]): Self = {
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
    def withNoteGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteGuid")(js.undefined)
        ret
    }
  }
  
}

