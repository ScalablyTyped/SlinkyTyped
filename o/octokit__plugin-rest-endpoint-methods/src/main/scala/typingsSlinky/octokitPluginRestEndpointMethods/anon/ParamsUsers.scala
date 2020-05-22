package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsUsers extends js.Object {
  var method: String
  var params: Users
  var url: String
}

object ParamsUsers {
  @scala.inline
  def apply(method: String, params: Users, url: String): ParamsUsers = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsUsers]
  }
}

