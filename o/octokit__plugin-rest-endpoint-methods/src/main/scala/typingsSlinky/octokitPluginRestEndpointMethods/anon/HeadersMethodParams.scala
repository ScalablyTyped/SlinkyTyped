package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadersMethodParams extends js.Object {
  var headers: Accept
  var method: String
  var params: Body
  var url: String
}

object HeadersMethodParams {
  @scala.inline
  def apply(headers: Accept, method: String, params: Body, url: String): HeadersMethodParams = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersMethodParams]
  }
}

