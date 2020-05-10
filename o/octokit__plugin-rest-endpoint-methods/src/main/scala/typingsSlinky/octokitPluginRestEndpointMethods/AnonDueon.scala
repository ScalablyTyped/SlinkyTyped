package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDueon extends js.Object {
  var description: AnonType = js.native
  var due_on: AnonType = js.native
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var state: AnonEnum = js.native
  var title: AnonRequired = js.native
}

object AnonDueon {
  @scala.inline
  def apply(
    description: AnonType,
    due_on: AnonType,
    owner: AnonRequired,
    repo: AnonRequired,
    state: AnonEnum,
    title: AnonRequired
  ): AnonDueon = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], due_on = due_on.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDueon]
  }
  @scala.inline
  implicit class AnonDueonOps[Self <: AnonDueon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDue_on(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("due_on")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withState(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

