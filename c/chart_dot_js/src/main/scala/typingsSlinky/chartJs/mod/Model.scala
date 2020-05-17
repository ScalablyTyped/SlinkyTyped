package typingsSlinky.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This model is generic with a bunch of optional properties to represent all types of chart models.
// Each chart type defines their own unique model structure so some of these optional properties
// might always have values depending on the chart type.
@js.native
trait Model extends js.Object {
  var backgroundColor: String = js.native
  var base: Double = js.native
  var borderAlign: js.UndefOr[BorderAlignment] = js.native
  var borderColor: String = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var circumference: js.UndefOr[Double] = js.native
  var controlPointNextX: Double = js.native
  var controlPointNextY: Double = js.native
  var controlPointPreviousX: Double = js.native
  var controlPointPreviousY: Double = js.native
  var endAngle: js.UndefOr[Double] = js.native
  var head: Double = js.native
  var hitRadius: Double = js.native
  var innerRadius: js.UndefOr[Double] = js.native
  var outerRadius: js.UndefOr[Double] = js.native
  var pointStyle: String = js.native
  var radius: String = js.native
  var skip: js.UndefOr[Boolean] = js.native
  var startAngle: js.UndefOr[Double] = js.native
  var steppedLine: js.UndefOr[scala.Nothing] = js.native
  var tension: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object Model {
  @scala.inline
  def apply(
    backgroundColor: String,
    base: Double,
    borderColor: String,
    controlPointNextX: Double,
    controlPointNextY: Double,
    controlPointPreviousX: Double,
    controlPointPreviousY: Double,
    head: Double,
    hitRadius: Double,
    pointStyle: String,
    radius: String,
    tension: Double,
    x: Double,
    y: Double
  ): Model = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], controlPointNextX = controlPointNextX.asInstanceOf[js.Any], controlPointNextY = controlPointNextY.asInstanceOf[js.Any], controlPointPreviousX = controlPointPreviousX.asInstanceOf[js.Any], controlPointPreviousY = controlPointPreviousY.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], hitRadius = hitRadius.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tension = tension.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlPointNextX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlPointNextX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlPointNextY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlPointNextY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlPointPreviousX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlPointPreviousX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlPointPreviousY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlPointPreviousY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tension")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withBorderAlign(value: BorderAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCircumference(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circumference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircumference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circumference")(js.undefined)
        ret
    }
    @scala.inline
    def withEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
  }
  
}

