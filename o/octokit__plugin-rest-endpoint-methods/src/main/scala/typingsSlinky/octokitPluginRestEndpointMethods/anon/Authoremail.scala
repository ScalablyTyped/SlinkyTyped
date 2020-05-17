package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authoremail extends js.Object {
  var author: Type = js.native
  @JSName("author.email")
  var authorDotemail: Required = js.native
  @JSName("author.name")
  var authorDotname: Required = js.native
  var branch: Type = js.native
  var committer: Type = js.native
  @JSName("committer.email")
  var committerDotemail: Required = js.native
  @JSName("committer.name")
  var committerDotname: Required = js.native
  var content: Required = js.native
  var message: Required = js.native
  var owner: Required = js.native
  var path: Required = js.native
  var repo: Required = js.native
  var sha: Type = js.native
}

object Authoremail {
  @scala.inline
  def apply(
    author: Type,
    authorDotemail: Required,
    authorDotname: Required,
    branch: Type,
    committer: Type,
    committerDotemail: Required,
    committerDotname: Required,
    content: Required,
    message: Required,
    owner: Required,
    path: Required,
    repo: Required,
    sha: Type
  ): Authoremail = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.updateDynamic("author.email")(authorDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("author.name")(authorDotname.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.email")(committerDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.name")(committerDotname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authoremail]
  }
  @scala.inline
  implicit class AuthoremailOps[Self <: Authoremail] (val x: Self) extends AnyVal {
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
    def withAuthorDotemail(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author.email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorDotname(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author.name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranch(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitter(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitterDotemail(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer.email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitterDotname(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer.name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
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
  }
  
}

