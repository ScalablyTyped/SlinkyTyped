package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsFiles extends js.Object {
  var method: String
  var params: Files
  var url: String
}

object ParamsFiles {
  @scala.inline
  def apply(method: String, params: Files, url: String): ParamsFiles = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsFiles]
  }
}

