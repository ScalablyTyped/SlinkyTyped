package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsUrl extends js.Object {
  var method: String
  var params: Name
  var url: String
}

object ParamsUrl {
  @scala.inline
  def apply(method: String, params: Name, url: String): ParamsUrl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsUrl]
  }
}

