package typingsSlinky.activexWord.Word

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Author: String = js.native
  val Creator: Double = js.native
  val Date: VarDate = js.native
  val Index: Double = js.native
  var Initial: String = js.native
  val IsInk: Boolean = js.native
  val Parent: js.Any = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  val Reference: typingsSlinky.activexWord.Word.Range = js.native
  val Scope: typingsSlinky.activexWord.Word.Range = js.native
  var ShowTip: Boolean = js.native
  @JSName("Word.Comment_typekey")
  var WordDotComment_typekey: Comment = js.native
  def Delete(): Unit = js.native
  def Edit(): Unit = js.native
}

object Comment {
  @scala.inline
  def apply(
    Application: Application,
    Author: String,
    Creator: Double,
    Date: VarDate,
    Delete: () => Unit,
    Edit: () => Unit,
    Index: Double,
    Initial: String,
    IsInk: Boolean,
    Parent: js.Any,
    Range: Range,
    Reference: Range,
    Scope: Range,
    ShowTip: Boolean,
    WordDotComment_typekey: Comment
  ): Comment = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Edit = js.Any.fromFunction0(Edit), Index = Index.asInstanceOf[js.Any], Initial = Initial.asInstanceOf[js.Any], IsInk = IsInk.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reference = Reference.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], ShowTip = ShowTip.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Comment_typekey")(WordDotComment_typekey.asInstanceOf[js.Any])
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
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEdit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Edit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsInk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowTip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotComment_typekey(value: Comment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Comment_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

