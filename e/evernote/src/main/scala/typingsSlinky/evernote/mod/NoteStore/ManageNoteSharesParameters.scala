package typingsSlinky.evernote.mod.NoteStore

import typingsSlinky.evernote.anon.InvitationsToUnshare
import typingsSlinky.evernote.mod.Types.IdentityID
import typingsSlinky.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.ManageNoteSharesParameters")
@js.native
class ManageNoteSharesParameters () extends js.Object {
  def this(args: InvitationsToUnshare) = this()
  
  var invitationsToUnshare: js.UndefOr[js.Array[IdentityID]] = js.native
  
  var invitationsToUpdate: js.UndefOr[js.Array[NoteInvitationShareRelationship]] = js.native
  
  var membershipsToUnshare: js.UndefOr[js.Array[UserID]] = js.native
  
  var membershipsToUpdate: js.UndefOr[js.Array[NoteMemberShareRelationship]] = js.native
  
  var noteGuid: js.UndefOr[String] = js.native
}
