package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsUnlockRepoForOrgParams extends js.Object {
  var migration_id: Double = js.native
  @JSName("org")
  var org_ : String = js.native
  var repo_name: String = js.native
}

object MigrationsUnlockRepoForOrgParams {
  @scala.inline
  def apply(migration_id: Double, org_ : String, repo_name: String): MigrationsUnlockRepoForOrgParams = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], repo_name = repo_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsUnlockRepoForOrgParams]
  }
  @scala.inline
  implicit class MigrationsUnlockRepoForOrgParamsOps[Self <: MigrationsUnlockRepoForOrgParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMigration_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migration_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg_(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo_name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

