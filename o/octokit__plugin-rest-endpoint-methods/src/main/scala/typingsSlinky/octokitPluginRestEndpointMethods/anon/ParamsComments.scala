package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsComments extends js.Object {
  var method: String
  var params: Comments
  var url: String
}

object ParamsComments {
  @scala.inline
  def apply(method: String, params: Comments, url: String): ParamsComments = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsComments]
  }
}

