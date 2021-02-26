package typingsSlinky.antd

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.listItemMod.ListItemTypeProps
import typingsSlinky.antd.paginationPaginationMod.PaginationConfig
import typingsSlinky.antd.spinMod.SpinProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  object default {
    
    @JSImport("antd/lib/list", JSImport.Default)
    @js.native
    def apply[T](
      hasPaginationPrefixClsBorderedSplitClassNameChildrenItemLayoutLoadMoreGridDataSourceSizeHeaderFooterLoadingRowKeyRenderItemLocaleRest: ListProps[T]
    ): ReactElement = js.native
    @JSImport("antd/lib/list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/list", "default.Item")
    @js.native
    def Item: ListItemTypeProps = js.native
    @scala.inline
    def Item_=(x: ListItemTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd/lib/list", "ListConsumer")
  @js.native
  val ListConsumer: ReactComponentClass[ConsumerProps[ListConsumerProps]] = js.native
  
  @JSImport("antd/lib/list", "ListContext")
  @js.native
  val ListContext: Context[ListConsumerProps] = js.native
  
  type ColumnCount = Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdStrings.gutter
    - typingsSlinky.antd.antdStrings.column
    - typingsSlinky.antd.antdStrings.xs
    - typingsSlinky.antd.antdStrings.sm
    - typingsSlinky.antd.antdStrings.md
    - typingsSlinky.antd.antdStrings.lg
    - typingsSlinky.antd.antdStrings.xl
    - typingsSlinky.antd.antdStrings.xxl
  */
  trait ColumnType extends StObject
  object ColumnType {
    
    @scala.inline
    def column: typingsSlinky.antd.antdStrings.column = "column".asInstanceOf[typingsSlinky.antd.antdStrings.column]
    
    @scala.inline
    def gutter: typingsSlinky.antd.antdStrings.gutter = "gutter".asInstanceOf[typingsSlinky.antd.antdStrings.gutter]
    
    @scala.inline
    def lg: typingsSlinky.antd.antdStrings.lg = "lg".asInstanceOf[typingsSlinky.antd.antdStrings.lg]
    
    @scala.inline
    def md: typingsSlinky.antd.antdStrings.md = "md".asInstanceOf[typingsSlinky.antd.antdStrings.md]
    
    @scala.inline
    def sm: typingsSlinky.antd.antdStrings.sm = "sm".asInstanceOf[typingsSlinky.antd.antdStrings.sm]
    
    @scala.inline
    def xl: typingsSlinky.antd.antdStrings.xl = "xl".asInstanceOf[typingsSlinky.antd.antdStrings.xl]
    
    @scala.inline
    def xs: typingsSlinky.antd.antdStrings.xs = "xs".asInstanceOf[typingsSlinky.antd.antdStrings.xs]
    
    @scala.inline
    def xxl: typingsSlinky.antd.antdStrings.xxl = "xxl".asInstanceOf[typingsSlinky.antd.antdStrings.xxl]
  }
  
  @js.native
  trait ListConsumerProps extends StObject {
    
    var grid: js.UndefOr[js.Any] = js.native
    
    var itemLayout: js.UndefOr[String] = js.native
  }
  object ListConsumerProps {
    
    @scala.inline
    def apply(): ListConsumerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListConsumerProps]
    }
    
    @scala.inline
    implicit class ListConsumerPropsMutableBuilder[Self <: ListConsumerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrid(value: js.Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setItemLayout(value: String): Self = StObject.set(x, "itemLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemLayoutUndefined: Self = StObject.set(x, "itemLayout", js.undefined)
    }
  }
  
  @js.native
  trait ListGridType extends StObject {
    
    var column: js.UndefOr[ColumnCount] = js.native
    
    var gutter: js.UndefOr[Double] = js.native
    
    var lg: js.UndefOr[ColumnCount] = js.native
    
    var md: js.UndefOr[ColumnCount] = js.native
    
    var sm: js.UndefOr[ColumnCount] = js.native
    
    var xl: js.UndefOr[ColumnCount] = js.native
    
    var xs: js.UndefOr[ColumnCount] = js.native
    
    var xxl: js.UndefOr[ColumnCount] = js.native
  }
  object ListGridType {
    
    @scala.inline
    def apply(): ListGridType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGridType]
    }
    
    @scala.inline
    implicit class ListGridTypeMutableBuilder[Self <: ListGridType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: ColumnCount): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setLg(value: ColumnCount): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      @scala.inline
      def setMd(value: ColumnCount): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      @scala.inline
      def setSm(value: ColumnCount): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      @scala.inline
      def setXl(value: ColumnCount): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      @scala.inline
      def setXs(value: ColumnCount): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      @scala.inline
      def setXxl(value: ColumnCount): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdStrings.horizontal
    - typingsSlinky.antd.antdStrings.vertical
  */
  trait ListItemLayout extends StObject
  object ListItemLayout {
    
    @scala.inline
    def horizontal: typingsSlinky.antd.antdStrings.horizontal = "horizontal".asInstanceOf[typingsSlinky.antd.antdStrings.horizontal]
    
    @scala.inline
    def vertical: typingsSlinky.antd.antdStrings.vertical = "vertical".asInstanceOf[typingsSlinky.antd.antdStrings.vertical]
  }
  
  @js.native
  trait ListLocale extends StObject {
    
    var emptyText: ReactElement | js.Function0[ReactElement] = js.native
  }
  object ListLocale {
    
    @scala.inline
    def apply(): ListLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListLocale]
    }
    
    @scala.inline
    implicit class ListLocaleMutableBuilder[Self <: ListLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmptyText(value: ReactElement | js.Function0[ReactElement]): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyTextFunction0(value: () => ReactElement): Self = StObject.set(x, "emptyText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmptyTextReactElement(value: ReactElement): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
    }
  }
  
  @js.native
  trait ListProps[T] extends StObject {
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dataSource: js.UndefOr[js.Array[T]] = js.native
    
    var extra: js.UndefOr[ReactElement] = js.native
    
    var footer: js.UndefOr[ReactElement] = js.native
    
    var grid: js.UndefOr[ListGridType] = js.native
    
    var header: js.UndefOr[ReactElement] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var itemLayout: js.UndefOr[ListItemLayout] = js.native
    
    var loadMore: js.UndefOr[ReactElement] = js.native
    
    var loading: js.UndefOr[Boolean | SpinProps] = js.native
    
    var locale: js.UndefOr[ListLocale] = js.native
    
    var pagination: js.UndefOr[PaginationConfig | `false`] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var renderItem: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, ReactElement]] = js.native
    
    var rowKey: js.UndefOr[(js.Function1[/* item */ T, String]) | String] = js.native
    
    var size: js.UndefOr[ListSize] = js.native
    
    var split: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ListProps {
    
    @scala.inline
    def apply[T](): ListProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps[T]]
    }
    
    @scala.inline
    implicit class ListPropsMutableBuilder[Self <: ListProps[_], T] (val x: Self with ListProps[T]) extends AnyVal {
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Array[T]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDataSourceVarargs(value: T*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
      
      @scala.inline
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraReactElement(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setFooter(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterReactElement(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setGrid(value: ListGridType): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setHeader(value: ReactElement): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderReactElement(value: ReactElement): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setItemLayout(value: ListItemLayout): Self = StObject.set(x, "itemLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemLayoutUndefined: Self = StObject.set(x, "itemLayout", js.undefined)
      
      @scala.inline
      def setLoadMore(value: ReactElement): Self = StObject.set(x, "loadMore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMoreReactElement(value: ReactElement): Self = StObject.set(x, "loadMore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean | SpinProps): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setLocale(value: ListLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPagination(value: PaginationConfig | `false`): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRenderItem(value: (/* item */ T, /* index */ Double) => ReactElement): Self = StObject.set(x, "renderItem", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      @scala.inline
      def setRowKey(value: (js.Function1[/* item */ T, String]) | String): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowKeyFunction1(value: /* item */ T => String): Self = StObject.set(x, "rowKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
      
      @scala.inline
      def setSize(value: ListSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdStrings.small
    - typingsSlinky.antd.antdStrings.default
    - typingsSlinky.antd.antdStrings.large
  */
  trait ListSize extends StObject
  object ListSize {
    
    @scala.inline
    def default: typingsSlinky.antd.antdStrings.default = "default".asInstanceOf[typingsSlinky.antd.antdStrings.default]
    
    @scala.inline
    def large: typingsSlinky.antd.antdStrings.large = "large".asInstanceOf[typingsSlinky.antd.antdStrings.large]
    
    @scala.inline
    def small: typingsSlinky.antd.antdStrings.small = "small".asInstanceOf[typingsSlinky.antd.antdStrings.small]
  }
}
