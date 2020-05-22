package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoSince extends js.Object {
  var owner: Required
  var repo: Required
  var since: Type
}

object RepoSince {
  @scala.inline
  def apply(owner: Required, repo: Required, since: Type): RepoSince = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoSince]
  }
}

