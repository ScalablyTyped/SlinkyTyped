package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsContentOwner extends js.Object {
  var headers: Accept
  var method: String
  var params: ContentOwner
  var url: String
}

object ParamsContentOwner {
  @scala.inline
  def apply(headers: Accept, method: String, params: ContentOwner, url: String): ParamsContentOwner = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsContentOwner]
  }
}

