package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prerelease extends js.Object {
  var body: Type = js.native
  var draft: Type = js.native
  var name: Type = js.native
  var owner: Required = js.native
  var prerelease: Type = js.native
  var repo: Required = js.native
  var tag_name: Required = js.native
  var target_commitish: Type = js.native
}

object Prerelease {
  @scala.inline
  def apply(
    body: Type,
    draft: Type,
    name: Type,
    owner: Required,
    prerelease: Type,
    repo: Required,
    tag_name: Required,
    target_commitish: Type
  ): Prerelease = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], target_commitish = target_commitish.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prerelease]
  }
  @scala.inline
  implicit class PrereleaseOps[Self <: Prerelease] (val x: Self) extends AnyVal {
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
    def withDraft(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrerelease(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag_name(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget_commitish(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target_commitish")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

