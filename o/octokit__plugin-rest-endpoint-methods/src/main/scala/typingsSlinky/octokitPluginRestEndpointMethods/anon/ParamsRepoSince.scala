package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsRepoSince extends js.Object {
  var method: String
  var params: RepoSince
  var url: String
}

object ParamsRepoSince {
  @scala.inline
  def apply(method: String, params: RepoSince, url: String): ParamsRepoSince = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsRepoSince]
  }
}

