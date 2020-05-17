package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoArrowheadLength
import typingsSlinky.activexOffice.Office.MsoArrowheadStyle
import typingsSlinky.activexOffice.Office.MsoArrowheadWidth
import typingsSlinky.activexOffice.Office.MsoLineDashStyle
import typingsSlinky.activexOffice.Office.MsoLineStyle
import typingsSlinky.activexOffice.Office.MsoPatternType
import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineFormat extends js.Object {
  val Application: js.Any = js.native
  var BackColor: ColorFormat = js.native
  var BeginArrowheadLength: MsoArrowheadLength = js.native
  var BeginArrowheadStyle: MsoArrowheadStyle = js.native
  var BeginArrowheadWidth: MsoArrowheadWidth = js.native
  val Creator: Double = js.native
  var DashStyle: MsoLineDashStyle = js.native
  var EndArrowheadLength: MsoArrowheadLength = js.native
  var EndArrowheadStyle: MsoArrowheadStyle = js.native
  var EndArrowheadWidth: MsoArrowheadWidth = js.native
  var ForeColor: ColorFormat = js.native
  var InsetPen: MsoTriState = js.native
  val Parent: js.Any = js.native
  var Pattern: MsoPatternType = js.native
  @JSName("PowerPoint.LineFormat_typekey")
  var PowerPointDotLineFormat_typekey: LineFormat = js.native
  var Style: MsoLineStyle = js.native
  var Transparency: Double = js.native
  var Visible: MsoTriState = js.native
  var Weight: Double = js.native
}

object LineFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    BackColor: ColorFormat,
    BeginArrowheadLength: MsoArrowheadLength,
    BeginArrowheadStyle: MsoArrowheadStyle,
    BeginArrowheadWidth: MsoArrowheadWidth,
    Creator: Double,
    DashStyle: MsoLineDashStyle,
    EndArrowheadLength: MsoArrowheadLength,
    EndArrowheadStyle: MsoArrowheadStyle,
    EndArrowheadWidth: MsoArrowheadWidth,
    ForeColor: ColorFormat,
    InsetPen: MsoTriState,
    Parent: js.Any,
    Pattern: MsoPatternType,
    PowerPointDotLineFormat_typekey: LineFormat,
    Style: MsoLineStyle,
    Transparency: Double,
    Visible: MsoTriState,
    Weight: Double
  ): LineFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BeginArrowheadLength = BeginArrowheadLength.asInstanceOf[js.Any], BeginArrowheadStyle = BeginArrowheadStyle.asInstanceOf[js.Any], BeginArrowheadWidth = BeginArrowheadWidth.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DashStyle = DashStyle.asInstanceOf[js.Any], EndArrowheadLength = EndArrowheadLength.asInstanceOf[js.Any], EndArrowheadStyle = EndArrowheadStyle.asInstanceOf[js.Any], EndArrowheadWidth = EndArrowheadWidth.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], InsetPen = InsetPen.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.LineFormat_typekey")(PowerPointDotLineFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineFormat]
  }
  @scala.inline
  implicit class LineFormatOps[Self <: LineFormat] (val x: Self) extends AnyVal {
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
    def withBackColor(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeginArrowheadLength(value: MsoArrowheadLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginArrowheadLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeginArrowheadStyle(value: MsoArrowheadStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginArrowheadStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeginArrowheadWidth(value: MsoArrowheadWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginArrowheadWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDashStyle(value: MsoLineDashStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndArrowheadLength(value: MsoArrowheadLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndArrowheadLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndArrowheadStyle(value: MsoArrowheadStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndArrowheadStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndArrowheadWidth(value: MsoArrowheadWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndArrowheadWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForeColor(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsetPen(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsetPen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: MsoPatternType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotLineFormat_typekey(value: LineFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.LineFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: MsoLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransparency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Weight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

