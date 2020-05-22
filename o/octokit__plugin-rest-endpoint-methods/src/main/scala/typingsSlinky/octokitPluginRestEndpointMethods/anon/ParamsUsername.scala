package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsUsername extends js.Object {
  var method: String
  var params: Username
  var url: String
}

object ParamsUsername {
  @scala.inline
  def apply(method: String, params: Username, url: String): ParamsUsername = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsUsername]
  }
}

