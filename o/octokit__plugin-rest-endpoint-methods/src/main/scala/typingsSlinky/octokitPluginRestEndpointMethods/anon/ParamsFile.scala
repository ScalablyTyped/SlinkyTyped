package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsFile extends js.Object {
  var method: String
  var params: File
  var url: String
}

object ParamsFile {
  @scala.inline
  def apply(method: String, params: File, url: String): ParamsFile = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsFile]
  }
}

