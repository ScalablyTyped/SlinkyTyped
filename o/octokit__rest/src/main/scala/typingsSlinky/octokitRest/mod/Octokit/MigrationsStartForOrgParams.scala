package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsStartForOrgParams extends js.Object {
  /**
    * Indicates whether attachments should be excluded from the migration (to reduce migration archive file size).
    */
  var exclude_attachments: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether repositories should be locked (to prevent manipulation) while migrating data.
    */
  var lock_repositories: js.UndefOr[Boolean] = js.native
  var org: String = js.native
  /**
    * A list of arrays indicating which repositories should be migrated.
    */
  var repositories: js.Array[String] = js.native
}

object MigrationsStartForOrgParams {
  @scala.inline
  def apply(org: String, repositories: js.Array[String]): MigrationsStartForOrgParams = {
    val __obj = js.Dynamic.literal(org = org.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartForOrgParams]
  }
  @scala.inline
  implicit class MigrationsStartForOrgParamsOps[Self <: MigrationsStartForOrgParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclude_attachments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_attachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withLock_repositories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLock_repositories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock_repositories")(js.undefined)
        ret
    }
  }
  
}

