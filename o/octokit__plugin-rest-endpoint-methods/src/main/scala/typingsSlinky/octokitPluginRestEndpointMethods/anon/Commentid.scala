package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commentid extends js.Object {
  var comment_id: Required = js.native
  var gist_id: Required = js.native
}

object Commentid {
  @scala.inline
  def apply(comment_id: Required, gist_id: Required): Commentid = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commentid]
  }
  @scala.inline
  implicit class CommentidOps[Self <: Commentid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGist_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gist_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

