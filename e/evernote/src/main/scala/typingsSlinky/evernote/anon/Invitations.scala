package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.NoteStore.InvitationShareRelationship
import typingsSlinky.evernote.mod.NoteStore.MemberShareRelationship
import typingsSlinky.evernote.mod.NoteStore.ShareRelationshipRestrictions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invitations extends js.Object {
  var invitationRestrictions: js.UndefOr[ShareRelationshipRestrictions] = js.native
  var invitations: js.UndefOr[js.Array[InvitationShareRelationship]] = js.native
  var memberships: js.UndefOr[js.Array[MemberShareRelationship]] = js.native
}

object Invitations {
  @scala.inline
  def apply(): Invitations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invitations]
  }
  @scala.inline
  implicit class InvitationsOps[Self <: Invitations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvitationRestrictions(value: ShareRelationshipRestrictions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitationRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationRestrictions")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitations(value: js.Array[InvitationShareRelationship]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitations")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberships(value: js.Array[MemberShareRelationship]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberships: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberships")(js.undefined)
        ret
    }
  }
  
}

