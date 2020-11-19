package typingsSlinky.nodeFetch.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-fetch", "FetchError")
@js.native
class FetchError protected () extends Error {
  def this(message: String, `type`: String) = this()
  def this(message: String, `type`: String, systemError: SystemError) = this()
  
  var code: js.UndefOr[String] = js.native
  
  var errno: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_FetchError: typingsSlinky.nodeFetch.nodeFetchStrings.FetchError = js.native
  
  var `type`: String = js.native
}
