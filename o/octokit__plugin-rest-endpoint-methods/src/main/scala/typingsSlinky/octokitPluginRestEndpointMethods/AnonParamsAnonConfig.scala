package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonConfig extends js.Object {
  var method: String
  var params: AnonConfig
  var url: String
}

object AnonParamsAnonConfig {
  @scala.inline
  def apply(method: String, params: AnonConfig, url: String): AnonParamsAnonConfig = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonConfig]
  }
}

