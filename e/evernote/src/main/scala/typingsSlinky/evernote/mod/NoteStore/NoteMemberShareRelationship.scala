package typingsSlinky.evernote.mod.NoteStore

import typingsSlinky.evernote.anon.Privilege
import typingsSlinky.evernote.mod.Types.SharedNotePrivilegeLevel
import typingsSlinky.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.NoteMemberShareRelationship")
@js.native
class NoteMemberShareRelationship () extends js.Object {
  def this(args: Privilege) = this()
  
  var displayName: js.UndefOr[String] = js.native
  
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  
  var recipientUserId: js.UndefOr[UserID] = js.native
  
  var restrictions: js.UndefOr[NoteShareRelationshipRestrictions] = js.native
  
  var sharerUserId: js.UndefOr[UserID] = js.native
}
