package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsSha extends js.Object {
  var method: String
  var params: Sha
  var url: String
}

object ParamsSha {
  @scala.inline
  def apply(method: String, params: Sha, url: String): ParamsSha = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsSha]
  }
}

