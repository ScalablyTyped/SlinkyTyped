package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgReponame extends js.Object {
  var migration_id: Required
  @JSName("org")
  var org_ : Required
  var repo_name: Required
}

object OrgReponame {
  @scala.inline
  def apply(migration_id: Required, org_ : Required, repo_name: Required): OrgReponame = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], repo_name = repo_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgReponame]
  }
}

