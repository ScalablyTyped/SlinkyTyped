package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.git
import typingsSlinky.octokitRest.octokitRestStrings.mercurial
import typingsSlinky.octokitRest.octokitRestStrings.subversion
import typingsSlinky.octokitRest.octokitRestStrings.tfvc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsStartImportParams extends js.Object {
  var owner: String = js.native
  var repo: String = js.native
  /**
    * For a tfvc import, the name of the project that is being imported.
    */
  var tfvc_project: js.UndefOr[String] = js.native
  /**
    * The originating VCS type. Can be one of `subversion`, `git`, `mercurial`, or `tfvc`. Please be aware that without this parameter, the import job will take additional time to detect the VCS type before beginning the import. This detection step will be reflected in the response.
    */
  var vcs: js.UndefOr[subversion | git | mercurial | tfvc] = js.native
  /**
    * If authentication is required, the password to provide to `vcs_url`.
    */
  var vcs_password: js.UndefOr[String] = js.native
  /**
    * The URL of the originating repository.
    */
  var vcs_url: String = js.native
  /**
    * If authentication is required, the username to provide to `vcs_url`.
    */
  var vcs_username: js.UndefOr[String] = js.native
}

object MigrationsStartImportParams {
  @scala.inline
  def apply(owner: String, repo: String, vcs_url: String): MigrationsStartImportParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], vcs_url = vcs_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartImportParams]
  }
  @scala.inline
  implicit class MigrationsStartImportParamsOps[Self <: MigrationsStartImportParams] (val x: Self) extends AnyVal {
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
    def withVcs_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcs_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfvc_project(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfvc_project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTfvc_project: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfvc_project")(js.undefined)
        ret
    }
    @scala.inline
    def withVcs(value: subversion | git | mercurial | tfvc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVcs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcs")(js.undefined)
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

