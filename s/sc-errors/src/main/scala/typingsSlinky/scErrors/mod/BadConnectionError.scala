package typingsSlinky.scErrors.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sc-errors", "BadConnectionError")
@js.native
class BadConnectionError protected () extends Error {
  def this(message: String, `type`: String) = this()
  
  var `type`: String = js.native
}
