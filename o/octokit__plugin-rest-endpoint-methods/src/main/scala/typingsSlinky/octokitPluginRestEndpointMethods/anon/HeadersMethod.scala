package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadersMethod extends js.Object {
  var headers: Accept
  var method: String
  var params: Clientid
  var url: String
}

object HeadersMethod {
  @scala.inline
  def apply(headers: Accept, method: String, params: Clientid, url: String): HeadersMethod = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersMethod]
  }
}

