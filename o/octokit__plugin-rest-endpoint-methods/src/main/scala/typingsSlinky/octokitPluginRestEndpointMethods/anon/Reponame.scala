package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reponame extends js.Object {
  var migration_id: Required = js.native
  var repo_name: Required = js.native
}

object Reponame {
  @scala.inline
  def apply(migration_id: Required, repo_name: Required): Reponame = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], repo_name = repo_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reponame]
  }
  @scala.inline
  implicit class ReponameOps[Self <: Reponame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMigration_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migration_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo_name(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo_name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

