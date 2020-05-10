package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentMetadata extends js.Object {
  /**
    * The ID of the comment.
    */
  var CommentId: js.UndefOr[CommentIdType] = js.native
  /**
    * The status of the comment.
    */
  var CommentStatus: js.UndefOr[CommentStatusType] = js.native
  /**
    * The user who made the comment.
    */
  var Contributor: js.UndefOr[User] = js.native
  /**
    * The timestamp that the comment was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the user being replied to.
    */
  var RecipientId: js.UndefOr[IdType] = js.native
}

object CommentMetadata {
  @scala.inline
  def apply(): CommentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentMetadata]
  }
  @scala.inline
  implicit class CommentMetadataOps[Self <: CommentMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommentId(value: CommentIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommentId")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentStatus(value: CommentStatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommentStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withContributor(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contributor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContributor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contributor")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipientId(value: IdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecipientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecipientId")(js.undefined)
        ret
    }
  }
  
}

