package typingsSlinky.antd

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticUIEvent
import typingsSlinky.antd.anon.BodyContent
import typingsSlinky.antd.anon.DataSource
import typingsSlinky.antd.anon.FilteredItems
import typingsSlinky.antd.anon.SelectedCount
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.antdStrings.all
import typingsSlinky.antd.antdStrings.none
import typingsSlinky.antd.antdStrings.part
import typingsSlinky.antd.listBodyMod.TransferListBodyProps
import typingsSlinky.antd.transferInterfaceMod.PaginationType
import typingsSlinky.antd.transferMod.KeyWiseTransferItem
import typingsSlinky.antd.transferMod.RenderResult
import typingsSlinky.antd.transferMod.SelectAllLabel
import typingsSlinky.antd.transferMod.TransferDirection
import typingsSlinky.antd.transferMod.TransferLocale
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transferListMod {
  
  @JSImport("antd/lib/transfer/list", JSImport.Default)
  @js.native
  class default[RecordType /* <: KeyWiseTransferItem */] protected () extends TransferList[RecordType] {
    def this(props: TransferListProps[RecordType]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd/lib/transfer/list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/transfer/list", "default.defaultProps")
    @js.native
    def defaultProps: DataSource = js.native
    @scala.inline
    def defaultProps_=(x: DataSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type RenderListFunction[T] = js.Function1[/* props */ TransferListBodyProps[T], ReactElement]
  
  @js.native
  trait RenderedItem[RecordType] extends StObject {
    
    var item: RecordType = js.native
    
    var renderedEl: ReactElement = js.native
    
    var renderedText: String = js.native
  }
  object RenderedItem {
    
    @scala.inline
    def apply[RecordType](item: RecordType, renderedText: String): RenderedItem[RecordType] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], renderedText = renderedText.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderedItem[RecordType]]
    }
    
    @scala.inline
    implicit class RenderedItemMutableBuilder[Self <: RenderedItem[_], RecordType] (val x: Self with RenderedItem[RecordType]) extends AnyVal {
      
      @scala.inline
      def setItem(value: RecordType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedEl(value: ReactElement): Self = StObject.set(x, "renderedEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderedElUndefined: Self = StObject.set(x, "renderedEl", js.undefined)
      
      @scala.inline
      def setRenderedText(value: String): Self = StObject.set(x, "renderedText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransferList[RecordType /* <: KeyWiseTransferItem */]
    extends PureComponent[TransferListProps[RecordType], TransferListState, js.Any] {
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTransferList(): Unit = js.native
    
    var defaultListBodyRef: ReactRef[typingsSlinky.antd.listBodyMod.default[RecordType]] = js.native
    
    def getCheckBox(
      filteredItems: js.Array[RecordType],
      onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit]
    ): `false` | ReactElement = js.native
    def getCheckBox(
      filteredItems: js.Array[RecordType],
      onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit],
      showSelectAll: js.UndefOr[scala.Nothing],
      disabled: Boolean
    ): `false` | ReactElement = js.native
    def getCheckBox(
      filteredItems: js.Array[RecordType],
      onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit],
      showSelectAll: Boolean
    ): `false` | ReactElement = js.native
    def getCheckBox(
      filteredItems: js.Array[RecordType],
      onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit],
      showSelectAll: Boolean,
      disabled: Boolean
    ): `false` | ReactElement = js.native
    
    def getCheckStatus(filteredItems: js.Array[RecordType]): none | all | part = js.native
    
    def getCurrentPageItems(): Unit = js.native
    
    def getFilteredItems(dataSource: js.Array[RecordType], filterValue: String): FilteredItems[RecordType] = js.native
    
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: ReactElement,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String]
    ): ReactElement = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: ReactElement,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: js.UndefOr[scala.Nothing],
      showSearch: js.UndefOr[scala.Nothing],
      disabled: Boolean
    ): ReactElement = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: ReactElement,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: js.UndefOr[scala.Nothing],
      showSearch: Boolean
    ): ReactElement = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: ReactElement,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: js.UndefOr[scala.Nothing],
      showSearch: Boolean,
      disabled: Boolean
    ): ReactElement = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: ReactElement,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: RenderListFunction[RecordType]
    ): ReactElement = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: ReactElement,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: RenderListFunction[RecordType],
      showSearch: js.UndefOr[scala.Nothing],
      disabled: Boolean
    ): ReactElement = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: ReactElement,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: RenderListFunction[RecordType],
      showSearch: Boolean
    ): ReactElement = js.native
    def getListBody(
      prefixCls: String,
      searchPlaceholder: String,
      filterValue: String,
      filteredItems: js.Array[RecordType],
      notFoundContent: ReactElement,
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      checkedKeys: js.Array[String],
      renderList: RenderListFunction[RecordType],
      showSearch: Boolean,
      disabled: Boolean
    ): ReactElement = js.native
    
    def getSelectAllLabel(selectedCount: Double, totalCount: Double): ReactElement = js.native
    
    def handleClear(): Unit = js.native
    
    def handleFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def matchFilter(text: String, item: RecordType): Boolean = js.native
    
    def renderItem(item: RecordType): RenderedItem[RecordType] = js.native
    
    def renderListBody(renderList: js.UndefOr[scala.Nothing], props: TransferListBodyProps[RecordType]): BodyContent = js.native
    def renderListBody(renderList: RenderListFunction[RecordType], props: TransferListBodyProps[RecordType]): BodyContent = js.native
    
    var timer: Double = js.native
    
    var triggerScrollTimer: Double = js.native
  }
  
  @js.native
  trait TransferListProps[RecordType] extends TransferLocale {
    
    var checkedKeys: js.Array[String] = js.native
    
    var dataSource: js.Array[RecordType] = js.native
    
    var direction: TransferDirection = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var filterOption: js.UndefOr[js.Function2[/* filterText */ String, /* item */ RecordType, Boolean]] = js.native
    
    var footer: js.UndefOr[js.Function1[/* props */ TransferListProps[RecordType], ReactElement]] = js.native
    
    def handleClear(): Unit = js.native
    
    def handleFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    var onItemRemove: js.UndefOr[js.Function1[/* keys */ js.Array[String], Unit]] = js.native
    
    def onItemSelect(key: String, check: Boolean): Unit = js.native
    
    def onItemSelectAll(dataSource: js.Array[String], checkAll: Boolean): Unit = js.native
    
    def onScroll(e: SyntheticUIEvent[HTMLUListElement]): Unit = js.native
    
    var pagination: js.UndefOr[PaginationType] = js.native
    
    var prefixCls: String = js.native
    
    /** render item */
    var render: js.UndefOr[js.Function1[/* item */ RecordType, RenderResult]] = js.native
    
    var renderList: js.UndefOr[RenderListFunction[RecordType]] = js.native
    
    var selectAllLabel: js.UndefOr[SelectAllLabel] = js.native
    
    var showRemove: js.UndefOr[Boolean] = js.native
    
    var showSearch: js.UndefOr[Boolean] = js.native
    
    var showSelectAll: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var titleText: String = js.native
  }
  object TransferListProps {
    
    @scala.inline
    def apply[RecordType](
      checkedKeys: js.Array[String],
      dataSource: js.Array[RecordType],
      direction: TransferDirection,
      handleClear: () => Unit,
      handleFilter: ChangeEvent[HTMLInputElement] => Unit,
      itemUnit: String,
      itemsUnit: String,
      onItemSelect: (String, Boolean) => Unit,
      onItemSelectAll: (js.Array[String], Boolean) => Unit,
      onScroll: SyntheticUIEvent[HTMLUListElement] => Unit,
      prefixCls: String,
      remove: String,
      removeAll: String,
      removeCurrent: String,
      searchPlaceholder: String,
      selectAll: String,
      selectCurrent: String,
      selectInvert: String,
      titleText: String,
      titles: js.Array[String]
    ): TransferListProps[RecordType] = {
      val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], handleClear = js.Any.fromFunction0(handleClear), handleFilter = js.Any.fromFunction1(handleFilter), itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction2(onItemSelect), onItemSelectAll = js.Any.fromFunction2(onItemSelectAll), onScroll = js.Any.fromFunction1(onScroll), prefixCls = prefixCls.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeAll = removeAll.asInstanceOf[js.Any], removeCurrent = removeCurrent.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], selectAll = selectAll.asInstanceOf[js.Any], selectCurrent = selectCurrent.asInstanceOf[js.Any], selectInvert = selectInvert.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferListProps[RecordType]]
    }
    
    @scala.inline
    implicit class TransferListPropsMutableBuilder[Self <: TransferListProps[_], RecordType] (val x: Self with TransferListProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setCheckedKeys(value: js.Array[String]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedKeysVarargs(value: String*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
      
      @scala.inline
      def setDataSource(value: js.Array[RecordType]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceVarargs(value: RecordType*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
      
      @scala.inline
      def setDirection(value: TransferDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFilterOption(value: (/* filterText */ String, /* item */ RecordType) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
      
      @scala.inline
      def setFooter(value: /* props */ TransferListProps[RecordType] => ReactElement): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHandleClear(value: () => Unit): Self = StObject.set(x, "handleClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandleFilter(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "handleFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemRemove(value: /* keys */ js.Array[String] => Unit): Self = StObject.set(x, "onItemRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemRemoveUndefined: Self = StObject.set(x, "onItemRemove", js.undefined)
      
      @scala.inline
      def setOnItemSelect(value: (String, Boolean) => Unit): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnItemSelectAll(value: (js.Array[String], Boolean) => Unit): Self = StObject.set(x, "onItemSelectAll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnScroll(value: SyntheticUIEvent[HTMLUListElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPagination(value: PaginationType): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: /* item */ RecordType => RenderResult): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderList(value: /* props */ TransferListBodyProps[RecordType] => ReactElement): Self = StObject.set(x, "renderList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderListUndefined: Self = StObject.set(x, "renderList", js.undefined)
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSelectAllLabel(value: SelectAllLabel): Self = StObject.set(x, "selectAllLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllLabelFunction1(value: /* info */ SelectedCount => ReactElement): Self = StObject.set(x, "selectAllLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectAllLabelReactElement(value: ReactElement): Self = StObject.set(x, "selectAllLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllLabelUndefined: Self = StObject.set(x, "selectAllLabel", js.undefined)
      
      @scala.inline
      def setShowRemove(value: Boolean): Self = StObject.set(x, "showRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRemoveUndefined: Self = StObject.set(x, "showRemove", js.undefined)
      
      @scala.inline
      def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSearchUndefined: Self = StObject.set(x, "showSearch", js.undefined)
      
      @scala.inline
      def setShowSelectAll(value: Boolean): Self = StObject.set(x, "showSelectAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSelectAllUndefined: Self = StObject.set(x, "showSelectAll", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransferListState extends StObject {
    
    /** Filter input value */
    var filterValue: String = js.native
  }
  object TransferListState {
    
    @scala.inline
    def apply(filterValue: String): TransferListState = {
      val __obj = js.Dynamic.literal(filterValue = filterValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferListState]
    }
    
    @scala.inline
    implicit class TransferListStateMutableBuilder[Self <: TransferListState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterValue(value: String): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
    }
  }
}
