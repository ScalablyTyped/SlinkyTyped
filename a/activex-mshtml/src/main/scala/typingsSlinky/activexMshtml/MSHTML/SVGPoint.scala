package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPoint extends js.Object {
  @JSName("MSHTML.SVGPoint_typekey")
  var MSHTMLDotSVGPoint_typekey: SVGPoint = js.native
  var x: Double = js.native
  var y: Double = js.native
  def matrixTransform(pMatrix: SVGMatrix): SVGPoint = js.native
}

object SVGPoint {
  @scala.inline
  def apply(MSHTMLDotSVGPoint_typekey: SVGPoint, matrixTransform: SVGMatrix => SVGPoint, x: Double, y: Double): SVGPoint = {
    val __obj = js.Dynamic.literal(matrixTransform = js.Any.fromFunction1(matrixTransform), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGPoint_typekey")(MSHTMLDotSVGPoint_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPoint]
  }
  @scala.inline
  implicit class SVGPointOps[Self <: SVGPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGPoint_typekey(value: SVGPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGPoint_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatrixTransform(value: SVGMatrix => SVGPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrixTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

