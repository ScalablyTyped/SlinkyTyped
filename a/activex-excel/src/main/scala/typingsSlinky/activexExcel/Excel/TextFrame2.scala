package typingsSlinky.activexExcel.Excel

import typingsSlinky.activexOffice.Office.MsoAutoSize
import typingsSlinky.activexOffice.Office.MsoHorizontalAnchor
import typingsSlinky.activexOffice.Office.MsoPathFormat
import typingsSlinky.activexOffice.Office.MsoPresetTextEffect
import typingsSlinky.activexOffice.Office.MsoTextOrientation
import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexOffice.Office.MsoVerticalAnchor
import typingsSlinky.activexOffice.Office.MsoWarpFormat
import typingsSlinky.activexOffice.Office.Ruler2
import typingsSlinky.activexOffice.Office.TextColumn2
import typingsSlinky.activexOffice.Office.TextRange2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextFrame2 extends js.Object {
  val Application: js.Any = js.native
  var AutoSize: MsoAutoSize = js.native
  val Column: TextColumn2 = js.native
  val Creator: Double = js.native
  @JSName("Excel.TextFrame2_typekey")
  var ExcelDotTextFrame2_typekey: TextFrame2 = js.native
  val HasText: MsoTriState = js.native
  var HorizontalAnchor: MsoHorizontalAnchor = js.native
  var MarginBottom: Double = js.native
  var MarginLeft: Double = js.native
  var MarginRight: Double = js.native
  var MarginTop: Double = js.native
  var NoTextRotation: MsoTriState = js.native
  var Orientation: MsoTextOrientation = js.native
  val Parent: js.Any = js.native
  var PathFormat: MsoPathFormat = js.native
  val Ruler: Ruler2 = js.native
  val TextRange: TextRange2 = js.native
  val ThreeD: ThreeDFormat = js.native
  var VerticalAnchor: MsoVerticalAnchor = js.native
  var WarpFormat: MsoWarpFormat = js.native
  var WordArtformat: MsoPresetTextEffect = js.native
  var WordWrap: MsoTriState = js.native
  def DeleteText(): Unit = js.native
}

object TextFrame2 {
  @scala.inline
  def apply(
    Application: js.Any,
    AutoSize: MsoAutoSize,
    Column: TextColumn2,
    Creator: Double,
    DeleteText: () => Unit,
    ExcelDotTextFrame2_typekey: TextFrame2,
    HasText: MsoTriState,
    HorizontalAnchor: MsoHorizontalAnchor,
    MarginBottom: Double,
    MarginLeft: Double,
    MarginRight: Double,
    MarginTop: Double,
    NoTextRotation: MsoTriState,
    Orientation: MsoTextOrientation,
    Parent: js.Any,
    PathFormat: MsoPathFormat,
    Ruler: Ruler2,
    TextRange: TextRange2,
    ThreeD: ThreeDFormat,
    VerticalAnchor: MsoVerticalAnchor,
    WarpFormat: MsoWarpFormat,
    WordArtformat: MsoPresetTextEffect,
    WordWrap: MsoTriState
  ): TextFrame2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], Column = Column.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DeleteText = js.Any.fromFunction0(DeleteText), HasText = HasText.asInstanceOf[js.Any], HorizontalAnchor = HorizontalAnchor.asInstanceOf[js.Any], MarginBottom = MarginBottom.asInstanceOf[js.Any], MarginLeft = MarginLeft.asInstanceOf[js.Any], MarginRight = MarginRight.asInstanceOf[js.Any], MarginTop = MarginTop.asInstanceOf[js.Any], NoTextRotation = NoTextRotation.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PathFormat = PathFormat.asInstanceOf[js.Any], Ruler = Ruler.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], ThreeD = ThreeD.asInstanceOf[js.Any], VerticalAnchor = VerticalAnchor.asInstanceOf[js.Any], WarpFormat = WarpFormat.asInstanceOf[js.Any], WordArtformat = WordArtformat.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.TextFrame2_typekey")(ExcelDotTextFrame2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrame2]
  }
  @scala.inline
  implicit class TextFrame2Ops[Self <: TextFrame2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoSize(value: MsoAutoSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: TextColumn2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteText(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExcelDotTextFrame2_typekey(value: TextFrame2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.TextFrame2_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasText(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalAnchor(value: MsoHorizontalAnchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HorizontalAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MarginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoTextRotation(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoTextRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: MsoTextOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathFormat(value: MsoPathFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuler(value: Ruler2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ruler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextRange(value: TextRange2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreeD(value: ThreeDFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreeD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalAnchor(value: MsoVerticalAnchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerticalAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarpFormat(value: MsoWarpFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WarpFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordArtformat(value: MsoPresetTextEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordArtformat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordWrap(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

