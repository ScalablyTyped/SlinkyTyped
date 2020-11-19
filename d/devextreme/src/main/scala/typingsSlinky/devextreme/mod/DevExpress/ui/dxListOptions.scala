package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.Action
import typingsSlinky.devextreme.anon.ComponentElementItemData
import typingsSlinky.devextreme.anon.Direction
import typingsSlinky.devextreme.anon.ElementItemData
import typingsSlinky.devextreme.anon.GroupData
import typingsSlinky.devextreme.anon.ItemIndexJQueryEvent
import typingsSlinky.devextreme.anon.ModelValue
import typingsSlinky.devextreme.anon.ReachedBottom
import typingsSlinky.devextreme.anon.ToIndex
import typingsSlinky.devextreme.anon.`4`
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
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxListOptions
  extends CollectionWidgetOptions[dxList]
     with SearchBoxMixinOptions[dxList] {
  
  /** @name dxList.Options.allowItemDeleting */
  var allowItemDeleting: js.UndefOr[Boolean] = js.native
  
  /** @deprecated */
  /** @name dxList.Options.allowItemReordering */
  var allowItemReordering: js.UndefOr[Boolean] = js.native
  
  /** @name dxList.Options.bounceEnabled */
  var bounceEnabled: js.UndefOr[Boolean] = js.native
  
  /** @name dxList.Options.collapsibleGroups */
  var collapsibleGroups: js.UndefOr[Boolean] = js.native
  
  /** @name dxList.Options.dataSource */
  @JSName("dataSource")
  var dataSource_dxListOptions: js.UndefOr[String | (js.Array[String | dxListItem | _]) | DataSource | DataSourceOptions] = js.native
  
  /** @name dxList.Options.displayExpr */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.native
  
  /** @name dxList.Options.groupTemplate */
  var groupTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* groupData */ js.Any, 
      /* groupIndex */ Double, 
      /* groupElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /** @name dxList.Options.grouped */
  var grouped: js.UndefOr[Boolean] = js.native
  
  /** @name dxList.Options.indicateLoading */
  var indicateLoading: js.UndefOr[Boolean] = js.native
  
  /** @name dxList.Options.itemDeleteMode */
  var itemDeleteMode: js.UndefOr[context | slideButton | slideItem | static | swipe | toggle] = js.native
  
  /** @name dxList.Options.itemDragging */
  var itemDragging: js.UndefOr[dxSortableOptions] = js.native
  
  /** @name dxList.Options.items */
  @JSName("items")
  var items_dxListOptions: js.UndefOr[js.Array[String | dxListItem | _]] = js.native
  
  /** @name dxList.Options.menuItems */
  var menuItems: js.UndefOr[js.Array[Action]] = js.native
  
  /** @name dxList.Options.menuMode */
  var menuMode: js.UndefOr[context | slide] = js.native
  
  /** @name dxList.Options.nextButtonText */
  var nextButtonText: js.UndefOr[String] = js.native
  
  /** @name dxList.Options.onGroupRendered */
  var onGroupRendered: js.UndefOr[js.Function1[/* e */ GroupData, _]] = js.native
  
  /** @name dxList.Options.onItemClick */
  @JSName("onItemClick")
  var onItemClick_dxListOptions: js.UndefOr[(js.Function1[/* e */ ItemIndexJQueryEvent, _]) | String] = js.native
  
  /** @name dxList.Options.onItemContextMenu */
  @JSName("onItemContextMenu")
  var onItemContextMenu_dxListOptions: js.UndefOr[js.Function1[/* e */ ItemIndexJQueryEvent, _]] = js.native
  
  /** @name dxList.Options.onItemDeleted */
  var onItemDeleted: js.UndefOr[js.Function1[/* e */ ElementItemData, _]] = js.native
  
  /** @name dxList.Options.onItemDeleting */
  var onItemDeleting: js.UndefOr[js.Function1[/* e */ ComponentElementItemData, _]] = js.native
  
  /** @name dxList.Options.onItemHold */
  @JSName("onItemHold")
  var onItemHold_dxListOptions: js.UndefOr[js.Function1[/* e */ ItemIndexJQueryEvent, _]] = js.native
  
  /** @name dxList.Options.onItemReordered */
  var onItemReordered: js.UndefOr[js.Function1[/* e */ ToIndex, _]] = js.native
  
  /** @name dxList.Options.onItemSwipe */
  var onItemSwipe: js.UndefOr[js.Function1[/* e */ Direction, _]] = js.native
  
  /** @name dxList.Options.onPageLoading */
  var onPageLoading: js.UndefOr[js.Function1[/* e */ `4`, _]] = js.native
  
  /** @name dxList.Options.onPullRefresh */
  var onPullRefresh: js.UndefOr[js.Function1[/* e */ `4`, _]] = js.native
  
  /** @name dxList.Options.onScroll */
  var onScroll: js.UndefOr[js.Function1[/* e */ ReachedBottom, _]] = js.native
  
  /** @name dxList.Options.onSelectAllValueChanged */
  var onSelectAllValueChanged: js.UndefOr[js.Function1[/* e */ ModelValue, _]] = js.native
  
  /** @name dxList.Options.pageLoadMode */
  var pageLoadMode: js.UndefOr[nextButton | scrollBottom] = js.native
  
  /** @name dxList.Options.pageLoadingText */
  var pageLoadingText: js.UndefOr[String] = js.native
  
  /** @name dxList.Options.pullRefreshEnabled */
  var pullRefreshEnabled: js.UndefOr[Boolean] = js.native
  
  /** @name dxList.Options.pulledDownText */
  var pulledDownText: js.UndefOr[String] = js.native
  
  /** @name dxList.Options.pullingDownText */
  var pullingDownText: js.UndefOr[String] = js.native
  
  /** @name dxList.Options.refreshingText */
  var refreshingText: js.UndefOr[String] = js.native
  
  /** @name dxList.Options.repaintChangesOnly */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.native
  
  /** @name dxList.Options.scrollByContent */
  var scrollByContent: js.UndefOr[Boolean] = js.native
  
  /** @name dxList.Options.scrollByThumb */
  var scrollByThumb: js.UndefOr[Boolean] = js.native
  
  /** @name dxList.Options.scrollingEnabled */
  var scrollingEnabled: js.UndefOr[Boolean] = js.native
  
  /** @name dxList.Options.selectAllMode */
  var selectAllMode: js.UndefOr[allPages | page] = js.native
  
  /** @name dxList.Options.selectionMode */
  var selectionMode: js.UndefOr[all | multiple | none | single_] = js.native
  
  /** @name dxList.Options.showScrollbar */
  var showScrollbar: js.UndefOr[always | never | onHover | onScroll] = js.native
  
  /** @name dxList.Options.showSelectionControls */
  var showSelectionControls: js.UndefOr[Boolean] = js.native
  
  /** @name dxList.Options.useNativeScrolling */
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowItemDeleting(value: Boolean): Self = this.set("allowItemDeleting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowItemDeleting: Self = this.set("allowItemDeleting", js.undefined)
    
    @scala.inline
    def setAllowItemReordering(value: Boolean): Self = this.set("allowItemReordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowItemReordering: Self = this.set("allowItemReordering", js.undefined)
    
    @scala.inline
    def setBounceEnabled(value: Boolean): Self = this.set("bounceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounceEnabled: Self = this.set("bounceEnabled", js.undefined)
    
    @scala.inline
    def setCollapsibleGroups(value: Boolean): Self = this.set("collapsibleGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsibleGroups: Self = this.set("collapsibleGroups", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: (String | dxListItem | js.Any)*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | (js.Array[String | dxListItem | _]) | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDisplayExprFunction1(value: /* item */ js.Any => String): Self = this.set("displayExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayExpr(value: String | (js.Function1[/* item */ js.Any, String])): Self = this.set("displayExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayExpr: Self = this.set("displayExpr", js.undefined)
    
    @scala.inline
    def setGroupTemplateElement(value: Element): Self = this.set("groupTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupTemplateFunction3(
      value: (/* groupData */ js.Any, /* groupIndex */ Double, /* groupElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("groupTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGroupTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* groupData */ js.Any, 
          /* groupIndex */ Double, 
          /* groupElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("groupTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupTemplate: Self = this.set("groupTemplate", js.undefined)
    
    @scala.inline
    def setGrouped(value: Boolean): Self = this.set("grouped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrouped: Self = this.set("grouped", js.undefined)
    
    @scala.inline
    def setIndicateLoading(value: Boolean): Self = this.set("indicateLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicateLoading: Self = this.set("indicateLoading", js.undefined)
    
    @scala.inline
    def setItemDeleteMode(value: context | slideButton | slideItem | static | swipe | toggle): Self = this.set("itemDeleteMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemDeleteMode: Self = this.set("itemDeleteMode", js.undefined)
    
    @scala.inline
    def setItemDragging(value: dxSortableOptions): Self = this.set("itemDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemDragging: Self = this.set("itemDragging", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: (String | dxListItem | js.Any)*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String | dxListItem | _]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setMenuItemsVarargs(value: Action*): Self = this.set("menuItems", js.Array(value :_*))
    
    @scala.inline
    def setMenuItems(value: js.Array[Action]): Self = this.set("menuItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuItems: Self = this.set("menuItems", js.undefined)
    
    @scala.inline
    def setMenuMode(value: context | slide): Self = this.set("menuMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuMode: Self = this.set("menuMode", js.undefined)
    
    @scala.inline
    def setNextButtonText(value: String): Self = this.set("nextButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextButtonText: Self = this.set("nextButtonText", js.undefined)
    
    @scala.inline
    def setOnGroupRendered(value: /* e */ GroupData => _): Self = this.set("onGroupRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGroupRendered: Self = this.set("onGroupRendered", js.undefined)
    
    @scala.inline
    def setOnItemClickFunction1(value: /* e */ ItemIndexJQueryEvent => _): Self = this.set("onItemClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnItemClick(value: (js.Function1[/* e */ ItemIndexJQueryEvent, _]) | String): Self = this.set("onItemClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    
    @scala.inline
    def setOnItemContextMenu(value: /* e */ ItemIndexJQueryEvent => _): Self = this.set("onItemContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemContextMenu: Self = this.set("onItemContextMenu", js.undefined)
    
    @scala.inline
    def setOnItemDeleted(value: /* e */ ElementItemData => _): Self = this.set("onItemDeleted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemDeleted: Self = this.set("onItemDeleted", js.undefined)
    
    @scala.inline
    def setOnItemDeleting(value: /* e */ ComponentElementItemData => _): Self = this.set("onItemDeleting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemDeleting: Self = this.set("onItemDeleting", js.undefined)
    
    @scala.inline
    def setOnItemHold(value: /* e */ ItemIndexJQueryEvent => _): Self = this.set("onItemHold", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemHold: Self = this.set("onItemHold", js.undefined)
    
    @scala.inline
    def setOnItemReordered(value: /* e */ ToIndex => _): Self = this.set("onItemReordered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemReordered: Self = this.set("onItemReordered", js.undefined)
    
    @scala.inline
    def setOnItemSwipe(value: /* e */ Direction => _): Self = this.set("onItemSwipe", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemSwipe: Self = this.set("onItemSwipe", js.undefined)
    
    @scala.inline
    def setOnPageLoading(value: /* e */ `4` => _): Self = this.set("onPageLoading", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPageLoading: Self = this.set("onPageLoading", js.undefined)
    
    @scala.inline
    def setOnPullRefresh(value: /* e */ `4` => _): Self = this.set("onPullRefresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPullRefresh: Self = this.set("onPullRefresh", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* e */ ReachedBottom => _): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnSelectAllValueChanged(value: /* e */ ModelValue => _): Self = this.set("onSelectAllValueChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectAllValueChanged: Self = this.set("onSelectAllValueChanged", js.undefined)
    
    @scala.inline
    def setPageLoadMode(value: nextButton | scrollBottom): Self = this.set("pageLoadMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageLoadMode: Self = this.set("pageLoadMode", js.undefined)
    
    @scala.inline
    def setPageLoadingText(value: String): Self = this.set("pageLoadingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageLoadingText: Self = this.set("pageLoadingText", js.undefined)
    
    @scala.inline
    def setPullRefreshEnabled(value: Boolean): Self = this.set("pullRefreshEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRefreshEnabled: Self = this.set("pullRefreshEnabled", js.undefined)
    
    @scala.inline
    def setPulledDownText(value: String): Self = this.set("pulledDownText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePulledDownText: Self = this.set("pulledDownText", js.undefined)
    
    @scala.inline
    def setPullingDownText(value: String): Self = this.set("pullingDownText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullingDownText: Self = this.set("pullingDownText", js.undefined)
    
    @scala.inline
    def setRefreshingText(value: String): Self = this.set("refreshingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshingText: Self = this.set("refreshingText", js.undefined)
    
    @scala.inline
    def setRepaintChangesOnly(value: Boolean): Self = this.set("repaintChangesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepaintChangesOnly: Self = this.set("repaintChangesOnly", js.undefined)
    
    @scala.inline
    def setScrollByContent(value: Boolean): Self = this.set("scrollByContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollByContent: Self = this.set("scrollByContent", js.undefined)
    
    @scala.inline
    def setScrollByThumb(value: Boolean): Self = this.set("scrollByThumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollByThumb: Self = this.set("scrollByThumb", js.undefined)
    
    @scala.inline
    def setScrollingEnabled(value: Boolean): Self = this.set("scrollingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollingEnabled: Self = this.set("scrollingEnabled", js.undefined)
    
    @scala.inline
    def setSelectAllMode(value: allPages | page): Self = this.set("selectAllMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAllMode: Self = this.set("selectAllMode", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: all | multiple | none | single_): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setShowScrollbar(value: always | never | onHover | onScroll): Self = this.set("showScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowScrollbar: Self = this.set("showScrollbar", js.undefined)
    
    @scala.inline
    def setShowSelectionControls(value: Boolean): Self = this.set("showSelectionControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSelectionControls: Self = this.set("showSelectionControls", js.undefined)
    
    @scala.inline
    def setUseNativeScrolling(value: Boolean): Self = this.set("useNativeScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNativeScrolling: Self = this.set("useNativeScrolling", js.undefined)
  }
}
