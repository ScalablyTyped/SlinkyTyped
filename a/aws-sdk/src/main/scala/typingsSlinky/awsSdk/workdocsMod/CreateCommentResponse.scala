package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCommentResponse extends js.Object {
  /**
    * The comment that has been created.
    */
  var Comment: js.UndefOr[typingsSlinky.awsSdk.workdocsMod.Comment] = js.native
}

object CreateCommentResponse {
  @scala.inline
  def apply(): CreateCommentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCommentResponse]
  }
  @scala.inline
  implicit class CreateCommentResponseOps[Self <: CreateCommentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: Comment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(js.undefined)
        ret
    }
  }
  
}

