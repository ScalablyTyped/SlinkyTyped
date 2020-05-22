package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecatedHeadersMethod extends js.Object {
  var deprecated: String
  var headers: Accept
  var method: String
  var params: Repo
  var url: String
}

object DeprecatedHeadersMethod {
  @scala.inline
  def apply(deprecated: String, headers: Accept, method: String, params: Repo, url: String): DeprecatedHeadersMethod = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatedHeadersMethod]
  }
}

