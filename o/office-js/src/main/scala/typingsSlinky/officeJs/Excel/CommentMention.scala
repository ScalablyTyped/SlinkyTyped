package typingsSlinky.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the entity that is mentioned in comments.
  *
  * [Api set: ExcelApiOnline 1.1]
  */
@js.native
trait CommentMention extends js.Object {
  /**
    *
    * Gets or sets the email address of the entity that is mentioned in comment.
    *
    * [Api set: ExcelApiOnline 1.1]
    */
  var email: String = js.native
  /**
    *
    * Gets or sets the id of the entity. The id matches one of the ids in `CommentRichContent.richContent`.
    *
    * [Api set: ExcelApiOnline 1.1]
    */
  var id: Double = js.native
  /**
    *
    * Gets or sets the name of the entity that is mentioned in comment.
    *
    * [Api set: ExcelApiOnline 1.1]
    */
  var name: String = js.native
}

object CommentMention {
  @scala.inline
  def apply(email: String, id: Double, name: String): CommentMention = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentMention]
  }
  @scala.inline
  implicit class CommentMentionOps[Self <: CommentMention] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

