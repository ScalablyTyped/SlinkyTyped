package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Before extends js.Object {
  var all: Type = js.native
  var before: Type = js.native
  var owner: Required = js.native
  var page: Type = js.native
  var participating: Type = js.native
  var per_page: Type = js.native
  var repo: Required = js.native
  var since: Type = js.native
}

object Before {
  @scala.inline
  def apply(
    all: Type,
    before: Type,
    owner: Required,
    page: Type,
    participating: Type,
    per_page: Type,
    repo: Required,
    since: Type
  ): Before = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], participating = participating.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.asInstanceOf[Before]
  }
  @scala.inline
  implicit class BeforeOps[Self <: Before] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBefore(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPage(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticipating(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPer_page(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSince(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

