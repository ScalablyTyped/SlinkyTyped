package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthoremail extends js.Object {
  var author: AnonType = js.native
  @JSName("author.email")
  var authorDotemail: AnonRequired = js.native
  @JSName("author.name")
  var authorDotname: AnonRequired = js.native
  var branch: AnonType = js.native
  var committer: AnonType = js.native
  @JSName("committer.email")
  var committerDotemail: AnonRequired = js.native
  @JSName("committer.name")
  var committerDotname: AnonRequired = js.native
  var content: AnonRequired = js.native
  var message: AnonRequired = js.native
  var owner: AnonRequired = js.native
  var path: AnonRequired = js.native
  var repo: AnonRequired = js.native
  var sha: AnonType = js.native
}

object AnonAuthoremail {
  @scala.inline
  def apply(
    author: AnonType,
    authorDotemail: AnonRequired,
    authorDotname: AnonRequired,
    branch: AnonType,
    committer: AnonType,
    committerDotemail: AnonRequired,
    committerDotname: AnonRequired,
    content: AnonRequired,
    message: AnonRequired,
    owner: AnonRequired,
    path: AnonRequired,
    repo: AnonRequired,
    sha: AnonType
  ): AnonAuthoremail = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.updateDynamic("author.email")(authorDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("author.name")(authorDotname.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.email")(committerDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.name")(committerDotname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthoremail]
  }
  @scala.inline
  implicit class AnonAuthoremailOps[Self <: AnonAuthoremail] (val x: Self) extends AnyVal {
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
    def withAuthorDotemail(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author.email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorDotname(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author.name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranch(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitter(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitterDotemail(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer.email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitterDotname(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer.name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
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
    def withPath(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

