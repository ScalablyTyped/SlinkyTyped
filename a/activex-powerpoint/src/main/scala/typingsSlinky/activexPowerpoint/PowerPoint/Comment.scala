package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Author: String = js.native
  val AuthorIndex: Double = js.native
  val AuthorInitials: String = js.native
  val DateTime: VarDate = js.native
  val Left: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Comment_typekey")
  var PowerPointDotComment_typekey: Comment = js.native
  val Text: String = js.native
  val Top: Double = js.native
  def Delete(): Unit = js.native
}

object Comment {
  @scala.inline
  def apply(
    Application: Application,
    Author: String,
    AuthorIndex: Double,
    AuthorInitials: String,
    DateTime: VarDate,
    Delete: () => Unit,
    Left: Double,
    Parent: js.Any,
    PowerPointDotComment_typekey: Comment,
    Text: String,
    Top: Double
  ): Comment = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], AuthorIndex = AuthorIndex.asInstanceOf[js.Any], AuthorInitials = AuthorInitials.asInstanceOf[js.Any], DateTime = DateTime.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Left = Left.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Comment_typekey")(PowerPointDotComment_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorInitials(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorInitials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateTime(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotComment_typekey(value: Comment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Comment_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Top")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

