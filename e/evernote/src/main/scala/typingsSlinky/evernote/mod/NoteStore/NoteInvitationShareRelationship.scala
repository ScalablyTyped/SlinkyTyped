package typingsSlinky.evernote.mod.NoteStore

import typingsSlinky.evernote.AnonRecipientIdentityId
import typingsSlinky.evernote.mod.Types.IdentityID
import typingsSlinky.evernote.mod.Types.SharedNotePrivilegeLevel
import typingsSlinky.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NoteInvitationShareRelationship")
@js.native
class NoteInvitationShareRelationship () extends js.Object {
  def this(args: AnonRecipientIdentityId) = this()
  var displayName: js.UndefOr[String] = js.native
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  var recipientIdentityId: js.UndefOr[IdentityID] = js.native
  var sharerUserId: js.UndefOr[UserID] = js.native
}

