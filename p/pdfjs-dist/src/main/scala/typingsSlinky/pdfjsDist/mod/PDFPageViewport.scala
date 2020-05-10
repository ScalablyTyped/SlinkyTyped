package typingsSlinky.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFPageViewport extends js.Object {
  var height: Double = js.native
  var scale: Double = js.native
  var transforms: js.Array[Double] = js.native
  var width: Double = js.native
  def clone(options: PDFPageViewportOptions): PDFPageViewport = js.native
   // [x1, y1, x2, y2]
  def convertToPdfPoint(x: Double, y: Double): js.Array[Double] = js.native
  def convertToViewportPoint(x: Double, y: Double): js.Array[Double] = js.native
   // [x, y]
  def convertToViewportRectangle(rect: js.Array[Double]): js.Array[Double] = js.native
}

object PDFPageViewport {
  @scala.inline
  def apply(
    clone: PDFPageViewportOptions => PDFPageViewport,
    convertToPdfPoint: (Double, Double) => js.Array[Double],
    convertToViewportPoint: (Double, Double) => js.Array[Double],
    convertToViewportRectangle: js.Array[Double] => js.Array[Double],
    height: Double,
    scale: Double,
    transforms: js.Array[Double],
    width: Double
  ): PDFPageViewport = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction1(clone), convertToPdfPoint = js.Any.fromFunction2(convertToPdfPoint), convertToViewportPoint = js.Any.fromFunction2(convertToViewportPoint), convertToViewportRectangle = js.Any.fromFunction1(convertToViewportRectangle), height = height.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFPageViewport]
  }
  @scala.inline
  implicit class PDFPageViewportOps[Self <: PDFPageViewport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: PDFPageViewportOptions => PDFPageViewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConvertToPdfPoint(value: (Double, Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertToPdfPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConvertToViewportPoint(value: (Double, Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertToViewportPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConvertToViewportRectangle(value: js.Array[Double] => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertToViewportRectangle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransforms(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

