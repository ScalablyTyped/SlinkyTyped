package typingsSlinky.identiconJs.mod

import typingsSlinky.identiconJs.AnonColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Svg extends js.Object {
  var background: Color = js.native
  var foreground: Color = js.native
  var rectangles: js.Array[AnonColor] = js.native
  var size: Double = js.native
  /**
    * Returns a string with the structure 'rgb(r, g, b, a)'.
    * @param red
    * @param green
    * @param blue
    * @param alpha
    */
  def color(red: Double, green: Double, blue: Double, alpha: Double): String = js.native
  /**
    * Returns the Svg as a base64 encoded string.
    */
  def getBase64(): String = js.native
  /**
    * Returns the Svg as string.
    */
  def getDump(): String = js.native
}

object Svg {
  @scala.inline
  def apply(
    background: Color,
    color: (Double, Double, Double, Double) => String,
    foreground: Color,
    getBase64: () => String,
    getDump: () => String,
    rectangles: js.Array[AnonColor],
    size: Double
  ): Svg = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = js.Any.fromFunction4(color), foreground = foreground.asInstanceOf[js.Any], getBase64 = js.Any.fromFunction0(getBase64), getDump = js.Any.fromFunction0(getDump), rectangles = rectangles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Svg]
  }
  @scala.inline
  implicit class SvgOps[Self <: Svg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: (Double, Double, Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withForeground(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBase64(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBase64")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDump(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDump")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRectangles(value: js.Array[AnonColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

