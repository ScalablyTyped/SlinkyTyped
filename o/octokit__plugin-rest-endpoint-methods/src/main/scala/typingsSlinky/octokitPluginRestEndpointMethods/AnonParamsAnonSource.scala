package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonSource extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonSource
  var url: String
}

object AnonParamsAnonSource {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonSource, url: String): AnonParamsAnonSource = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonSource]
  }
}

