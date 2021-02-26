package typingsSlinky.antd.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticUIEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.anon.PartialTransferLocale
import typingsSlinky.antd.anon.SelectedCount
import typingsSlinky.antd.listBodyMod.TransferListBodyProps
import typingsSlinky.antd.transferInterfaceMod.PaginationType
import typingsSlinky.antd.transferListMod.TransferListProps
import typingsSlinky.antd.transferMod.KeyWiseTransferItem
import typingsSlinky.antd.transferMod.ListStyle
import typingsSlinky.antd.transferMod.RenderResult
import typingsSlinky.antd.transferMod.SelectAllLabel
import typingsSlinky.antd.transferMod.TransferDirection
import typingsSlinky.antd.transferMod.TransferItem
import typingsSlinky.antd.transferMod.TransferProps
import typingsSlinky.antd.transferSearchMod.TransferSearchProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transfer {
  
  @scala.inline
  def apply[RecordType /* <: TransferItem */](
    dataSource: js.Array[RecordType],
    listStyle: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties
  ): Builder[RecordType] = {
    val __props = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], listStyle = listStyle.asInstanceOf[js.Any])
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[TransferProps[RecordType]]))
  }
  
  object List {
    
    @scala.inline
    def apply[RecordType /* <: KeyWiseTransferItem */](
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
    ): typingsSlinky.antd.components.Transfer.List.Builder[RecordType] = {
      val __props = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], handleClear = js.Any.fromFunction0(handleClear), handleFilter = js.Any.fromFunction1(handleFilter), itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction2(onItemSelect), onItemSelectAll = js.Any.fromFunction2(onItemSelectAll), onScroll = js.Any.fromFunction1(onScroll), prefixCls = prefixCls.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeAll = removeAll.asInstanceOf[js.Any], removeCurrent = removeCurrent.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], selectAll = selectAll.asInstanceOf[js.Any], selectCurrent = selectCurrent.asInstanceOf[js.Any], selectInvert = selectInvert.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any])
      new typingsSlinky.antd.components.Transfer.List.Builder[RecordType](js.Array(this.component, __props.asInstanceOf[TransferListProps[RecordType]]))
    }
    
    @JSImport("antd", "Transfer.List")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder[RecordType /* <: KeyWiseTransferItem */] (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.antd.mod.Transfer.List[RecordType]] {
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def filterOption(value: (/* filterText */ String, RecordType) => Boolean): this.type = set("filterOption", js.Any.fromFunction2(value))
      
      @scala.inline
      def footer(value: /* props */ TransferListProps[RecordType] => ReactElement): this.type = set("footer", js.Any.fromFunction1(value))
      
      @scala.inline
      def notFoundContent(value: ReactElement): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def notFoundContentReactElement(value: ReactElement): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onItemRemove(value: /* keys */ js.Array[String] => Unit): this.type = set("onItemRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def pagination(value: PaginationType): this.type = set("pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def render(value: RecordType => RenderResult): this.type = set("render", js.Any.fromFunction1(value))
      
      @scala.inline
      def renderList(value: /* props */ TransferListBodyProps[RecordType] => ReactElement): this.type = set("renderList", js.Any.fromFunction1(value))
      
      @scala.inline
      def selectAllLabel(value: SelectAllLabel): this.type = set("selectAllLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectAllLabelFunction1(value: /* info */ SelectedCount => ReactElement): this.type = set("selectAllLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def selectAllLabelReactElement(value: ReactElement): this.type = set("selectAllLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showRemove(value: Boolean): this.type = set("showRemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showSelectAll(value: Boolean): this.type = set("showSelectAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    def withProps[RecordType /* <: KeyWiseTransferItem */](p: TransferListProps[RecordType]): typingsSlinky.antd.components.Transfer.List.Builder[RecordType] = new typingsSlinky.antd.components.Transfer.List.Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Search {
    
    @JSImport("antd", "Transfer.Search")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antd.mod.Transfer.Search] {
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def handleClear(value: /* e */ SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("handleClear", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChange(value: SyntheticEvent[EventTarget with HTMLElement, Event] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Search.type): typingsSlinky.antd.components.Transfer.Search.Builder = new typingsSlinky.antd.components.Transfer.Search.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TransferSearchProps): typingsSlinky.antd.components.Transfer.Search.Builder = new typingsSlinky.antd.components.Transfer.Search.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Transfer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[RecordType /* <: TransferItem */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.ul.tag.type, typingsSlinky.antd.mod.Transfer[RecordType]] {
    
    @scala.inline
    def children(value: /* props */ TransferListBodyProps[RecordType] => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterOption(value: (/* inputValue */ String, RecordType) => Boolean): this.type = set("filterOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def footer(value: /* props */ TransferListProps[RecordType] => ReactElement): this.type = set("footer", js.Any.fromFunction1(value))
    
    @scala.inline
    def locale(value: PartialTransferLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(
      value: (/* targetKeys */ js.Array[String], /* direction */ TransferDirection, /* moveKeys */ js.Array[String]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def onScroll(
      value: (/* direction */ TransferDirection, /* e */ SyntheticEvent[Event, HTMLUListElement]) => Unit
    ): this.type = set("onScroll", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSearch(value: (/* direction */ TransferDirection, /* value */ String) => Unit): this.type = set("onSearch", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSelectChange(
      value: (/* sourceSelectedKeys */ js.Array[String], /* targetSelectedKeys */ js.Array[String]) => Unit
    ): this.type = set("onSelectChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def oneWay(value: Boolean): this.type = set("oneWay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def operationStyle(value: CSSProperties): this.type = set("operationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def operations(value: js.Array[String]): this.type = set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def operationsVarargs(value: String*): this.type = set("operations", js.Array(value :_*))
    
    @scala.inline
    def pagination(value: PaginationType): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def render(value: RecordType => RenderResult): this.type = set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def rowKey(value: RecordType => String): this.type = set("rowKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def selectAllLabels(value: js.Array[SelectAllLabel]): this.type = set("selectAllLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectAllLabelsVarargs(value: SelectAllLabel*): this.type = set("selectAllLabels", js.Array(value :_*))
    
    @scala.inline
    def selectedKeys(value: js.Array[String]): this.type = set("selectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedKeysVarargs(value: String*): this.type = set("selectedKeys", js.Array(value :_*))
    
    @scala.inline
    def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSelectAll(value: Boolean): this.type = set("showSelectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetKeys(value: js.Array[String]): this.type = set("targetKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetKeysVarargs(value: String*): this.type = set("targetKeys", js.Array(value :_*))
    
    @scala.inline
    def titles(value: js.Array[String]): this.type = set("titles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titlesVarargs(value: String*): this.type = set("titles", js.Array(value :_*))
  }
  
  def withProps[RecordType /* <: TransferItem */](p: TransferProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
