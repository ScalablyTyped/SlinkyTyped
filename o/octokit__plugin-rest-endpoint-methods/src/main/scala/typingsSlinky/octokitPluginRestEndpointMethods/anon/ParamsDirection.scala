package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsDirection extends js.Object {
  var method: String
  var params: Direction
  var url: String
}

object ParamsDirection {
  @scala.inline
  def apply(method: String, params: Direction, url: String): ParamsDirection = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDirection]
  }
}

