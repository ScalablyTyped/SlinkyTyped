package typingsSlinky.evernote.mod.Types

import typingsSlinky.evernote.anon.RecipientIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.SharedNote")
@js.native
class SharedNote () extends js.Object {
  def this(args: RecipientIdentity) = this()
  
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  
  var recipientIdentity: js.UndefOr[Identity] = js.native
  
  var serviceAssigned: js.UndefOr[Timestamp] = js.native
  
  var serviceCreated: js.UndefOr[Timestamp] = js.native
  
  var serviceUpdated: js.UndefOr[Timestamp] = js.native
  
  var sharerUserID: js.UndefOr[UserID] = js.native
}
