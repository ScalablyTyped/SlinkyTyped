package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonPath extends js.Object {
  var method: String
  var params: AnonPath
  var url: String
}

object AnonParamsAnonPath {
  @scala.inline
  def apply(method: String, params: AnonPath, url: String): AnonParamsAnonPath = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonPath]
  }
}

