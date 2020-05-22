package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsEnvironment extends js.Object {
  var method: String
  var params: Environment
  var url: String
}

object ParamsEnvironment {
  @scala.inline
  def apply(method: String, params: Environment, url: String): ParamsEnvironment = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsEnvironment]
  }
}

