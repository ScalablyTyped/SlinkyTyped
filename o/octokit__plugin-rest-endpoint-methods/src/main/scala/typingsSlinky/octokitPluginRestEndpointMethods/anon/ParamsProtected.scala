package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsProtected extends js.Object {
  var method: String
  var params: Protected
  var url: String
}

object ParamsProtected {
  @scala.inline
  def apply(method: String, params: Protected, url: String): ParamsProtected = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsProtected]
  }
}

