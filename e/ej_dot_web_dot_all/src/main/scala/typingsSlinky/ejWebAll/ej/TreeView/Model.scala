package typingsSlinky.ejWebAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Gets or sets a value that indicates whether to enable drag and drop a node within the same tree.
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable drag and drop a node in inter ej.TreeView.
    * @Default {true}
    */
  var allowDragAndDropAcrossControl: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to drop a node to a child of particular node.
    * @Default {true}
    */
  var allowDropChild: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to drop a node to a sibling of particular node.
    * @Default {true}
    */
  var allowDropSibling: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable node editing support for TreeView.
    * @Default {false}
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable keyboard support for TreeView actions like nodeSelection, nodeEditing, nodeExpand, nodeCollapse, nodeCut and Paste.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable multi selection support for TreeView.
    * @Default {false}
    */
  var allowMultiSelection: js.UndefOr[Boolean] = js.native
  /** Allow us to specify the parent and child nodes to get auto check while we check or uncheck a node.
    * @Default {true}
    */
  var autoCheck: js.UndefOr[Boolean] = js.native
  /** Allow us to specify the parent node to be retain in checked or unchecked state instead of going for indeterminate state.
    * @Default {false}
    */
  var autoCheckParentNode: js.UndefOr[Boolean] = js.native
  /** Fires before adding node to TreeView.
    */
  var beforeAdd: js.UndefOr[js.Function1[/* e */ BeforeAddEventArgs, Unit]] = js.native
  /** Fires before collapse a node.
    */
  var beforeCollapse: js.UndefOr[js.Function1[/* e */ BeforeCollapseEventArgs, Unit]] = js.native
  /** Fires before cut node in TreeView.
    */
  var beforeCut: js.UndefOr[js.Function1[/* e */ BeforeCutEventArgs, Unit]] = js.native
  /** Fires before deleting node in TreeView.
    */
  var beforeDelete: js.UndefOr[js.Function1[/* e */ BeforeDeleteEventArgs, Unit]] = js.native
  /** Fires before editing the node in TreeView.
    */
  var beforeEdit: js.UndefOr[js.Function1[/* e */ BeforeEditEventArgs, Unit]] = js.native
  /** Fires before expanding the node.
    */
  var beforeExpand: js.UndefOr[js.Function1[/* e */ BeforeExpandEventArgs, Unit]] = js.native
  /** Fires before loading nodes to TreeView.
    */
  var beforeLoad: js.UndefOr[js.Function1[/* e */ BeforeLoadEventArgs, Unit]] = js.native
  /** Fires before paste node in TreeView.
    */
  var beforePaste: js.UndefOr[js.Function1[/* e */ BeforePasteEventArgs, Unit]] = js.native
  /** Fires before selecting node in TreeView.
    */
  var beforeSelect: js.UndefOr[js.Function1[/* e */ BeforeSelectEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates the checkedNodes index collection as an array. The given array index position denotes the nodes, that are checked while rendering TreeView.
    * @Default {[]}
    */
  var checkedNodes: js.UndefOr[js.Array[_]] = js.native
  /** Fires when TreeView created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root CSS class for TreeView which allow us to customize the appearance.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Fires when TreeView destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to enable or disable the animation effect while expanding or collapsing a node.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Allow us to prevent multiple nodes to be in expanded state. If it set to false, previously expanded node will be collapsed automatically, while we expand a node.
    * @Default {true}
    */
  var enableMultipleExpand: js.UndefOr[Boolean] = js.native
  /** Sets a value that indicates whether to persist the TreeView model state in page using applicable medium i.e., HTML5 localStorage or cookies
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to align content in the TreeView control from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether a TreeView can be enabled or disabled. No actions can be performed while this property is set as false
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates the TreeView node can be expand or collapse by using the specified action.
    * @Default {dblclick}
    */
  var expandOn: js.UndefOr[String] = js.native
  /** Gets or sets a array of value that indicates the expandedNodes index collection as an array. The given array index position denotes the nodes, that are expanded while rendering
    * TreeView.
    * @Default {[]}
    */
  var expandedNodes: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a fields object that allow us to map the data members with field properties in order to make the data binding easier.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.native
  /** Gets or sets a value that indicates whether to enable full row selection support for TreeView.
    * @Default {false}
    */
  var fullRowSelect: js.UndefOr[Boolean] = js.native
  /** Defines the height of the TreeView.
    * @Default {Null}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Specifies the HTML Attributes for the TreeView. Using this API we can add custom attributes in TreeView control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Fires before nodeEdit Successful.
    */
  var inlineEditValidation: js.UndefOr[js.Function1[/* e */ InlineEditValidationEventArgs, Unit]] = js.native
  /** Fires when key pressed successfully.
    */
  var keyPress: js.UndefOr[js.Function1[/* e */ KeyPressEventArgs, Unit]] = js.native
  /** Fires when data load fails.
    */
  var loadError: js.UndefOr[js.Function1[/* e */ LoadErrorEventArgs, Unit]] = js.native
  /** Specifies the child nodes to be loaded on demand
    * @Default {false}
    */
  var loadOnDemand: js.UndefOr[Boolean] = js.native
  /** Fires when data loaded successfully.
    */
  var loadSuccess: js.UndefOr[js.Function1[/* e */ LoadSuccessEventArgs, Unit]] = js.native
  /** Fires once node added successfully.
    */
  var nodeAdd: js.UndefOr[js.Function1[/* e */ NodeAddEventArgs, Unit]] = js.native
  /** Fires once node checked successfully.
    */
  var nodeCheck: js.UndefOr[js.Function1[/* e */ NodeCheckEventArgs, Unit]] = js.native
  /** Fires when node clicked successfully.
    */
  var nodeClick: js.UndefOr[js.Function1[/* e */ NodeClickEventArgs, Unit]] = js.native
  /** Fires when node collapsed successfully.
    */
  var nodeCollapse: js.UndefOr[js.Function1[/* e */ NodeCollapseEventArgs, Unit]] = js.native
  /** Fires when node cut successfully.
    */
  var nodeCut: js.UndefOr[js.Function1[/* e */ NodeCutEventArgs, Unit]] = js.native
  /** Fires when node deleted successfully.
    */
  var nodeDelete: js.UndefOr[js.Function1[/* e */ NodeDeleteEventArgs, Unit]] = js.native
  /** Fires when node dragging.
    */
  var nodeDrag: js.UndefOr[js.Function1[/* e */ NodeDragEventArgs, Unit]] = js.native
  /** Fires once node drag start successfully.
    */
  var nodeDragStart: js.UndefOr[js.Function1[/* e */ NodeDragStartEventArgs, Unit]] = js.native
  /** Fires before the dragged node to be dropped.
    */
  var nodeDragStop: js.UndefOr[js.Function1[/* e */ NodeDragStopEventArgs, Unit]] = js.native
  /** Fires once node dropped successfully.
    */
  var nodeDropped: js.UndefOr[js.Function1[/* e */ NodeDroppedEventArgs, Unit]] = js.native
  /** Fires once node edited successfully.
    */
  var nodeEdit: js.UndefOr[js.Function1[/* e */ NodeEditEventArgs, Unit]] = js.native
  /** Fires once node expanded successfully.
    */
  var nodeExpand: js.UndefOr[js.Function1[/* e */ NodeExpandEventArgs, Unit]] = js.native
  /** Fires once node pasted successfully.
    */
  var nodePaste: js.UndefOr[js.Function1[/* e */ NodePasteEventArgs, Unit]] = js.native
  /** Fires when node selected successfully.
    */
  var nodeSelect: js.UndefOr[js.Function1[/* e */ NodeSelectEventArgs, Unit]] = js.native
  /** Fires once node unchecked successfully.
    */
  var nodeUncheck: js.UndefOr[js.Function1[/* e */ NodeUncheckEventArgs, Unit]] = js.native
  /** Fires once node unselected successfully.
    */
  var nodeUnselect: js.UndefOr[js.Function1[/* e */ NodeUnselectEventArgs, Unit]] = js.native
  /** Fires when TreeView nodes are loaded successfully
    */
  var ready: js.UndefOr[js.Function1[/* e */ ReadyEventArgs, Unit]] = js.native
  /** Gets or Sets a value that indicates the index position of a tree node. The particular index tree node will be selected while rendering the TreeView.
    * @Default {-1}
    */
  var selectedNode: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates the selectedNodes index collection as an array. The given array index position denotes the nodes, that are selected while rendering TreeView.
    * @Default {[]}
    */
  var selectedNodes: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a value that indicates whether to display or hide checkbox for all TreeView nodes.
    * @Default {false}
    */
  var showCheckbox: js.UndefOr[Boolean] = js.native
  /** By using sortSettings property, you can customize the sorting option in TreeView control.
    */
  var sortSettings: js.UndefOr[SortSettings] = js.native
  /** Allow us to use custom template in order to create TreeView.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Defines the width of the TreeView.
    * @Default {Null}
    */
  var width: js.UndefOr[String | Double] = js.native
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
    def withAllowDragAndDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDragAndDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDragAndDropAcrossControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDropAcrossControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDragAndDropAcrossControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDropAcrossControl")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDropChild(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDropChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDropChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDropChild")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDropSibling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDropSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDropSibling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDropSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowKeyboardNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKeyboardNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowKeyboardNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKeyboardNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMultiSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultiSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCheckParentNode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCheckParentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCheckParentNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCheckParentNode")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeAdd(value: /* e */ BeforeAddEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCollapse(value: /* e */ BeforeCollapseEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCut(value: /* e */ BeforeCutEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCut")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDelete(value: /* e */ BeforeDeleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeEdit(value: /* e */ BeforeEditEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeExpand(value: /* e */ BeforeExpandEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeLoad(value: /* e */ BeforeLoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforePaste(value: /* e */ BeforePasteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePaste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforePaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePaste")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSelect(value: /* e */ BeforeSelectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedNodes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedNodes")(js.undefined)
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
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMultipleExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultipleExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMultipleExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultipleExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandOn")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedNodes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: Fields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFullRowSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullRowSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullRowSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullRowSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
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
    def withHtmlAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineEditValidation(value: /* e */ InlineEditValidationEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineEditValidation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInlineEditValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineEditValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPress(value: /* e */ KeyPressEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadError(value: /* e */ LoadErrorEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadError")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadOnDemand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnDemand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadOnDemand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnDemand")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadSuccess(value: /* e */ LoadSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeAdd(value: /* e */ NodeAddEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeCheck(value: /* e */ NodeCheckEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCheck")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeClick(value: /* e */ NodeClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeClick")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeCollapse(value: /* e */ NodeCollapseEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeCut(value: /* e */ NodeCutEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeCut")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDelete(value: /* e */ NodeDeleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDrag(value: /* e */ NodeDragEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDragStart(value: /* e */ NodeDragStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDragStop(value: /* e */ NodeDragStopEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDragStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeDragStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDragStop")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDropped(value: /* e */ NodeDroppedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDropped")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeDropped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDropped")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeEdit(value: /* e */ NodeEditEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeExpand(value: /* e */ NodeExpandEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withNodePaste(value: /* e */ NodePasteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePaste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodePaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePaste")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeSelect(value: /* e */ NodeSelectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeUncheck(value: /* e */ NodeUncheckEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeUncheck")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeUncheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeUncheck")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeUnselect(value: /* e */ NodeUnselectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeUnselect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeUnselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeUnselect")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: /* e */ ReadyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedNode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedNode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedNodes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withSortSettings(value: SortSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
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

