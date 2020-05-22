package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsProjectidRequired extends js.Object {
  var headers: Accept
  var method: String
  var params: ProjectidRequired
  var url: String
}

object ParamsProjectidRequired {
  @scala.inline
  def apply(headers: Accept, method: String, params: ProjectidRequired, url: String): ParamsProjectidRequired = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsProjectidRequired]
  }
}

