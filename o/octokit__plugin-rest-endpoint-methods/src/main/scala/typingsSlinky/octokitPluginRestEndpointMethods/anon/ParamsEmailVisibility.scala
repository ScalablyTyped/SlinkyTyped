package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsEmailVisibility extends js.Object {
  var method: String
  var params: EmailVisibility
  var url: String
}

object ParamsEmailVisibility {
  @scala.inline
  def apply(method: String, params: EmailVisibility, url: String): ParamsEmailVisibility = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsEmailVisibility]
  }
}

