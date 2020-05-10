package typingsSlinky.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the content contained within a comment or comment reply. Rich content incudes the text string and any other objects contained within the comment body, such as mentions.
  *
  * [Api set: ExcelApiOnline 1.1]
  */
@js.native
trait CommentRichContent extends js.Object {
  /**
    *
    * An array containing all the entities (e.g. people) mentioned within the comment.
    *
    * [Api set: ExcelApiOnline 1.1]
    */
  var mentions: js.UndefOr[js.Array[CommentMention]] = js.native
  var richContent: String = js.native
}

object CommentRichContent {
  @scala.inline
  def apply(richContent: String): CommentRichContent = {
    val __obj = js.Dynamic.literal(richContent = richContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentRichContent]
  }
  @scala.inline
  implicit class CommentRichContentOps[Self <: CommentRichContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRichContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("richContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMentions(value: js.Array[CommentMention]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMentions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mentions")(js.undefined)
        ret
    }
  }
  
}

