package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Author extends js.Object {
  var author: Type
  @JSName("author.date")
  var authorDotdate: Type
  @JSName("author.email")
  var authorDotemail: Type
  @JSName("author.name")
  var authorDotname: Type
  var committer: Type
  @JSName("committer.date")
  var committerDotdate: Type
  @JSName("committer.email")
  var committerDotemail: Type
  @JSName("committer.name")
  var committerDotname: Type
  var message: Required
  var owner: Required
  var parents: Required
  var repo: Required
  var signature: Type
  var tree: Required
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
}

