package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsRepoSort extends js.Object {
  var method: String
  var params: RepoSort
  var url: String
}

object ParamsRepoSort {
  @scala.inline
  def apply(method: String, params: RepoSort, url: String): ParamsRepoSort = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsRepoSort]
  }
}

