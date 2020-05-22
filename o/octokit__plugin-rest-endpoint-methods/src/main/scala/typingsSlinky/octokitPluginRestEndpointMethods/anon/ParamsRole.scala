package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsRole extends js.Object {
  var method: String
  var params: Role
  var url: String
}

object ParamsRole {
  @scala.inline
  def apply(method: String, params: Role, url: String): ParamsRole = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsRole]
  }
}

