package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonContent extends js.Object {
  var method: String
  var params: AnonContent
  var url: String
}

object AnonParamsAnonContent {
  @scala.inline
  def apply(method: String, params: AnonContent, url: String): AnonParamsAnonContent = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonContent]
  }
}

