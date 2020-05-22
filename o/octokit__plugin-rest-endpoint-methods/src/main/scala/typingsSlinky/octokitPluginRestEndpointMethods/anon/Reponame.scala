package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reponame extends js.Object {
  var migration_id: Required
  var repo_name: Required
}

object Reponame {
  @scala.inline
  def apply(migration_id: Required, repo_name: Required): Reponame = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], repo_name = repo_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reponame]
  }
}

