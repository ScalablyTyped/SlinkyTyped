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
trait FillStrokeState extends js.Object {
  var currentFillStyle: js.UndefOr[ColorLike] = js.native
  var currentLineCap: js.UndefOr[CanvasLineCap] = js.native
  var currentLineDash: js.Array[Double] = js.native
  var currentLineDashOffset: js.UndefOr[Double] = js.native
  var currentLineJoin: js.UndefOr[CanvasLineJoin] = js.native
  var currentLineWidth: js.UndefOr[Double] = js.native
  var currentMiterLimit: js.UndefOr[Double] = js.native
  var currentStrokeStyle: js.UndefOr[ColorLike] = js.native
  var fillStyle: js.UndefOr[ColorLike] = js.native
  var lastStroke: js.UndefOr[Double] = js.native
  var lineCap: js.UndefOr[CanvasLineCap] = js.native
  var lineDash: js.Array[Double] = js.native
  var lineDashOffset: js.UndefOr[Double] = js.native
  var lineJoin: js.UndefOr[CanvasLineJoin] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
  var miterLimit: js.UndefOr[Double] = js.native
  var strokeStyle: js.UndefOr[ColorLike] = js.native
}

object FillStrokeState {
  @scala.inline
  def apply(currentLineDash: js.Array[Double], lineDash: js.Array[Double]): FillStrokeState = {
    val __obj = js.Dynamic.literal(currentLineDash = currentLineDash.asInstanceOf[js.Any], lineDash = lineDash.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillStrokeState]
  }
  @scala.inline
  implicit class FillStrokeStateOps[Self <: FillStrokeState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentLineDash(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLineDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineDash(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentFillStyleCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentFillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentFillStyleCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentFillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentFillStyle(value: ColorLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentFillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentFillStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentFillStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentLineCap(value: CanvasLineCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLineCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentLineCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLineCap")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentLineDashOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLineDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentLineDashOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLineDashOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentLineJoin(value: CanvasLineJoin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLineJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentLineJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLineJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentMiterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMiterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentMiterLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentMiterLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentStrokeStyleCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentStrokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentStrokeStyleCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentStrokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentStrokeStyle(value: ColorLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentStrokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentStrokeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentStrokeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFillStyleCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillStyleCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillStyle(value: ColorLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStroke(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withLineCap(value: CanvasLineCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDashOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDashOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLineJoin(value: CanvasLineJoin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMiterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiterLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterLimit")(js.undefined)
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
    @scala.inline
    def withoutStrokeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(js.undefined)
        ret
    }
  }
  
}

