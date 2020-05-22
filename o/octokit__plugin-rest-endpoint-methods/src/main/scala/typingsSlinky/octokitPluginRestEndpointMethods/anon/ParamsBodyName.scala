package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsBodyName extends js.Object {
  var headers: Accept
  var method: String
  var params: BodyName
  var url: String
}

object ParamsBodyName {
  @scala.inline
  def apply(headers: Accept, method: String, params: BodyName, url: String): ParamsBodyName = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsBodyName]
  }
}

