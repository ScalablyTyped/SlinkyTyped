package typingsSlinky.ol.canvasMod

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import typingsSlinky.ol.colorlikeMod.ColorLike
import typingsSlinky.std.CanvasLineCap
import typingsSlinky.std.CanvasLineJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrokeState extends js.Object {
  var lineCap: CanvasLineCap = js.native
  var lineDash: js.Array[Double] = js.native
  var lineDashOffset: Double = js.native
  var lineJoin: CanvasLineJoin = js.native
  var lineWidth: Double = js.native
  var miterLimit: Double = js.native
  var strokeStyle: ColorLike = js.native
}

object StrokeState {
  @scala.inline
  def apply(
    lineCap: CanvasLineCap,
    lineDash: js.Array[Double],
    lineDashOffset: Double,
    lineJoin: CanvasLineJoin,
    lineWidth: Double,
    miterLimit: Double,
    strokeStyle: ColorLike
  ): StrokeState = {
    val __obj = js.Dynamic.literal(lineCap = lineCap.asInstanceOf[js.Any], lineDash = lineDash.asInstanceOf[js.Any], lineDashOffset = lineDashOffset.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeState]
  }
  @scala.inline
  implicit class StrokeStateOps[Self <: StrokeState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineCap(value: CanvasLineCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineDash(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineDashOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineJoin(value: CanvasLineJoin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeStyleCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeStyleCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeStyle(value: ColorLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

