package typingsSlinky.jpm.requestMod

import typingsSlinky.jpm.anon.Anonymous
import typingsSlinky.jpm.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends BaseRequest {
  
  var response: Response = js.native
}
@JSImport("sdk/request", "Request")
@js.native
object Request extends js.Object {
  
  def apply(options: Anonymous): Request = js.native
  def apply[ResponseType](options: Content[ResponseType]): STRequest[ResponseType] = js.native
}
