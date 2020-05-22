package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsLicense extends js.Object {
  var method: String
  var params: License
  var url: String
}

object ParamsLicense {
  @scala.inline
  def apply(method: String, params: License, url: String): ParamsLicense = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsLicense]
  }
}

