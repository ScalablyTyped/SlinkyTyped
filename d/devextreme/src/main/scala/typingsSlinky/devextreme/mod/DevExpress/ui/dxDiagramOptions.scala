package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonAllowEditImage
import typingsSlinky.devextreme.AnonAutoLayout
import typingsSlinky.devextreme.AnonCollapsible
import typingsSlinky.devextreme.AnonCommands
import typingsSlinky.devextreme.AnonComponentDxDiagram
import typingsSlinky.devextreme.AnonElementItems
import typingsSlinky.devextreme.AnonFromExpr
import typingsSlinky.devextreme.AnonGroups
import typingsSlinky.devextreme.AnonItem
import typingsSlinky.devextreme.AnonItemsValue
import typingsSlinky.devextreme.AnonProxyUrl
import typingsSlinky.devextreme.AnonVisible
import typingsSlinky.devextreme.AnonWidth
import typingsSlinky.devextreme.devextremeStrings.cm
import typingsSlinky.devextreme.devextremeStrings.disabled
import typingsSlinky.devextreme.devextremeStrings.fitContent
import typingsSlinky.devextreme.devextremeStrings.fitWidth
import typingsSlinky.devextreme.devextremeStrings.in
import typingsSlinky.devextreme.devextremeStrings.landscape
import typingsSlinky.devextreme.devextremeStrings.portrait
import typingsSlinky.devextreme.devextremeStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDiagramOptions extends WidgetOptions[dxDiagram] {
  /** Specifies whether the Diagram widget automatically zooms the work area. */
  var autoZoom: js.UndefOr[fitContent | fitWidth | disabled] = js.native
  /** Configures the context menu's settings. */
  var contextMenu: js.UndefOr[AnonCommands] = js.native
  /** Provide access to an array of custom shapes. */
  var customShapes: js.UndefOr[js.Array[AnonAllowEditImage]] = js.native
  /** Allows you to bind the collection of diagram edges to a data source. */
  var edges: js.UndefOr[AnonFromExpr] = js.native
  /** Configures export settings. */
  var export: js.UndefOr[AnonProxyUrl] = js.native
  /** Specifies whether or not to display the widget in full-screen mode. */
  var fullScreen: js.UndefOr[Boolean] = js.native
  /** Specifies the grid pitch. */
  var gridSize: js.UndefOr[Double | AnonItemsValue] = js.native
  /** Allows you to bind the collection of diagram nodes to a data source. */
  var nodes: js.UndefOr[AnonAutoLayout] = js.native
  /** A function that is executed when the diagram's data changes. */
  var onDataChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxDiagram, _]] = js.native
  /** A function that is executed after a shape or connector is clicked. */
  var onItemClick: js.UndefOr[js.Function1[/* e */ AnonItem, _]] = js.native
  /** A function that is executed after a shape or connector is double-clicked. */
  var onItemDblClick: js.UndefOr[js.Function1[/* e */ AnonItem, _]] = js.native
  /** A function that is executed after the selection is changed in the Diagram. */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonElementItems, _]] = js.native
  /** Specifies the color of a diagram page. */
  var pageColor: js.UndefOr[String] = js.native
  /** Specifies the page orientation. */
  var pageOrientation: js.UndefOr[portrait | landscape] = js.native
  /** Specifies a size of pages. */
  var pageSize: js.UndefOr[AnonWidth] = js.native
  /** Provides access to Properties panel settings. */
  var propertiesPanel: js.UndefOr[AnonCollapsible] = js.native
  /** Specifies whether the diagram is read-only. */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Specifies whether grid lines are visible. */
  var showGrid: js.UndefOr[Boolean] = js.native
  /** Switch the Diagram widget to simple view mode. */
  var simpleView: js.UndefOr[Boolean] = js.native
  /** Specifies whether diagram elements should snap to grid lines. */
  var snapToGrid: js.UndefOr[Boolean] = js.native
  /** Provides access to toolbar settings. */
  var toolbar: js.UndefOr[AnonVisible] = js.native
  /** Provides access to toolbox settings. */
  var toolbox: js.UndefOr[AnonGroups] = js.native
  /** Specifies the unit for measurement options (for example, defaultHeight, gridSize, leftExpr). */
  var units: js.UndefOr[in | cm | px] = js.native
  /** Specifies the measurement unit that is displayed in user interface elements. */
  var viewUnits: js.UndefOr[in | cm | px] = js.native
  /** Specifies the zoom level. */
  var zoomLevel: js.UndefOr[Double | AnonItemsValue] = js.native
}

object dxDiagramOptions {
  @scala.inline
  def apply(): dxDiagramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramOptions]
  }
  @scala.inline
  implicit class dxDiagramOptionsOps[Self <: dxDiagramOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoZoom(value: fitContent | fitWidth | disabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenu(value: AnonCommands): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomShapes(value: js.Array[AnonAllowEditImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customShapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomShapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customShapes")(js.undefined)
        ret
    }
    @scala.inline
    def withEdges(value: AnonFromExpr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(js.undefined)
        ret
    }
    @scala.inline
    def withExport(value: AnonProxyUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(js.undefined)
        ret
    }
    @scala.inline
    def withFullScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withGridSize(value: Double | AnonItemsValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNodes(value: AnonAutoLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDataChanged(value: /* e */ AnonComponentDxDiagram => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDataChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDataChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDataChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemClick(value: /* e */ AnonItem => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemDblClick(value: /* e */ AnonItem => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDblClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChanged(value: /* e */ AnonElementItems => _): Self = {
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
    def withPageColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPageOrientation(value: portrait | landscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: AnonWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertiesPanel(value: AnonCollapsible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertiesPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertiesPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertiesPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleView")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapToGrid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapToGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapToGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapToGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: AnonVisible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbox(value: AnonGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbox")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: in | cm | px): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
    @scala.inline
    def withViewUnits(value: in | cm | px): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomLevel(value: Double | AnonItemsValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(js.undefined)
        ret
    }
  }
  
}

