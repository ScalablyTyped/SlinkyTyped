package typingsSlinky.extjs.Ext.draw

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColor extends IBase {
  /** [Method] Get the blue component of the color in the range 0 255
  		* @returns Number
  		*/
  var getBlue: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Return a new color that is darker than this color
  		* @param factor Number Darker factor (0..1), default to 0.2
  		* @returns Object Ext.draw.Color
  		*/
  var getDarker: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], _]] = js.native
  /** [Method] Returns the gray value 0 to 255 of the color
  		* @returns Number
  		*/
  var getGrayscale: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get the green component of the color in the range 0 255
  		* @returns Number
  		*/
  var getGreen: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get the equivalent HSL components of the color
  		* @returns Number[]
  		*/
  var getHSL: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Return a new color that is lighter than this color
  		* @param factor Number Lighter factor (0..1), default to 0.2
  		* @returns Object Ext.draw.Color
  		*/
  var getLighter: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], _]] = js.native
  /** [Method] Get the RGB values
  		* @returns Number[]
  		*/
  var getRGB: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Get the red component of the color in the range 0 255
  		* @returns Number
  		*/
  var getRed: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var lightnessFactor: js.UndefOr[Double] = js.native
  /** [Method] Return the color in the hex format i e
  		* @returns String
  		*/
  @JSName("toString")
  var toString_FIColor: js.UndefOr[js.Function0[String]] = js.native
}

object IColor {
  @scala.inline
  def apply(): IColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColor]
  }
  @scala.inline
  implicit class IColorOps[Self <: IColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBlue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBlue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBlue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBlue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDarker(value: /* factor */ js.UndefOr[Double] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDarker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDarker")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGrayscale(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrayscale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGrayscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrayscale")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGreen(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGreen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGreen")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHSL(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHSL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHSL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHSL")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLighter(value: /* factor */ js.UndefOr[Double] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLighter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetLighter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLighter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRGB(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRGB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRGB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRGB")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRed(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRed")(js.undefined)
        ret
    }
    @scala.inline
    def withLightnessFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightnessFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightnessFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightnessFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withToString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.undefined)
        ret
    }
  }
  
}

