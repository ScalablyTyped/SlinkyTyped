package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsPrerelease extends js.Object {
  var method: String
  var params: Prerelease
  var url: String
}

object ParamsPrerelease {
  @scala.inline
  def apply(method: String, params: Prerelease, url: String): ParamsPrerelease = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsPrerelease]
  }
}

