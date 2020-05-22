package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOwnerRepo extends js.Object {
  var method: String
  var params: OwnerRepo
  var url: String
}

object ParamsOwnerRepo {
  @scala.inline
  def apply(method: String, params: OwnerRepo, url: String): ParamsOwnerRepo = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOwnerRepo]
  }
}

