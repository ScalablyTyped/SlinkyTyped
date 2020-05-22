package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsVisibility extends js.Object {
  var method: String
  var params: Visibility
  var url: String
}

object ParamsVisibility {
  @scala.inline
  def apply(method: String, params: Visibility, url: String): ParamsVisibility = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsVisibility]
  }
}

