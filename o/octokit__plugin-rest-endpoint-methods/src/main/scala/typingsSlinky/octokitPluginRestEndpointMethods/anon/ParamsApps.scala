package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsApps extends js.Object {
  var method: String
  var params: Apps
  var url: String
}

object ParamsApps {
  @scala.inline
  def apply(method: String, params: Apps, url: String): ParamsApps = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsApps]
  }
}

