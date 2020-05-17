package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMsoChartArea extends js.Object {
  val Application: js.Any = js.native
  var AutoScaleFont: js.Any = js.native
  val Border: IMsoBorder = js.native
  val Creator: Double = js.native
  val Fill: ChartFillFormat = js.native
  val Font: ChartFont = js.native
  val Format: IMsoChartFormat = js.native
  var Height: Double = js.native
  val Interior: IMsoInterior = js.native
  var Left: Double = js.native
  val Name: String = js.native
  @JSName("Office.IMsoChartArea_typekey")
  var OfficeDotIMsoChartArea_typekey: IMsoChartArea = js.native
  val Parent: js.Any = js.native
  var RoundedCorners: Boolean = js.native
  var Shadow: Boolean = js.native
  var Top: Double = js.native
  var Width: Double = js.native
  def Clear(): js.Any = js.native
  def ClearContents(): js.Any = js.native
  def ClearFormats(): js.Any = js.native
  def Copy(): js.Any = js.native
  def Select(): js.Any = js.native
}

object IMsoChartArea {
  @scala.inline
  def apply(
    Application: js.Any,
    AutoScaleFont: js.Any,
    Border: IMsoBorder,
    Clear: () => js.Any,
    ClearContents: () => js.Any,
    ClearFormats: () => js.Any,
    Copy: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Font: ChartFont,
    Format: IMsoChartFormat,
    Height: Double,
    Interior: IMsoInterior,
    Left: Double,
    Name: String,
    OfficeDotIMsoChartArea_typekey: IMsoChartArea,
    Parent: js.Any,
    RoundedCorners: Boolean,
    Select: () => js.Any,
    Shadow: Boolean,
    Top: Double,
    Width: Double
  ): IMsoChartArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), ClearContents = js.Any.fromFunction0(ClearContents), ClearFormats = js.Any.fromFunction0(ClearFormats), Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RoundedCorners = RoundedCorners.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shadow = Shadow.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoChartArea_typekey")(OfficeDotIMsoChartArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoChartArea]
  }
  @scala.inline
  implicit class IMsoChartAreaOps[Self <: IMsoChartArea] (val x: Self) extends AnyVal {
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
    def withAutoScaleFont(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScaleFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorder(value: IMsoBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearContents(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearContents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearFormats(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearFormats")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCopy(value: () => js.Any): Self = {
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
    def withFill(value: ChartFillFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: ChartFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: IMsoChartFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterior(value: IMsoInterior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotIMsoChartArea_typekey(value: IMsoChartArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.IMsoChartArea_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoundedCorners(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoundedCorners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shadow")(value.asInstanceOf[js.Any])
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
  }
  
}

