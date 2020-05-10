package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTagsha extends js.Object {
  var owner: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var tag_sha: AnonRequired = js.native
}

object AnonTagsha {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired, tag_sha: AnonRequired): AnonTagsha = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag_sha = tag_sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTagsha]
  }
  @scala.inline
  implicit class AnonTagshaOps[Self <: AnonTagsha] (val x: Self) extends AnyVal {
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
    def withTag_sha(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag_sha")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

