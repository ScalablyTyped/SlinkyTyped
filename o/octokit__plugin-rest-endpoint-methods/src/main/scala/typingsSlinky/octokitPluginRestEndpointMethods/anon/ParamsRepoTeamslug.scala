package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsRepoTeamslug extends js.Object {
  var method: String
  var params: RepoTeamslug
  var url: String
}

object ParamsRepoTeamslug {
  @scala.inline
  def apply(method: String, params: RepoTeamslug, url: String): ParamsRepoTeamslug = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsRepoTeamslug]
  }
}

