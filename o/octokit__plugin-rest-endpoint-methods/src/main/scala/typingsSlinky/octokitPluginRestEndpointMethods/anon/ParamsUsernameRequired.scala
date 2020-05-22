package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsUsernameRequired extends js.Object {
  var headers: Accept
  var method: String
  var params: UsernameRequired
  var url: String
}

object ParamsUsernameRequired {
  @scala.inline
  def apply(headers: Accept, method: String, params: UsernameRequired, url: String): ParamsUsernameRequired = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsUsernameRequired]
  }
}

