package typingsSlinky.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Fires, on clicking the tree map items.
    */
  var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Specifies the border brush color of the treemap
    * @Default {white}
    */
  var borderBrush: js.UndefOr[String] = js.native
  /** Specifies the border thickness of the treemap
    * @Default {1}
    */
  var borderThickness: js.UndefOr[Double] = js.native
  /** Specifies the field name in the datasource that contains color values for treemap items.
    * @Default {null}
    */
  var colorPath: js.UndefOr[String] = js.native
  /** Specifies the color value path of the treemap
    * @Default {null}
    */
  var colorValuePath: js.UndefOr[String] = js.native
  /** Specifies the datasource of the treemap
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Specifies the desaturationColorMapping settings of the treemap
    */
  var desaturationColorMapping: js.UndefOr[DesaturationColorMapping] = js.native
  /** Specifies the dockPosition for legend
    * @Default {top}
    */
  var dockPosition: js.UndefOr[DockPosition | String] = js.native
  /** Fires, on double clicking the tree map items.
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  /** This property is used to select group of treemap items while clicking and dragging
    * @Default {false}
    */
  var draggingGroupOnSelection: js.UndefOr[Boolean] = js.native
  /** This property is used to select treemap items while clicking and dragging
    * @Default {false}
    */
  var draggingOnSelection: js.UndefOr[Boolean] = js.native
  /** specifies the drillDown header color
    * @Default {'null'}
    */
  var drillDownHeaderColor: js.UndefOr[String] = js.native
  /** Triggers on treemap  drilldown  item  selected.
    */
  var drillDownItemSelected: js.UndefOr[js.Function1[/* e */ DrillDownItemSelectedEventArgs, Unit]] = js.native
  /** Specifies to render particular level of the treemap.
    * @Default {0}
    */
  var drillDownLevel: js.UndefOr[Double] = js.native
  /** specifies the drillDown selection color
    * @Default {'#000000'}
    */
  var drillDownSelectionColor: js.UndefOr[String] = js.native
  /** Specifies to drill the particular data of the treemap.
    * @Default {null}
    */
  var drillDownValue: js.UndefOr[String] = js.native
  /** Triggers when drilldown is started
    */
  var drillStarted: js.UndefOr[js.Function1[/* e */ DrillStartedEventArgs, Unit]] = js.native
  /** Enable/Disable the drillDown for treemap
    * @Default {false}
    */
  var enableDrillDown: js.UndefOr[Boolean] = js.native
  /** Specifies whether gradient color has to be applied for treemap items
    * @Default {false}
    */
  var enableGradient: js.UndefOr[Boolean] = js.native
  /** Specify to convert the date object to string, using locale settings.
    * @Default {false}
    */
  var enableGroupSeparator: js.UndefOr[Boolean] = js.native
  /** Specifies whether treemap need to resize when container is resized
    * @Default {true}
    */
  var enableResize: js.UndefOr[Boolean] = js.native
  /** Specifies the group color mapping of the treemap
    * @Default {[]}
    */
  var groupColorMapping: js.UndefOr[js.Array[GroupColorMapping]] = js.native
  /** Specifies the selection mode of the treemap. Accepted selection mode values are Default and Multiple.
    * @Default {default}
    */
  var groupSelectionMode: js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.TreeMap.groupSelectionMode | String] = js.native
  /** Specifies the header for parent item during drilldown. This is applicable only for hierarchical data source.
    * @Default {null}
    */
  var header: js.UndefOr[String] = js.native
  /** Triggers before rendering the treemap drilldown header template
    */
  var headerTemplateRendering: js.UndefOr[js.Function1[/* e */ HeaderTemplateRenderingEventArgs, Unit]] = js.native
  /** Specifies the highlight border brush of treemap
    * @Default {gray}
    */
  var highlightBorderBrush: js.UndefOr[String] = js.native
  /** Specifies the border thickness when treemap items is highlighted in the treemap
    * @Default {5}
    */
  var highlightBorderThickness: js.UndefOr[Double] = js.native
  /** Specifies the highlight border brush of treemap
    * @Default {gray}
    */
  var highlightGroupBorderBrush: js.UndefOr[String] = js.native
  /** Specifies the border thickness when treemap items is highlighted in the treemap
    * @Default {5}
    */
  var highlightGroupBorderThickness: js.UndefOr[Double] = js.native
  /** Specifies whether treemap item need to highlighted on selection
    * @Default {false}
    */
  var highlightGroupOnSelection: js.UndefOr[Boolean] = js.native
  /** Specifies whether treemap item need to highlighted on selection
    * @Default {false}
    */
  var highlightOnSelection: js.UndefOr[Boolean] = js.native
  /** Specifies whether datasource is hierarchical or not.
    * @Default {false}
    */
  var isHierarchicalDatasource: js.UndefOr[Boolean] = js.native
  /** Controls whether Treemap has to be responsive while resizing the window.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Triggers while rendering each treemap items.
    */
  var itemRendering: js.UndefOr[js.Function1[/* e */ ItemRenderingEventArgs, Unit]] = js.native
  /** Specifies the items layout mode of the treemap. Accepted itemsLayoutMode values are Squarified, SliceAndDiceHorizontal, SliceAndDiceVertical and SliceAndDiceAuto
    * @Default {Squarified}
    */
  var itemsLayoutMode: js.UndefOr[ItemsLayoutMode | String] = js.native
  /** Specifies the leaf settings of the treemap
    */
  var leafItemSettings: js.UndefOr[LeafItemSettings] = js.native
  /** Triggers while rendering each legend item
    */
  var legendItemRendering: js.UndefOr[js.Function1[/* e */ LegendItemRenderingEventArgs, Unit]] = js.native
  /** Specifies the legend settings of the treemap
    */
  var legendSettings: js.UndefOr[LegendSettings] = js.native
  /** Specify levels of treemap for grouped visualization of data
    * @Default {[]}
    */
  var levels: js.UndefOr[js.Array[Level]] = js.native
  /** Name of the culture based on which Tree Map should be localized.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Specifies the paletteColorMapping of the treemap
    */
  var paletteColorMapping: js.UndefOr[PaletteColorMapping] = js.native
  /** Specifies the rangeColorMapping settings of the treemap
    * @Default {[]}
    */
  var rangeColorMapping: js.UndefOr[js.Array[RangeColorMapping]] = js.native
  /** Triggers after refreshing the treemap items.
    */
  var refreshed: js.UndefOr[js.Function1[/* e */ RefreshedEventArgs, Unit]] = js.native
  /** Fires, on right clicking the tree map items.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  /** Specifies the selection mode of treemap item. Accepted selection mode values are Default and Multiple.
    * @Default {default}
    */
  var selectionMode: js.UndefOr[typingsSlinky.ejWebAll.ej.datavisualization.TreeMap.selectionMode | String] = js.native
  /** Specifies the legend visibility status of the treemap
    * @Default {false}
    */
  var showLegend: js.UndefOr[Boolean] = js.native
  /** Specifies whether treemap showTooltip need to be visible
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** Specifies the tooltip template of the treemap
    * @Default {null}
    */
  var tooltipTemplate: js.UndefOr[String] = js.native
  /** Triggers when the group selection is performed on treemap items.
    */
  var treeMapGroupSelected: js.UndefOr[js.Function1[/* e */ TreeMapGroupSelectedEventArgs, Unit]] = js.native
  /** Triggers on treemap item selected.
    */
  var treeMapItemSelected: js.UndefOr[js.Function1[/* e */ TreeMapItemSelectedEventArgs, Unit]] = js.native
  /** Hold the treeMapItems to be displayed in treemap
    * @Default {[]}
    */
  var treeMapItems: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the uniColorMapping settings of the treemap
    */
  var uniColorMapping: js.UndefOr[UniColorMapping] = js.native
  /** Specifies the weight value path of the treemap
    * @Default {null}
    */
  var weightValuePath: js.UndefOr[String] = js.native
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
    def withClick(value: /* e */ ClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Click")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withColorPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPath")(js.undefined)
        ret
    }
    @scala.inline
    def withColorValuePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValuePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorValuePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValuePath")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
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
    def withDesaturationColorMapping(value: DesaturationColorMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desaturationColorMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesaturationColorMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desaturationColorMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withDockPosition(value: DockPosition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggingGroupOnSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingGroupOnSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggingGroupOnSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingGroupOnSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggingOnSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingOnSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggingOnSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingOnSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillDownHeaderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownHeaderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillDownHeaderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownHeaderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillDownItemSelected(value: /* e */ DrillDownItemSelectedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownItemSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrillDownItemSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownItemSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillDownLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillDownLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillDownSelectionColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownSelectionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillDownSelectionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownSelectionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillDownValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillDownValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDrillStarted(value: /* e */ DrillStartedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillStarted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrillStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDrillDown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDrillDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDrillDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDrillDown")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGradient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGroupSeparator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGroupSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResize")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupColorMapping(value: js.Array[GroupColorMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupColorMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupColorMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupColorMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSelectionMode(value: groupSelectionMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSelectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSelectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTemplateRendering(value: /* e */ HeaderTemplateRenderingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplateRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeaderTemplateRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplateRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightBorderBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightBorderBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightBorderBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightBorderBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightBorderThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightBorderThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightBorderThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightBorderThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightGroupBorderBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightGroupBorderBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightGroupBorderBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightGroupBorderBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightGroupBorderThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightGroupBorderThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightGroupBorderThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightGroupBorderThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightGroupOnSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightGroupOnSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightGroupOnSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightGroupOnSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightOnSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightOnSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightOnSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightOnSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHierarchicalDatasource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHierarchicalDatasource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHierarchicalDatasource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHierarchicalDatasource")(js.undefined)
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
    def withItemRendering(value: /* e */ ItemRenderingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsLayoutMode(value: ItemsLayoutMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsLayoutMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsLayoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsLayoutMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLeafItemSettings(value: LeafItemSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leafItemSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeafItemSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leafItemSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendItemRendering(value: /* e */ LegendItemRenderingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemRendering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLegendItemRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendItemRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendSettings(value: LegendSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withLevels(value: js.Array[Level]): Self = {
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
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withPaletteColorMapping(value: PaletteColorMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteColorMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaletteColorMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paletteColorMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeColorMapping(value: js.Array[RangeColorMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeColorMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeColorMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeColorMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshed(value: /* e */ RefreshedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRefreshed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshed")(js.undefined)
        ret
    }
    @scala.inline
    def withRightClick(value: /* e */ RightClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRightClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: selectionMode | String): Self = {
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
    def withShowLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegend")(js.undefined)
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
    def withTooltipTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeMapGroupSelected(value: /* e */ TreeMapGroupSelectedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeMapGroupSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTreeMapGroupSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeMapGroupSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeMapItemSelected(value: /* e */ TreeMapItemSelectedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeMapItemSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTreeMapItemSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeMapItemSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeMapItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeMapItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeMapItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeMapItems")(js.undefined)
        ret
    }
    @scala.inline
    def withUniColorMapping(value: UniColorMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniColorMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniColorMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniColorMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightValuePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightValuePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightValuePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightValuePath")(js.undefined)
        ret
    }
  }
  
}

