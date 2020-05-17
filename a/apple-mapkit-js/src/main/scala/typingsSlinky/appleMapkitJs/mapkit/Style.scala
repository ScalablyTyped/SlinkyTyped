package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of observable attributes for overlays, including color and opacity of
  * stroke and fill, and line styles.
  */
@js.native
trait Style extends js.Object {
  /**
    * The fill color of a shape.
    */
  var fillColor: String = js.native
  /**
    * The opacity of the fill color.
    */
  var fillOpacity: Double = js.native
  /**
    * A rule for determining whether a point is inside or outside a polygon.
    */
  var fillRule: String = js.native
  /**
    * The style to use when drawing line endings.
    */
  var lineCap: String = js.native
  /**
    * An array of line and gap lengths, used to create a dashed line.
    */
  var lineDash: js.Array[Double] = js.native
  /**
    * The number of CSS pixels to offset drawing of a line's dash pattern.
    */
  var lineDashOffset: Double = js.native
  /**
    * The style to use when drawing joins between line segments.
    */
  var lineJoin: String = js.native
  /**
    * The width of a line's stroke, in CSS pixels.
    */
  var lineWidth: Double = js.native
  /**
    * The stroke color of a line.
    */
  var strokeColor: String = js.native
  /**
    * The opacity of the stroke color.
    */
  var strokeOpacity: Double = js.native
}

object Style {
  @scala.inline
  def apply(
    fillColor: String,
    fillOpacity: Double,
    fillRule: String,
    lineCap: String,
    lineDash: js.Array[Double],
    lineDashOffset: Double,
    lineJoin: String,
    lineWidth: Double,
    strokeColor: String,
    strokeOpacity: Double
  ): Style = {
    val __obj = js.Dynamic.literal(fillColor = fillColor.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], fillRule = fillRule.asInstanceOf[js.Any], lineCap = lineCap.asInstanceOf[js.Any], lineDash = lineDash.asInstanceOf[js.Any], lineDashOffset = lineDashOffset.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillRule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineCap(value: String): Self = {
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
    def withLineJoin(value: String): Self = {
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
    def withStrokeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

