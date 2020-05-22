package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsHeadsha extends js.Object {
  var headers: Accept
  var method: String
  var params: Headsha
  var url: String
}

object ParamsHeadsha {
  @scala.inline
  def apply(headers: Accept, method: String, params: Headsha, url: String): ParamsHeadsha = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsHeadsha]
  }
}

