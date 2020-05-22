package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsActive extends js.Object {
  var method: String
  var params: Active
  var url: String
}

object ParamsActive {
  @scala.inline
  def apply(method: String, params: Active, url: String): ParamsActive = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsActive]
  }
}

