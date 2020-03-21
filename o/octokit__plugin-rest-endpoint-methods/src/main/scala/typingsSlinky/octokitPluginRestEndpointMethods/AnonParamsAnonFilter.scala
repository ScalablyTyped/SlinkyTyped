package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonFilter extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonFilter
  var url: String
}

object AnonParamsAnonFilter {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonFilter, url: String): AnonParamsAnonFilter = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonFilter]
  }
}

