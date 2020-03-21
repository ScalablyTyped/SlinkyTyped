package typingsSlinky.evernote.mod.NoteStore

import typingsSlinky.evernote.AnonIdentityID
import typingsSlinky.evernote.mod.Errors.EDAMNotFoundException
import typingsSlinky.evernote.mod.Errors.EDAMUserException
import typingsSlinky.evernote.mod.Types.IdentityID
import typingsSlinky.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.ManageNoteSharesError")
@js.native
class ManageNoteSharesError () extends js.Object {
  def this(args: AnonIdentityID) = this()
  var identityID: js.UndefOr[IdentityID] = js.native
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.native
  var userException: js.UndefOr[EDAMUserException] = js.native
  var userID: js.UndefOr[UserID] = js.native
}

