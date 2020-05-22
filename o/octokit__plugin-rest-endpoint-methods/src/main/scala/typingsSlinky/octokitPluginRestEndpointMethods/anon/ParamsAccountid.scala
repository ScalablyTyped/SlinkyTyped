package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsAccountid extends js.Object {
  var method: String
  var params: Accountid
  var url: String
}

object ParamsAccountid {
  @scala.inline
  def apply(method: String, params: Accountid, url: String): ParamsAccountid = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsAccountid]
  }
}

