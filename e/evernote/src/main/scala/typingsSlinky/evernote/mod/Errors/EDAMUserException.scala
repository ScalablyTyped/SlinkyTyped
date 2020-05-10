package typingsSlinky.evernote.mod.Errors

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Errors.EDAMUserException")
@js.native
class EDAMUserException () extends Error {
  var errorCode: EDAMErrorCode = js.native
  var parameter: String = js.native
}

