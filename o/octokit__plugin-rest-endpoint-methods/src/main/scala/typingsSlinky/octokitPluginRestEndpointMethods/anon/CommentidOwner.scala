package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentidOwner extends js.Object {
  var comment_id: Required
  var owner: Required
  var repo: Required
}

object CommentidOwner {
  @scala.inline
  def apply(comment_id: Required, owner: Required, repo: Required): CommentidOwner = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentidOwner]
  }
}

