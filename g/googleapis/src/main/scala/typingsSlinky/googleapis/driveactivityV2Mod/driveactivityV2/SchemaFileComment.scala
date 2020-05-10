package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A comment on a file.
  */
@js.native
trait SchemaFileComment extends js.Object {
  /**
    * The comment in the discussion thread. This identifier is an opaque string
    * compatible with the Drive API; see
    * https://developers.google.com/drive/v3/reference/comments/get
    */
  var legacyCommentId: js.UndefOr[String] = js.native
  /**
    * The discussion thread to which the comment was added. This identifier is
    * an opaque string compatible with the Drive API and references the first
    * comment in a discussion; see
    * https://developers.google.com/drive/v3/reference/comments/get
    */
  var legacyDiscussionId: js.UndefOr[String] = js.native
  /**
    * The link to the discussion thread containing this comment, for example,
    * &quot;https://docs.google.com/DOCUMENT_ID/edit?disco=THREAD_ID&quot;.
    */
  var linkToDiscussion: js.UndefOr[String] = js.native
  /**
    * The Drive item containing this comment.
    */
  var parent: js.UndefOr[SchemaDriveItem] = js.native
}

object SchemaFileComment {
  @scala.inline
  def apply(): SchemaFileComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileComment]
  }
  @scala.inline
  implicit class SchemaFileCommentOps[Self <: SchemaFileComment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLegacyCommentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyCommentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacyCommentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyCommentId")(js.undefined)
        ret
    }
    @scala.inline
    def withLegacyDiscussionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyDiscussionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacyDiscussionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyDiscussionId")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkToDiscussion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkToDiscussion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkToDiscussion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkToDiscussion")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: SchemaDriveItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
  }
  
}

