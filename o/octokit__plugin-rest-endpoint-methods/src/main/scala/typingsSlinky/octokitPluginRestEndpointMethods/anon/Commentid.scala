package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commentid extends js.Object {
  var comment_id: Required
  var gist_id: Required
}

object Commentid {
  @scala.inline
  def apply(comment_id: Required, gist_id: Required): Commentid = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commentid]
  }
}

