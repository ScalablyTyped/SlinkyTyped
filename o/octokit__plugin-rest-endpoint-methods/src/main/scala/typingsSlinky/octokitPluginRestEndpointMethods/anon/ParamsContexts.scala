package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsContexts extends js.Object {
  var method: String
  var params: Contexts
  var url: String
}

object ParamsContexts {
  @scala.inline
  def apply(method: String, params: Contexts, url: String): ParamsContexts = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsContexts]
  }
}

