package typingsSlinky.evernote.mod.NoteStore

import typingsSlinky.evernote.anon.CcAddresses
import typingsSlinky.evernote.mod.Types.Note
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.NoteEmailParameters")
@js.native
class NoteEmailParameters () extends js.Object {
  def this(args: CcAddresses) = this()
  
  var ccAddresses: js.UndefOr[js.Array[String]] = js.native
  
  var guid: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var note: js.UndefOr[Note] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var toAddresses: js.UndefOr[js.Array[String]] = js.native
}
