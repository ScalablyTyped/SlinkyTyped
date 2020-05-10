package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the person who posted the comment.
    */
  var authorArn: js.UndefOr[Arn] = js.native
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request returns information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The system-generated comment ID.
    */
  var commentId: js.UndefOr[CommentId] = js.native
  /**
    * The content of the comment.
    */
  var content: js.UndefOr[Content] = js.native
  /**
    * The date and time the comment was created, in timestamp format.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * A Boolean value indicating whether the comment has been deleted.
    */
  var deleted: js.UndefOr[IsCommentDeleted] = js.native
  /**
    * The ID of the comment for which this comment is a reply, if any.
    */
  var inReplyTo: js.UndefOr[CommentId] = js.native
  /**
    * The date and time the comment was most recently modified, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.native
}

object Comment {
  @scala.inline
  def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorArn")(js.undefined)
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentId(value: CommentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentId")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: Content): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleted(value: IsCommentDeleted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withInReplyTo(value: CommentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inReplyTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInReplyTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inReplyTo")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(js.undefined)
        ret
    }
  }
  
}

