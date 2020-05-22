package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsProjectid extends js.Object {
  var headers: Accept
  var method: String
  var params: Projectid
  var url: String
}

object ParamsProjectid {
  @scala.inline
  def apply(headers: Accept, method: String, params: Projectid, url: String): ParamsProjectid = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsProjectid]
  }
}

