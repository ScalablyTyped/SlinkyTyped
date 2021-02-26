package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.NoteStore.NoteInvitationShareRelationship
import typingsSlinky.evernote.mod.NoteStore.NoteMemberShareRelationship
import typingsSlinky.evernote.mod.NoteStore.NoteShareRelationshipRestrictions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvitationRestrictions extends StObject {
  
  var invitationRestrictions: js.UndefOr[NoteShareRelationshipRestrictions] = js.native
  
  var invitations: js.UndefOr[js.Array[NoteInvitationShareRelationship]] = js.native
  
  var memberships: js.UndefOr[js.Array[NoteMemberShareRelationship]] = js.native
}
object InvitationRestrictions {
  
  @scala.inline
  def apply(): InvitationRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvitationRestrictions]
  }
  
  @scala.inline
  implicit class InvitationRestrictionsMutableBuilder[Self <: InvitationRestrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitationRestrictions(value: NoteShareRelationshipRestrictions): Self = StObject.set(x, "invitationRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationRestrictionsUndefined: Self = StObject.set(x, "invitationRestrictions", js.undefined)
    
    @scala.inline
    def setInvitations(value: js.Array[NoteInvitationShareRelationship]): Self = StObject.set(x, "invitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationsUndefined: Self = StObject.set(x, "invitations", js.undefined)
    
    @scala.inline
    def setInvitationsVarargs(value: NoteInvitationShareRelationship*): Self = StObject.set(x, "invitations", js.Array(value :_*))
    
    @scala.inline
    def setMemberships(value: js.Array[NoteMemberShareRelationship]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
    
    @scala.inline
    def setMembershipsVarargs(value: NoteMemberShareRelationship*): Self = StObject.set(x, "memberships", js.Array(value :_*))
  }
}
