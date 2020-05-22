package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsLabels extends js.Object {
  var method: String
  var params: Labels
  var url: String
}

object ParamsLabels {
  @scala.inline
  def apply(method: String, params: Labels, url: String): ParamsLabels = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsLabels]
  }
}

