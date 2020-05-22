package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentOwner extends js.Object {
  var comment_id: Required
  var content: Enum
  var owner: Required
  var page: Type
  var per_page: Type
  var repo: Required
}

object ContentOwner {
  @scala.inline
  def apply(comment_id: Required, content: Enum, owner: Required, page: Type, per_page: Type, repo: Required): ContentOwner = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentOwner]
  }
}

