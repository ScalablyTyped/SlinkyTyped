package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyCommentid extends js.Object {
  var body: Required
  var comment_id: Required
  var gist_id: Required
}

object BodyCommentid {
  @scala.inline
  def apply(body: Required, comment_id: Required, gist_id: Required): BodyCommentid = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_id = comment_id.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyCommentid]
  }
}

