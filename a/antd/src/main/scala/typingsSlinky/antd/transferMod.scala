package typingsSlinky.antd

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.DataSource
import typingsSlinky.antd.anon.ItemUnit
import typingsSlinky.antd.anon.ItemsUnit
import typingsSlinky.antd.anon.Key
import typingsSlinky.antd.anon.LeftDataSource
import typingsSlinky.antd.anon.PartialTransferLocale
import typingsSlinky.antd.anon.Placeholder
import typingsSlinky.antd.anon.RightDataSource
import typingsSlinky.antd.anon.SelectedCount
import typingsSlinky.antd.anon.SourceSelectedKeys
import typingsSlinky.antd.listBodyMod.TransferListBodyProps
import typingsSlinky.antd.operationMod.TransferOperationProps
import typingsSlinky.antd.renderEmptyMod.RenderEmptyHandler
import typingsSlinky.antd.transferInterfaceMod.PaginationType
import typingsSlinky.antd.transferListMod.TransferListProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transferMod {
  
  @JSImport("antd/lib/transfer", JSImport.Default)
  @js.native
  class default[RecordType /* <: TransferItem */] protected () extends Transfer[RecordType] {
    def this(props: TransferProps[RecordType]) = this()
  }
  object default {
    
    @JSImport("antd/lib/transfer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/lib/transfer", "default.List")
    @js.native
    class List[RecordType /* <: KeyWiseTransferItem */] protected ()
      extends typingsSlinky.antd.transferListMod.default[RecordType] {
      def this(props: TransferListProps[/* import warning: RewrittenClass.unapply cls was tparam RecordType */ _]) = this()
    }
    /* static member */
    /* was `typeof List` */
    object List {
      
      @JSImport("antd/lib/transfer", "default.List")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/transfer", "default.List.defaultProps")
      @js.native
      def defaultProps: DataSource = js.native
      @scala.inline
      def defaultProps_=(x: DataSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("antd/lib/transfer", "default.Operation")
    @js.native
    def Operation: js.Function1[
        /* hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirectionOneWay */ TransferOperationProps, 
        ReactElement
      ] = js.native
    @scala.inline
    def Operation_=(
      x: js.Function1[
          /* hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirectionOneWay */ TransferOperationProps, 
          ReactElement
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Operation")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/lib/transfer", "default.Search")
    @js.native
    class Search ()
      extends typingsSlinky.antd.transferSearchMod.default
    /* static member */
    /* was `typeof Search` */
    object Search {
      
      @JSImport("antd/lib/transfer", "default.Search")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/transfer", "default.Search.defaultProps")
      @js.native
      def defaultProps: Placeholder = js.native
      @scala.inline
      def defaultProps_=(x: Placeholder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd/lib/transfer", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/transfer", "default.defaultProps.dataSource")
      @js.native
      def dataSource: js.Array[scala.Nothing] = js.native
      @scala.inline
      def dataSource_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/transfer", "default.defaultProps.listStyle")
      @js.native
      def listStyle(): Unit = js.native
      
      @JSImport("antd/lib/transfer", "default.defaultProps.showSearch")
      @js.native
      def showSearch: Boolean = js.native
      @scala.inline
      def showSearch_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showSearch")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("antd/lib/transfer", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps[T](hasSelectedKeysTargetKeysPaginationChildren: TransferProps[T]): SourceSelectedKeys | Null = js.native
  }
  
  type KeyWise[T] = T with Key
  
  /* Inlined antd.antd/lib/transfer.KeyWise<antd.antd/lib/transfer.TransferItem> */
  @js.native
  trait KeyWiseTransferItem
    extends /* customProp */ StringDictionary[js.Any] {
    
    var description: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String] with String = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object KeyWiseTransferItem {
    
    @scala.inline
    def apply(key: js.UndefOr[String] with String): KeyWiseTransferItem = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyWiseTransferItem]
    }
    
    @scala.inline
    implicit class KeyWiseTransferItemMutableBuilder[Self <: KeyWiseTransferItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setKey(value: js.UndefOr[String] with String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait ListStyle extends StObject {
    
    var direction: TransferDirection = js.native
  }
  object ListStyle {
    
    @scala.inline
    def apply(direction: TransferDirection): ListStyle = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListStyle]
    }
    
    @scala.inline
    implicit class ListStyleMutableBuilder[Self <: ListStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: TransferDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
  
  type RenderResult = ReactElement | RenderResultObject | String | Null
  
  @js.native
  trait RenderResultObject extends StObject {
    
    var label: ReactElement = js.native
    
    var value: String = js.native
  }
  object RenderResultObject {
    
    @scala.inline
    def apply(label: ReactElement, value: String): RenderResultObject = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderResultObject]
    }
    
    @scala.inline
    implicit class RenderResultObjectMutableBuilder[Self <: RenderResultObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SelectAllLabel = ReactElement | (js.Function1[/* info */ SelectedCount, ReactElement])
  
  @js.native
  trait Transfer[RecordType /* <: TransferItem */]
    extends Component[TransferProps[RecordType], TransferState, js.Any] {
    
    def getLocale(transferLocale: TransferLocale, renderEmpty: RenderEmptyHandler): ItemUnit | ItemsUnit = js.native
    
    def getTitles(transferLocale: TransferLocale): js.Array[String] = js.native
    
    def handleClear(direction: TransferDirection): Unit = js.native
    
    def handleFilter(direction: TransferDirection, e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def handleLeftClear(): Unit = js.native
    
    def handleLeftFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def handleLeftScroll(e: SyntheticEvent[Event, HTMLUListElement]): Unit = js.native
    
    def handleListStyle(listStyle: js.Function1[/* style */ ListStyle, CSSProperties], direction: TransferDirection): CSSProperties = js.native
    def handleListStyle(listStyle: CSSProperties, direction: TransferDirection): CSSProperties = js.native
    
    def handleRightClear(): Unit = js.native
    
    def handleRightFilter(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def handleRightScroll(e: SyntheticEvent[Event, HTMLUListElement]): Unit = js.native
    
    def handleScroll(direction: TransferDirection, e: SyntheticEvent[Event, HTMLUListElement]): Unit = js.native
    
    def handleSelectChange(direction: TransferDirection, holder: js.Array[String]): Unit = js.native
    
    def moveTo(direction: TransferDirection): Unit = js.native
    
    def moveToLeft(): Unit = js.native
    
    def moveToRight(): Unit = js.native
    
    def onItemSelect(direction: TransferDirection, selectedKey: String, checked: Boolean): Unit = js.native
    
    def onItemSelectAll(direction: TransferDirection, selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
    
    def onLeftItemSelect(selectedKey: String, checked: Boolean): Unit = js.native
    
    def onLeftItemSelectAll(selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
    
    def onRightItemRemove(selectedKeys: js.Array[String]): Unit = js.native
    
    def onRightItemSelect(selectedKey: String, checked: Boolean): Unit = js.native
    
    def onRightItemSelectAll(selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
    
    def renderTransfer(transferLocale: TransferLocale): ReactElement = js.native
    
    def separateDataSource(): RightDataSource[RecordType] = js.native
    
    var separatedDataSource: LeftDataSource[RecordType] | Null = js.native
    
    def setStateKeys(direction: TransferDirection, keys: js.Array[String]): Unit = js.native
    def setStateKeys(
      direction: TransferDirection,
      keys: js.Function1[/* prevKeys */ js.Array[String], js.Array[String]]
    ): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdStrings.left
    - typingsSlinky.antd.antdStrings.right
  */
  trait TransferDirection extends StObject
  object TransferDirection {
    
    @scala.inline
    def left: typingsSlinky.antd.antdStrings.left = "left".asInstanceOf[typingsSlinky.antd.antdStrings.left]
    
    @scala.inline
    def right: typingsSlinky.antd.antdStrings.right = "right".asInstanceOf[typingsSlinky.antd.antdStrings.right]
  }
  
  @js.native
  trait TransferItem
    extends /* customProp */ StringDictionary[js.Any] {
    
    var description: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object TransferItem {
    
    @scala.inline
    def apply(): TransferItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransferItem]
    }
    
    @scala.inline
    implicit class TransferItemMutableBuilder[Self <: TransferItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait TransferLocale extends StObject {
    
    var itemUnit: String = js.native
    
    var itemsUnit: String = js.native
    
    var notFoundContent: js.UndefOr[ReactElement] = js.native
    
    var remove: String = js.native
    
    var removeAll: String = js.native
    
    var removeCurrent: String = js.native
    
    var searchPlaceholder: String = js.native
    
    var selectAll: String = js.native
    
    var selectCurrent: String = js.native
    
    var selectInvert: String = js.native
    
    var titles: js.Array[String] = js.native
  }
  object TransferLocale {
    
    @scala.inline
    def apply(
      itemUnit: String,
      itemsUnit: String,
      remove: String,
      removeAll: String,
      removeCurrent: String,
      searchPlaceholder: String,
      selectAll: String,
      selectCurrent: String,
      selectInvert: String,
      titles: js.Array[String]
    ): TransferLocale = {
      val __obj = js.Dynamic.literal(itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeAll = removeAll.asInstanceOf[js.Any], removeCurrent = removeCurrent.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], selectAll = selectAll.asInstanceOf[js.Any], selectCurrent = selectCurrent.asInstanceOf[js.Any], selectInvert = selectInvert.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferLocale]
    }
    
    @scala.inline
    implicit class TransferLocaleMutableBuilder[Self <: TransferLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemUnit(value: String): Self = StObject.set(x, "itemUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUnit(value: String): Self = StObject.set(x, "itemsUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContent(value: ReactElement): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContentReactElement(value: ReactElement): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      @scala.inline
      def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveAll(value: String): Self = StObject.set(x, "removeAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveCurrent(value: String): Self = StObject.set(x, "removeCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAll(value: String): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectCurrent(value: String): Self = StObject.set(x, "selectCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectInvert(value: String): Self = StObject.set(x, "selectInvert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitles(value: js.Array[String]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlesVarargs(value: String*): Self = StObject.set(x, "titles", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TransferProps[RecordType] extends StObject {
    
    var children: js.UndefOr[js.Function1[/* props */ TransferListBodyProps[RecordType], ReactElement]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dataSource: js.Array[RecordType] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var filterOption: js.UndefOr[js.Function2[/* inputValue */ String, /* item */ RecordType, Boolean]] = js.native
    
    var footer: js.UndefOr[js.Function1[/* props */ TransferListProps[RecordType], ReactElement]] = js.native
    
    var listStyle: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties = js.native
    
    var locale: js.UndefOr[PartialTransferLocale] = js.native
    
    var onChange: js.UndefOr[
        js.Function3[
          /* targetKeys */ js.Array[String], 
          /* direction */ TransferDirection, 
          /* moveKeys */ js.Array[String], 
          Unit
        ]
      ] = js.native
    
    var onScroll: js.UndefOr[
        js.Function2[
          /* direction */ TransferDirection, 
          /* e */ SyntheticEvent[Event, HTMLUListElement], 
          Unit
        ]
      ] = js.native
    
    var onSearch: js.UndefOr[js.Function2[/* direction */ TransferDirection, /* value */ String, Unit]] = js.native
    
    var onSelectChange: js.UndefOr[
        js.Function2[
          /* sourceSelectedKeys */ js.Array[String], 
          /* targetSelectedKeys */ js.Array[String], 
          Unit
        ]
      ] = js.native
    
    var oneWay: js.UndefOr[Boolean] = js.native
    
    var operationStyle: js.UndefOr[CSSProperties] = js.native
    
    var operations: js.UndefOr[js.Array[String]] = js.native
    
    var pagination: js.UndefOr[PaginationType] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var render: js.UndefOr[TransferRender[RecordType]] = js.native
    
    var rowKey: js.UndefOr[js.Function1[/* record */ RecordType, String]] = js.native
    
    var selectAllLabels: js.UndefOr[js.Array[SelectAllLabel]] = js.native
    
    var selectedKeys: js.UndefOr[js.Array[String]] = js.native
    
    var showSearch: js.UndefOr[Boolean] = js.native
    
    var showSelectAll: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var targetKeys: js.UndefOr[js.Array[String]] = js.native
    
    var titles: js.UndefOr[js.Array[String]] = js.native
  }
  object TransferProps {
    
    @scala.inline
    def apply[RecordType](
      dataSource: js.Array[RecordType],
      listStyle: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties
    ): TransferProps[RecordType] = {
      val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], listStyle = listStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferProps[RecordType]]
    }
    
    @scala.inline
    implicit class TransferPropsMutableBuilder[Self <: TransferProps[_], RecordType] (val x: Self with TransferProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* props */ TransferListBodyProps[RecordType] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Array[RecordType]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceVarargs(value: RecordType*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFilterOption(value: (/* inputValue */ String, /* item */ RecordType) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
      
      @scala.inline
      def setFooter(value: /* props */ TransferListProps[RecordType] => ReactElement): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setListStyle(value: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListStyleFunction1(value: /* style */ ListStyle => CSSProperties): Self = StObject.set(x, "listStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLocale(value: PartialTransferLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* targetKeys */ js.Array[String], /* direction */ TransferDirection, /* moveKeys */ js.Array[String]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnScroll(
        value: (/* direction */ TransferDirection, /* e */ SyntheticEvent[Event, HTMLUListElement]) => Unit
      ): Self = StObject.set(x, "onScroll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSearch(value: (/* direction */ TransferDirection, /* value */ String) => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      @scala.inline
      def setOnSelectChange(
        value: (/* sourceSelectedKeys */ js.Array[String], /* targetSelectedKeys */ js.Array[String]) => Unit
      ): Self = StObject.set(x, "onSelectChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectChangeUndefined: Self = StObject.set(x, "onSelectChange", js.undefined)
      
      @scala.inline
      def setOneWay(value: Boolean): Self = StObject.set(x, "oneWay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneWayUndefined: Self = StObject.set(x, "oneWay", js.undefined)
      
      @scala.inline
      def setOperationStyle(value: CSSProperties): Self = StObject.set(x, "operationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationStyleUndefined: Self = StObject.set(x, "operationStyle", js.undefined)
      
      @scala.inline
      def setOperations(value: js.Array[String]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
      
      @scala.inline
      def setOperationsVarargs(value: String*): Self = StObject.set(x, "operations", js.Array(value :_*))
      
      @scala.inline
      def setPagination(value: PaginationType): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRender(value: RecordType => RenderResult): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setRowKey(value: /* record */ RecordType => String): Self = StObject.set(x, "rowKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
      
      @scala.inline
      def setSelectAllLabels(value: js.Array[SelectAllLabel]): Self = StObject.set(x, "selectAllLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllLabelsUndefined: Self = StObject.set(x, "selectAllLabels", js.undefined)
      
      @scala.inline
      def setSelectAllLabelsVarargs(value: SelectAllLabel*): Self = StObject.set(x, "selectAllLabels", js.Array(value :_*))
      
      @scala.inline
      def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      @scala.inline
      def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
      
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
      def setTargetKeys(value: js.Array[String]): Self = StObject.set(x, "targetKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetKeysUndefined: Self = StObject.set(x, "targetKeys", js.undefined)
      
      @scala.inline
      def setTargetKeysVarargs(value: String*): Self = StObject.set(x, "targetKeys", js.Array(value :_*))
      
      @scala.inline
      def setTitles(value: js.Array[String]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlesUndefined: Self = StObject.set(x, "titles", js.undefined)
      
      @scala.inline
      def setTitlesVarargs(value: String*): Self = StObject.set(x, "titles", js.Array(value :_*))
    }
  }
  
  type TransferRender[RecordType] = js.Function1[/* item */ RecordType, RenderResult]
  
  @js.native
  trait TransferState extends StObject {
    
    var sourceSelectedKeys: js.Array[String] = js.native
    
    var targetSelectedKeys: js.Array[String] = js.native
  }
  object TransferState {
    
    @scala.inline
    def apply(sourceSelectedKeys: js.Array[String], targetSelectedKeys: js.Array[String]): TransferState = {
      val __obj = js.Dynamic.literal(sourceSelectedKeys = sourceSelectedKeys.asInstanceOf[js.Any], targetSelectedKeys = targetSelectedKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferState]
    }
    
    @scala.inline
    implicit class TransferStateMutableBuilder[Self <: TransferState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "sourceSelectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceSelectedKeysVarargs(value: String*): Self = StObject.set(x, "sourceSelectedKeys", js.Array(value :_*))
      
      @scala.inline
      def setTargetSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "targetSelectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetSelectedKeysVarargs(value: String*): Self = StObject.set(x, "targetSelectedKeys", js.Array(value :_*))
    }
  }
}
