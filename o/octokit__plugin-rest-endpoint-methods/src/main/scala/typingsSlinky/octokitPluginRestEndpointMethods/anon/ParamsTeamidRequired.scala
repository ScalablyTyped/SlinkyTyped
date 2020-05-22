package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsTeamidRequired extends js.Object {
  var deprecated: String
  var method: String
  var params: TeamidRequired
  var url: String
}

object ParamsTeamidRequired {
  @scala.inline
  def apply(deprecated: String, method: String, params: TeamidRequired, url: String): ParamsTeamidRequired = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsTeamidRequired]
  }
}

