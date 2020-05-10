package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOrgReponame extends js.Object {
  var migration_id: AnonRequired = js.native
  var org: AnonRequired = js.native
  var repo_name: AnonRequired = js.native
}

object AnonOrgReponame {
  @scala.inline
  def apply(migration_id: AnonRequired, org: AnonRequired, repo_name: AnonRequired): AnonOrgReponame = {
    val __obj = js.Dynamic.literal(migration_id = migration_id.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any], repo_name = repo_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrgReponame]
  }
  @scala.inline
  implicit class AnonOrgReponameOps[Self <: AnonOrgReponame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMigration_id(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migration_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo_name(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo_name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

