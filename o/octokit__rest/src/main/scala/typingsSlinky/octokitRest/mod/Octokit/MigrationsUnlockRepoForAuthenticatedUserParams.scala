package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsUnlockRepoForAuthenticatedUserParams extends js.Object {
  var migration_id: Double = js.native
  var repo_name: String = js.native
}

object MigrationsUnlockRepoForAuthenticatedUserParams {
  @scala.inline
  def apply(migration_id: Double, repo_name: String): MigrationsUnlockRepoForAuthenticatedUserParams = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], repo_name = repo_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsUnlockRepoForAuthenticatedUserParams]
  }
  @scala.inline
  implicit class MigrationsUnlockRepoForAuthenticatedUserParamsOps[Self <: MigrationsUnlockRepoForAuthenticatedUserParams] (val x: Self) extends AnyVal {
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
    def withRepo_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo_name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

