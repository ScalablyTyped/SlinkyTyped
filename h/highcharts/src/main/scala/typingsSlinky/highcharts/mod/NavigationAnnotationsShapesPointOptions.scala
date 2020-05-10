package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationAnnotationsShapesPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The x position of the point.
    * Units can be either in axis or chart pixel coordinates.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This number defines which xAxis
    * the point is connected to. It refers to either the axis id or the index
    * of the axis in the xAxis array. If the option is not configured or the
    * axis is not found the point's x coordinate refers to the chart pixels.
    */
  var xAxis: js.UndefOr[Double | String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The y position of the point.
    * Units can be either in axis or chart pixel coordinates.
    */
  var y: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This number defines which yAxis
    * the point is connected to. It refers to either the axis id or the index
    * of the axis in the yAxis array. If the option is not configured or the
    * axis is not found the point's y coordinate refers to the chart pixels.
    */
  var yAxis: js.UndefOr[Double | String] = js.native
}

object NavigationAnnotationsShapesPointOptions {
  @scala.inline
  def apply(): NavigationAnnotationsShapesPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationAnnotationsShapesPointOptions]
  }
  @scala.inline
  implicit class NavigationAnnotationsShapesPointOptionsOps[Self <: NavigationAnnotationsShapesPointOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxis(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxis(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(js.undefined)
        ret
    }
  }
  
}

