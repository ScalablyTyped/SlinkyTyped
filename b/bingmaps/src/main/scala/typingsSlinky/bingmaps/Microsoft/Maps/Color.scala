package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  /** The opacity of the color. The range of valid values are an interger between 0 and 255, or a decimal between 0 and 1. */
  var a: Double = js.native
  /** The blue value of the color. The range of valid values is 0 to 255 */
  var b: Double = js.native
  /** The green value of the color. The range of valid values is 0 to 255 */
  var g: Double = js.native
  /** The red value of the color. The range of valid values is 0 to 255 */
  var r: Double = js.native
  /**
    * Gets the opacity of this color.
    * @returns The opacity between 0 and 1 of this color.
    */
  def getOpacity(): Double = js.native
  /**
    * Converts the color to hex notation.
    * @returns The hex notation as '#rrggbb' (ignores a).
    */
  def toHex(): String = js.native
  /**
    * Converts the color to rgba notation.
    * @returns The rgba notation as rgba(rr, gg, bb, aa)
    */
  def toRgba(): String = js.native
}

object Color {
  @scala.inline
  def apply(
    a: Double,
    b: Double,
    g: Double,
    getOpacity: () => Double,
    r: Double,
    toHex: () => String,
    toRgba: () => String
  ): Color = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], getOpacity = js.Any.fromFunction0(getOpacity), r = r.asInstanceOf[js.Any], toHex = js.Any.fromFunction0(toHex), toRgba = js.Any.fromFunction0(toRgba))
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOpacity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpacity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToHex(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToRgba(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toRgba")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

