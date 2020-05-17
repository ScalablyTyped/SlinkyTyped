package typingsSlinky.activexLibreoffice.com_.sun.star.rendering

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARGBColor extends js.Object {
  /**
    * Alpha component.
    *
    * Valid range is [0,1.0], with 0.0 denoting fully transparent, and 1.0 fully opaque.
    */
  var Alpha: ColorComponent = js.native
  var Blue: ColorComponent = js.native
  var Green: ColorComponent = js.native
  var Red: ColorComponent = js.native
}

object ARGBColor {
  @scala.inline
  def apply(Alpha: ColorComponent, Blue: ColorComponent, Green: ColorComponent, Red: ColorComponent): ARGBColor = {
    val __obj = js.Dynamic.literal(Alpha = Alpha.asInstanceOf[js.Any], Blue = Blue.asInstanceOf[js.Any], Green = Green.asInstanceOf[js.Any], Red = Red.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARGBColor]
  }
  @scala.inline
  implicit class ARGBColorOps[Self <: ARGBColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: ColorComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alpha")(value.asInstanceOf[js.Any])
        ret
    }
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

