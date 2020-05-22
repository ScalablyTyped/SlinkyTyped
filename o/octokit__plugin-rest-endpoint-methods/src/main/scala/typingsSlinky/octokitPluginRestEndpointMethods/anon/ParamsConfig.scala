package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsConfig extends js.Object {
  var method: String
  var params: Config
  var url: String
}

object ParamsConfig {
  @scala.inline
  def apply(method: String, params: Config, url: String): ParamsConfig = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsConfig]
  }
}

