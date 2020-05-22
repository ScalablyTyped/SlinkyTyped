package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsReponame extends js.Object {
  var headers: Accept
  var method: String
  var params: Reponame
  var url: String
}

object ParamsReponame {
  @scala.inline
  def apply(headers: Accept, method: String, params: Reponame, url: String): ParamsReponame = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsReponame]
  }
}

