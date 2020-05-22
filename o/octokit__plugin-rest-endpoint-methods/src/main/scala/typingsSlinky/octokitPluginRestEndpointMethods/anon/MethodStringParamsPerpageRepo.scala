package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodStringParamsPerpageRepo extends js.Object {
  var headers: Accept
  var method: String
  var params: PerpageRepo
  var url: String
}

object MethodStringParamsPerpageRepo {
  @scala.inline
  def apply(headers: Accept, method: String, params: PerpageRepo, url: String): MethodStringParamsPerpageRepo = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodStringParamsPerpageRepo]
  }
}

