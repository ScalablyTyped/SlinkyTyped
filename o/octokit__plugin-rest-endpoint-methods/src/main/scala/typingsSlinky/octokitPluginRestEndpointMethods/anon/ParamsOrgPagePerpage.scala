package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOrgPagePerpage extends js.Object {
  var headers: Accept
  var method: String
  var params: OrgPagePerpage
  var url: String
}

object ParamsOrgPagePerpage {
  @scala.inline
  def apply(headers: Accept, method: String, params: OrgPagePerpage, url: String): ParamsOrgPagePerpage = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOrgPagePerpage]
  }
}

