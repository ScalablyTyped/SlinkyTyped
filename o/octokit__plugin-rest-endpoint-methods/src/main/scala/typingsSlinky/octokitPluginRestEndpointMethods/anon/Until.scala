package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Until extends js.Object {
  var author: Type
  var owner: Required
  var page: Type
  var path: Type
  var per_page: Type
  var repo: Required
  var sha: Type
  var since: Type
  var until: Type
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
}

