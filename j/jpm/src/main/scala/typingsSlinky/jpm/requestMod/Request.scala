package typingsSlinky.jpm.requestMod

import typingsSlinky.jpm.AnonAnonymous
import typingsSlinky.jpm.AnonContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends BaseRequest {
  var response: Response
}

@JSImport("sdk/request", "Request")
@js.native
object Request extends js.Object {
  def apply(options: AnonAnonymous): Request = js.native
  def apply[ResponseType](options: AnonContent[ResponseType]): STRequest[ResponseType] = js.native
}

