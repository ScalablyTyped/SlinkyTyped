package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsTeams extends js.Object {
  var method: String
  var params: Teams
  var url: String
}

object ParamsTeams {
  @scala.inline
  def apply(method: String, params: Teams, url: String): ParamsTeams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsTeams]
  }
}

