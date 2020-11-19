package typingsSlinky.forgeDi.resolutionErrorMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolutionError extends Error
object ResolutionError {
  
  @scala.inline
  def apply(message: String, name: String): ResolutionError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolutionError]
  }
}
