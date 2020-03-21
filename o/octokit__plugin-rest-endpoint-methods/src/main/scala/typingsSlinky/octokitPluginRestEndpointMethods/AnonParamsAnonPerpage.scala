package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonPerpage extends js.Object {
  var method: String
  var params: AnonPerpage
  var url: String
}

object AnonParamsAnonPerpage {
  @scala.inline
  def apply(method: String, params: AnonPerpage, url: String): AnonParamsAnonPerpage = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonPerpage]
  }
}

