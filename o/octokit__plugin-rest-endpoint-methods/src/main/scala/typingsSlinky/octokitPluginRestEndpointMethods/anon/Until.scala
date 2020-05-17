package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Until extends js.Object {
  var author: Type = js.native
  var owner: Required = js.native
  var page: Type = js.native
  var path: Type = js.native
  var per_page: Type = js.native
  var repo: Required = js.native
  var sha: Type = js.native
  var since: Type = js.native
  var until: Type = js.native
}

object Until {
  @scala.inline
  def apply(
    author: Type,
    owner: Required,
    page: Type,
    path: Type,
    per_page: Type,
    repo: Required,
    sha: Type,
    since: Type,
    until: Type
  ): Until = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
    __obj.asInstanceOf[Until]
  }
  @scala.inline
  implicit class UntilOps[Self <: Until] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
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
    def withPath(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
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
    def withSha(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSince(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUntil(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("until")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

