package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonAppid extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonAppid
  var url: String
}

object AnonParamsAnonAppid {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonAppid, url: String): AnonParamsAnonAppid = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonAppid]
  }
}

