package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodStringParamsPagePerpage extends js.Object {
  var headers: Accept
  var method: String
  var params: PagePerpage
  var url: String
}

object MethodStringParamsPagePerpage {
  @scala.inline
  def apply(headers: Accept, method: String, params: PagePerpage, url: String): MethodStringParamsPagePerpage = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodStringParamsPagePerpage]
  }
}

