package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsLine extends js.Object {
  var method: String
  var params: Line
  var url: String
}

object ParamsLine {
  @scala.inline
  def apply(method: String, params: Line, url: String): ParamsLine = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsLine]
  }
}

