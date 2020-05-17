package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartColorFormat extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("Office.ChartColorFormat_typekey")
  var OfficeDotChartColorFormat_typekey: ChartColorFormat = js.native
  val Parent: js.Any = js.native
  var RGB: Double = js.native
  var SchemeColor: Double = js.native
  val Type: Double = js.native
  val _Default: Double = js.native
}

object ChartColorFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    OfficeDotChartColorFormat_typekey: ChartColorFormat,
    Parent: js.Any,
    RGB: Double,
    SchemeColor: Double,
    Type: Double,
    _Default: Double
  ): ChartColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ChartColorFormat_typekey")(OfficeDotChartColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartColorFormat]
  }
  @scala.inline
  implicit class ChartColorFormatOps[Self <: ChartColorFormat] (val x: Self) extends AnyVal {
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
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotChartColorFormat_typekey(value: ChartColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.ChartColorFormat_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRGB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RGB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemeColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SchemeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_Default(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Default")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

