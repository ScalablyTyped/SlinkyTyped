package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  /**
    * The ID of the comment.
    */
  var CommentId: CommentIdType = js.native
  /**
    * The details of the user who made the comment.
    */
  var Contributor: js.UndefOr[User] = js.native
  /**
    * The time that the comment was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the parent comment.
    */
  var ParentId: js.UndefOr[CommentIdType] = js.native
  /**
    * If the comment is a reply to another user's comment, this field contains the user ID of the user being replied to.
    */
  var RecipientId: js.UndefOr[IdType] = js.native
  /**
    * The status of the comment.
    */
  var Status: js.UndefOr[CommentStatusType] = js.native
  /**
    * The text of the comment.
    */
  var Text: js.UndefOr[CommentTextType] = js.native
  /**
    * The ID of the root comment in the thread.
    */
  var ThreadId: js.UndefOr[CommentIdType] = js.native
  /**
    * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners, and contributors.
    */
  var Visibility: js.UndefOr[CommentVisibilityType] = js.native
}

object Comment {
  @scala.inline
  def apply(CommentId: CommentIdType): Comment = {
    val __obj = js.Dynamic.literal(CommentId = CommentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
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
    def withParentId(value: CommentIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentId")(js.undefined)
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
    @scala.inline
    def withStatus(value: CommentStatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: CommentTextType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(js.undefined)
        ret
    }
    @scala.inline
    def withThreadId(value: CommentIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreadId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreadId")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: CommentVisibilityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visibility")(js.undefined)
        ret
    }
  }
  
}

