package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOrg extends js.Object {
  var method: String
  var params: Org
  var url: String
}

object ParamsOrg {
  @scala.inline
  def apply(method: String, params: Org, url: String): ParamsOrg = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOrg]
  }
}

