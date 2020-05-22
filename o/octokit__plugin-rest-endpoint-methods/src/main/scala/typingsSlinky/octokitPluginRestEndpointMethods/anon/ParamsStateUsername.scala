package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsStateUsername extends js.Object {
  var headers: Accept
  var method: String
  var params: StateUsername
  var url: String
}

object ParamsStateUsername {
  @scala.inline
  def apply(headers: Accept, method: String, params: StateUsername, url: String): ParamsStateUsername = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsStateUsername]
  }
}

