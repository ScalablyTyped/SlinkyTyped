package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGTransform extends js.Object {
  @JSName("MSHTML.SVGTransform_typekey")
  var MSHTMLDotSVGTransform_typekey: SVGTransform = js.native
  var angle: Double = js.native
  var matrix: SVGMatrix = js.native
  var `type`: Double = js.native
  def setMatrix(matrix: SVGMatrix): Unit = js.native
  def setRotate(angle: Double, cx: Double, cy: Double): Unit = js.native
  def setScale(sx: Double, sy: Double): Unit = js.native
  def setSkewX(angle: Double): Unit = js.native
  def setSkewY(angle: Double): Unit = js.native
  def setTranslate(tx: Double, ty: Double): Unit = js.native
}

object SVGTransform {
  @scala.inline
  def apply(
    MSHTMLDotSVGTransform_typekey: SVGTransform,
    angle: Double,
    matrix: SVGMatrix,
    setMatrix: SVGMatrix => Unit,
    setRotate: (Double, Double, Double) => Unit,
    setScale: (Double, Double) => Unit,
    setSkewX: Double => Unit,
    setSkewY: Double => Unit,
    setTranslate: (Double, Double) => Unit,
    `type`: Double
  ): SVGTransform = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], setMatrix = js.Any.fromFunction1(setMatrix), setRotate = js.Any.fromFunction3(setRotate), setScale = js.Any.fromFunction2(setScale), setSkewX = js.Any.fromFunction1(setSkewX), setSkewY = js.Any.fromFunction1(setSkewY), setTranslate = js.Any.fromFunction2(setTranslate))
    __obj.updateDynamic("MSHTML.SVGTransform_typekey")(MSHTMLDotSVGTransform_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTransform]
  }
  @scala.inline
  implicit class SVGTransformOps[Self <: SVGTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGTransform_typekey(value: SVGTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGTransform_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatrix(value: SVGMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetMatrix(value: SVGMatrix => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMatrix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRotate(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRotate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetScale(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScale")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetSkewX(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSkewX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSkewY(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSkewY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTranslate(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTranslate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

