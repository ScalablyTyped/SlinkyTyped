package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageSetup extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var BookFoldPrinting: Boolean = js.native
  var BookFoldPrintingSheets: Double = js.native
  var BookFoldRevPrinting: Boolean = js.native
  var BottomMargin: Double = js.native
  var CharsLine: Double = js.native
  val Creator: Double = js.native
  var DifferentFirstPageHeaderFooter: Double = js.native
  var FirstPageTray: WdPaperTray = js.native
  var FooterDistance: Double = js.native
  var Gutter: Double = js.native
  var GutterOnTop: Boolean = js.native
  var GutterPos: WdGutterStyle = js.native
  var GutterStyle: WdGutterStyleOld = js.native
  var HeaderDistance: Double = js.native
  var LayoutMode: WdLayoutMode = js.native
  var LeftMargin: Double = js.native
  var LineNumbering: typingsSlinky.activexWord.Word.LineNumbering = js.native
  var LinesPage: Double = js.native
  var MirrorMargins: Double = js.native
  var OddAndEvenPagesHeaderFooter: Double = js.native
  var Orientation: WdOrientation = js.native
  var OtherPagesTray: WdPaperTray = js.native
  var PageHeight: Double = js.native
  var PageWidth: Double = js.native
  var PaperSize: WdPaperSize = js.native
  val Parent: js.Any = js.native
  var RightMargin: Double = js.native
  var SectionDirection: WdSectionDirection = js.native
  var SectionStart: WdSectionStart = js.native
  var ShowGrid: Boolean = js.native
  var SuppressEndnotes: Double = js.native
  var TextColumns: typingsSlinky.activexWord.Word.TextColumns = js.native
  var TopMargin: Double = js.native
  var TwoPagesOnOne: Boolean = js.native
  var VerticalAlignment: WdVerticalAlignment = js.native
  @JSName("Word.PageSetup_typekey")
  var WordDotPageSetup_typekey: PageSetup = js.native
  def SetAsTemplateDefault(): Unit = js.native
  def TogglePortrait(): Unit = js.native
}

object PageSetup {
  @scala.inline
  def apply(
    Application: Application,
    BookFoldPrinting: Boolean,
    BookFoldPrintingSheets: Double,
    BookFoldRevPrinting: Boolean,
    BottomMargin: Double,
    CharsLine: Double,
    Creator: Double,
    DifferentFirstPageHeaderFooter: Double,
    FirstPageTray: WdPaperTray,
    FooterDistance: Double,
    Gutter: Double,
    GutterOnTop: Boolean,
    GutterPos: WdGutterStyle,
    GutterStyle: WdGutterStyleOld,
    HeaderDistance: Double,
    LayoutMode: WdLayoutMode,
    LeftMargin: Double,
    LineNumbering: LineNumbering,
    LinesPage: Double,
    MirrorMargins: Double,
    OddAndEvenPagesHeaderFooter: Double,
    Orientation: WdOrientation,
    OtherPagesTray: WdPaperTray,
    PageHeight: Double,
    PageWidth: Double,
    PaperSize: WdPaperSize,
    Parent: js.Any,
    RightMargin: Double,
    SectionDirection: WdSectionDirection,
    SectionStart: WdSectionStart,
    SetAsTemplateDefault: () => Unit,
    ShowGrid: Boolean,
    SuppressEndnotes: Double,
    TextColumns: TextColumns,
    TogglePortrait: () => Unit,
    TopMargin: Double,
    TwoPagesOnOne: Boolean,
    VerticalAlignment: WdVerticalAlignment,
    WordDotPageSetup_typekey: PageSetup
  ): PageSetup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BookFoldPrinting = BookFoldPrinting.asInstanceOf[js.Any], BookFoldPrintingSheets = BookFoldPrintingSheets.asInstanceOf[js.Any], BookFoldRevPrinting = BookFoldRevPrinting.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], CharsLine = CharsLine.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DifferentFirstPageHeaderFooter = DifferentFirstPageHeaderFooter.asInstanceOf[js.Any], FirstPageTray = FirstPageTray.asInstanceOf[js.Any], FooterDistance = FooterDistance.asInstanceOf[js.Any], Gutter = Gutter.asInstanceOf[js.Any], GutterOnTop = GutterOnTop.asInstanceOf[js.Any], GutterPos = GutterPos.asInstanceOf[js.Any], GutterStyle = GutterStyle.asInstanceOf[js.Any], HeaderDistance = HeaderDistance.asInstanceOf[js.Any], LayoutMode = LayoutMode.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], LineNumbering = LineNumbering.asInstanceOf[js.Any], LinesPage = LinesPage.asInstanceOf[js.Any], MirrorMargins = MirrorMargins.asInstanceOf[js.Any], OddAndEvenPagesHeaderFooter = OddAndEvenPagesHeaderFooter.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], OtherPagesTray = OtherPagesTray.asInstanceOf[js.Any], PageHeight = PageHeight.asInstanceOf[js.Any], PageWidth = PageWidth.asInstanceOf[js.Any], PaperSize = PaperSize.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], SectionDirection = SectionDirection.asInstanceOf[js.Any], SectionStart = SectionStart.asInstanceOf[js.Any], SetAsTemplateDefault = js.Any.fromFunction0(SetAsTemplateDefault), ShowGrid = ShowGrid.asInstanceOf[js.Any], SuppressEndnotes = SuppressEndnotes.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], TogglePortrait = js.Any.fromFunction0(TogglePortrait), TopMargin = TopMargin.asInstanceOf[js.Any], TwoPagesOnOne = TwoPagesOnOne.asInstanceOf[js.Any], VerticalAlignment = VerticalAlignment.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.PageSetup_typekey")(WordDotPageSetup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSetup]
  }
  @scala.inline
  implicit class PageSetupOps[Self <: PageSetup] (val x: Self) extends AnyVal {
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
    def withBookFoldPrinting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BookFoldPrinting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBookFoldPrintingSheets(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BookFoldPrintingSheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBookFoldRevPrinting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BookFoldRevPrinting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharsLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CharsLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDifferentFirstPageHeaderFooter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DifferentFirstPageHeaderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstPageTray(value: WdPaperTray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstPageTray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FooterDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGutter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Gutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGutterOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GutterOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGutterPos(value: WdGutterStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GutterPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGutterStyle(value: WdGutterStyleOld): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GutterStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeaderDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutMode(value: WdLayoutMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayoutMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LeftMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineNumbering(value: LineNumbering): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineNumbering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinesPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinesPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMirrorMargins(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MirrorMargins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOddAndEvenPagesHeaderFooter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OddAndEvenPagesHeaderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: WdOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOtherPagesTray(value: WdPaperTray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OtherPagesTray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaperSize(value: WdPaperSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaperSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RightMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectionDirection(value: WdSectionDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SectionDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectionStart(value: WdSectionStart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SectionStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAsTemplateDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetAsTemplateDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuppressEndnotes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuppressEndnotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextColumns(value: TextColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTogglePortrait(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TogglePortrait")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTopMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwoPagesOnOne(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TwoPagesOnOne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: WdVerticalAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotPageSetup_typekey(value: PageSetup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.PageSetup_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

