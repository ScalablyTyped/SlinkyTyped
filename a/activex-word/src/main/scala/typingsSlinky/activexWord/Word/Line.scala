package typingsSlinky.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Line extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Height: Double = js.native
  val Left: Double = js.native
  val LineType: WdLineType = js.native
  val Parent: js.Any = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  val Rectangles: typingsSlinky.activexWord.Word.Rectangles = js.native
  val Top: Double = js.native
  val Width: Double = js.native
  @JSName("Word.Line_typekey")
  var WordDotLine_typekey: Line = js.native
}

object Line {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Height: Double,
    Left: Double,
    LineType: WdLineType,
    Parent: js.Any,
    Range: Range,
    Rectangles: Rectangles,
    Top: Double,
    Width: Double,
    WordDotLine_typekey: Line
  ): Line = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], LineType = LineType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Rectangles = Rectangles.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Line_typekey")(WordDotLine_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  @scala.inline
  implicit class LineOps[Self <: Line] (val x: Self) extends AnyVal {
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
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineType(value: WdLineType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineType")(value.asInstanceOf[js.Any])
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
    def withRectangles(value: Rectangles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rectangles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordDotLine_typekey(value: Line): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word.Line_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

