package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsUnlockRepoForOrgParams extends js.Object {
  var migration_id: Double
  @JSName("org")
  var org_ : String
  var repo_name: String
}

object MigrationsUnlockRepoForOrgParams {
  @scala.inline
  def apply(migration_id: Double, org_ : String, repo_name: String): MigrationsUnlockRepoForOrgParams = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], repo_name = repo_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsUnlockRepoForOrgParams]
  }
}

