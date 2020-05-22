package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsPrivacy extends js.Object {
  var method: String
  var params: Privacy
  var url: String
}

object ParamsPrivacy {
  @scala.inline
  def apply(method: String, params: Privacy, url: String): ParamsPrivacy = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsPrivacy]
  }
}

