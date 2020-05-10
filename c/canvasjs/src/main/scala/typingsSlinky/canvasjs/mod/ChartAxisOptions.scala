package typingsSlinky.canvasjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartAxisOptions extends js.Object {
  /**
    * Sets the color of Axis line. Axis line color can be a "HTML Color Name" or "hex" code .
    * Default: "#BBBBBB"
    * Example: "blue","#21AB13"..
    */
  var lineColor: js.UndefOr[String] = js.native
  /**
    * Sets the dash type for axisY.
    * Default: "solid"
    */
  var lineDashType: js.UndefOr[DashType] = js.native
  /**
    * Sets the Thickness of Axis line in pixels.
    * Default: 2
    * Example: 2, 4..
    */
  var lineThickness: js.UndefOr[Double] = js.native
  /**
    * This property lets you set margin between chart’s boundary and Axis.
    * Default: 2
    * Example: 8, 10..
    */
  var margin: js.UndefOr[Double] = js.native
  /**
    * Sets the maximum value permitted on Axis. Values greater than maximum are clipped. maximum also set the upper limit while panning chart.
    * Default: Automatically Calculated based on the data.
    * Example: 100, 350..
    */
  var maximum: js.UndefOr[Double] = js.native
  /**
    * Sets the minimum value of Axis. Values smaller than minimum are clipped. minimum also sets the lower limit while panning chart.
    * Default: Automatically Calculated based on the data.
    * Example: 100, 350..
    */
  var minimum: js.UndefOr[Double] = js.native
  /**
    * Sets the Axis Title.
    * Default: null
    * Example: "Axis X Title"
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Sets the Font Color of Axis Title. The value of titleFontColor can be a "HTML Color Name" or "hex" code .
    * Default: "#666666"
    * Example: "red", "#006400" .
    */
  var titleFontColor: js.UndefOr[String] = js.native
  /**
    * Sets the Font Family of Axis Title.
    * Default: "arial"
    * Example: "calibri", "tahoma, "verdana" ..
    */
  var titleFontFamily: js.UndefOr[String] = js.native
  /**
    * Sets the Font Size of Axis Title in pixels.
    * Default: 20
    * Example: 16, 25 ..
    */
  var titleFontSize: js.UndefOr[Double] = js.native
  /**
    * Sets the Font Style of Axis Title. It can be set to one of the below options.
    * Default: "normal"
    * Options: "normal", "italic" , "oblique"
    */
  var titleFontStyle: js.UndefOr[String] = js.native
  /**
    * Sets the Font Weight used in the Axis Title. It can be set to one of the options below.
    * Default: "normal"
    * Options: "lighter", "normal", "bold" , "bolder"
    */
  var titleFontWeight: js.UndefOr[String] = js.native
  /**
    * Viewport is the visible range of the axis and viewportMinimum allows you to set its minimum value.
    * This can be used in combination with viewportMaximum in order to zoom into a certain region programmatically.
    * Default: Automatically Calculated based on the data.
    * Example: -100, 350..
    */
  var viewportMaximum: js.UndefOr[Double] = js.native
  /**
    * Viewport is the visible range of the axis and viewportMinimum allows you to set its minimum value.
    * This can be used in combination with viewportMaximum in order to zoom into a certain region programmatically.
    * Default: Automatically Calculated based on the data.
    * Example: -100, 350..
    */
  var viewportMinimum: js.UndefOr[Double] = js.native
}

object ChartAxisOptions {
  @scala.inline
  def apply(): ChartAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisOptions]
  }
  @scala.inline
  implicit class ChartAxisOptionsOps[Self <: ChartAxisOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDashType(value: DashType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDashType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashType")(js.undefined)
        ret
    }
    @scala.inline
    def withLineThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFontWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportMaximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportMaximum")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportMinimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportMinimum")(js.undefined)
        ret
    }
  }
  
}

