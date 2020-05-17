package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comments extends js.Object {
  var body: Type = js.native
  var comments: Type = js.native
  @JSName("comments[].body")
  var `comments[]Dotbody`: Required = js.native
  @JSName("comments[].path")
  var `comments[]Dotpath`: Required = js.native
  @JSName("comments[].position")
  var `comments[]Dotposition`: Required = js.native
  var commit_id: Type = js.native
  var event: Enum = js.native
  var number: Alias = js.native
  var owner: Required = js.native
  var pull_number: Required = js.native
  var repo: Required = js.native
}

object Comments {
  @scala.inline
  def apply(
    body: Type,
    comments: Type,
    `comments[]Dotbody`: Required,
    `comments[]Dotpath`: Required,
    `comments[]Dotposition`: Required,
    commit_id: Type,
    event: Enum,
    number: Alias,
    owner: Required,
    pull_number: Required,
    repo: Required
  ): Comments = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("comments[].body")(`comments[]Dotbody`.asInstanceOf[js.Any])
    __obj.updateDynamic("comments[].path")(`comments[]Dotpath`.asInstanceOf[js.Any])
    __obj.updateDynamic("comments[].position")(`comments[]Dotposition`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comments]
  }
  @scala.inline
  implicit class CommentsOps[Self <: Comments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withComments[]Dotbody`(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments[].body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withComments[]Dotpath`(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments[].path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withComments[]Dotposition`(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments[].position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit_id(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
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
  }
  
}

