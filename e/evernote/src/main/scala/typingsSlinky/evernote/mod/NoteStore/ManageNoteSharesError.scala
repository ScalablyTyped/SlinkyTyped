package typingsSlinky.evernote.mod.NoteStore

import typingsSlinky.evernote.anon.IdentityID
import typingsSlinky.evernote.mod.Errors.EDAMNotFoundException
import typingsSlinky.evernote.mod.Errors.EDAMUserException
import typingsSlinky.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.ManageNoteSharesError")
@js.native
class ManageNoteSharesError () extends StObject {
  def this(args: IdentityID) = this()
  
  var identityID: js.UndefOr[typingsSlinky.evernote.mod.Types.IdentityID] = js.native
  
  var notFoundException: js.UndefOr[EDAMNotFoundException] = js.native
  
  var userException: js.UndefOr[EDAMUserException] = js.native
  
  var userID: js.UndefOr[UserID] = js.native
}
