package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsFilterOrg extends js.Object {
  var method: String
  var params: FilterOrg
  var url: String
}

object ParamsFilterOrg {
  @scala.inline
  def apply(method: String, params: FilterOrg, url: String): ParamsFilterOrg = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsFilterOrg]
  }
}

