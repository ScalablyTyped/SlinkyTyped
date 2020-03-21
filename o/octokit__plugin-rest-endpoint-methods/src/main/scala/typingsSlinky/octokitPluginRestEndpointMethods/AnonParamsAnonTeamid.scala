package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonTeamid extends js.Object {
  var deprecated: String
  var headers: AnonAccept
  var method: String
  var params: AnonTeamid
  var url: String
}

object AnonParamsAnonTeamid {
  @scala.inline
  def apply(deprecated: String, headers: AnonAccept, method: String, params: AnonTeamid, url: String): AnonParamsAnonTeamid = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonTeamid]
  }
}

