package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsEventid extends js.Object {
  var method: String
  var params: Eventid
  var url: String
}

object ParamsEventid {
  @scala.inline
  def apply(method: String, params: Eventid, url: String): ParamsEventid = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsEventid]
  }
}

