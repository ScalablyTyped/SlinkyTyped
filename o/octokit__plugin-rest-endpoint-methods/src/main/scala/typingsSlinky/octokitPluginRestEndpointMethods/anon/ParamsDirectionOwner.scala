package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsDirectionOwner extends js.Object {
  var method: String
  var params: DirectionOwner
  var url: String
}

object ParamsDirectionOwner {
  @scala.inline
  def apply(method: String, params: DirectionOwner, url: String): ParamsDirectionOwner = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDirectionOwner]
  }
}

