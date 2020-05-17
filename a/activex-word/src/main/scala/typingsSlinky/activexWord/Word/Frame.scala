package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  var Borders: typingsSlinky.activexWord.Word.Borders = js.native
  val Creator: Double = js.native
  var Height: Double = js.native
  var HeightRule: WdFrameSizeRule = js.native
  var HorizontalDistanceFromText: Double = js.native
  var HorizontalPosition: Double = js.native
  var LockAnchor: Boolean = js.native
  val Parent: js.Any = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  var RelativeHorizontalPosition: WdRelativeHorizontalPosition = js.native
  var RelativeVerticalPosition: WdRelativeVerticalPosition = js.native
  val Shading: typingsSlinky.activexWord.Word.Shading = js.native
  var TextWrap: Boolean = js.native
  var VerticalDistanceFromText: Double = js.native
  var VerticalPosition: Double = js.native
  var Width: Double = js.native
  var WidthRule: WdFrameSizeRule = js.native
  @JSName("Word.Frame_typekey")
  var WordDotFrame_typekey: Frame = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

object Frame {
  @scala.inline
  def apply(
    Application: Application,
    Borders: Borders,
    Copy: () => Unit,
    Creator: Double,
    Cut: () => Unit,
    Delete: () => Unit,
    Height: Double,
    HeightRule: WdFrameSizeRule,
    HorizontalDistanceFromText: Double,
    HorizontalPosition: Double,
    LockAnchor: Boolean,
    Parent: js.Any,
    Range: Range,
    RelativeHorizontalPosition: WdRelativeHorizontalPosition,
    RelativeVerticalPosition: WdRelativeVerticalPosition,
    Select: () => Unit,
    Shading: Shading,
    TextWrap: Boolean,
    VerticalDistanceFromText: Double,
    VerticalPosition: Double,
    Width: Double,
    WidthRule: WdFrameSizeRule,
    WordDotFrame_typekey: Frame
  ): Frame = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), Height = Height.asInstanceOf[js.Any], HeightRule = HeightRule.asInstanceOf[js.Any], HorizontalDistanceFromText = HorizontalDistanceFromText.asInstanceOf[js.Any], HorizontalPosition = HorizontalPosition.asInstanceOf[js.Any], LockAnchor = LockAnchor.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], RelativeHorizontalPosition = RelativeHorizontalPosition.asInstanceOf[js.Any], RelativeVerticalPosition = RelativeVerticalPosition.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shading = Shading.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], VerticalDistanceFromText = VerticalDistanceFromText.asInstanceOf[js.Any], VerticalPosition = VerticalPosition.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WidthRule = WidthRule.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Frame_typekey")(WordDotFrame_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
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
    def withCopy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightRule(value: WdFrameSizeRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeightRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalDistanceFromText(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HorizontalDistanceFromText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HorizontalPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLockAnchor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LockAnchor")(value.asInstanceOf[js.Any])
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
    def withRelativeHorizontalPosition(value: WdRelativeHorizontalPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeHorizontalPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeVerticalPosition(value: WdRelativeVerticalPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelativeVerticalPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShading(value: Shading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalDistanceFromText(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerticalDistanceFromText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerticalPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidthRule(value: WdFrameSizeRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WidthRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotFrame_typekey(value: Frame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Frame_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

