package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsUpdateImportParams extends js.Object {
  var owner: String = js.native
  var repo: String = js.native
  /**
    * The password to provide to the originating repository.
    */
  var vcs_password: js.UndefOr[String] = js.native
  /**
    * The username to provide to the originating repository.
    */
  var vcs_username: js.UndefOr[String] = js.native
}

object MigrationsUpdateImportParams {
  @scala.inline
  def apply(owner: String, repo: String): MigrationsUpdateImportParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsUpdateImportParams]
  }
  @scala.inline
  implicit class MigrationsUpdateImportParamsOps[Self <: MigrationsUpdateImportParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVcs_password(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcs_password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVcs_password: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcs_password")(js.undefined)
        ret
    }
    @scala.inline
    def withVcs_username(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcs_username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVcs_username: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcs_username")(js.undefined)
        ret
    }
  }
  
}

