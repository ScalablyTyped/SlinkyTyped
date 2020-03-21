package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsUrl extends js.Object {
  var method: String
  var params: AnonName
  var url: String
}

object AnonParamsUrl {
  @scala.inline
  def apply(method: String, params: AnonName, url: String): AnonParamsUrl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsUrl]
  }
}

