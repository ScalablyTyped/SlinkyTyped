package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.NoteStore.InvitationShareRelationship
import typingsSlinky.evernote.mod.NoteStore.MemberShareRelationship
import typingsSlinky.evernote.mod.Types.UserIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvitationsToCreateOrUpdate extends StObject {
  
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
  implicit class InvitationsToCreateOrUpdateMutableBuilder[Self <: InvitationsToCreateOrUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvitationsToCreateOrUpdate(value: js.Array[InvitationShareRelationship]): Self = StObject.set(x, "invitationsToCreateOrUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationsToCreateOrUpdateUndefined: Self = StObject.set(x, "invitationsToCreateOrUpdate", js.undefined)
    
    @scala.inline
    def setInvitationsToCreateOrUpdateVarargs(value: InvitationShareRelationship*): Self = StObject.set(x, "invitationsToCreateOrUpdate", js.Array(value :_*))
    
    @scala.inline
    def setInviteMessage(value: String): Self = StObject.set(x, "inviteMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInviteMessageUndefined: Self = StObject.set(x, "inviteMessage", js.undefined)
    
    @scala.inline
    def setMembershipsToUpdate(value: js.Array[MemberShareRelationship]): Self = StObject.set(x, "membershipsToUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipsToUpdateUndefined: Self = StObject.set(x, "membershipsToUpdate", js.undefined)
    
    @scala.inline
    def setMembershipsToUpdateVarargs(value: MemberShareRelationship*): Self = StObject.set(x, "membershipsToUpdate", js.Array(value :_*))
    
    @scala.inline
    def setNotebookGuid(value: String): Self = StObject.set(x, "notebookGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotebookGuidUndefined: Self = StObject.set(x, "notebookGuid", js.undefined)
    
    @scala.inline
    def setUnshares(value: js.Array[UserIdentity]): Self = StObject.set(x, "unshares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsharesUndefined: Self = StObject.set(x, "unshares", js.undefined)
    
    @scala.inline
    def setUnsharesVarargs(value: UserIdentity*): Self = StObject.set(x, "unshares", js.Array(value :_*))
  }
}
