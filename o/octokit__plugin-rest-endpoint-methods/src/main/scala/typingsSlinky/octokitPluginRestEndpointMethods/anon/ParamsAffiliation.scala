package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsAffiliation extends js.Object {
  var headers: Accept
  var method: String
  var params: Affiliation
  var url: String
}

object ParamsAffiliation {
  @scala.inline
  def apply(headers: Accept, method: String, params: Affiliation, url: String): ParamsAffiliation = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsAffiliation]
  }
}

