package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsStartForAuthenticatedUserParams extends js.Object {
  /**
    * Does not include attachments uploaded to GitHub.com in the migration data when set to `true`. Excluding attachments will reduce the migration archive file size.
    */
  var exclude_attachments: js.UndefOr[Boolean] = js.native
  /**
    * Locks the `repositories` to prevent changes during the migration when set to `true`.
    */
  var lock_repositories: js.UndefOr[Boolean] = js.native
  /**
    * An array of repositories to include in the migration.
    */
  var repositories: js.Array[String] = js.native
}

object MigrationsStartForAuthenticatedUserParams {
  @scala.inline
  def apply(repositories: js.Array[String]): MigrationsStartForAuthenticatedUserParams = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartForAuthenticatedUserParams]
  }
  @scala.inline
  implicit class MigrationsStartForAuthenticatedUserParamsOps[Self <: MigrationsStartForAuthenticatedUserParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

