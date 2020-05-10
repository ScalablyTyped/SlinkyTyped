package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonAction
import typingsSlinky.devextreme.AnonComponentDxList
import typingsSlinky.devextreme.AnonComponentElementItemData
import typingsSlinky.devextreme.AnonDirection
import typingsSlinky.devextreme.AnonElementItemData
import typingsSlinky.devextreme.AnonGroupData
import typingsSlinky.devextreme.AnonItemIndexJQueryEvent
import typingsSlinky.devextreme.AnonModelValue
import typingsSlinky.devextreme.AnonReachedBottom
import typingsSlinky.devextreme.AnonToIndex
import typingsSlinky.devextreme.devextremeStrings.all
import typingsSlinky.devextreme.devextremeStrings.allPages
import typingsSlinky.devextreme.devextremeStrings.always
import typingsSlinky.devextreme.devextremeStrings.context
import typingsSlinky.devextreme.devextremeStrings.multiple
import typingsSlinky.devextreme.devextremeStrings.never
import typingsSlinky.devextreme.devextremeStrings.nextButton
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.onHover
import typingsSlinky.devextreme.devextremeStrings.onScroll
import typingsSlinky.devextreme.devextremeStrings.page
import typingsSlinky.devextreme.devextremeStrings.scrollBottom
import typingsSlinky.devextreme.devextremeStrings.single_
import typingsSlinky.devextreme.devextremeStrings.slide
import typingsSlinky.devextreme.devextremeStrings.slideButton
import typingsSlinky.devextreme.devextremeStrings.slideItem
import typingsSlinky.devextreme.devextremeStrings.static
import typingsSlinky.devextreme.devextremeStrings.swipe
import typingsSlinky.devextreme.devextremeStrings.toggle
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxListOptions
  extends CollectionWidgetOptions[dxList]
     with SearchBoxMixinOptions[dxList] {
  /** Specifies whether or not an end user can delete list items. */
  var allowItemDeleting: js.UndefOr[Boolean] = js.native
  /** @deprecated Use the itemDragging option instead. */
  /** Specifies whether a user can reorder list items. Grouped items cannot be moved from one group to another. */
  var allowItemReordering: js.UndefOr[Boolean] = js.native
  /** A Boolean value specifying whether to enable or disable the bounce-back effect. */
  var bounceEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not an end-user can collapse groups. */
  var collapsibleGroups: js.UndefOr[Boolean] = js.native
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxListOptions: js.UndefOr[String | (js.Array[String | dxListItem | _]) | DataSource | DataSourceOptions] = js.native
  /** Specifies the data field whose values should be displayed. Defaults to "text" when the data source contains objects. */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.native
  /** Specifies a custom template for group captions. */
  var groupTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* groupData */ js.Any, 
      /* groupIndex */ Double, 
      /* groupElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Specifies whether data items should be grouped. */
  var grouped: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not to show the loading panel when the DataSource bound to the widget is loading data. */
  var indicateLoading: js.UndefOr[Boolean] = js.native
  /** Specifies the way a user can delete items from the list. */
  var itemDeleteMode: js.UndefOr[context | slideButton | slideItem | static | swipe | toggle] = js.native
  /** Configures item reordering using drag and drop gestures. */
  var itemDragging: js.UndefOr[dxSortableOptions] = js.native
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxListOptions: js.UndefOr[js.Array[String | dxListItem | _]] = js.native
  /** Specifies the array of items for a context menu called for a list item. */
  var menuItems: js.UndefOr[js.Array[AnonAction]] = js.native
  /** Specifies whether an item context menu is shown when a user holds or swipes an item. */
  var menuMode: js.UndefOr[context | slide] = js.native
  /** The text displayed on the button used to load the next page from the data source. */
  var nextButtonText: js.UndefOr[String] = js.native
  /** A function that is executed when a group element is rendered. */
  var onGroupRendered: js.UndefOr[js.Function1[/* e */ AnonGroupData, _]] = js.native
  /** A function that is executed when a collection item is clicked or tapped. */
  @JSName("onItemClick")
  var onItemClick_dxListOptions: js.UndefOr[(js.Function1[/* e */ AnonItemIndexJQueryEvent, _]) | String] = js.native
  /** A function that is executed when a collection item is right-clicked or pressed. */
  @JSName("onItemContextMenu")
  var onItemContextMenu_dxListOptions: js.UndefOr[js.Function1[/* e */ AnonItemIndexJQueryEvent, _]] = js.native
  /** A function that is executed after a list item is deleted from the data source. */
  var onItemDeleted: js.UndefOr[js.Function1[/* e */ AnonElementItemData, _]] = js.native
  /** A function that is executed before a collection item is deleted from the data source. */
  var onItemDeleting: js.UndefOr[js.Function1[/* e */ AnonComponentElementItemData, _]] = js.native
  /** A function that is executed when a collection item has been held for a specified period. */
  @JSName("onItemHold")
  var onItemHold_dxListOptions: js.UndefOr[js.Function1[/* e */ AnonItemIndexJQueryEvent, _]] = js.native
  /** A function that is executed after a list item is moved to another position. */
  var onItemReordered: js.UndefOr[js.Function1[/* e */ AnonToIndex, _]] = js.native
  /** A function that is executed when a list item is swiped. */
  var onItemSwipe: js.UndefOr[js.Function1[/* e */ AnonDirection, _]] = js.native
  /** A function that is executed before the next page is loaded. */
  var onPageLoading: js.UndefOr[js.Function1[/* e */ AnonComponentDxList, _]] = js.native
  /** A function that is executed when the "pull to refresh" gesture is performed. Supported in mobile themes only. */
  var onPullRefresh: js.UndefOr[js.Function1[/* e */ AnonComponentDxList, _]] = js.native
  /** A function that is executed on each scroll gesture. */
  var onScroll: js.UndefOr[js.Function1[/* e */ AnonReachedBottom, _]] = js.native
  /** A function that is executed when the "Select All" check box value is changed. Applies only if the selectionMode is "all". */
  var onSelectAllValueChanged: js.UndefOr[js.Function1[/* e */ AnonModelValue, _]] = js.native
  /** Specifies whether the next page is loaded when a user scrolls the widget to the bottom or when the "next" button is clicked. */
  var pageLoadMode: js.UndefOr[nextButton | scrollBottom] = js.native
  /** Specifies the text shown in the pullDown panel, which is displayed when the list is scrolled to the bottom. */
  var pageLoadingText: js.UndefOr[String] = js.native
  /** A Boolean value specifying whether or not the widget supports the "pull down to refresh" gesture. */
  var pullRefreshEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the text displayed in the pullDown panel when the list is pulled below the refresh threshold. */
  var pulledDownText: js.UndefOr[String] = js.native
  /** Specifies the text shown in the pullDown panel while the list is being pulled down to the refresh threshold. */
  var pullingDownText: js.UndefOr[String] = js.native
  /** Specifies the text displayed in the pullDown panel while the list is being refreshed. */
  var refreshingText: js.UndefOr[String] = js.native
  /** Specifies whether to repaint only those elements whose data changed. */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.native
  /** A Boolean value specifying if the list is scrolled by content. */
  var scrollByContent: js.UndefOr[Boolean] = js.native
  /** A Boolean value specifying if the list is scrolled using the scrollbar. */
  var scrollByThumb: js.UndefOr[Boolean] = js.native
  /** A Boolean value specifying whether to enable or disable list scrolling. */
  var scrollingEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the mode in which all items are selected. */
  var selectAllMode: js.UndefOr[allPages | page] = js.native
  /** Specifies item selection mode. */
  var selectionMode: js.UndefOr[all | multiple | none | single_] = js.native
  /** Specifies when the widget shows the scrollbar. */
  var showScrollbar: js.UndefOr[always | never | onHover | onScroll] = js.native
  /** Specifies whether or not to display controls used to select list items. */
  var showSelectionControls: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not the widget uses native scrolling. */
  var useNativeScrolling: js.UndefOr[Boolean] = js.native
}

object dxListOptions {
  @scala.inline
  def apply(): dxListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxListOptions]
  }
  @scala.inline
  implicit class dxListOptionsOps[Self <: dxListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowItemDeleting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowItemDeleting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowItemDeleting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowItemDeleting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowItemReordering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowItemReordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowItemReordering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowItemReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withBounceEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounceEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsibleGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsibleGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsibleGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsibleGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | (js.Array[String | dxListItem | _]) | DataSource | DataSourceOptions): Self = {
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
    def withDisplayExprFunction1(value: /* item */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplayExpr(value: String | (js.Function1[/* item */ js.Any, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupTemplateFunction3(
      value: (/* groupData */ js.Any, /* groupIndex */ Double, /* groupElement */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGroupTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* groupData */ js.Any, 
          /* groupIndex */ Double, 
          /* groupElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouped")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicateLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicateLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicateLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicateLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withItemDeleteMode(value: context | slideButton | slideItem | static | swipe | toggle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDeleteMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemDeleteMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDeleteMode")(js.undefined)
        ret
    }
    @scala.inline
    def withItemDragging(value: dxSortableOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[String | dxListItem | _]): Self = {
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
    def withMenuItems(value: js.Array[AnonAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItems")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuMode(value: context | slide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuMode")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGroupRendered(value: /* e */ AnonGroupData => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGroupRendered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGroupRendered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGroupRendered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemClickFunction1(value: /* e */ AnonItemIndexJQueryEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnItemClick(value: (js.Function1[/* e */ AnonItemIndexJQueryEvent, _]) | String): Self = {
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
    def withOnItemContextMenu(value: /* e */ AnonItemIndexJQueryEvent => _): Self = {
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
    def withOnItemDeleted(value: /* e */ AnonElementItemData => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDeleted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemDeleting(value: /* e */ AnonComponentElementItemData => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDeleting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemDeleting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemDeleting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemHold(value: /* e */ AnonItemIndexJQueryEvent => _): Self = {
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
    def withOnItemReordered(value: /* e */ AnonToIndex => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemReordered")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemReordered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemReordered")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemSwipe(value: /* e */ AnonDirection => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSwipe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnItemSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemSwipe")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageLoading(value: /* e */ AnonComponentDxList => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageLoading")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPullRefresh(value: /* e */ AnonComponentDxList => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullRefresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPullRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPullRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* e */ AnonReachedBottom => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectAllValueChanged(value: /* e */ AnonModelValue => _): Self = {
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
    def withPageLoadMode(value: nextButton | scrollBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLoadMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLoadingText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLoadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withPullRefreshEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRefreshEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRefreshEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRefreshEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPulledDownText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulledDownText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPulledDownText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulledDownText")(js.undefined)
        ret
    }
    @scala.inline
    def withPullingDownText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullingDownText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullingDownText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullingDownText")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshingText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshingText")(js.undefined)
        ret
    }
    @scala.inline
    def withRepaintChangesOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaintChangesOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepaintChangesOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaintChangesOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollByContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollByContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollByContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollByContent")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollByThumb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollByThumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollByThumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollByThumb")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllMode(value: allPages | page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: all | multiple | none | single_): Self = {
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
    def withShowScrollbar(value: always | never | onHover | onScroll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSelectionControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSelectionControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSelectionControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSelectionControls")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNativeScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeScrolling")(js.undefined)
        ret
    }
  }
  
}

