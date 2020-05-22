package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsDraft extends js.Object {
  var deprecated: String
  var method: String
  var params: Draft
  var url: String
}

object ParamsDraft {
  @scala.inline
  def apply(deprecated: String, method: String, params: Draft, url: String): ParamsDraft = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDraft]
  }
}

