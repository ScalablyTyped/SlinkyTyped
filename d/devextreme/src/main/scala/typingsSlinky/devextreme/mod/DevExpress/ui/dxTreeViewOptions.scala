package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonComponentDxTreeView
import typingsSlinky.devextreme.AnonComponentElementModelValue
import typingsSlinky.devextreme.AnonElementItemElement
import typingsSlinky.devextreme.AnonEventItemDataItemElement
import typingsSlinky.devextreme.AnonItemDataItemElementItemIndex
import typingsSlinky.devextreme.AnonItemElementItemIndexModel
import typingsSlinky.devextreme.AnonModelNode
import typingsSlinky.devextreme.devextremeStrings.both
import typingsSlinky.devextreme.devextremeStrings.click
import typingsSlinky.devextreme.devextremeStrings.dblclick_
import typingsSlinky.devextreme.devextremeStrings.horizontal
import typingsSlinky.devextreme.devextremeStrings.multiple
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.normal
import typingsSlinky.devextreme.devextremeStrings.plain
import typingsSlinky.devextreme.devextremeStrings.selectAll
import typingsSlinky.devextreme.devextremeStrings.single_
import typingsSlinky.devextreme.devextremeStrings.tree
import typingsSlinky.devextreme.devextremeStrings.vertical
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod._Global_.JQueryPromise
import typingsSlinky.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTreeViewOptions
  extends HierarchicalCollectionWidgetOptions[dxTreeView]
     with SearchBoxMixinOptions[dxTreeView] {
  /** Specifies whether or not to animate item collapsing and expanding. */
  var animationEnabled: js.UndefOr[Boolean] = js.native
  /** Allows you to load nodes on demand. */
  var createChildren: js.UndefOr[
    js.Function1[/* parentNode */ dxTreeViewNode, Promise[_] | JQueryPromise[_] | js.Array[_]]
  ] = js.native
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxTreeViewOptions: js.UndefOr[String | js.Array[dxTreeViewItem] | DataSource | DataSourceOptions] = js.native
  /** Notifies the widget of the used data structure. */
  var dataStructure: js.UndefOr[plain | tree] = js.native
  /** Specifies whether or not a user can expand all tree view items by the "*" hot key. */
  var expandAllEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the event on which to expand/collapse a node. */
  var expandEvent: js.UndefOr[dblclick_ | click] = js.native
  /** Specifies whether or not all parent nodes of an initially expanded node are displayed expanded. */
  var expandNodesRecursive: js.UndefOr[Boolean] = js.native
  /** Specifies which data source field specifies whether an item is expanded. */
  var expandedExpr: js.UndefOr[String | js.Function] = js.native
  /** Specifies the name of the data source item field whose value defines whether or not the corresponding node includes child nodes. */
  var hasItemsExpr: js.UndefOr[String | js.Function] = js.native
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxTreeViewOptions: js.UndefOr[js.Array[dxTreeViewItem]] = js.native
  /** A function that is executed when a collection item is clicked or tapped. */
  @JSName("onItemClick")
  var onItemClick_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ AnonModelNode, _]] = js.native
  /** A function that is executed when a tree view item is collapsed. */
  var onItemCollapsed: js.UndefOr[js.Function1[/* e */ AnonEventItemDataItemElement, _]] = js.native
  /** A function that is executed when a collection item is right-clicked or pressed. */
  @JSName("onItemContextMenu")
  var onItemContextMenu_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ AnonModelNode, _]] = js.native
  /** A function that is executed when a tree view item is expanded. */
  var onItemExpanded: js.UndefOr[js.Function1[/* e */ AnonEventItemDataItemElement, _]] = js.native
  /** A function that is executed when a collection item has been held for a specified period. */
  @JSName("onItemHold")
  var onItemHold_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ AnonItemDataItemElementItemIndex, _]] = js.native
  /** A function that is executed after a collection item is rendered. */
  @JSName("onItemRendered")
  var onItemRendered_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ AnonItemElementItemIndexModel, _]] = js.native
  /** A function that is executed when a tree view item is selected or selection is canceled. */
  var onItemSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonElementItemElement, _]] = js.native
  /** A function that is executed when the "Select All" check box value is changed. Applies only if showCheckBoxesMode is "selectAll" and selectionMode is "multiple". */
  var onSelectAllValueChanged: js.UndefOr[js.Function1[/* e */ AnonComponentElementModelValue, _]] = js.native
  /** A function that is executed when a tree view item is selected or selection is canceled. */
  @JSName("onSelectionChanged")
  var onSelectionChanged_dxTreeViewOptions: js.UndefOr[js.Function1[/* e */ AnonComponentDxTreeView, _]] = js.native
  /** Specifies the name of the data source item field for holding the parent key of the corresponding node. */
  var parentIdExpr: js.UndefOr[String | js.Function] = js.native
  /** Specifies the parent ID value of the root item. */
  var rootValue: js.UndefOr[js.Any] = js.native
  /** A string value specifying available scrolling directions. */
  var scrollDirection: js.UndefOr[both | horizontal | vertical] = js.native
  /** Specifies the text displayed at the "Select All" check box. */
  var selectAllText: js.UndefOr[String] = js.native
  /** Specifies whether or not an item becomes selected if a user clicks it. */
  var selectByClick: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not to select nodes recursively. */
  var selectNodesRecursive: js.UndefOr[Boolean] = js.native
  /** Specifies item selection mode. */
  var selectionMode: js.UndefOr[multiple | single_] = js.native
  /** Specifies the current check boxes display mode. */
  var showCheckBoxesMode: js.UndefOr[none | normal | selectAll] = js.native
  /** Enables the virtual mode in which nodes are loaded on demand. Use it to enhance the performance on large datasets. */
  var virtualModeEnabled: js.UndefOr[Boolean] = js.native
}

object dxTreeViewOptions {
  @scala.inline
  def apply(): dxTreeViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeViewOptions]
  }
  @scala.inline
  implicit class dxTreeViewOptionsOps[Self <: dxTreeViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateChildren(value: /* parentNode */ dxTreeViewNode => Promise[_] | JQueryPromise[_] | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createChildren")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | js.Array[dxTreeViewItem] | DataSource | DataSourceOptions): Self = {
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
    def withDataStructure(value: plain | tree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataStructure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataStructure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataStructure")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandAllEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAllEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandAllEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAllEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandEvent(value: dblclick_ | click): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandNodesRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandNodesRecursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandNodesRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandNodesRecursive")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withHasItemsExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasItemsExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasItemsExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasItemsExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[dxTreeViewItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemClick(value: /* e */ AnonModelNode => _): Self = {
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
    def withOnItemCollapsed(value: /* e */ AnonEventItemDataItemElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemCollapsed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemContextMenu(value: /* e */ AnonModelNode => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemExpanded(value: /* e */ AnonEventItemDataItemElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemExpanded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemHold(value: /* e */ AnonItemDataItemElementItemIndex => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemHold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemHold")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemRendered(value: /* e */ AnonItemElementItemIndexModel => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemSelectionChanged(value: /* e */ AnonElementItemElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemSelectionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectAllValueChanged(value: /* e */ AnonComponentElementModelValue => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectAllValueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectAllValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectAllValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChanged(value: /* e */ AnonComponentDxTreeView => _): Self = {
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
    def withParentIdExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIdExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentIdExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIdExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withRootValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootValue")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollDirection(value: both | horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllText")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectByClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectByClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectByClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectByClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectNodesRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectNodesRecursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectNodesRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectNodesRecursive")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: multiple | single_): Self = {
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
    def withShowCheckBoxesMode(value: none | normal | selectAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckBoxesMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCheckBoxesMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckBoxesMode")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualModeEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualModeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualModeEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualModeEnabled")(js.undefined)
        ret
    }
  }
  
}

