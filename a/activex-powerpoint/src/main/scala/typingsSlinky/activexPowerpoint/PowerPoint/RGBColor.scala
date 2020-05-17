package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoRGBType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RGBColor extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.RGBColor_typekey")
  var PowerPointDotRGBColor_typekey: RGBColor = js.native
  var RGB: MsoRGBType = js.native
}

object RGBColor {
  @scala.inline
  def apply(Application: Application, Parent: js.Any, PowerPointDotRGBColor_typekey: RGBColor, RGB: MsoRGBType): RGBColor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.RGBColor_typekey")(PowerPointDotRGBColor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBColor]
  }
  @scala.inline
  implicit class RGBColorOps[Self <: RGBColor] (val x: Self) extends AnyVal {
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
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotRGBColor_typekey(value: RGBColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.RGBColor_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRGB(value: MsoRGBType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RGB")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

