package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsFilter extends js.Object {
  var headers: Accept
  var method: String
  var params: Filter
  var url: String
}

object ParamsFilter {
  @scala.inline
  def apply(headers: Accept, method: String, params: Filter, url: String): ParamsFilter = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsFilter]
  }
}

