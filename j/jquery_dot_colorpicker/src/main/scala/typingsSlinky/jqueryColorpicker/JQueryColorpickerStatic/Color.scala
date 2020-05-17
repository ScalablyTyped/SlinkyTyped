package typingsSlinky.jqueryColorpicker.JQueryColorpickerStatic

import typingsSlinky.jqueryColorpicker.anon.A
import typingsSlinky.jqueryColorpicker.anon.Cmyk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var set: Boolean = js.native
  def copy(): Color = js.native
  def distance(color: Color): Double = js.native
  def equals(color: Color): Boolean = js.native
  def getAlpha(): Double = js.native
  def getCMYK(): CMYK = js.native
  def getChannels(): A = js.native
  def getHSL(): HSL = js.native
  def getHSV(): HSV = js.native
  def getLAB(): LAB = js.native
  def getRGB(): RGB = js.native
  def getSpaces(): Cmyk = js.native
  def limit(steps: Double): Unit = js.native
  def normalize(): Color = js.native
  def setAlpha(a: Double): Color = js.native
  def setCMYK(c: Double, m: Double, y: Double, k: Double): Color = js.native
  def setHSL(h: Double, s: Double, l: Double): Color = js.native
  def setHSV(h: Double, s: Double, v: Double): Color = js.native
  def setLAB(l: Double, a: Double, b: Double): Color = js.native
  def setRGB(r: Double, g: Double, b: Double): Color = js.native
  def setSpaces(new_spaces: js.Any): Color = js.native
  def toCSS(): String = js.native
  def toHEX(): String = js.native
}

object Color {
  @scala.inline
  def apply(
    copy: () => Color,
    distance: Color => Double,
    equals: Color => Boolean,
    getAlpha: () => Double,
    getCMYK: () => CMYK,
    getChannels: () => A,
    getHSL: () => HSL,
    getHSV: () => HSV,
    getLAB: () => LAB,
    getRGB: () => RGB,
    getSpaces: () => Cmyk,
    limit: Double => Unit,
    normalize: () => Color,
    set: Boolean,
    setAlpha: Double => Color,
    setCMYK: (Double, Double, Double, Double) => Color,
    setHSL: (Double, Double, Double) => Color,
    setHSV: (Double, Double, Double) => Color,
    setLAB: (Double, Double, Double) => Color,
    setRGB: (Double, Double, Double) => Color,
    setSpaces: js.Any => Color,
    toCSS: () => String,
    toHEX: () => String
  ): Color = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), distance = js.Any.fromFunction1(distance), equals = js.Any.fromFunction1(equals), getAlpha = js.Any.fromFunction0(getAlpha), getCMYK = js.Any.fromFunction0(getCMYK), getChannels = js.Any.fromFunction0(getChannels), getHSL = js.Any.fromFunction0(getHSL), getHSV = js.Any.fromFunction0(getHSV), getLAB = js.Any.fromFunction0(getLAB), getRGB = js.Any.fromFunction0(getRGB), getSpaces = js.Any.fromFunction0(getSpaces), limit = js.Any.fromFunction1(limit), normalize = js.Any.fromFunction0(normalize), set = set.asInstanceOf[js.Any], setAlpha = js.Any.fromFunction1(setAlpha), setCMYK = js.Any.fromFunction4(setCMYK), setHSL = js.Any.fromFunction3(setHSL), setHSV = js.Any.fromFunction3(setHSV), setLAB = js.Any.fromFunction3(setLAB), setRGB = js.Any.fromFunction3(setRGB), setSpaces = js.Any.fromFunction1(setSpaces), toCSS = js.Any.fromFunction0(toCSS), toHEX = js.Any.fromFunction0(toHEX))
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: () => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDistance(value: Color => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEquals(value: Color => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAlpha(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlpha")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCMYK(value: () => CMYK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCMYK")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetChannels(value: () => A): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChannels")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHSL(value: () => HSL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHSL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHSV(value: () => HSV): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHSV")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLAB(value: () => LAB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLAB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRGB(value: () => RGB): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRGB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSpaces(value: () => Cmyk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSpaces")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLimit(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNormalize(value: () => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAlpha(value: Double => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAlpha")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCMYK(value: (Double, Double, Double, Double) => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCMYK")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSetHSL(value: (Double, Double, Double) => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHSL")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetHSV(value: (Double, Double, Double) => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHSV")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetLAB(value: (Double, Double, Double) => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLAB")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetRGB(value: (Double, Double, Double) => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRGB")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetSpaces(value: js.Any => Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSpaces")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToCSS(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toCSS")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToHEX(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHEX")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

