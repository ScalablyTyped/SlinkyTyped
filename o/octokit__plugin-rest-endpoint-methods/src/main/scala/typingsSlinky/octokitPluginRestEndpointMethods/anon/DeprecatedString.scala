package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecatedString extends js.Object {
  var deprecated: String
  var method: String
  var params: Grantid
  var url: String
}

object DeprecatedString {
  @scala.inline
  def apply(deprecated: String, method: String, params: Grantid, url: String): DeprecatedString = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatedString]
  }
}

