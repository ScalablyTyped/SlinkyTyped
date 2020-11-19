package typingsSlinky.jsonwebtokenPromisified.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonwebtoken-promisified", "JsonWebTokenError")
@js.native
class JsonWebTokenError protected () extends Error {
  def this(message: String) = this()
  def this(message: String, error: js.Error) = this()
  
  var inner: js.Error = js.native
}
