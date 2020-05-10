package typingsSlinky.amcharts.guideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Guide extends js.Object {
  /**
    * If you set it to true, the guide will be displayed above the graphs.
    */
  var above: Boolean = js.native
  /**
    * Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines.
    */
  var angle: Double = js.native
  /**
    * Baloon fill color.
    */
  var balloonColor: String = js.native
  /**
    * The text which will be displayed if the user rolls-over the guide.
    */
  var balloonText: String = js.native
  /**
    * Specifies if label should be bold or not.
    */
  var boldLabel: Boolean = js.native
  /**
    * Category of the guide (in case the guide is for category axis).
    */
  var category: String = js.native
  /**
    * Dash length.
    */
  var dashLength: Double = js.native
  /**
    * Date of the guide (in case the guide is for category axis and parseDates is set to true).
    */
  var date: js.Date = js.native
  /**
    * Works if a guide is added to CategoryAxis and this axis is non-date-based.
    * If you set it to true, the guide will start (or be placed, if it's not a fill) on the
    * beginning of the category cell and will end at the end of toCategory cell.
    */
  var expand: Boolean = js.native
  /**
    * Fill opacity. Value range is 0 - 1.
    */
  var fillAlpha: Double = js.native
  /**
    * Fill color.
    */
  var fillColor: String = js.native
  /**
    * Font size of guide label.
    */
  var fontSize: String = js.native
  /**
    * Unique id of a Guide. You don't need to set it, unless you want to.
    */
  var id: String = js.native
  /**
    * Specifies whether label should be placed inside or outside plot area.
    */
  var inside: Boolean = js.native
  /**
    * The label which will be displayed near the guide.
    */
  var label: String = js.native
  /**
    * Rotation angle of a guide label.
    */
  var labelRotation: Double = js.native
  /**
    * Line opacity.
    */
  var lineAlpha: Double = js.native
  /**
    * Line color.
    */
  var lineColor: String = js.native
  /**
    * Line thickness.
    */
  var lineThickness: Double = js.native
  /**
    * Position of guide label. Possible values are "left" or "right" for horizontal axis
    * and "top" or "bottom" for vertical axis.
    */
  var position: String = js.native
  /**
    * Tick length.
    */
  var tickLength: Double = js.native
  /**
    * Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines.
    */
  var toAngle: Double = js.native
  /**
    * To category of the guide (in case the guide is for category axis).
    */
  var toCategory: String = js.native
  /**
    * To date of the guide (in case the guide is for category axis and parseDates is set to true).
    * If you have both date and toDate, the space between these two dates can be filled with color.
    */
  var toDate: js.Date = js.native
  /**
    * To value of the guide (in case the guide is for value axis).
    */
  var toValue: Double = js.native
  /**
    * Value of the guide (in case the guide is for value axis).
    */
  var value: Double = js.native
  /**
    * Value axis of a guide. As you can add guides directly to the chart,
    * you might need to specify which which value axis should be used.
    */
  var valueAxis: typingsSlinky.amcharts.valueAxisMod.default = js.native
}

object Guide {
  @scala.inline
  def apply(
    above: Boolean,
    angle: Double,
    balloonColor: String,
    balloonText: String,
    boldLabel: Boolean,
    category: String,
    dashLength: Double,
    date: js.Date,
    expand: Boolean,
    fillAlpha: Double,
    fillColor: String,
    fontSize: String,
    id: String,
    inside: Boolean,
    label: String,
    labelRotation: Double,
    lineAlpha: Double,
    lineColor: String,
    lineThickness: Double,
    position: String,
    tickLength: Double,
    toAngle: Double,
    toCategory: String,
    toDate: js.Date,
    toValue: Double,
    value: Double,
    valueAxis: typingsSlinky.amcharts.valueAxisMod.default
  ): Guide = {
    val __obj = js.Dynamic.literal(above = above.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], balloonColor = balloonColor.asInstanceOf[js.Any], balloonText = balloonText.asInstanceOf[js.Any], boldLabel = boldLabel.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], dashLength = dashLength.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], fillAlpha = fillAlpha.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], lineAlpha = lineAlpha.asInstanceOf[js.Any], lineColor = lineColor.asInstanceOf[js.Any], lineThickness = lineThickness.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tickLength = tickLength.asInstanceOf[js.Any], toAngle = toAngle.asInstanceOf[js.Any], toCategory = toCategory.asInstanceOf[js.Any], toDate = toDate.asInstanceOf[js.Any], toValue = toValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueAxis = valueAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guide]
  }
  @scala.inline
  implicit class GuideOps[Self <: Guide] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("above")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalloonColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalloonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoldLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boldLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDashLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueAxis(value: typingsSlinky.amcharts.valueAxisMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAxis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

