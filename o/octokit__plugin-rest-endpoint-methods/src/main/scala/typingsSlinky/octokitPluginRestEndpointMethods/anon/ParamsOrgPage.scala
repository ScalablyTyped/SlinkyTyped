package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOrgPage extends js.Object {
  var method: String
  var params: OrgPage
  var url: String
}

object ParamsOrgPage {
  @scala.inline
  def apply(method: String, params: OrgPage, url: String): ParamsOrgPage = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOrgPage]
  }
}

