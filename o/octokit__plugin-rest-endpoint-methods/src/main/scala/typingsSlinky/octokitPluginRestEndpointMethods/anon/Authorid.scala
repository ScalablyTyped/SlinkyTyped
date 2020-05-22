package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authorid extends js.Object {
  var author_id: Required
  var email: Type
  var name: Type
  var owner: Required
  var repo: Required
}

object Authorid {
  @scala.inline
  def apply(author_id: Required, email: Type, name: Type, owner: Required, repo: Required): Authorid = {
    val __obj = js.Dynamic.literal(author_id = author_id.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorid]
  }
}

