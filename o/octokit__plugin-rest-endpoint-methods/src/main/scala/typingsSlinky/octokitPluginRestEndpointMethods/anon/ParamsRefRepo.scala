package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsRefRepo extends js.Object {
  var method: String
  var params: RefRepo
  var url: String
}

object ParamsRefRepo {
  @scala.inline
  def apply(method: String, params: RefRepo, url: String): ParamsRefRepo = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsRefRepo]
  }
}

