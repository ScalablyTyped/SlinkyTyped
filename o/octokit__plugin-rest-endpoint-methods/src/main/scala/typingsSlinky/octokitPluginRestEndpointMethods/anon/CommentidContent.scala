package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentidContent extends js.Object {
  var comment_id: Required
  var content: EnumRequired
  var owner: Required
  var repo: Required
}

object CommentidContent {
  @scala.inline
  def apply(comment_id: Required, content: EnumRequired, owner: Required, repo: Required): CommentidContent = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentidContent]
  }
}

