package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVcspassword extends js.Object {
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var vcs_password: AnonType = js.native
  var vcs_username: AnonType = js.native
}

object AnonVcspassword {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired, vcs_password: AnonType, vcs_username: AnonType): AnonVcspassword = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], vcs_password = vcs_password.asInstanceOf[js.Any], vcs_username = vcs_username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVcspassword]
  }
  @scala.inline
  implicit class AnonVcspasswordOps[Self <: AnonVcspassword] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVcs_password(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcs_password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVcs_username(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcs_username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

