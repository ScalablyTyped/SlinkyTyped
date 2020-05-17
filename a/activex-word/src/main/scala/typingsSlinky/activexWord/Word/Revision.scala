package typingsSlinky.activexWord.Word

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Revision extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Author: String = js.native
  val Cells: typingsSlinky.activexWord.Word.Cells = js.native
  val Creator: Double = js.native
  val Date: VarDate = js.native
  val FormatDescription: String = js.native
  val Index: Double = js.native
  val MovedRange: typingsSlinky.activexWord.Word.Range = js.native
  val Parent: js.Any = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  val Style: typingsSlinky.activexWord.Word.Style = js.native
  val Type: WdRevisionType = js.native
  @JSName("Word.Revision_typekey")
  var WordDotRevision_typekey: Revision = js.native
  def Accept(): Unit = js.native
  def Reject(): Unit = js.native
}

object Revision {
  @scala.inline
  def apply(
    Accept: () => Unit,
    Application: Application,
    Author: String,
    Cells: Cells,
    Creator: Double,
    Date: VarDate,
    FormatDescription: String,
    Index: Double,
    MovedRange: Range,
    Parent: js.Any,
    Range: Range,
    Reject: () => Unit,
    Style: Style,
    Type: WdRevisionType,
    WordDotRevision_typekey: Revision
  ): Revision = {
    val __obj = js.Dynamic.literal(Accept = js.Any.fromFunction0(Accept), Application = Application.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Cells = Cells.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], FormatDescription = FormatDescription.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MovedRange = MovedRange.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reject = js.Any.fromFunction0(Reject), Style = Style.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Revision_typekey")(WordDotRevision_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision]
  }
  @scala.inline
  implicit class RevisionOps[Self <: Revision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accept")(js.Any.fromFunction0(value))
        ret
    }
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
    def withCells(value: Cells): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cells")(value.asInstanceOf[js.Any])
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
    def withFormatDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FormatDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMovedRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MovedRange")(value.asInstanceOf[js.Any])
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
    def withReject(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStyle(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: WdRevisionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotRevision_typekey(value: Revision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Revision_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

