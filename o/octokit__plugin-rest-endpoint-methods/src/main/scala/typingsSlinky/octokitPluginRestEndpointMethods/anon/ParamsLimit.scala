package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsLimit extends js.Object {
  var headers: Accept
  var method: String
  var params: Limit
  var url: String
}

object ParamsLimit {
  @scala.inline
  def apply(headers: Accept, method: String, params: Limit, url: String): ParamsLimit = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsLimit]
  }
}

