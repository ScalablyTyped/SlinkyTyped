package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOrgState extends js.Object {
  var method: String
  var params: OrgState
  var url: String
}

object ParamsOrgState {
  @scala.inline
  def apply(method: String, params: OrgState, url: String): ParamsOrgState = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOrgState]
  }
}

