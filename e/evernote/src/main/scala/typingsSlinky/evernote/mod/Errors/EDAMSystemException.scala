package typingsSlinky.evernote.mod.Errors

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Errors.EDAMSystemException")
@js.native
class EDAMSystemException () extends Error {
  
  var errorCode: EDAMErrorCode = js.native
  
  var rateLimitDuration: Double = js.native
}
