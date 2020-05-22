package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsFingerprint extends js.Object {
  var deprecated: String
  var method: String
  var params: Fingerprint
  var url: String
}

object ParamsFingerprint {
  @scala.inline
  def apply(deprecated: String, method: String, params: Fingerprint, url: String): ParamsFingerprint = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsFingerprint]
  }
}

