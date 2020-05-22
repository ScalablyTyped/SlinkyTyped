package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOwnerPage extends js.Object {
  var method: String
  var params: OwnerPage
  var url: String
}

object ParamsOwnerPage {
  @scala.inline
  def apply(method: String, params: OwnerPage, url: String): ParamsOwnerPage = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOwnerPage]
  }
}

