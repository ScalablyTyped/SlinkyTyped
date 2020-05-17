package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderFooter extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var Exists: Boolean = js.native
  val Index: WdHeaderFooterIndex = js.native
  val IsHeader: Boolean = js.native
  var LinkToPrevious: Boolean = js.native
  val PageNumbers: typingsSlinky.activexWord.Word.PageNumbers = js.native
  val Parent: js.Any = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  val Shapes: typingsSlinky.activexWord.Word.Shapes = js.native
  @JSName("Word.HeaderFooter_typekey")
  var WordDotHeaderFooter_typekey: HeaderFooter = js.native
}

object HeaderFooter {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Exists: Boolean,
    Index: WdHeaderFooterIndex,
    IsHeader: Boolean,
    LinkToPrevious: Boolean,
    PageNumbers: PageNumbers,
    Parent: js.Any,
    Range: Range,
    Shapes: Shapes,
    WordDotHeaderFooter_typekey: HeaderFooter
  ): HeaderFooter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Exists = Exists.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], IsHeader = IsHeader.asInstanceOf[js.Any], LinkToPrevious = LinkToPrevious.asInstanceOf[js.Any], PageNumbers = PageNumbers.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Shapes = Shapes.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HeaderFooter_typekey")(WordDotHeaderFooter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
  @scala.inline
  implicit class HeaderFooterOps[Self <: HeaderFooter] (val x: Self) extends AnyVal {
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
    def withExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Exists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: WdHeaderFooterIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkToPrevious(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkToPrevious")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageNumbers(value: PageNumbers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageNumbers")(value.asInstanceOf[js.Any])
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
    def withShapes(value: Shapes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotHeaderFooter_typekey(value: HeaderFooter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.HeaderFooter_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

