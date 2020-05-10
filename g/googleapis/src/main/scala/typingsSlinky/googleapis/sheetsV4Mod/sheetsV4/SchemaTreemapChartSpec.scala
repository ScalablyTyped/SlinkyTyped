package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A &lt;a href=&quot;/chart/interactive/docs/gallery/treemap&quot;&gt;Treemap
  * chart&lt;/a&gt;.
  */
@js.native
trait SchemaTreemapChartSpec extends js.Object {
  /**
    * The data that determines the background color of each treemap data cell.
    * This field is optional. If not specified, size_data is used to determine
    * background colors. If specified, the data is expected to be numeric.
    * color_scale will determine how the values in this data map to data cell
    * background colors.
    */
  var colorData: js.UndefOr[SchemaChartData] = js.native
  /**
    * The color scale for data cells in the treemap chart. Data cells are
    * assigned colors based on their color values. These color values come from
    * color_data, or from size_data if color_data is not specified. Cells with
    * color values less than or equal to min_value will have minValueColor as
    * their background color. Cells with color values greater than or equal to
    * max_value will have maxValueColor as their background color. Cells with
    * color values between min_value and max_value will have background colors
    * on a gradient between minValueColor and maxValueColor, the midpoint of
    * the gradient being midValueColor. Cells with missing or non-numeric color
    * values will have noDataColor as their background color.
    */
  var colorScale: js.UndefOr[SchemaTreemapChartColorScale] = js.native
  /**
    * The background color for header cells.
    */
  var headerColor: js.UndefOr[SchemaColor] = js.native
  /**
    * True to hide tooltips.
    */
  var hideTooltips: js.UndefOr[Boolean] = js.native
  /**
    * The number of additional data levels beyond the labeled levels to be
    * shown on the treemap chart. These levels are not interactive and are
    * shown without their labels. Defaults to 0 if not specified.
    */
  var hintedLevels: js.UndefOr[Double] = js.native
  /**
    * The data that contains the treemap cell labels.
    */
  var labels: js.UndefOr[SchemaChartData] = js.native
  /**
    * The number of data levels to show on the treemap chart. These levels are
    * interactive and are shown with their labels. Defaults to 2 if not
    * specified.
    */
  var levels: js.UndefOr[Double] = js.native
  /**
    * The maximum possible data value. Cells with values greater than this will
    * have the same color as cells with this value. If not specified, defaults
    * to the actual maximum value from color_data, or the maximum value from
    * size_data if color_data is not specified.
    */
  var maxValue: js.UndefOr[Double] = js.native
  /**
    * The minimum possible data value. Cells with values less than this will
    * have the same color as cells with this value. If not specified, defaults
    * to the actual minimum value from color_data, or the minimum value from
    * size_data if color_data is not specified.
    */
  var minValue: js.UndefOr[Double] = js.native
  /**
    * The data the contains the treemap cells&#39; parent labels.
    */
  var parentLabels: js.UndefOr[SchemaChartData] = js.native
  /**
    * The data that determines the size of each treemap data cell. This data is
    * expected to be numeric. The cells corresponding to non-numeric or missing
    * data will not be rendered. If color_data is not specified, this data is
    * used to determine data cell background colors as well.
    */
  var sizeData: js.UndefOr[SchemaChartData] = js.native
  /**
    * The text format for all labels on the chart.
    */
  var textFormat: js.UndefOr[SchemaTextFormat] = js.native
}

object SchemaTreemapChartSpec {
  @scala.inline
  def apply(): SchemaTreemapChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTreemapChartSpec]
  }
  @scala.inline
  implicit class SchemaTreemapChartSpecOps[Self <: SchemaTreemapChartSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorData(value: SchemaChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorData")(js.undefined)
        ret
    }
    @scala.inline
    def withColorScale(value: SchemaTreemapChartColorScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScale")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderColor(value: SchemaColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHideTooltips(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTooltips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideTooltips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTooltips")(js.undefined)
        ret
    }
    @scala.inline
    def withHintedLevels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintedLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHintedLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hintedLevels")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: SchemaChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLevels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withParentLabels(value: SchemaChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeData(value: SchemaChartData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeData")(js.undefined)
        ret
    }
    @scala.inline
    def withTextFormat(value: SchemaTextFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textFormat")(js.undefined)
        ret
    }
  }
  
}

