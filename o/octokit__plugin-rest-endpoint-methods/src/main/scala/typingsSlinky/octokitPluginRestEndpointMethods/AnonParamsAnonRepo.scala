package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonRepo extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonRepo
  var url: String
}

object AnonParamsAnonRepo {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonRepo, url: String): AnonParamsAnonRepo = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonRepo]
  }
}

