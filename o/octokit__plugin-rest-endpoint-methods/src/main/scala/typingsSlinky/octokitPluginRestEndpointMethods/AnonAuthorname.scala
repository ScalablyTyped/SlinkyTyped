package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthorname extends js.Object {
  var author: AnonType
  @JSName("author.email")
  var authorDotemail: AnonType
  @JSName("author.name")
  var authorDotname: AnonType
  var branch: AnonType
  var committer: AnonType
  @JSName("committer.email")
  var committerDotemail: AnonType
  @JSName("committer.name")
  var committerDotname: AnonType
  var message: AnonRequired
  var owner: AnonRequired
  var path: AnonRequired
  var repo: AnonRequired
  var sha: AnonRequired
}

object AnonAuthorname {
  @scala.inline
  def apply(
    author: AnonType,
    authorDotemail: AnonType,
    authorDotname: AnonType,
    branch: AnonType,
    committer: AnonType,
    committerDotemail: AnonType,
    committerDotname: AnonType,
    message: AnonRequired,
    owner: AnonRequired,
    path: AnonRequired,
    repo: AnonRequired,
    sha: AnonRequired
  ): AnonAuthorname = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.updateDynamic("author.email")(authorDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("author.name")(authorDotname.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.email")(committerDotemail.asInstanceOf[js.Any])
    __obj.updateDynamic("committer.name")(committerDotname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorname]
  }
}

