package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsEmail extends js.Object {
  var method: String
  var params: Email
  var url: String
}

object ParamsEmail {
  @scala.inline
  def apply(method: String, params: Email, url: String): ParamsEmail = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsEmail]
  }
}

