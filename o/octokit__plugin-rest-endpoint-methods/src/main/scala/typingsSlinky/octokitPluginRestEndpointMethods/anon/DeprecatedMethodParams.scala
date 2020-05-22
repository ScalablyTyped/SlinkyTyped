package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecatedMethodParams extends js.Object {
  var deprecated: String
  var method: String
  var params: Clientsecret
  var url: String
}

object DeprecatedMethodParams {
  @scala.inline
  def apply(deprecated: String, method: String, params: Clientsecret, url: String): DeprecatedMethodParams = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatedMethodParams]
  }
}

