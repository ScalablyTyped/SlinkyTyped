package typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileComment extends js.Object {
  var legacyCommentId: js.UndefOr[String] = js.native
  var legacyDiscussionId: js.UndefOr[String] = js.native
  var linkToDiscussion: js.UndefOr[String] = js.native
  var parent: js.UndefOr[DriveItem] = js.native
}

object FileComment {
  @scala.inline
  def apply(): FileComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileComment]
  }
  @scala.inline
  implicit class FileCommentOps[Self <: FileComment] (val x: Self) extends AnyVal {
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
    def withParent(value: DriveItem): Self = {
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

