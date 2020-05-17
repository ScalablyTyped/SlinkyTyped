package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commitmessage extends js.Object {
  var commit_message: Type = js.native
  var commit_title: Type = js.native
  var merge_method: Enum = js.native
  var number: Alias = js.native
  var owner: Required = js.native
  var pull_number: Required = js.native
  var repo: Required = js.native
  var sha: Type = js.native
}

object Commitmessage {
  @scala.inline
  def apply(
    commit_message: Type,
    commit_title: Type,
    merge_method: Enum,
    number: Alias,
    owner: Required,
    pull_number: Required,
    repo: Required,
    sha: Type
  ): Commitmessage = {
    val __obj = js.Dynamic.literal(commit_message = commit_message.asInstanceOf[js.Any], commit_title = commit_title.asInstanceOf[js.Any], merge_method = merge_method.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commitmessage]
  }
  @scala.inline
  implicit class CommitmessageOps[Self <: Commitmessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommit_message(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit_title(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerge_method(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Alias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_number(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

