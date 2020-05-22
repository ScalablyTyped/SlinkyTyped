package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsContent extends js.Object {
  var method: String
  var params: Content
  var url: String
}

object ParamsContent {
  @scala.inline
  def apply(method: String, params: Content, url: String): ParamsContent = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsContent]
  }
}

