package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsAssignee extends js.Object {
  var method: String
  var params: Assignee
  var url: String
}

object ParamsAssignee {
  @scala.inline
  def apply(method: String, params: Assignee, url: String): ParamsAssignee = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsAssignee]
  }
}

