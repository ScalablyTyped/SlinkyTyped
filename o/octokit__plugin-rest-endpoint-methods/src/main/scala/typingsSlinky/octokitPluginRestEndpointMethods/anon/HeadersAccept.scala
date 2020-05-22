package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadersAccept extends js.Object {
  var headers: Accept
  var method: String
  var params: Permissions
  var url: String
}

object HeadersAccept {
  @scala.inline
  def apply(headers: Accept, method: String, params: Permissions, url: String): HeadersAccept = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersAccept]
  }
}

