package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsMilestone extends js.Object {
  var method: String
  var params: Milestone
  var url: String
}

object ParamsMilestone {
  @scala.inline
  def apply(method: String, params: Milestone, url: String): ParamsMilestone = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsMilestone]
  }
}

