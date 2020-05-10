package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineDataLabelsOptionsObject extends DataLabelsOptionsObject {
  /**
    * Whether to position data labels alternately. For example, if distance is
    * set equal to `100`, then data labels will be positioned alternately (on
    * both sides of the point) at a distance of 100px.
    */
  var alternate: js.UndefOr[Boolean] = js.native
  /**
    * The color of the line connecting the data label to the point. The default
    * color is the same as the point's color.
    */
  var connectorColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * The width of the line connecting the data label to the point. In styled
    * mode, the connector stroke width is given in the
    * `.highcharts-data-label-connector` class.
    */
  var connectorWidth: js.UndefOr[Double] = js.native
  /**
    * A pixel value defining the distance between the data label and the point.
    * Negative numbers puts the label on top of the point.
    */
  var distance: js.UndefOr[Double] = js.native
  @JSName("formatter")
  var formatter_TimelineDataLabelsOptionsObject: js.UndefOr[TimelineDataLabelsFormatterCallbackFunction] = js.native
  var width: js.UndefOr[Double] = js.native
}

object TimelineDataLabelsOptionsObject {
  @scala.inline
  def apply(): TimelineDataLabelsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineDataLabelsOptionsObject]
  }
  @scala.inline
  implicit class TimelineDataLabelsOptionsObjectOps[Self <: TimelineDataLabelsOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorColor")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: TimelineDataLabelsFormatterCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

