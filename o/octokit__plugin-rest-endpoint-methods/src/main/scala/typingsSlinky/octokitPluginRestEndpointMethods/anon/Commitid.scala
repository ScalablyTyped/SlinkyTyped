package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commitid extends js.Object {
  var body: Required = js.native
  var commit_id: Required = js.native
  var in_reply_to: DeprecatedDescription = js.native
  var line: Type = js.native
  var number: Alias = js.native
  var owner: Required = js.native
  var path: Required = js.native
  var position: Type = js.native
  var pull_number: Required = js.native
  var repo: Required = js.native
  var side: Enum = js.native
  var start_line: Type = js.native
  var start_side: Enum = js.native
}

object Commitid {
  @scala.inline
  def apply(
    body: Required,
    commit_id: Required,
    in_reply_to: DeprecatedDescription,
    line: Type,
    number: Alias,
    owner: Required,
    path: Required,
    position: Type,
    pull_number: Required,
    repo: Required,
    side: Enum,
    start_line: Type,
    start_side: Enum
  ): Commitid = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], in_reply_to = in_reply_to.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], start_line = start_line.asInstanceOf[js.Any], start_side = start_side.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commitid]
  }
  @scala.inline
  implicit class CommitidOps[Self <: Commitid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIn_reply_to(value: DeprecatedDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_reply_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
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
    def withPath(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
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
    def withSide(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_line(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_side(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_side")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

