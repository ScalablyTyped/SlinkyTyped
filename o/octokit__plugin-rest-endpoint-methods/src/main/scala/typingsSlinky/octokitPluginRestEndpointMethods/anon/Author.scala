package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Author extends js.Object {
  var author: Type = js.native
  @JSName("author.date")
  var authorDotdate: Type = js.native
  @JSName("author.email")
  var authorDotemail: Type = js.native
  @JSName("author.name")
  var authorDotname: Type = js.native
  var committer: Type = js.native
  @JSName("committer.date")
  var committerDotdate: Type = js.native
  @JSName("committer.email")
  var committerDotemail: Type = js.native
  @JSName("committer.name")
  var committerDotname: Type = js.native
  var message: Required = js.native
  var owner: Required = js.native
  var parents: Required = js.native
  var repo: Required = js.native
  var signature: Type = js.native
  var tree: Required = js.native
}

object Author {
  @scala.inline
  def apply(
    author: Type,
    authorDotdate: Type,
    authorDotemail: Type,
    authorDotname: Type,
    committer: Type,
    committerDotdate: Type,
    committerDotemail: Type,
    committerDotname: Type,
    message: Required,
    owner: Required,
    parents: Required,
    repo: Required,
    signature: Type,
    tree: Required
  ): Author = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.updateDynamic("author.date")(authorDotdate.asInstanceOf[js.Any])
    __obj.updateDynamic("author.email")(authorDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("author.name")(authorDotname.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.date")(committerDotdate.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.email")(committerDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.name")(committerDotname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  @scala.inline
  implicit class AuthorOps[Self <: Author] (val x: Self) extends AnyVal {
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
    def withAuthorDotdate(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author.date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorDotemail(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author.email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorDotname(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author.name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitter(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitterDotdate(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer.date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitterDotemail(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer.email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitterDotname(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer.name")(value.asInstanceOf[js.Any])
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
    def withParents(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

