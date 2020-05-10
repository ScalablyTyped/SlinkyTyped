package typingsSlinky.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartTooltipModel extends js.Object {
  var _bodyAlign: String = js.native
  var _bodyFontFamily: String = js.native
  var _bodyFontStyle: String = js.native
  var _footerAlign: String = js.native
  var _footerFontFamily: String = js.native
  var _footerFontStyle: String = js.native
  var _titleAlign: String = js.native
  var _titleFontFamily: String = js.native
  var _titleFontStyle: String = js.native
  var afterBody: js.Array[String] = js.native
  var backgroundColor: String = js.native
  var beforeBody: js.Array[String] = js.native
  var body: js.Array[ChartTooltipModelBody] = js.native
  var bodyFontColor: String = js.native
  var bodyFontSize: Double = js.native
  var bodySpacing: Double = js.native
  var borderColor: String = js.native
  var borderWidth: Double = js.native
  var caretPadding: Double = js.native
  var caretSize: Double = js.native
  var caretX: Double = js.native
  var caretY: Double = js.native
  var cornerRadius: Double = js.native
  var dataPoints: js.Array[ChartTooltipItem] = js.native
  var displayColors: Boolean = js.native
  var footer: js.Array[String] = js.native
  var footerFontColor: String = js.native
  var footerFontSize: Double = js.native
  var footerMarginTop: Double = js.native
  var footerSpacing: Double = js.native
  var height: Double = js.native
  var labelColors: js.Array[String] = js.native
  var labelTextColors: js.Array[String] = js.native
  var legendColorBackground: String = js.native
  var opacity: Double = js.native
  var title: js.Array[String] = js.native
  var titleFontColor: String = js.native
  var titleFontSize: Double = js.native
  var titleMarginBottom: Double = js.native
  var titleSpacing: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var xAlign: String = js.native
  var xPadding: Double = js.native
  var y: Double = js.native
  var yAlign: String = js.native
  var yPadding: Double = js.native
}

object ChartTooltipModel {
  @scala.inline
  def apply(
    _bodyAlign: String,
    _bodyFontFamily: String,
    _bodyFontStyle: String,
    _footerAlign: String,
    _footerFontFamily: String,
    _footerFontStyle: String,
    _titleAlign: String,
    _titleFontFamily: String,
    _titleFontStyle: String,
    afterBody: js.Array[String],
    backgroundColor: String,
    beforeBody: js.Array[String],
    body: js.Array[ChartTooltipModelBody],
    bodyFontColor: String,
    bodyFontSize: Double,
    bodySpacing: Double,
    borderColor: String,
    borderWidth: Double,
    caretPadding: Double,
    caretSize: Double,
    caretX: Double,
    caretY: Double,
    cornerRadius: Double,
    dataPoints: js.Array[ChartTooltipItem],
    displayColors: Boolean,
    footer: js.Array[String],
    footerFontColor: String,
    footerFontSize: Double,
    footerMarginTop: Double,
    footerSpacing: Double,
    height: Double,
    labelColors: js.Array[String],
    labelTextColors: js.Array[String],
    legendColorBackground: String,
    opacity: Double,
    title: js.Array[String],
    titleFontColor: String,
    titleFontSize: Double,
    titleMarginBottom: Double,
    titleSpacing: Double,
    width: Double,
    x: Double,
    xAlign: String,
    xPadding: Double,
    y: Double,
    yAlign: String,
    yPadding: Double
  ): ChartTooltipModel = {
    val __obj = js.Dynamic.literal(_bodyAlign = _bodyAlign.asInstanceOf[js.Any], _bodyFontFamily = _bodyFontFamily.asInstanceOf[js.Any], _bodyFontStyle = _bodyFontStyle.asInstanceOf[js.Any], _footerAlign = _footerAlign.asInstanceOf[js.Any], _footerFontFamily = _footerFontFamily.asInstanceOf[js.Any], _footerFontStyle = _footerFontStyle.asInstanceOf[js.Any], _titleAlign = _titleAlign.asInstanceOf[js.Any], _titleFontFamily = _titleFontFamily.asInstanceOf[js.Any], _titleFontStyle = _titleFontStyle.asInstanceOf[js.Any], afterBody = afterBody.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], beforeBody = beforeBody.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], bodyFontColor = bodyFontColor.asInstanceOf[js.Any], bodyFontSize = bodyFontSize.asInstanceOf[js.Any], bodySpacing = bodySpacing.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], caretPadding = caretPadding.asInstanceOf[js.Any], caretSize = caretSize.asInstanceOf[js.Any], caretX = caretX.asInstanceOf[js.Any], caretY = caretY.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], dataPoints = dataPoints.asInstanceOf[js.Any], displayColors = displayColors.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], footerFontColor = footerFontColor.asInstanceOf[js.Any], footerFontSize = footerFontSize.asInstanceOf[js.Any], footerMarginTop = footerMarginTop.asInstanceOf[js.Any], footerSpacing = footerSpacing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], labelColors = labelColors.asInstanceOf[js.Any], labelTextColors = labelTextColors.asInstanceOf[js.Any], legendColorBackground = legendColorBackground.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleFontColor = titleFontColor.asInstanceOf[js.Any], titleFontSize = titleFontSize.asInstanceOf[js.Any], titleMarginBottom = titleMarginBottom.asInstanceOf[js.Any], titleSpacing = titleSpacing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xAlign = xAlign.asInstanceOf[js.Any], xPadding = xPadding.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yAlign = yAlign.asInstanceOf[js.Any], yPadding = yPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTooltipModel]
  }
  @scala.inline
  implicit class ChartTooltipModelOps[Self <: ChartTooltipModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_bodyAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_bodyAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_bodyFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_bodyFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_bodyFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_bodyFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_footerAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_footerAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_footerFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_footerFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_footerFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_footerFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_titleAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_titleAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_titleFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_titleFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_titleFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_titleFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterBody(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeBody(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: js.Array[ChartTooltipModelBody]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyFontColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodySpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodySpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaretPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaretSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaretX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaretY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCornerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataPoints(value: js.Array[ChartTooltipItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterFontColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterMarginTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerMarginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelTextColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTextColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegendColorBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendColorBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleFontColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleMarginBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleMarginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yPadding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

