package typingsSlinky.evernote.mod.NoteStore

import typingsSlinky.evernote.anon.RecipientIdentityId
import typingsSlinky.evernote.mod.Types.IdentityID
import typingsSlinky.evernote.mod.Types.SharedNotePrivilegeLevel
import typingsSlinky.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.NoteInvitationShareRelationship")
@js.native
class NoteInvitationShareRelationship () extends StObject {
  def this(args: RecipientIdentityId) = this()
  
  var displayName: js.UndefOr[String] = js.native
  
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  
  var recipientIdentityId: js.UndefOr[IdentityID] = js.native
  
  var sharerUserId: js.UndefOr[UserID] = js.native
}
