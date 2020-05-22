package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsCommitsha extends js.Object {
  var method: String
  var params: Commitsha
  var url: String
}

object ParamsCommitsha {
  @scala.inline
  def apply(method: String, params: Commitsha, url: String): ParamsCommitsha = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsCommitsha]
  }
}

