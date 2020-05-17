package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableOfAuthorities extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Bookmark: String = js.native
  var Category: Double = js.native
  val Creator: Double = js.native
  var EntrySeparator: String = js.native
  var IncludeCategoryHeader: Boolean = js.native
  var IncludeSequenceName: String = js.native
  var KeepEntryFormatting: Boolean = js.native
  var PageNumberSeparator: String = js.native
  var PageRangeSeparator: String = js.native
  val Parent: js.Any = js.native
  var Passim: Boolean = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  var Separator: String = js.native
  var TabLeader: WdTabLeader = js.native
  @JSName("Word.TableOfAuthorities_typekey")
  var WordDotTableOfAuthorities_typekey: TableOfAuthorities = js.native
  def Delete(): Unit = js.native
  def Update(): Unit = js.native
}

object TableOfAuthorities {
  @scala.inline
  def apply(
    Application: Application,
    Bookmark: String,
    Category: Double,
    Creator: Double,
    Delete: () => Unit,
    EntrySeparator: String,
    IncludeCategoryHeader: Boolean,
    IncludeSequenceName: String,
    KeepEntryFormatting: Boolean,
    PageNumberSeparator: String,
    PageRangeSeparator: String,
    Parent: js.Any,
    Passim: Boolean,
    Range: Range,
    Separator: String,
    TabLeader: WdTabLeader,
    Update: () => Unit,
    WordDotTableOfAuthorities_typekey: TableOfAuthorities
  ): TableOfAuthorities = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Bookmark = Bookmark.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), EntrySeparator = EntrySeparator.asInstanceOf[js.Any], IncludeCategoryHeader = IncludeCategoryHeader.asInstanceOf[js.Any], IncludeSequenceName = IncludeSequenceName.asInstanceOf[js.Any], KeepEntryFormatting = KeepEntryFormatting.asInstanceOf[js.Any], PageNumberSeparator = PageNumberSeparator.asInstanceOf[js.Any], PageRangeSeparator = PageRangeSeparator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Passim = Passim.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], TabLeader = TabLeader.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("Word.TableOfAuthorities_typekey")(WordDotTableOfAuthorities_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOfAuthorities]
  }
  @scala.inline
  implicit class TableOfAuthoritiesOps[Self <: TableOfAuthorities] (val x: Self) extends AnyVal {
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
    def withBookmark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bookmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(value.asInstanceOf[js.Any])
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
    def withEntrySeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntrySeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeCategoryHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeCategoryHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeSequenceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeSequenceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepEntryFormatting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeepEntryFormatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageNumberSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageNumberSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageRangeSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageRangeSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Passim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabLeader(value: WdTabLeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabLeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWordDotTableOfAuthorities_typekey(value: TableOfAuthorities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.TableOfAuthorities_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

