package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonPermissionProjectid extends js.Object {
  var deprecated: String
  var headers: AnonAccept
  var method: String
  var params: AnonPermissionProjectid
  var url: String
}

object AnonParamsAnonPermissionProjectid {
  @scala.inline
  def apply(
    deprecated: String,
    headers: AnonAccept,
    method: String,
    params: AnonPermissionProjectid,
    url: String
  ): AnonParamsAnonPermissionProjectid = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonPermissionProjectid]
  }
}

