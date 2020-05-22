package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecatedMethod extends js.Object {
  var deprecated: String
  var method: String
  var url: String
}

object DeprecatedMethod {
  @scala.inline
  def apply(deprecated: String, method: String, url: String): DeprecatedMethod = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatedMethod]
  }
}

