package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesPieDataLabelsOptionsObject extends DataLabelsOptionsObject {
  /**
    * (Highcharts) Alignment method for data labels. Possible values are:
    *
    * - `toPlotEdges`: each label touches the nearest vertical edge of the plot
    * area
    *
    * - `connectors`: connectors have the same x position and the widest label
    * of each half (left & right) touches the nearest vertical edge of the plot
    * area.
    */
  var alignTo: js.UndefOr[String] = js.native
  /**
    * (Highcharts) The color of the line connecting the data label to the pie
    * slice. The default color is the same as the point's color.
    *
    * In styled mode, the connector stroke is given in the
    * `.highcharts-data-label-connector` class.
    */
  var connectorColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) The distance from the data label to the connector. Note that
    * data labels also have a default `padding`, so in order for the connector
    * to touch the text, the `padding` must also be 0.
    */
  var connectorPadding: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Specifies the method that is used to generate the connector
    * path. Highcharts provides 3 built-in connector shapes: `'fixedOffset'`
    * (default), `'straight'` and `'crookedLine'`. Using `'crookedLine'` has
    * the most sense (in most of the cases) when `'alignTo'` is set.
    *
    * Users can provide their own method by passing a function instead of a
    * String. 3 arguments are passed to the callback:
    *
    * - Object that holds the information about the coordinates of the label
    * (`x` & `y` properties) and how the label is located in relation to the
    * pie (`alignment` property). `alignment` can by one of the following:
    * `'left'` (pie on the left side of the data label), `'right'` (pie on the
    * right side of the data label) or `'center'` (data label overlaps the
    * pie).
    *
    * - Object that holds the information about the position of the connector.
    * Its `touchingSliceAt` porperty tells the position of the place where the
    * connector touches the slice.
    *
    * - Data label options
    *
    * The function has to return an SVG path definition in array form (see the
    * example).
    */
  var connectorShape: js.UndefOr[String | js.Function] = js.native
  /**
    * (Highcharts) The width of the line connecting the data label to the pie
    * slice.
    *
    * In styled mode, the connector stroke width is given in the
    * `.highcharts-data-label-connector` class.
    */
  var connectorWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Works only if `connectorShape` is `'crookedLine'`. It
    * defines how far from the vertical plot edge the coonnector path should be
    * crooked.
    */
  var crookDistance: js.UndefOr[String] = js.native
  /**
    * (Highcharts) The distance of the data label from the pie's edge. Negative
    * numbers put the data label on top of the pie slices. Can also be defined
    * as a percentage of pie's radius. Connectors are only shown for data
    * labels outside the pie.
    */
  var distance: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Whether to render the connector as a soft arc or a line with
    * sharp break. Works only if `connectorShape` equals to `fixedOffset`.
    */
  var softConnector: js.UndefOr[Boolean] = js.native
}

object SeriesPieDataLabelsOptionsObject {
  @scala.inline
  def apply(): SeriesPieDataLabelsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesPieDataLabelsOptionsObject]
  }
  @scala.inline
  implicit class SeriesPieDataLabelsOptionsObjectOps[Self <: SeriesPieDataLabelsOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTo")(js.undefined)
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
    def withConnectorPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorShape(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorShape")(js.undefined)
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
    def withCrookDistance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crookDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrookDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crookDistance")(js.undefined)
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
    def withSoftConnector(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softConnector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftConnector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softConnector")(js.undefined)
        ret
    }
  }
  
}

