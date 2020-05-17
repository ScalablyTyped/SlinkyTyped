package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeColor extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("Office.ThemeColor_typekey")
  var OfficeDotThemeColor_typekey: ThemeColor = js.native
  val Parent: js.Any = js.native
  var RGB: Double = js.native
  val ThemeColorSchemeIndex: MsoThemeColorSchemeIndex = js.native
}

object ThemeColor {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    OfficeDotThemeColor_typekey: ThemeColor,
    Parent: js.Any,
    RGB: Double,
    ThemeColorSchemeIndex: MsoThemeColorSchemeIndex
  ): ThemeColor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], ThemeColorSchemeIndex = ThemeColorSchemeIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ThemeColor_typekey")(OfficeDotThemeColor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeColor]
  }
  @scala.inline
  implicit class ThemeColorOps[Self <: ThemeColor] (val x: Self) extends AnyVal {
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
    def withOfficeDotThemeColor_typekey(value: ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.ThemeColor_typekey")(value.asInstanceOf[js.Any])
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
    def withThemeColorSchemeIndex(value: MsoThemeColorSchemeIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThemeColorSchemeIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

