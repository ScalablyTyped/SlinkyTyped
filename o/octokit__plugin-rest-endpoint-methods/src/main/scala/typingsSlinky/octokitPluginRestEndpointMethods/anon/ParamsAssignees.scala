package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsAssignees extends js.Object {
  var method: String
  var params: Assignees
  var url: String
}

object ParamsAssignees {
  @scala.inline
  def apply(method: String, params: Assignees, url: String): ParamsAssignees = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsAssignees]
  }
}

