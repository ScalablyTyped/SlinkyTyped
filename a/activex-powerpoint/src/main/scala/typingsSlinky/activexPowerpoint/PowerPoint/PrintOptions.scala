package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintOptions extends js.Object {
  var ActivePrinter: String = js.native
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var Collate: MsoTriState = js.native
  var FitToPage: MsoTriState = js.native
  var FrameSlides: MsoTriState = js.native
  var HandoutOrder: PpPrintHandoutOrder = js.native
  var HighQuality: MsoTriState = js.native
  var NumberOfCopies: Double = js.native
  var OutputType: PpPrintOutputType = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.PrintOptions_typekey")
  var PowerPointDotPrintOptions_typekey: PrintOptions = js.native
  var PrintColorType: PpPrintColorType = js.native
  var PrintComments: MsoTriState = js.native
  var PrintFontsAsGraphics: MsoTriState = js.native
  var PrintHiddenSlides: MsoTriState = js.native
  var PrintInBackground: MsoTriState = js.native
  var RangeType: PpPrintRangeType = js.native
  val Ranges: PrintRanges = js.native
  var SlideShowName: String = js.native
  var sectionIndex: Double = js.native
}

object PrintOptions {
  @scala.inline
  def apply(
    ActivePrinter: String,
    Application: Application,
    Collate: MsoTriState,
    FitToPage: MsoTriState,
    FrameSlides: MsoTriState,
    HandoutOrder: PpPrintHandoutOrder,
    HighQuality: MsoTriState,
    NumberOfCopies: Double,
    OutputType: PpPrintOutputType,
    Parent: js.Any,
    PowerPointDotPrintOptions_typekey: PrintOptions,
    PrintColorType: PpPrintColorType,
    PrintComments: MsoTriState,
    PrintFontsAsGraphics: MsoTriState,
    PrintHiddenSlides: MsoTriState,
    PrintInBackground: MsoTriState,
    RangeType: PpPrintRangeType,
    Ranges: PrintRanges,
    SlideShowName: String,
    sectionIndex: Double
  ): PrintOptions = {
    val __obj = js.Dynamic.literal(ActivePrinter = ActivePrinter.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Collate = Collate.asInstanceOf[js.Any], FitToPage = FitToPage.asInstanceOf[js.Any], FrameSlides = FrameSlides.asInstanceOf[js.Any], HandoutOrder = HandoutOrder.asInstanceOf[js.Any], HighQuality = HighQuality.asInstanceOf[js.Any], NumberOfCopies = NumberOfCopies.asInstanceOf[js.Any], OutputType = OutputType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PrintColorType = PrintColorType.asInstanceOf[js.Any], PrintComments = PrintComments.asInstanceOf[js.Any], PrintFontsAsGraphics = PrintFontsAsGraphics.asInstanceOf[js.Any], PrintHiddenSlides = PrintHiddenSlides.asInstanceOf[js.Any], PrintInBackground = PrintInBackground.asInstanceOf[js.Any], RangeType = RangeType.asInstanceOf[js.Any], Ranges = Ranges.asInstanceOf[js.Any], SlideShowName = SlideShowName.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PrintOptions_typekey")(PowerPointDotPrintOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintOptions]
  }
  @scala.inline
  implicit class PrintOptionsOps[Self <: PrintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivePrinter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivePrinter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollate(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Collate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFitToPage(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FitToPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameSlides(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameSlides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandoutOrder(value: PpPrintHandoutOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HandoutOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighQuality(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HighQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfCopies(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfCopies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputType(value: PpPrintOutputType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotPrintOptions_typekey(value: PrintOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.PrintOptions_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintColorType(value: PpPrintColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintColorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintComments(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintFontsAsGraphics(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintFontsAsGraphics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintHiddenSlides(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintHiddenSlides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintInBackground(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrintInBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeType(value: PpPrintRangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRanges(value: PrintRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideShowName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlideShowName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

