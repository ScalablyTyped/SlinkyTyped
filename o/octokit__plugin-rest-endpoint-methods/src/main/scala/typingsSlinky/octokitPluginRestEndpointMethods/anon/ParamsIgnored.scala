package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsIgnored extends js.Object {
  var method: String
  var params: Ignored
  var url: String
}

object ParamsIgnored {
  @scala.inline
  def apply(method: String, params: Ignored, url: String): ParamsIgnored = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsIgnored]
  }
}

