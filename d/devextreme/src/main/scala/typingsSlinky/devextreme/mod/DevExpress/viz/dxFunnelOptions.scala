package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.Connector
import typingsSlinky.devextreme.anon.ElementItem
import typingsSlinky.devextreme.anon.EventItem
import typingsSlinky.devextreme.anon.HoverStyle
import typingsSlinky.devextreme.anon.KeepLabels
import typingsSlinky.devextreme.devextremeStrings.Bright
import typingsSlinky.devextreme.devextremeStrings.Carmine
import typingsSlinky.devextreme.devextremeStrings.Default
import typingsSlinky.devextreme.devextremeStrings.Material
import typingsSlinky.devextreme.devextremeStrings.Ocean
import typingsSlinky.devextreme.devextremeStrings.Office
import typingsSlinky.devextreme.devextremeStrings.Pastel
import typingsSlinky.devextreme.devextremeStrings.Soft
import typingsSlinky.devextreme.devextremeStrings.Vintage
import typingsSlinky.devextreme.devextremeStrings.Violet
import typingsSlinky.devextreme.devextremeStrings.`Dark Moon`
import typingsSlinky.devextreme.devextremeStrings.`Dark Violet`
import typingsSlinky.devextreme.devextremeStrings.`Green Mist`
import typingsSlinky.devextreme.devextremeStrings.`Harmony Light`
import typingsSlinky.devextreme.devextremeStrings.`Soft Blue`
import typingsSlinky.devextreme.devextremeStrings.`Soft Pastel`
import typingsSlinky.devextreme.devextremeStrings.alternate
import typingsSlinky.devextreme.devextremeStrings.blend
import typingsSlinky.devextreme.devextremeStrings.dynamicHeight
import typingsSlinky.devextreme.devextremeStrings.dynamicSlope
import typingsSlinky.devextreme.devextremeStrings.extrapolate
import typingsSlinky.devextreme.devextremeStrings.hide
import typingsSlinky.devextreme.devextremeStrings.multiple
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.shift
import typingsSlinky.devextreme.devextremeStrings.single_
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFunnelOptions extends BaseWidgetOptions[dxFunnel] {
  /** Specifies adaptive layout options. */
  var adaptiveLayout: js.UndefOr[KeepLabels] = js.native
  /** Specifies the algorithm for building the funnel. */
  var algorithm: js.UndefOr[dynamicHeight | dynamicSlope] = js.native
  /** Specifies which data source field provides arguments for funnel items. The argument identifies a funnel item and represents it on the legend. */
  var argumentField: js.UndefOr[String] = js.native
  /** Specifies which data source field provides colors for funnel items. If this field is absent, the palette provides the colors. */
  var colorField: js.UndefOr[String] = js.native
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.native
  /** Specifies whether funnel items change their style when a user pauses on them. */
  var hoverEnabled: js.UndefOr[Boolean] = js.native
  /** Turns the funnel upside down. */
  var inverted: js.UndefOr[Boolean] = js.native
  /** Configures funnel items' appearance. */
  var item: js.UndefOr[HoverStyle] = js.native
  /** Configures funnel item labels. */
  var label: js.UndefOr[Connector] = js.native
  /** Configures the legend. */
  var legend: js.UndefOr[dxFunnelLegend] = js.native
  /** Specifies the ratio between the height of the neck and that of the whole funnel. Accepts values from 0 to 1. Applies only if the algorithm is "dynamicHeight". */
  var neckHeight: js.UndefOr[Double] = js.native
  /** Specifies the ratio between the width of the neck and that of the whole funnel. Accepts values from 0 to 1. Applies only if the algorithm is "dynamicHeight". */
  var neckWidth: js.UndefOr[Double] = js.native
  /** A function that is executed after the pointer enters or leaves a funnel item. */
  var onHoverChanged: js.UndefOr[js.Function1[/* e */ ElementItem, _]] = js.native
  /** A function that is executed when a funnel item is clicked or tapped. */
  var onItemClick: js.UndefOr[(js.Function1[/* e */ EventItem, _]) | String] = js.native
  /** A function that is executed when a legend item is clicked or tapped. */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ EventItem, _]) | String] = js.native
  /** A function that is executed when a funnel item is selected or selection is canceled. */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ ElementItem, _]] = js.native
  /** Sets the palette to be used to colorize funnel items. */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  /** Specifies what to do with colors in the palette when their number is less than the number of funnel items. */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
  /** Specifies how item labels should behave when they overlap. */
  var resolveLabelOverlapping: js.UndefOr[hide | none | shift] = js.native
  /** Specifies whether a single or multiple funnel items can be in the selected state at a time. Assigning "none" disables the selection feature. */
  var selectionMode: js.UndefOr[multiple | none | single_] = js.native
  /** Specifies whether to sort funnel items. */
  var sortData: js.UndefOr[Boolean] = js.native
  /** Configures tooltips - small pop-up rectangles that display information about a data-visualizing widget element being pressed or hovered over with the mouse pointer. */
  @JSName("tooltip")
  var tooltip_dxFunnelOptions: js.UndefOr[dxFunnelTooltip] = js.native
  /** Specifies which data source field provides values for funnel items. The value defines a funnel item's area. */
  var valueField: js.UndefOr[String] = js.native
}

object dxFunnelOptions {
  @scala.inline
  def apply(): dxFunnelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFunnelOptions]
  }
  @scala.inline
  implicit class dxFunnelOptionsOps[Self <: dxFunnelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptiveLayout(value: KeepLabels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptiveLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withAlgorithm(value: dynamicHeight | dynamicSlope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withArgumentField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgumentField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argumentField")(js.undefined)
        ret
    }
    @scala.inline
    def withColorField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorField")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Array[_] | DataSource | DataSourceOptions | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: HoverStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: Connector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: dxFunnelLegend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withNeckHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neckHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeckHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neckHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withNeckWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neckWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeckWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neckWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHoverChanged(value: /* e */ ElementItem => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHoverChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHoverChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHoverChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemClickFunction1(value: /* e */ EventItem => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnItemClick(value: (js.Function1[/* e */ EventItem, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLegendClickFunction1(value: /* e */ EventItem => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLegendClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnLegendClick(value: (js.Function1[/* e */ EventItem, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLegendClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLegendClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLegendClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChanged(value: /* e */ ElementItem => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(
      value: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(js.undefined)
        ret
    }
    @scala.inline
    def withPaletteExtensionMode(value: alternate | blend | extrapolate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteExtensionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaletteExtensionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteExtensionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveLabelOverlapping(value: hide | none | shift): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveLabelOverlapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveLabelOverlapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveLabelOverlapping")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: multiple | none | single_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSortData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortData")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: dxFunnelTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueField")(js.undefined)
        ret
    }
  }
  
}

