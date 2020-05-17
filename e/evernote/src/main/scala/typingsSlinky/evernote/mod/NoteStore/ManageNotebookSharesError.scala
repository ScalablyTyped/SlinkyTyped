package typingsSlinky.evernote.mod.NoteStore

import typingsSlinky.evernote.anon.NotFoundException
import typingsSlinky.evernote.mod.Errors.EDAMNotFoundException
import typingsSlinky.evernote.mod.Errors.EDAMUserException
import typingsSlinky.evernote.mod.Types.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.ManageNotebookSharesError")
@js.native
class ManageNotebookSharesError () extends js.Object {
  def this(args: NotFoundException) = this()
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.native
  var userException: js.UndefOr[EDAMUserException] = js.native
  var userIdentity: js.UndefOr[UserIdentity] = js.native
}

