package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorGradient extends IValueGradient {
  /**
    * Gets or sets first associated color
    */
  var color1: Color4 = js.native
  /**
    * Gets or sets second associated color
    */
  var color2: js.UndefOr[Color4] = js.native
  /**
    * Will get a color picked randomly between color1 and color2.
    * If color2 is undefined then color1 will be used
    * @param result defines the target Color4 to store the result in
    */
  def getColorToRef(result: Color4): Unit = js.native
}

object ColorGradient {
  @scala.inline
  def apply(color1: Color4, getColorToRef: Color4 => Unit, gradient: Double): ColorGradient = {
    val __obj = js.Dynamic.literal(color1 = color1.asInstanceOf[js.Any], getColorToRef = js.Any.fromFunction1(getColorToRef), gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorGradient]
  }
  @scala.inline
  implicit class ColorGradientOps[Self <: ColorGradient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor1(value: Color4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetColorToRef(value: Color4 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColorToRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColor2(value: Color4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color2")(js.undefined)
        ret
    }
  }
  
}

