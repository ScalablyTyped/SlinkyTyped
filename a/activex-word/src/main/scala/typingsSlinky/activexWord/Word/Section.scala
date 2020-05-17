package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Section extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Borders: typingsSlinky.activexWord.Word.Borders = js.native
  val Creator: Double = js.native
  val Footers: HeadersFooters = js.native
  val Headers: HeadersFooters = js.native
  val Index: Double = js.native
  var PageSetup: typingsSlinky.activexWord.Word.PageSetup = js.native
  val Parent: js.Any = js.native
  var ProtectedForForms: Boolean = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  @JSName("Word.Section_typekey")
  var WordDotSection_typekey: Section = js.native
}

object Section {
  @scala.inline
  def apply(
    Application: Application,
    Borders: Borders,
    Creator: Double,
    Footers: HeadersFooters,
    Headers: HeadersFooters,
    Index: Double,
    PageSetup: PageSetup,
    Parent: js.Any,
    ProtectedForForms: Boolean,
    Range: Range,
    WordDotSection_typekey: Section
  ): Section = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Footers = Footers.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], PageSetup = PageSetup.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ProtectedForForms = ProtectedForForms.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Section_typekey")(WordDotSection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
  @scala.inline
  implicit class SectionOps[Self <: Section] (val x: Self) extends AnyVal {
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
    def withBorders(value: Borders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Borders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooters(value: HeadersFooters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Footers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: HeadersFooters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageSetup(value: PageSetup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSetup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtectedForForms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProtectedForForms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotSection_typekey(value: Section): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Section_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

