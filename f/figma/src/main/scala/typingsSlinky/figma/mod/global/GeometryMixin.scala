package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.CENTER
import typingsSlinky.figma.figmaStrings.INSIDE
import typingsSlinky.figma.figmaStrings.OUTSIDE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeometryMixin extends js.Object {
  var dashPattern: js.Array[Double] = js.native
  var fillStyleId: String | js.Symbol = js.native
  var fills: js.Array[Paint] | js.Symbol = js.native
  var strokeAlign: CENTER | INSIDE | OUTSIDE = js.native
  var strokeCap: StrokeCap | js.Symbol = js.native
  var strokeJoin: StrokeJoin | js.Symbol = js.native
  var strokeMiterLimit: Double = js.native
  var strokeStyleId: String = js.native
  var strokeWeight: Double = js.native
  var strokes: js.Array[Paint] = js.native
  def outlineStroke(): VectorNode | Null = js.native
}

object GeometryMixin {
  @scala.inline
  def apply(
    dashPattern: js.Array[Double],
    fillStyleId: String | js.Symbol,
    fills: js.Array[Paint] | js.Symbol,
    outlineStroke: () => VectorNode | Null,
    strokeAlign: CENTER | INSIDE | OUTSIDE,
    strokeCap: StrokeCap | js.Symbol,
    strokeJoin: StrokeJoin | js.Symbol,
    strokeMiterLimit: Double,
    strokeStyleId: String,
    strokeWeight: Double,
    strokes: js.Array[Paint]
  ): GeometryMixin = {
    val __obj = js.Dynamic.literal(dashPattern = dashPattern.asInstanceOf[js.Any], fillStyleId = fillStyleId.asInstanceOf[js.Any], fills = fills.asInstanceOf[js.Any], outlineStroke = js.Any.fromFunction0(outlineStroke), strokeAlign = strokeAlign.asInstanceOf[js.Any], strokeCap = strokeCap.asInstanceOf[js.Any], strokeJoin = strokeJoin.asInstanceOf[js.Any], strokeMiterLimit = strokeMiterLimit.asInstanceOf[js.Any], strokeStyleId = strokeStyleId.asInstanceOf[js.Any], strokeWeight = strokeWeight.asInstanceOf[js.Any], strokes = strokes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryMixin]
  }
  @scala.inline
  implicit class GeometryMixinOps[Self <: GeometryMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashPattern(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillStyleId(value: String | js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStyleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFills(value: js.Array[Paint] | js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fills")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlineStroke(value: () => VectorNode | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineStroke")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStrokeAlign(value: CENTER | INSIDE | OUTSIDE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeCap(value: StrokeCap | js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeJoin(value: StrokeJoin | js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeMiterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeMiterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeStyleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokes(value: js.Array[Paint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

