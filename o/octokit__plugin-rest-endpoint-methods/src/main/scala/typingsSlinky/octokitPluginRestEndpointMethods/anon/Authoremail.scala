package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authoremail extends js.Object {
  var author: Type
  @JSName("author.email")
  var authorDotemail: Required
  @JSName("author.name")
  var authorDotname: Required
  var branch: Type
  var committer: Type
  @JSName("committer.email")
  var committerDotemail: Required
  @JSName("committer.name")
  var committerDotname: Required
  var content: Required
  var message: Required
  var owner: Required
  var path: Required
  var repo: Required
  var sha: Type
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
}

