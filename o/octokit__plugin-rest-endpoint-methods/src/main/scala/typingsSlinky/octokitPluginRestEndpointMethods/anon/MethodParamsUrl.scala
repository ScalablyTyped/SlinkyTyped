package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodParamsUrl extends js.Object {
  var method: String
  var params: Archiveformat
  var url: String
}

object MethodParamsUrl {
  @scala.inline
  def apply(method: String, params: Archiveformat, url: String): MethodParamsUrl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodParamsUrl]
  }
}

