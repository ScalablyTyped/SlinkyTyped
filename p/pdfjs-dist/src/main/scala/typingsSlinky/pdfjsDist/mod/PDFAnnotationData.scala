package typingsSlinky.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFAnnotationData extends js.Object {
   // [x1, y1, x2, y2]
  var annotationFlags: js.Any = js.native
   // [r,g,b]
  var borderWidth: Double = js.native
   // todo
  var color: js.Array[Double] = js.native
  var hasAppearance: Boolean = js.native
  var rect: js.Array[Double] = js.native
  var subtype: String = js.native
}

object PDFAnnotationData {
  @scala.inline
  def apply(
    annotationFlags: js.Any,
    borderWidth: Double,
    color: js.Array[Double],
    hasAppearance: Boolean,
    rect: js.Array[Double],
    subtype: String
  ): PDFAnnotationData = {
    val __obj = js.Dynamic.literal(annotationFlags = annotationFlags.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], hasAppearance = hasAppearance.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFAnnotationData]
  }
  @scala.inline
  implicit class PDFAnnotationDataOps[Self <: PDFAnnotationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationFlags(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasAppearance(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAppearance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRect(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

