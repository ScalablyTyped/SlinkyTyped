package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableOfContents extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val HeadingStyles: typingsSlinky.activexWord.Word.HeadingStyles = js.native
  var HidePageNumbersInWeb: Boolean = js.native
  var IncludePageNumbers: Boolean = js.native
  var LowerHeadingLevel: Double = js.native
  val Parent: js.Any = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  var RightAlignPageNumbers: Boolean = js.native
  var TabLeader: WdTabLeader = js.native
  var TableID: String = js.native
  var UpperHeadingLevel: Double = js.native
  var UseFields: Boolean = js.native
  var UseHeadingStyles: Boolean = js.native
  var UseHyperlinks: Boolean = js.native
  @JSName("Word.TableOfContents_typekey")
  var WordDotTableOfContents_typekey: TableOfContents = js.native
  def Delete(): Unit = js.native
  def Update(): Unit = js.native
  def UpdatePageNumbers(): Unit = js.native
}

object TableOfContents {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    HeadingStyles: HeadingStyles,
    HidePageNumbersInWeb: Boolean,
    IncludePageNumbers: Boolean,
    LowerHeadingLevel: Double,
    Parent: js.Any,
    Range: Range,
    RightAlignPageNumbers: Boolean,
    TabLeader: WdTabLeader,
    TableID: String,
    Update: () => Unit,
    UpdatePageNumbers: () => Unit,
    UpperHeadingLevel: Double,
    UseFields: Boolean,
    UseHeadingStyles: Boolean,
    UseHyperlinks: Boolean,
    WordDotTableOfContents_typekey: TableOfContents
  ): TableOfContents = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), HeadingStyles = HeadingStyles.asInstanceOf[js.Any], HidePageNumbersInWeb = HidePageNumbersInWeb.asInstanceOf[js.Any], IncludePageNumbers = IncludePageNumbers.asInstanceOf[js.Any], LowerHeadingLevel = LowerHeadingLevel.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], RightAlignPageNumbers = RightAlignPageNumbers.asInstanceOf[js.Any], TabLeader = TabLeader.asInstanceOf[js.Any], TableID = TableID.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update), UpdatePageNumbers = js.Any.fromFunction0(UpdatePageNumbers), UpperHeadingLevel = UpperHeadingLevel.asInstanceOf[js.Any], UseFields = UseFields.asInstanceOf[js.Any], UseHeadingStyles = UseHeadingStyles.asInstanceOf[js.Any], UseHyperlinks = UseHyperlinks.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TableOfContents_typekey")(WordDotTableOfContents_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOfContents]
  }
  @scala.inline
  implicit class TableOfContentsOps[Self <: TableOfContents] (val x: Self) extends AnyVal {
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
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeadingStyles(value: HeadingStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeadingStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidePageNumbersInWeb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HidePageNumbersInWeb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludePageNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludePageNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowerHeadingLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LowerHeadingLevel")(value.asInstanceOf[js.Any])
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
    def withRightAlignPageNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightAlignPageNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabLeader(value: WdTabLeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabLeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdatePageNumbers(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatePageNumbers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpperHeadingLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpperHeadingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseHeadingStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseHeadingStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseHyperlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseHyperlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotTableOfContents_typekey(value: TableOfContents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.TableOfContents_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

