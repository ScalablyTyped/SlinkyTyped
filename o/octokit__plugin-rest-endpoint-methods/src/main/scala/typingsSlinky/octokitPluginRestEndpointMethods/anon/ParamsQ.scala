package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsQ extends js.Object {
  var method: String
  var params: Q
  var url: String
}

object ParamsQ {
  @scala.inline
  def apply(method: String, params: Q, url: String): ParamsQ = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsQ]
  }
}

