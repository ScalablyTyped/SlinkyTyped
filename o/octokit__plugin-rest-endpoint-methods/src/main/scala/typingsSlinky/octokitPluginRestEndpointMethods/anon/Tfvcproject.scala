package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tfvcproject extends js.Object {
  var owner: Required = js.native
  var repo: Required = js.native
  var tfvc_project: Type = js.native
  var vcs: Enum = js.native
  var vcs_password: Type = js.native
  var vcs_url: Required = js.native
  var vcs_username: Type = js.native
}

object Tfvcproject {
  @scala.inline
  def apply(
    owner: Required,
    repo: Required,
    tfvc_project: Type,
    vcs: Enum,
    vcs_password: Type,
    vcs_url: Required,
    vcs_username: Type
  ): Tfvcproject = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tfvc_project = tfvc_project.asInstanceOf[js.Any], vcs = vcs.asInstanceOf[js.Any], vcs_password = vcs_password.asInstanceOf[js.Any], vcs_url = vcs_url.asInstanceOf[js.Any], vcs_username = vcs_username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tfvcproject]
  }
  @scala.inline
  implicit class TfvcprojectOps[Self <: Tfvcproject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfvc_project(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfvc_project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVcs(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVcs_password(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcs_password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVcs_url(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcs_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVcs_username(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcs_username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

