package typingsSlinky.activexWord.Word

import typingsSlinky.activexOffice.Office.MsoHorizontalAnchor
import typingsSlinky.activexOffice.Office.MsoPathFormat
import typingsSlinky.activexOffice.Office.MsoTextOrientation
import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexOffice.Office.MsoVerticalAnchor
import typingsSlinky.activexOffice.Office.MsoWarpFormat
import typingsSlinky.activexOffice.Office.TextColumn2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextFrame extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var AutoSize: Double = js.native
  val Column: TextColumn2 = js.native
  val ContainingRange: Range = js.native
  val Creator: Double = js.native
  val HasText: Double = js.native
  var HorizontalAnchor: MsoHorizontalAnchor = js.native
  var MarginBottom: Double = js.native
  var MarginLeft: Double = js.native
  var MarginRight: Double = js.native
  var MarginTop: Double = js.native
  var Next: TextFrame = js.native
  var NoTextRotation: MsoTriState = js.native
  var Orientation: MsoTextOrientation = js.native
  val Overflowing: Boolean = js.native
  val Parent: Shape = js.native
  var PathFormat: MsoPathFormat = js.native
  var Previous: TextFrame = js.native
  val TextRange: Range = js.native
  val ThreeD: ThreeDFormat = js.native
  var VerticalAnchor: MsoVerticalAnchor = js.native
  var WarpFormat: MsoWarpFormat = js.native
  @JSName("Word.TextFrame_typekey")
  var WordDotTextFrame_typekey: TextFrame = js.native
  var WordWrap: Double = js.native
  def BreakForwardLink(): Unit = js.native
  def DeleteText(): Unit = js.native
  def ValidLinkTarget(TargetTextFrame: TextFrame): Boolean = js.native
}

object TextFrame {
  @scala.inline
  def apply(
    Application: Application,
    AutoSize: Double,
    BreakForwardLink: () => Unit,
    Column: TextColumn2,
    ContainingRange: Range,
    Creator: Double,
    DeleteText: () => Unit,
    HasText: Double,
    HorizontalAnchor: MsoHorizontalAnchor,
    MarginBottom: Double,
    MarginLeft: Double,
    MarginRight: Double,
    MarginTop: Double,
    Next: TextFrame,
    NoTextRotation: MsoTriState,
    Orientation: MsoTextOrientation,
    Overflowing: Boolean,
    Parent: Shape,
    PathFormat: MsoPathFormat,
    Previous: TextFrame,
    TextRange: Range,
    ThreeD: ThreeDFormat,
    ValidLinkTarget: TextFrame => Boolean,
    VerticalAnchor: MsoVerticalAnchor,
    WarpFormat: MsoWarpFormat,
    WordDotTextFrame_typekey: TextFrame,
    WordWrap: Double
  ): TextFrame = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], BreakForwardLink = js.Any.fromFunction0(BreakForwardLink), Column = Column.asInstanceOf[js.Any], ContainingRange = ContainingRange.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DeleteText = js.Any.fromFunction0(DeleteText), HasText = HasText.asInstanceOf[js.Any], HorizontalAnchor = HorizontalAnchor.asInstanceOf[js.Any], MarginBottom = MarginBottom.asInstanceOf[js.Any], MarginLeft = MarginLeft.asInstanceOf[js.Any], MarginRight = MarginRight.asInstanceOf[js.Any], MarginTop = MarginTop.asInstanceOf[js.Any], Next = Next.asInstanceOf[js.Any], NoTextRotation = NoTextRotation.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Overflowing = Overflowing.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PathFormat = PathFormat.asInstanceOf[js.Any], Previous = Previous.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], ThreeD = ThreeD.asInstanceOf[js.Any], ValidLinkTarget = js.Any.fromFunction1(ValidLinkTarget), VerticalAnchor = VerticalAnchor.asInstanceOf[js.Any], WarpFormat = WarpFormat.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TextFrame_typekey")(WordDotTextFrame_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrame]
  }
  @scala.inline
  implicit class TextFrameOps[Self <: TextFrame] (val x: Self) extends AnyVal {
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
    def withAutoSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreakForwardLink(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BreakForwardLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withColumn(value: TextColumn2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainingRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainingRange")(value.asInstanceOf[js.Any])
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
    def withHasText(value: Double): Self = {
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
    def withNext(value: TextFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Next")(value.asInstanceOf[js.Any])
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
    def withOverflowing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Overflowing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: Shape): Self = {
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
    def withPrevious(value: TextFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Previous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextRange(value: Range): Self = {
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
    def withValidLinkTarget(value: TextFrame => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidLinkTarget")(js.Any.fromFunction1(value))
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
    def withWordDotTextFrame_typekey(value: TextFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.TextFrame_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordWrap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordWrap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

