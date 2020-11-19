package typingsSlinky.evernote.mod.Errors

import typingsSlinky.evernote.mod.Types.Contact
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Errors.EDAMInvalidContactsException")
@js.native
class EDAMInvalidContactsException () extends Error {
  
  var contacts: js.Array[Contact] = js.native
  
  var parameter: String = js.native
  
  var reasons: js.Array[EDAMInvalidContactReason] = js.native
}
