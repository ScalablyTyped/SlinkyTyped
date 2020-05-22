package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsSource extends js.Object {
  var headers: Accept
  var method: String
  var params: Source
  var url: String
}

object ParamsSource {
  @scala.inline
  def apply(headers: Accept, method: String, params: Source, url: String): ParamsSource = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsSource]
  }
}

