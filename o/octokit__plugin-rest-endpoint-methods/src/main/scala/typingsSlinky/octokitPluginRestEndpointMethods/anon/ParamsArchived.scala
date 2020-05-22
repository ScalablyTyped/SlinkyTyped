package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsArchived extends js.Object {
  var headers: Accept
  var method: String
  var params: Archived
  var url: String
}

object ParamsArchived {
  @scala.inline
  def apply(headers: Accept, method: String, params: Archived, url: String): ParamsArchived = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsArchived]
  }
}

