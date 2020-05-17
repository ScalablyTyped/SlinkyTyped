package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyCommentid extends js.Object {
  var body: Required = js.native
  var comment_id: Required = js.native
  var gist_id: Required = js.native
}

object BodyCommentid {
  @scala.inline
  def apply(body: Required, comment_id: Required, gist_id: Required): BodyCommentid = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_id = comment_id.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyCommentid]
  }
  @scala.inline
  implicit class BodyCommentidOps[Self <: BodyCommentid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
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

