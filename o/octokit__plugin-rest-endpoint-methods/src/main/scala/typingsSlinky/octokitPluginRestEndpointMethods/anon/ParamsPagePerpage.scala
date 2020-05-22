package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsPagePerpage extends js.Object {
  var method: String
  var params: PagePerpage
  var url: String
}

object ParamsPagePerpage {
  @scala.inline
  def apply(method: String, params: PagePerpage, url: String): ParamsPagePerpage = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsPagePerpage]
  }
}

