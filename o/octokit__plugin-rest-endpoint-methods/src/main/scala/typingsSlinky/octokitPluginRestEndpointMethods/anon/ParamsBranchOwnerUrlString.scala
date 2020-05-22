package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsBranchOwnerUrlString extends js.Object {
  var deprecated: String
  var method: String
  var params: BranchOwner
  var url: String
}

object ParamsBranchOwnerUrlString {
  @scala.inline
  def apply(deprecated: String, method: String, params: BranchOwner, url: String): ParamsBranchOwnerUrlString = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsBranchOwnerUrlString]
  }
}

