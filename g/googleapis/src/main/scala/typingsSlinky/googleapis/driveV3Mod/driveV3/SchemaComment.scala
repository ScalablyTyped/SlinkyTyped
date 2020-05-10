package typingsSlinky.googleapis.driveV3Mod.driveV3

import typingsSlinky.googleapis.AnonMimeTypeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A comment on a file.
  */
@js.native
trait SchemaComment extends js.Object {
  /**
    * A region of the document represented as a JSON string. See anchor
    * documentation for details on how to define and interpret anchor
    * properties.
    */
  var anchor: js.UndefOr[String] = js.native
  /**
    * The user who created the comment.
    */
  var author: js.UndefOr[SchemaUser] = js.native
  /**
    * The plain text content of the comment. This field is used for setting the
    * content, while htmlContent should be displayed.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The time at which the comment was created (RFC 3339 date-time).
    */
  var createdTime: js.UndefOr[String] = js.native
  /**
    * Whether the comment has been deleted. A deleted comment has no content.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * The content of the comment with HTML formatting.
    */
  var htmlContent: js.UndefOr[String] = js.native
  /**
    * The ID of the comment.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#comment&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The last time the comment or any of its replies was modified (RFC 3339
    * date-time).
    */
  var modifiedTime: js.UndefOr[String] = js.native
  /**
    * The file content to which the comment refers, typically within the anchor
    * region. For a text file, for example, this would be the text at the
    * location of the comment.
    */
  var quotedFileContent: js.UndefOr[AnonMimeTypeValue] = js.native
  /**
    * The full list of replies to the comment in chronological order.
    */
  var replies: js.UndefOr[js.Array[SchemaReply]] = js.native
  /**
    * Whether the comment has been resolved by one of its replies.
    */
  var resolved: js.UndefOr[Boolean] = js.native
}

object SchemaComment {
  @scala.inline
  def apply(): SchemaComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComment]
  }
  @scala.inline
  implicit class SchemaCommentOps[Self <: SchemaComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
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
    def withCreatedTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTime")(js.undefined)
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withModifiedTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotedFileContent(value: AnonMimeTypeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotedFileContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotedFileContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotedFileContent")(js.undefined)
        ret
    }
    @scala.inline
    def withReplies(value: js.Array[SchemaReply]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replies")(js.undefined)
        ret
    }
    @scala.inline
    def withResolved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(js.undefined)
        ret
    }
  }
  
}

