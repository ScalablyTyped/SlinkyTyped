package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RGBColor extends js.Object {
  var Blue: ColorComponent = js.native
  var Green: ColorComponent = js.native
  var Red: ColorComponent = js.native
}

object RGBColor {
  @scala.inline
  def apply(Blue: ColorComponent, Green: ColorComponent, Red: ColorComponent): RGBColor = {
    val __obj = js.Dynamic.literal(Blue = Blue.asInstanceOf[js.Any], Green = Green.asInstanceOf[js.Any], Red = Red.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBColor]
  }
  @scala.inline
  implicit class RGBColorOps[Self <: RGBColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlue(value: ColorComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreen(value: ColorComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRed(value: ColorComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Red")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

