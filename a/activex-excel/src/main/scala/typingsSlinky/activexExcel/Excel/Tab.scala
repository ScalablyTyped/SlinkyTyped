package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tab extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  var Color: XlRgbColor | Double = js.native
  var ColorIndex: XlColorIndex = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Tab_typekey")
  var ExcelDotTab_typekey: Tab = js.native
  val Parent: js.Any = js.native
  var ThemeColor: XlThemeColor = js.native
  var TintAndShade: Double = js.native
}

object Tab {
  @scala.inline
  def apply(
    Application: Application,
    Color: XlRgbColor | Double,
    ColorIndex: XlColorIndex,
    Creator: XlCreator,
    ExcelDotTab_typekey: Tab,
    Parent: js.Any,
    ThemeColor: XlThemeColor,
    TintAndShade: Double
  ): Tab = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ThemeColor = ThemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Tab_typekey")(ExcelDotTab_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
  @scala.inline
  implicit class TabOps[Self <: Tab] (val x: Self) extends AnyVal {
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
    def withColor(value: XlRgbColor | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorIndex(value: XlColorIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotTab_typekey(value: Tab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.Tab_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThemeColor(value: XlThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThemeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTintAndShade(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TintAndShade")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

