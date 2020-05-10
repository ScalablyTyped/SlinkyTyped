package typingsSlinky.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggered when the mouse over on the cell.
    */
  var cellMouseEnter: js.UndefOr[js.Function1[/* e */ CellMouseEnterEventArgs, Unit]] = js.native
  /** Triggered when the mouse over on the cell.
    */
  var cellMouseLeave: js.UndefOr[js.Function1[/* e */ CellMouseLeaveEventArgs, Unit]] = js.native
  /** Triggered when the mouse over on the cell.
    */
  var cellMouseOver: js.UndefOr[js.Function1[/* e */ CellMouseOverEventArgs, Unit]] = js.native
  /** Triggered when the mouse over on the cell.
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.native
  /** Specifies the color values of the heat map column data.
    * @Default {[]}
    */
  var colorMappingCollection: js.UndefOr[js.Array[ColorMappingCollection]] = js.native
  /** Specifies the default column properties for all the column style not specified in column properties.
    * @Default {[]}
    */
  var defaultColumnStyle: js.UndefOr[DefaultColumnStyle] = js.native
  /** Specifies whether the virtualization can be enable or not.
    * @Default {false}
    */
  var enableVirtualization: js.UndefOr[Boolean] = js.native
  /** Specifies the property of the heat map cell.
    * @Default {Null}
    */
  var heatMapCell: js.UndefOr[HeatMapCell] = js.native
  /** Specifies the width of the heat map.
    * @Default {null}
    */
  var height: js.UndefOr[js.Any] = js.native
  /** Specifies the name of the heat map.
    * @Default {null}
    */
  var id: js.UndefOr[Double] = js.native
  /** Specifies can enable responsive mode or not for heat map.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Specifies the property and display value of the heat map column.
    * @Default {[]}
    */
  var itemsMapping: js.UndefOr[ItemsMapping] = js.native
  /** Specifies the source data of the heat map.
    * @Default {[]}
    */
  var itemsSource: js.UndefOr[js.Any] = js.native
  /** Specifies the no of legends can sync with heat map.
    * @Default {[]}
    */
  var legendCollection: js.UndefOr[js.Array[_]] = js.native
  /** Enables or disables tooltip of heatmap
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** Defines the tooltip that should be shown when the mouse hovers over rows/columns.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.native
  /** Specifies the width of the heat map.
    * @Default {null}
    */
  var width: js.UndefOr[js.Any] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellMouseEnter(value: /* e */ CellMouseEnterEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withCellMouseLeave(value: /* e */ CellMouseLeaveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withCellMouseOver(value: /* e */ CellMouseOverEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMouseOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSelected(value: /* e */ CellSelectedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withColorMappingCollection(value: js.Array[ColorMappingCollection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMappingCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMappingCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMappingCollection")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultColumnStyle(value: DefaultColumnStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumnStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColumnStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumnStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableVirtualization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVirtualization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableVirtualization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVirtualization")(js.undefined)
        ret
    }
    @scala.inline
    def withHeatMapCell(value: HeatMapCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatMapCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeatMapCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heatMapCell")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsMapping(value: ItemsMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsSource")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendCollection(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendCollection")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipSettings(value: TooltipSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: js.Any): Self = {
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

