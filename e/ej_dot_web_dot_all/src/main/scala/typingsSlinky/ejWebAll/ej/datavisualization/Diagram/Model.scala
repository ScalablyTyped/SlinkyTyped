package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggers When auto scroll is changed
    */
  var autoScrollChange: js.UndefOr[js.Function1[/* e */ AutoScrollChangeEventArgs, Unit]] = js.native
  /** Defines the background color of diagram elements
    * @Default {transparent}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Defines the path of the background image of diagram elements
    */
  var backgroundImage: js.UndefOr[String] = js.native
  /** Sets the direction of line bridges.
    * @Default {ej.datavisualization.Diagram.BridgeDirection.Top}
    */
  var bridgeDirection: js.UndefOr[BridgeDirection | String] = js.native
  /** Triggers when a node, connector or diagram is clicked
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Defines a set of custom commands and binds them with a set of desired key gestures.
    */
  var commandManager: js.UndefOr[CommandManager] = js.native
  /** Triggers when the connection is changed
    */
  var connectionChange: js.UndefOr[js.Function1[/* e */ ConnectionChangeEventArgs, Unit]] = js.native
  /** Triggers when the connector collection is changed
    */
  var connectorCollectionChange: js.UndefOr[js.Function1[/* e */ ConnectorCollectionChangeEventArgs, Unit]] = js.native
  /** Triggers when the connectors' source point is changed
    */
  var connectorSourceChange: js.UndefOr[js.Function1[/* e */ ConnectorSourceChangeEventArgs, Unit]] = js.native
  /** Triggers when the connectors' target point is changed
    */
  var connectorTargetChange: js.UndefOr[js.Function1[/* e */ ConnectorTargetChangeEventArgs, Unit]] = js.native
  /** Binds the custom JSON data with connector properties
    * @Default {null}
    */
  var connectorTemplate: js.UndefOr[js.Any] = js.native
  /** A collection of JSON objects where each object represents a connector
    * @Default {[]}
    */
  var connectors: js.UndefOr[js.Array[Connector]] = js.native
  /** Enables/Disables the default behaviors of the diagram.
    * @Default {ej.datavisualization.Diagram.DiagramConstraints.All}
    */
  var constraints: js.UndefOr[DiagramConstraints | String] = js.native
  /** An object to customize the context menu of diagram
    */
  var contextMenu: js.UndefOr[ContextMenu] = js.native
  /** Triggers before opening the context menu
    */
  var contextMenuBeforeOpen: js.UndefOr[js.Function1[/* e */ ContextMenuBeforeOpenEventArgs, Unit]] = js.native
  /** Triggers when a context menu item is clicked
    */
  var contextMenuClick: js.UndefOr[js.Function1[/* e */ ContextMenuClickEventArgs, Unit]] = js.native
  /** Triggered when the diagram is rendered completely.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Configures the data source that is to be bound with diagram
    */
  var dataSourceSettings: js.UndefOr[DataSourceSettings] = js.native
  /** Initializes the default values for nodes and connectors
    * @Default {{}}
    */
  var defaultSettings: js.UndefOr[DefaultSettings] = js.native
  /** Triggers when a node, connector or diagram model is clicked twice
    */
  var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
  /** Triggers while dragging the elements in diagram
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.native
  /** Triggers when a symbol is dragged into diagram from symbol palette
    */
  var dragEnter: js.UndefOr[js.Function1[/* e */ DragEnterEventArgs, Unit]] = js.native
  /** Triggers when a symbol is dragged outside of the diagram.
    */
  var dragLeave: js.UndefOr[js.Function1[/* e */ DragLeaveEventArgs, Unit]] = js.native
  /** Triggers when a symbol is dragged over diagram
    */
  var dragOver: js.UndefOr[js.Function1[/* e */ DragOverEventArgs, Unit]] = js.native
  /** Sets the type of JSON object to be drawn through drawing tool
    * @Default {{}}
    */
  var drawType: js.UndefOr[js.Any] = js.native
  /** Triggers when a symbol is dragged and dropped from symbol palette to drawing area
    */
  var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, Unit]] = js.native
  /** Triggers when editor got focus at the time of node's label or text node editing.
    */
  var editorFocusChange: js.UndefOr[js.Function1[/* e */ EditorFocusChangeEventArgs, Unit]] = js.native
  /** Enables or disables auto scroll in diagram
    * @Default {true}
    */
  var enableAutoScroll: js.UndefOr[Boolean] = js.native
  /** Enables or disables diagram context menu
    * @Default {true}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.native
  /** Triggers when a child is added to or removed from a group
    */
  var groupChange: js.UndefOr[js.Function1[/* e */ GroupChangeEventArgs, Unit]] = js.native
  /** Specifies the height of the diagram
    * @Default {null}
    */
  var height: js.UndefOr[String] = js.native
  /** Triggers when a change is reverted or restored(undo/redo)
    */
  var historyChange: js.UndefOr[js.Function1[/* e */ HistoryChangeEventArgs, Unit]] = js.native
  /** Customizes the undo redo functionality
    */
  var historyManager: js.UndefOr[HistoryManager] = js.native
  /** Triggers when a diagram element is clicked
    */
  var itemClick: js.UndefOr[js.Function1[/* e */ ItemClickEventArgs, Unit]] = js.native
  /** Defines the type of the rendering mode of label.
    * @Default {HTML}
    */
  var labelRenderingMode: js.UndefOr[LabelRenderingMode | String] = js.native
  /** A collection of JSON objects where each object represents a layer. Layer is a named category of diagram shapes.
    * @Default {[]}
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  /** Automatically arranges the nodes and connectors in a predefined manner.
    */
  var layout: js.UndefOr[Layout] = js.native
  /** Defines the current culture of diagram
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Triggers when mouse enters a node/connector
    */
  var mouseEnter: js.UndefOr[js.Function1[/* e */ MouseEnterEventArgs, Unit]] = js.native
  /** Triggers when mouse leaves node/connector
    */
  var mouseLeave: js.UndefOr[js.Function1[/* e */ MouseLeaveEventArgs, Unit]] = js.native
  /** Triggers when mouse hovers over a node/connector
    */
  var mouseOver: js.UndefOr[js.Function1[/* e */ MouseOverEventArgs, Unit]] = js.native
  /** Triggers when node collection is changed
    */
  var nodeCollectionChange: js.UndefOr[js.Function1[/* e */ NodeCollectionChangeEventArgs, Unit]] = js.native
  /** Binds the custom JSON data with node properties
    * @Default {null}
    */
  var nodeTemplate: js.UndefOr[js.Any] = js.native
  /** Array of JSON objects where each object represents a node
    * @Default {[]}
    */
  var nodes: js.UndefOr[js.Array[Node]] = js.native
  /** Defines the size and appearance of diagram page
    */
  var pageSettings: js.UndefOr[PageSettings] = js.native
  /** Triggers when the node properties(x, y,width and height alone) are changed using nudge commands or updateNode API.
    */
  var propertyChange: js.UndefOr[js.Function1[/* e */ PropertyChangeEventArgs, Unit]] = js.native
  /** Triggers when the diagram elements are rotated
    */
  var rotationChange: js.UndefOr[js.Function1[/* e */ RotationChangeEventArgs, Unit]] = js.native
  /** Defines the properties of the both the horizontal and vertical gauge to measure the diagram area.
    */
  var rulerSettings: js.UndefOr[RulerSettings] = js.native
  /** Triggers when the diagram is zoomed or panned
    */
  var scrollChange: js.UndefOr[js.Function1[/* e */ ScrollChangeEventArgs, Unit]] = js.native
  /** Defines the zoom value, zoom factor, scroll status and view port size of the diagram
    */
  var scrollSettings: js.UndefOr[ScrollSettings] = js.native
  /** Triggers when a connector segment is edited
    */
  var segmentChange: js.UndefOr[js.Function1[/* e */ SegmentChangeEventArgs, Unit]] = js.native
  /** Defines the size and position of selected items and defines the appearance of selector
    */
  var selectedItems: js.UndefOr[SelectedItems] = js.native
  /** Triggers when the selection is changed in diagram
    */
  var selectionChange: js.UndefOr[js.Function1[/* e */ SelectionChangeEventArgs, Unit]] = js.native
  /** Defines diagram serialization properties that would defines how the serialization content would be.
    */
  var serializationSettings: js.UndefOr[SerializationSettings] = js.native
  /** Used to decide on the action on Diagramming elements at runtime.
    */
  var setTool: js.UndefOr[js.Function1[/* e */ SetToolEventArgs, Unit]] = js.native
  /** Enables or disables tooltip of diagram
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** Triggers when a node is resized
    */
  var sizeChange: js.UndefOr[js.Function1[/* e */ SizeChangeEventArgs, Unit]] = js.native
  /** Defines the gridlines and defines how and when the objects have to be snapped
    */
  var snapSettings: js.UndefOr[SnapSettings] = js.native
  /** Triggers when label editing is ended
    */
  var textChange: js.UndefOr[js.Function1[/* e */ TextChangeEventArgs, Unit]] = js.native
  /** Enables/Disables the interactive behaviors of diagram.
    * @Default {ej.datavisualization.Diagram.Tool.All}
    */
  var tool: js.UndefOr[Tool | String] = js.native
  /** An object that defines the description, appearance and alignments of tooltips
    * @Default {null}
    */
  var tooltip: js.UndefOr[Tooltip] = js.native
  /** Specifies the width of the diagram
    * @Default {null}
    */
  var width: js.UndefOr[String] = js.native
  /** Sets the factor by which we can zoom in or zoom out
    * @Default {0.2}
    */
  var zoomFactor: js.UndefOr[Double] = js.native
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
    def withAutoScrollChange(value: /* e */ AutoScrollChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAutoScrollChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollChange")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(js.undefined)
        ret
    }
    @scala.inline
    def withBridgeDirection(value: BridgeDirection | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridgeDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBridgeDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridgeDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: /* e */ ClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withCommandManager(value: CommandManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandManager")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionChange(value: /* e */ ConnectionChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConnectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorCollectionChange(value: /* e */ ConnectorCollectionChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorCollectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConnectorCollectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorCollectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorSourceChange(value: /* e */ ConnectorSourceChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorSourceChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConnectorSourceChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorSourceChange")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorTargetChange(value: /* e */ ConnectorTargetChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorTargetChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConnectorTargetChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorTargetChange")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectors(value: js.Array[Connector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectors")(js.undefined)
        ret
    }
    @scala.inline
    def withConstraints(value: DiagramConstraints | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenu(value: ContextMenu): Self = {
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
    def withContextMenuBeforeOpen(value: /* e */ ContextMenuBeforeOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuBeforeOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContextMenuBeforeOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuBeforeOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuClick(value: /* e */ ContextMenuClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContextMenuClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuClick")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceSettings(value: DataSourceSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSettings(value: DefaultSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSettings")(js.undefined)
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
    def withDrag(value: /* e */ DragEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEnter(value: /* e */ DragEnterEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withDragLeave(value: /* e */ DragLeaveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withDragOver(value: /* e */ DragOverEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawType")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop(value: /* e */ DropEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorFocusChange(value: /* e */ EditorFocusChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorFocusChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEditorFocusChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorFocusChange")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAutoScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupChange(value: /* e */ GroupChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGroupChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupChange")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
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
    def withHistoryChange(value: /* e */ HistoryChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHistoryChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyChange")(js.undefined)
        ret
    }
    @scala.inline
    def withHistoryManager(value: HistoryManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistoryManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyManager")(js.undefined)
        ret
    }
    @scala.inline
    def withItemClick(value: /* e */ ItemClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemClick")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelRenderingMode(value: LabelRenderingMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRenderingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelRenderingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRenderingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[Layer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: Layout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
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
    def withMouseEnter(value: /* e */ MouseEnterEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseLeave(value: /* e */ MouseLeaveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseOver(value: /* e */ MouseOverEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeCollectionChange(value: /* e */ NodeCollectionChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCollectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeCollectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCollectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withNodes(value: js.Array[Node]): Self = {
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
    def withPageSettings(value: PageSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyChange(value: /* e */ PropertyChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPropertyChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationChange(value: /* e */ RotationChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRotationChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRulerSettings(value: RulerSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulerSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRulerSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulerSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollChange(value: /* e */ ScrollChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollChange")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSettings(value: ScrollSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentChange(value: /* e */ SegmentChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSegmentChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItems(value: SelectedItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionChange(value: /* e */ SelectionChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializationSettings(value: SerializationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializationSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializationSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializationSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTool(value: /* e */ SetToolEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTool")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTool")(js.undefined)
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
    def withSizeChange(value: /* e */ SizeChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSizeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapSettings(value: SnapSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTextChange(value: /* e */ TextChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTextChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textChange")(js.undefined)
        ret
    }
    @scala.inline
    def withTool(value: Tool | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tool")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: Tooltip): Self = {
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
    def withWidth(value: String): Self = {
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
    @scala.inline
    def withZoomFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomFactor")(js.undefined)
        ret
    }
  }
  
}

