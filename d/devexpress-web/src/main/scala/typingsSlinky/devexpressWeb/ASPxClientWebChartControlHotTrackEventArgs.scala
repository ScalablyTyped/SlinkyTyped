package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for a chart control's ASPxClientWebChartControl.ObjectHotTracked and ASPxClientWebChartControl.ObjectSelected events on the client side.
  */
@js.native
trait ASPxClientWebChartControlHotTrackEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the X-coordinate of the hit test point, relative to the top left corner of the Web Page containing this chart.
    */
  var absoluteX: Double = js.native
  /**
    * Gets the Y-coordinate of the hit test point, relative to the top left corner of the Web Page containing this chart.
    */
  var absoluteY: Double = js.native
  /**
    * Provides access on the client side to the object, which is in some way related to the object being hit. The returned value depends on the ASPxClientWebChartControlHotTrackEventArgs.hitObject type and hit point location.
    */
  var additionalHitObject: ASPxClientWebChartElement = js.native
  /**
    * Gets a value indicating whether the hot-tracking or object selection should be canceled.
    */
  var cancel: Boolean = js.native
  /**
    * Provides access on the client side to the chart and all its elements.
    */
  var chart: ASPxClientWebChart = js.native
  /**
    * Gets details on the chart elements located at the point where an end-user has clicked when hot-tracking or selecting a chart element on the client side.
    */
  var hitInfo: ASPxClientWebChartHitInfo = js.native
  /**
    * Provides access on the client side to the chart element, for which the event was raised.
    */
  var hitObject: ASPxClientWebChartElement = js.native
  /**
    * Gets the HTML object that contains the processed item.
    */
  var htmlElement: js.Any = js.native
  /**
    * Gets the X-coordinate of the hit test point, relative to the top left corner of the chart.
    */
  var x: Double = js.native
  /**
    * Gets the Y-coordinate of the hit test point, relative to the top left corner of the chart.
    */
  var y: Double = js.native
}

object ASPxClientWebChartControlHotTrackEventArgs {
  @scala.inline
  def apply(
    absoluteX: Double,
    absoluteY: Double,
    additionalHitObject: ASPxClientWebChartElement,
    cancel: Boolean,
    chart: ASPxClientWebChart,
    hitInfo: ASPxClientWebChartHitInfo,
    hitObject: ASPxClientWebChartElement,
    htmlElement: js.Any,
    processOnServer: Boolean,
    x: Double,
    y: Double
  ): ASPxClientWebChartControlHotTrackEventArgs = {
    val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], additionalHitObject = additionalHitObject.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], hitInfo = hitInfo.asInstanceOf[js.Any], hitObject = hitObject.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebChartControlHotTrackEventArgs]
  }
  @scala.inline
  implicit class ASPxClientWebChartControlHotTrackEventArgsOps[Self <: ASPxClientWebChartControlHotTrackEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsoluteX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbsoluteY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalHitObject(value: ASPxClientWebChartElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalHitObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChart(value: ASPxClientWebChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitInfo(value: ASPxClientWebChartHitInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitObject(value: ASPxClientWebChartElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlElement")(value.asInstanceOf[js.Any])
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

