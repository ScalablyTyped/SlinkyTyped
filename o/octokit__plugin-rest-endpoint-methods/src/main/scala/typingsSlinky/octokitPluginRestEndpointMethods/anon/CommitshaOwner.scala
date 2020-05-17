package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitshaOwner extends js.Object {
  var commit_sha: Alias = js.native
  var owner: Required = js.native
  var ref: Required = js.native
  var repo: Required = js.native
  var sha: Alias = js.native
}

object CommitshaOwner {
  @scala.inline
  def apply(commit_sha: Alias, owner: Required, ref: Required, repo: Required, sha: Alias): CommitshaOwner = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitshaOwner]
  }
  @scala.inline
  implicit class CommitshaOwnerOps[Self <: CommitshaOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommit_sha(value: Alias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_sha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha(value: Alias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

