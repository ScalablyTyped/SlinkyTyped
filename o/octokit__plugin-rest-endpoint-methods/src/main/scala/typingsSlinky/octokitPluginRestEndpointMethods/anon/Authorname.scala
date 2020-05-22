package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authorname extends js.Object {
  var author: Type
  @JSName("author.email")
  var authorDotemail: Type
  @JSName("author.name")
  var authorDotname: Type
  var branch: Type
  var committer: Type
  @JSName("committer.email")
  var committerDotemail: Type
  @JSName("committer.name")
  var committerDotname: Type
  var message: Required
  var owner: Required
  var path: Required
  var repo: Required
  var sha: Required
}

object Authorname {
  @scala.inline
  def apply(
    author: Type,
    authorDotemail: Type,
    authorDotname: Type,
    branch: Type,
    committer: Type,
    committerDotemail: Type,
    committerDotname: Type,
    message: Required,
    owner: Required,
    path: Required,
    repo: Required,
    sha: Required
  ): Authorname = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.updateDynamic("author.email")(authorDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("author.name")(authorDotname.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.email")(committerDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.name")(committerDotname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorname]
  }
}

