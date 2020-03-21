package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUrl extends js.Object {
  var method: String
  var params: AnonRepo
  var url: String
}

object AnonUrl {
  @scala.inline
  def apply(method: String, params: AnonRepo, url: String): AnonUrl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUrl]
  }
}

