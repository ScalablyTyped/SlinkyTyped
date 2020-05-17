package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index extends js.Object {
  var AccentedLetters: Boolean = js.native
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var Filter: WdIndexFilter = js.native
  var HeadingSeparator: WdHeadingSeparator = js.native
  var IndexLanguage: WdLanguageID = js.native
  var NumberOfColumns: Double = js.native
  val Parent: js.Any = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  var RightAlignPageNumbers: Boolean = js.native
  var SortBy: WdIndexSortBy = js.native
  var TabLeader: WdTabLeader = js.native
  var Type: WdIndexType = js.native
  @JSName("Word.Index_typekey")
  var WordDotIndex_typekey: Index = js.native
  def Delete(): Unit = js.native
  def Update(): Unit = js.native
}

object Index {
  @scala.inline
  def apply(
    AccentedLetters: Boolean,
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Filter: WdIndexFilter,
    HeadingSeparator: WdHeadingSeparator,
    IndexLanguage: WdLanguageID,
    NumberOfColumns: Double,
    Parent: js.Any,
    Range: Range,
    RightAlignPageNumbers: Boolean,
    SortBy: WdIndexSortBy,
    TabLeader: WdTabLeader,
    Type: WdIndexType,
    Update: () => Unit,
    WordDotIndex_typekey: Index
  ): Index = {
    val __obj = js.Dynamic.literal(AccentedLetters = AccentedLetters.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Filter = Filter.asInstanceOf[js.Any], HeadingSeparator = HeadingSeparator.asInstanceOf[js.Any], IndexLanguage = IndexLanguage.asInstanceOf[js.Any], NumberOfColumns = NumberOfColumns.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], RightAlignPageNumbers = RightAlignPageNumbers.asInstanceOf[js.Any], SortBy = SortBy.asInstanceOf[js.Any], TabLeader = TabLeader.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("Word.Index_typekey")(WordDotIndex_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  @scala.inline
  implicit class IndexOps[Self <: Index] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccentedLetters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccentedLetters")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withFilter(value: WdIndexFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadingSeparator(value: WdHeadingSeparator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeadingSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexLanguage(value: WdLanguageID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfColumns")(value.asInstanceOf[js.Any])
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
    def withSortBy(value: WdIndexSortBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabLeader(value: WdTabLeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabLeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: WdIndexType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWordDotIndex_typekey(value: Index): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Index_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

