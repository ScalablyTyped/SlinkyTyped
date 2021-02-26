package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.NoteStore.InvitationShareRelationship
import typingsSlinky.evernote.mod.NoteStore.MemberShareRelationship
import typingsSlinky.evernote.mod.NoteStore.ShareRelationshipRestrictions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Invitations extends StObject {
  
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
  implicit class InvitationsMutableBuilder[Self <: Invitations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitationRestrictions(value: ShareRelationshipRestrictions): Self = StObject.set(x, "invitationRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationRestrictionsUndefined: Self = StObject.set(x, "invitationRestrictions", js.undefined)
    
    @scala.inline
    def setInvitations(value: js.Array[InvitationShareRelationship]): Self = StObject.set(x, "invitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationsUndefined: Self = StObject.set(x, "invitations", js.undefined)
    
    @scala.inline
    def setInvitationsVarargs(value: InvitationShareRelationship*): Self = StObject.set(x, "invitations", js.Array(value :_*))
    
    @scala.inline
    def setMemberships(value: js.Array[MemberShareRelationship]): Self = StObject.set(x, "memberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipsUndefined: Self = StObject.set(x, "memberships", js.undefined)
    
    @scala.inline
    def setMembershipsVarargs(value: MemberShareRelationship*): Self = StObject.set(x, "memberships", js.Array(value :_*))
  }
}
