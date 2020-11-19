package typingsSlinky.ky.mod

import org.scalajs.dom.experimental.Response
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ky", "HTTPError")
@js.native
class HTTPError protected () extends Error {
  def this(response: Response) = this()
  
  var response: Response = js.native
}
