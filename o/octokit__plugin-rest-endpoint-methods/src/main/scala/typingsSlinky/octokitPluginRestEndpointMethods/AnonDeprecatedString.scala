package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeprecatedString extends js.Object {
  var deprecated: String
  var method: String
  var params: AnonGrantid
  var url: String
}

object AnonDeprecatedString {
  @scala.inline
  def apply(deprecated: String, method: String, params: AnonGrantid, url: String): AnonDeprecatedString = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeprecatedString]
  }
}

