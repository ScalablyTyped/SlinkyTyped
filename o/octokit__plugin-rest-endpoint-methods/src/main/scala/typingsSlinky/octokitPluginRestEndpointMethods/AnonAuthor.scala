package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthor extends js.Object {
  var author: AnonType = js.native
  @JSName("author.date")
  var authorDotdate: AnonType = js.native
  @JSName("author.email")
  var authorDotemail: AnonType = js.native
  @JSName("author.name")
  var authorDotname: AnonType = js.native
  var committer: AnonType = js.native
  @JSName("committer.date")
  var committerDotdate: AnonType = js.native
  @JSName("committer.email")
  var committerDotemail: AnonType = js.native
  @JSName("committer.name")
  var committerDotname: AnonType = js.native
  var message: AnonRequired = js.native
  var owner: AnonRequired = js.native
  var parents: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var signature: AnonType = js.native
  var tree: AnonRequired = js.native
}

object AnonAuthor {
  @scala.inline
  def apply(
    author: AnonType,
    authorDotdate: AnonType,
    authorDotemail: AnonType,
    authorDotname: AnonType,
    committer: AnonType,
    committerDotdate: AnonType,
    committerDotemail: AnonType,
    committerDotname: AnonType,
    message: AnonRequired,
    owner: AnonRequired,
    parents: AnonRequired,
    repo: AnonRequired,
    signature: AnonType,
    tree: AnonRequired
  ): AnonAuthor = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.updateDynamic("author.date")(authorDotdate.asInstanceOf[js.Any])
    __obj.updateDynamic("author.email")(authorDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("author.name")(authorDotname.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.date")(committerDotdate.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.email")(committerDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.name")(committerDotname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthor]
  }
  @scala.inline
  implicit class AnonAuthorOps[Self <: AnonAuthor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorDotdate(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author.date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorDotemail(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author.email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorDotname(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author.name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitter(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitterDotdate(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer.date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitterDotemail(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer.email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitterDotname(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer.name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParents(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

