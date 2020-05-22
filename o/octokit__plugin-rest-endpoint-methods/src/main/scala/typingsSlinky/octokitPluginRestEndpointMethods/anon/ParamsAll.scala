package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsAll extends js.Object {
  var method: String
  var params: All
  var url: String
}

object ParamsAll {
  @scala.inline
  def apply(method: String, params: All, url: String): ParamsAll = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsAll]
  }
}

