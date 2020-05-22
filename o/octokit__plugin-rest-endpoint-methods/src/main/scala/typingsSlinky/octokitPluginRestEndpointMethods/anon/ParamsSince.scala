package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsSince extends js.Object {
  var method: String
  var params: Since
  var url: String
}

object ParamsSince {
  @scala.inline
  def apply(method: String, params: Since, url: String): ParamsSince = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsSince]
  }
}

