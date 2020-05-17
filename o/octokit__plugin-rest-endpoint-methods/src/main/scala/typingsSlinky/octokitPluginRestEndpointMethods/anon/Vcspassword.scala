package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vcspassword extends js.Object {
  var owner: Required = js.native
  var repo: Required = js.native
  var vcs_password: Type = js.native
  var vcs_username: Type = js.native
}

object Vcspassword {
  @scala.inline
  def apply(owner: Required, repo: Required, vcs_password: Type, vcs_username: Type): Vcspassword = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], vcs_password = vcs_password.asInstanceOf[js.Any], vcs_username = vcs_username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vcspassword]
  }
  @scala.inline
  implicit class VcspasswordOps[Self <: Vcspassword] (val x: Self) extends AnyVal {
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
    def withVcs_password(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcs_password")(value.asInstanceOf[js.Any])
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

