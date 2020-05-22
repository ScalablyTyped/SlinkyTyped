package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsCreator extends js.Object {
  var method: String
  var params: Creator
  var url: String
}

object ParamsCreator {
  @scala.inline
  def apply(method: String, params: Creator, url: String): ParamsCreator = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsCreator]
  }
}

