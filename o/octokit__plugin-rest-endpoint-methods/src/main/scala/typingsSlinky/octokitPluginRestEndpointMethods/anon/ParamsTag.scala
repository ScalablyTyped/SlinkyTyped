package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsTag extends js.Object {
  var method: String
  var params: Tag
  var url: String
}

object ParamsTag {
  @scala.inline
  def apply(method: String, params: Tag, url: String): ParamsTag = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsTag]
  }
}

