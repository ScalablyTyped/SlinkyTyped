package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTargeturl extends js.Object {
  var context: AnonType = js.native
  var description: AnonType = js.native
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var sha: AnonRequired = js.native
  var state: AnonEnumRequired = js.native
  var target_url: AnonType = js.native
}

object AnonTargeturl {
  @scala.inline
  def apply(
    context: AnonType,
    description: AnonType,
    owner: AnonRequired,
    repo: AnonRequired,
    sha: AnonRequired,
    state: AnonEnumRequired,
    target_url: AnonType
  ): AnonTargeturl = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target_url = target_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTargeturl]
  }
  @scala.inline
  implicit class AnonTargeturlOps[Self <: AnonTargeturl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
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
    def withSha(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: AnonEnumRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget_url(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

