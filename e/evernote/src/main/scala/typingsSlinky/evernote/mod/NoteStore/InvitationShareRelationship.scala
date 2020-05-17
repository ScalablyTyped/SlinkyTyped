package typingsSlinky.evernote.mod.NoteStore

import typingsSlinky.evernote.anon.DisplayName
import typingsSlinky.evernote.mod.Types.UserID
import typingsSlinky.evernote.mod.Types.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.InvitationShareRelationship")
@js.native
class InvitationShareRelationship () extends js.Object {
  def this(args: DisplayName) = this()
  var displayName: js.UndefOr[String] = js.native
  var privilege: js.UndefOr[ShareRelationshipPrivilegeLevel] = js.native
  var recipientUserIdentity: js.UndefOr[UserIdentity] = js.native
  var sharerUserId: js.UndefOr[UserID] = js.native
}

