package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsLabel extends js.Object {
  var method: String
  var params: Label
  var url: String
}

object ParamsLabel {
  @scala.inline
  def apply(method: String, params: Label, url: String): ParamsLabel = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsLabel]
  }
}

