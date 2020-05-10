package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCommitmessage extends js.Object {
  var commit_message: AnonType = js.native
  var commit_title: AnonType = js.native
  var merge_method: AnonEnum = js.native
  var number: AnonAlias = js.native
  var owner: AnonRequired = js.native
  var pull_number: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var sha: AnonType = js.native
}

object AnonCommitmessage {
  @scala.inline
  def apply(
    commit_message: AnonType,
    commit_title: AnonType,
    merge_method: AnonEnum,
    number: AnonAlias,
    owner: AnonRequired,
    pull_number: AnonRequired,
    repo: AnonRequired,
    sha: AnonType
  ): AnonCommitmessage = {
    val __obj = js.Dynamic.literal(commit_message = commit_message.asInstanceOf[js.Any], commit_title = commit_title.asInstanceOf[js.Any], merge_method = merge_method.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommitmessage]
  }
  @scala.inline
  implicit class AnonCommitmessageOps[Self <: AnonCommitmessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommit_message(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit_title(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerge_method(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: AnonAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_number(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

