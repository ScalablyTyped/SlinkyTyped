package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGMatrix extends js.Object {
  @JSName("MSHTML.SVGMatrix_typekey")
  var MSHTMLDotSVGMatrix_typekey: SVGMatrix = js.native
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var e: Double = js.native
  var f: Double = js.native
  def flipX(): SVGMatrix = js.native
  def flipY(): SVGMatrix = js.native
  def inverse(): SVGMatrix = js.native
  def multiply(secondMatrix: SVGMatrix): SVGMatrix = js.native
  def rotate(angle: Double): SVGMatrix = js.native
  def rotateFromVector(x: Double, y: Double): SVGMatrix = js.native
  def scale(scaleFactor: Double): SVGMatrix = js.native
  def scaleNonUniform(scaleFactorX: Double, scaleFactorY: Double): SVGMatrix = js.native
  def skewX(angle: Double): SVGMatrix = js.native
  def skewY(angle: Double): SVGMatrix = js.native
  def translate(x: Double, y: Double): SVGMatrix = js.native
}

object SVGMatrix {
  @scala.inline
  def apply(
    MSHTMLDotSVGMatrix_typekey: SVGMatrix,
    a: Double,
    b: Double,
    c: Double,
    d: Double,
    e: Double,
    f: Double,
    flipX: () => SVGMatrix,
    flipY: () => SVGMatrix,
    inverse: () => SVGMatrix,
    multiply: SVGMatrix => SVGMatrix,
    rotate: Double => SVGMatrix,
    rotateFromVector: (Double, Double) => SVGMatrix,
    scale: Double => SVGMatrix,
    scaleNonUniform: (Double, Double) => SVGMatrix,
    skewX: Double => SVGMatrix,
    skewY: Double => SVGMatrix,
    translate: (Double, Double) => SVGMatrix
  ): SVGMatrix = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], flipX = js.Any.fromFunction0(flipX), flipY = js.Any.fromFunction0(flipY), inverse = js.Any.fromFunction0(inverse), multiply = js.Any.fromFunction1(multiply), rotate = js.Any.fromFunction1(rotate), rotateFromVector = js.Any.fromFunction2(rotateFromVector), scale = js.Any.fromFunction1(scale), scaleNonUniform = js.Any.fromFunction2(scaleNonUniform), skewX = js.Any.fromFunction1(skewX), skewY = js.Any.fromFunction1(skewY), translate = js.Any.fromFunction2(translate))
    __obj.updateDynamic("MSHTML.SVGMatrix_typekey")(MSHTMLDotSVGMatrix_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGMatrix]
  }
  @scala.inline
  implicit class SVGMatrixOps[Self <: SVGMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGMatrix_typekey(value: SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGMatrix_typekey")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withC(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlipX(value: () => SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlipY(value: () => SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInverse(value: () => SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMultiply(value: SVGMatrix => SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRotate(value: Double => SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRotateFromVector(value: (Double, Double) => SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateFromVector")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScale(value: Double => SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScaleNonUniform(value: (Double, Double) => SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleNonUniform")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSkewX(value: Double => SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkewY(value: Double => SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTranslate(value: (Double, Double) => SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

