package typingsSlinky.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A comment on a file in Google Drive.
  */
@js.native
trait SchemaCommentReply extends js.Object {
  /**
    * The user who wrote this reply.
    */
  var author: js.UndefOr[SchemaUser] = js.native
  /**
    * The plain text content used to create this reply. This is not HTML safe
    * and should only be used as a starting point to make edits to a
    * reply&#39;s content. This field is required on inserts if no verb is
    * specified (resolve/reopen).
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The date when this reply was first created.
    */
  var createdDate: js.UndefOr[String] = js.native
  /**
    * Whether this reply has been deleted. If a reply has been deleted the
    * content will be cleared and this will only represent a reply that once
    * existed.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * HTML formatted content for this reply.
    */
  var htmlContent: js.UndefOr[String] = js.native
  /**
    * This is always drive#commentReply.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The date when this reply was last modified.
    */
  var modifiedDate: js.UndefOr[String] = js.native
  /**
    * The ID of the reply.
    */
  var replyId: js.UndefOr[String] = js.native
  /**
    * The action this reply performed to the parent comment. When creating a
    * new reply this is the action to be perform to the parent comment.
    * Possible values are:   - &quot;resolve&quot; - To resolve a comment.  -
    * &quot;reopen&quot; - To reopen (un-resolve) a comment.
    */
  var verb: js.UndefOr[String] = js.native
}

object SchemaCommentReply {
  @scala.inline
  def apply(): SchemaCommentReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentReply]
  }
  @scala.inline
  implicit class SchemaCommentReplyOps[Self <: SchemaCommentReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: SchemaUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
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
    def withCreatedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self = {
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
    def withHtmlContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlContent")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withReplyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replyId")(js.undefined)
        ret
    }
    @scala.inline
    def withVerb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(js.undefined)
        ret
    }
  }
  
}

