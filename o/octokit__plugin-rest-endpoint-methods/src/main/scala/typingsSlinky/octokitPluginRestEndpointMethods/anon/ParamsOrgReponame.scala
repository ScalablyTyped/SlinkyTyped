package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOrgReponame extends js.Object {
  var headers: Accept
  var method: String
  var params: OrgReponame
  var url: String
}

object ParamsOrgReponame {
  @scala.inline
  def apply(headers: Accept, method: String, params: OrgReponame, url: String): ParamsOrgReponame = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOrgReponame]
  }
}

