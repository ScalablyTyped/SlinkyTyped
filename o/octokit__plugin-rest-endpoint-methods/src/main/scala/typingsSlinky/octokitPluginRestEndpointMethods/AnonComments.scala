package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComments extends js.Object {
  var body: AnonType = js.native
  var comments: AnonType = js.native
  @JSName("comments[].body")
  var `comments[]Dotbody`: AnonRequired = js.native
  @JSName("comments[].path")
  var `comments[]Dotpath`: AnonRequired = js.native
  @JSName("comments[].position")
  var `comments[]Dotposition`: AnonRequired = js.native
  var commit_id: AnonType = js.native
  var event: AnonEnum = js.native
  var number: AnonAlias = js.native
  var owner: AnonRequired = js.native
  var pull_number: AnonRequired = js.native
  var repo: AnonRequired = js.native
}

object AnonComments {
  @scala.inline
  def apply(
    body: AnonType,
    comments: AnonType,
    `comments[]Dotbody`: AnonRequired,
    `comments[]Dotpath`: AnonRequired,
    `comments[]Dotposition`: AnonRequired,
    commit_id: AnonType,
    event: AnonEnum,
    number: AnonAlias,
    owner: AnonRequired,
    pull_number: AnonRequired,
    repo: AnonRequired
  ): AnonComments = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("comments[].body")(`comments[]Dotbody`.asInstanceOf[js.Any])
    __obj.updateDynamic("comments[].path")(`comments[]Dotpath`.asInstanceOf[js.Any])
    __obj.updateDynamic("comments[].position")(`comments[]Dotposition`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComments]
  }
  @scala.inline
  implicit class AnonCommentsOps[Self <: AnonComments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withComments[]Dotbody`(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments[].body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withComments[]Dotpath`(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments[].path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withComments[]Dotposition`(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments[].position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit_id(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
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
  }
  
}

