package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsBasetree extends js.Object {
  var method: String
  var params: Basetree
  var url: String
}

object ParamsBasetree {
  @scala.inline
  def apply(method: String, params: Basetree, url: String): ParamsBasetree = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsBasetree]
  }
}

