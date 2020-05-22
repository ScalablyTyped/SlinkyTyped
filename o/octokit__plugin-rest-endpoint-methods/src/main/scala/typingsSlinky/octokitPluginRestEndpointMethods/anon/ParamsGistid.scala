package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsGistid extends js.Object {
  var method: String
  var params: Gistid
  var url: String
}

object ParamsGistid {
  @scala.inline
  def apply(method: String, params: Gistid, url: String): ParamsGistid = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsGistid]
  }
}

