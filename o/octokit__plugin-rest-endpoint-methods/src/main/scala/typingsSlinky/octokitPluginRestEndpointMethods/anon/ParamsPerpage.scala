package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsPerpage extends js.Object {
  var method: String
  var params: Perpage
  var url: String
}

object ParamsPerpage {
  @scala.inline
  def apply(method: String, params: Perpage, url: String): ParamsPerpage = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsPerpage]
  }
}

