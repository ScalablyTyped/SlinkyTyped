package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethodString extends js.Object {
  var method: String
  var params: AnonPage
  var url: String
}

object AnonMethodString {
  @scala.inline
  def apply(method: String, params: AnonPage, url: String): AnonMethodString = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMethodString]
  }
}

