package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsDirectionFilter extends js.Object {
  var method: String
  var params: DirectionFilter
  var url: String
}

object ParamsDirectionFilter {
  @scala.inline
  def apply(method: String, params: DirectionFilter, url: String): ParamsDirectionFilter = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDirectionFilter]
  }
}

