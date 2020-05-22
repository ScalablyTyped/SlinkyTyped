package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsPullnumberRepo extends js.Object {
  var method: String
  var params: PullnumberRepo
  var url: String
}

object ParamsPullnumberRepo {
  @scala.inline
  def apply(method: String, params: PullnumberRepo, url: String): ParamsPullnumberRepo = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsPullnumberRepo]
  }
}

