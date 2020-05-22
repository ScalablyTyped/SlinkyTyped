package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsAutomerge extends js.Object {
  var method: String
  var params: Automerge
  var url: String
}

object ParamsAutomerge {
  @scala.inline
  def apply(method: String, params: Automerge, url: String): ParamsAutomerge = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsAutomerge]
  }
}

