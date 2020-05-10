package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCommentContentOutput extends js.Object {
  /**
    * Information about the comment you just deleted.
    */
  var comment: js.UndefOr[Comment] = js.native
}

object DeleteCommentContentOutput {
  @scala.inline
  def apply(): DeleteCommentContentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCommentContentOutput]
  }
  @scala.inline
  implicit class DeleteCommentContentOutputOps[Self <: DeleteCommentContentOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: Comment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
  }
  
}

