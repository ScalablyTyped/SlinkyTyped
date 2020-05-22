package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodParams extends js.Object {
  var method: String
  var params: Artifactid
  var url: String
}

object MethodParams {
  @scala.inline
  def apply(method: String, params: Artifactid, url: String): MethodParams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodParams]
  }
}

