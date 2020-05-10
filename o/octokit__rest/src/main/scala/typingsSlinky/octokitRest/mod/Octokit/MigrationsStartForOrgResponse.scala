package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsStartForOrgResponse extends js.Object {
  var created_at: String = js.native
  var exclude_attachments: Boolean = js.native
  var guid: String = js.native
  var id: Double = js.native
  var lock_repositories: Boolean = js.native
  var owner: MigrationsStartForOrgResponseOwner = js.native
  var repositories: js.Array[MigrationsStartForOrgResponseRepositoriesItem] = js.native
  var state: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
}

object MigrationsStartForOrgResponse {
  @scala.inline
  def apply(
    created_at: String,
    exclude_attachments: Boolean,
    guid: String,
    id: Double,
    lock_repositories: Boolean,
    owner: MigrationsStartForOrgResponseOwner,
    repositories: js.Array[MigrationsStartForOrgResponseRepositoriesItem],
    state: String,
    updated_at: String,
    url: String
  ): MigrationsStartForOrgResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], exclude_attachments = exclude_attachments.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lock_repositories = lock_repositories.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartForOrgResponse]
  }
  @scala.inline
  implicit class MigrationsStartForOrgResponseOps[Self <: MigrationsStartForOrgResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclude_attachments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLock_repositories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: MigrationsStartForOrgResponseOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositories(value: js.Array[MigrationsStartForOrgResponseRepositoriesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

