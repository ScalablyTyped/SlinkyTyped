package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsPerpageRepo extends js.Object {
  var method: String
  var params: PerpageRepo
  var url: String
}

object ParamsPerpageRepo {
  @scala.inline
  def apply(method: String, params: PerpageRepo, url: String): ParamsPerpageRepo = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsPerpageRepo]
  }
}

