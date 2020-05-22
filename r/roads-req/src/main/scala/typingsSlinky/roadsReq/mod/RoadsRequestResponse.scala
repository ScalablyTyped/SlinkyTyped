package typingsSlinky.roadsReq.mod

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoadsRequestResponse extends js.Object {
  var body: String
  var response: IncomingMessage
}

object RoadsRequestResponse {
  @scala.inline
  def apply(body: String, response: IncomingMessage): RoadsRequestResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoadsRequestResponse]
  }
}

