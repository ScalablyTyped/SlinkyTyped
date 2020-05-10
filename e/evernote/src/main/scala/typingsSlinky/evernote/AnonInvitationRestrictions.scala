package typingsSlinky.evernote

import typingsSlinky.evernote.mod.NoteStore.NoteInvitationShareRelationship
import typingsSlinky.evernote.mod.NoteStore.NoteMemberShareRelationship
import typingsSlinky.evernote.mod.NoteStore.NoteShareRelationshipRestrictions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInvitationRestrictions extends js.Object {
  var invitationRestrictions: js.UndefOr[NoteShareRelationshipRestrictions] = js.native
  var invitations: js.UndefOr[js.Array[NoteInvitationShareRelationship]] = js.native
  var memberships: js.UndefOr[js.Array[NoteMemberShareRelationship]] = js.native
}

object AnonInvitationRestrictions {
  @scala.inline
  def apply(): AnonInvitationRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonInvitationRestrictions]
  }
  @scala.inline
  implicit class AnonInvitationRestrictionsOps[Self <: AnonInvitationRestrictions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvitationRestrictions(value: NoteShareRelationshipRestrictions): Self = {
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
    def withInvitations(value: js.Array[NoteInvitationShareRelationship]): Self = {
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
    def withMemberships(value: js.Array[NoteMemberShareRelationship]): Self = {
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

