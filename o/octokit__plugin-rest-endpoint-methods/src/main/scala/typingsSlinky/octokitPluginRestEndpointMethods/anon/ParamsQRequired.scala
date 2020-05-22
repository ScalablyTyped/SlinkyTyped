package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsQRequired extends js.Object {
  var method: String
  var params: QRequired
  var url: String
}

object ParamsQRequired {
  @scala.inline
  def apply(method: String, params: QRequired, url: String): ParamsQRequired = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsQRequired]
  }
}

