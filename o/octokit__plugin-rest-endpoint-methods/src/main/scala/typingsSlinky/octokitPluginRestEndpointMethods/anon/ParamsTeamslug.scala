package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsTeamslug extends js.Object {
  var headers: Accept
  var method: String
  var params: Teamslug
  var url: String
}

object ParamsTeamslug {
  @scala.inline
  def apply(headers: Accept, method: String, params: Teamslug, url: String): ParamsTeamslug = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsTeamslug]
  }
}

