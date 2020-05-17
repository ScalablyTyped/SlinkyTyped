package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoHorizontalAnchor
import typingsSlinky.activexOffice.Office.MsoTextOrientation
import typingsSlinky.activexOffice.Office.MsoTriState
import typingsSlinky.activexOffice.Office.MsoVerticalAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextFrame extends js.Object {
  val Application: js.Any = js.native
  var AutoSize: PpAutoSize = js.native
  val Creator: Double = js.native
  val HasText: MsoTriState = js.native
  var HorizontalAnchor: MsoHorizontalAnchor = js.native
  var MarginBottom: Double = js.native
  var MarginLeft: Double = js.native
  var MarginRight: Double = js.native
  var MarginTop: Double = js.native
  var Orientation: MsoTextOrientation = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.TextFrame_typekey")
  var PowerPointDotTextFrame_typekey: TextFrame = js.native
  val Ruler: typingsSlinky.activexPowerpoint.PowerPoint.Ruler = js.native
  val TextRange: typingsSlinky.activexPowerpoint.PowerPoint.TextRange = js.native
  var VerticalAnchor: MsoVerticalAnchor = js.native
  var WordWrap: MsoTriState = js.native
  def DeleteText(): Unit = js.native
}

object TextFrame {
  @scala.inline
  def apply(
    Application: js.Any,
    AutoSize: PpAutoSize,
    Creator: Double,
    DeleteText: () => Unit,
    HasText: MsoTriState,
    HorizontalAnchor: MsoHorizontalAnchor,
    MarginBottom: Double,
    MarginLeft: Double,
    MarginRight: Double,
    MarginTop: Double,
    Orientation: MsoTextOrientation,
    Parent: js.Any,
    PowerPointDotTextFrame_typekey: TextFrame,
    Ruler: Ruler,
    TextRange: TextRange,
    VerticalAnchor: MsoVerticalAnchor,
    WordWrap: MsoTriState
  ): TextFrame = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DeleteText = js.Any.fromFunction0(DeleteText), HasText = HasText.asInstanceOf[js.Any], HorizontalAnchor = HorizontalAnchor.asInstanceOf[js.Any], MarginBottom = MarginBottom.asInstanceOf[js.Any], MarginLeft = MarginLeft.asInstanceOf[js.Any], MarginRight = MarginRight.asInstanceOf[js.Any], MarginTop = MarginTop.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Ruler = Ruler.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], VerticalAnchor = VerticalAnchor.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TextFrame_typekey")(PowerPointDotTextFrame_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrame]
  }
  @scala.inline
  implicit class TextFrameOps[Self <: TextFrame] (val x: Self) extends AnyVal {
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
    def withAutoSize(value: PpAutoSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoSize")(value.asInstanceOf[js.Any])
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
    def withPowerPointDotTextFrame_typekey(value: TextFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.TextFrame_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuler(value: Ruler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ruler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextRange(value: TextRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalAnchor(value: MsoVerticalAnchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerticalAnchor")(value.asInstanceOf[js.Any])
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

