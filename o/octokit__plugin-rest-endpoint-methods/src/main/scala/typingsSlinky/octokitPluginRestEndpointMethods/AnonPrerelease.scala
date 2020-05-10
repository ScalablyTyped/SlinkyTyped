package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrerelease extends js.Object {
  var body: AnonType = js.native
  var draft: AnonType = js.native
  var name: AnonType = js.native
  var owner: AnonRequired = js.native
  var prerelease: AnonType = js.native
  var repo: AnonRequired = js.native
  var tag_name: AnonRequired = js.native
  var target_commitish: AnonType = js.native
}

object AnonPrerelease {
  @scala.inline
  def apply(
    body: AnonType,
    draft: AnonType,
    name: AnonType,
    owner: AnonRequired,
    prerelease: AnonType,
    repo: AnonRequired,
    tag_name: AnonRequired,
    target_commitish: AnonType
  ): AnonPrerelease = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], target_commitish = target_commitish.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrerelease]
  }
  @scala.inline
  implicit class AnonPrereleaseOps[Self <: AnonPrerelease] (val x: Self) extends AnyVal {
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
    def withDraft(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrerelease(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag_name(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget_commitish(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_commitish")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

