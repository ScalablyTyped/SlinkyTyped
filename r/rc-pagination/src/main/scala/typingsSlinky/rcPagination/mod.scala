package typingsSlinky.rcPagination

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-pagination", JSImport.Default)
  @js.native
  class default ()
    extends Component[PaginationProps, js.Object, js.Any]
  
  type Pagination = ReactComponentClass[PaginationProps]
  
  @js.native
  trait PaginationData extends StObject {
    
    var className: String = js.native
    
    var current: Double = js.native
    
    var defaultCurrent: Double = js.native
    
    var defaultPageSize: Double = js.native
    
    var hideOnSinglePage: Boolean = js.native
    
    var jumpNextIcon: ReactComponentClass[js.Object] | ReactElement = js.native
    
    var jumpPrevIcon: ReactComponentClass[js.Object] | ReactElement = js.native
    
    var locale: js.Object = js.native
    
    var nextIcon: ReactComponentClass[js.Object] | ReactElement = js.native
    
    var pageSize: Double = js.native
    
    var pageSizeOptions: js.Array[String] = js.native
    
    var prefixCls: String = js.native
    
    var prevIcon: ReactComponentClass[js.Object] | ReactElement = js.native
    
    var selectComponentClass: ReactComponentClass[js.Object] = js.native
    
    var selectPrefixCls: String = js.native
    
    var showLessItems: Boolean = js.native
    
    var showPrevNextJumpers: Boolean = js.native
    
    var showQuickJumper: Boolean | js.Object = js.native
    
    var showSizeChanger: Boolean = js.native
    
    var showTitle: Boolean = js.native
    
    var simple: Boolean = js.native
    
    var style: CSSProperties = js.native
    
    var total: Double = js.native
  }
  object PaginationData {
    
    @scala.inline
    def apply(
      className: String,
      current: Double,
      defaultCurrent: Double,
      defaultPageSize: Double,
      hideOnSinglePage: Boolean,
      locale: js.Object,
      pageSize: Double,
      pageSizeOptions: js.Array[String],
      prefixCls: String,
      selectComponentClass: ReactComponentClass[js.Object],
      selectPrefixCls: String,
      showLessItems: Boolean,
      showPrevNextJumpers: Boolean,
      showQuickJumper: Boolean | js.Object,
      showSizeChanger: Boolean,
      showTitle: Boolean,
      simple: Boolean,
      style: CSSProperties,
      total: Double
    ): PaginationData = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], defaultCurrent = defaultCurrent.asInstanceOf[js.Any], defaultPageSize = defaultPageSize.asInstanceOf[js.Any], hideOnSinglePage = hideOnSinglePage.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pageSizeOptions = pageSizeOptions.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectComponentClass = selectComponentClass.asInstanceOf[js.Any], selectPrefixCls = selectPrefixCls.asInstanceOf[js.Any], showLessItems = showLessItems.asInstanceOf[js.Any], showPrevNextJumpers = showPrevNextJumpers.asInstanceOf[js.Any], showQuickJumper = showQuickJumper.asInstanceOf[js.Any], showSizeChanger = showSizeChanger.asInstanceOf[js.Any], showTitle = showTitle.asInstanceOf[js.Any], simple = simple.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationData]
    }
    
    @scala.inline
    implicit class PaginationDataMutableBuilder[Self <: PaginationData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCurrent(value: Double): Self = StObject.set(x, "defaultCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPageSize(value: Double): Self = StObject.set(x, "defaultPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnSinglePage(value: Boolean): Self = StObject.set(x, "hideOnSinglePage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpNextIcon(value: ReactComponentClass[js.Object] | ReactElement): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpNextIconComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpNextIconFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpNextIconReactElement(value: ReactElement): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpNextIconUndefined: Self = StObject.set(x, "jumpNextIcon", js.undefined)
      
      @scala.inline
      def setJumpPrevIcon(value: ReactComponentClass[js.Object] | ReactElement): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpPrevIconComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpPrevIconFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpPrevIconReactElement(value: ReactElement): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpPrevIconUndefined: Self = StObject.set(x, "jumpPrevIcon", js.undefined)
      
      @scala.inline
      def setLocale(value: js.Object): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIcon(value: ReactComponentClass[js.Object] | ReactElement): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconReactElement(value: ReactElement): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeOptions(value: js.Array[String]): Self = StObject.set(x, "pageSizeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeOptionsVarargs(value: String*): Self = StObject.set(x, "pageSizeOptions", js.Array(value :_*))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIcon(value: ReactComponentClass[js.Object] | ReactElement): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconReactElement(value: ReactElement): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      @scala.inline
      def setSelectComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "selectComponentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectPrefixCls(value: String): Self = StObject.set(x, "selectPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLessItems(value: Boolean): Self = StObject.set(x, "showLessItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPrevNextJumpers(value: Boolean): Self = StObject.set(x, "showPrevNextJumpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowQuickJumper(value: Boolean | js.Object): Self = StObject.set(x, "showQuickJumper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSizeChanger(value: Boolean): Self = StObject.set(x, "showSizeChanger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<rc-pagination.rc-pagination.PaginationData> */
  @js.native
  trait PaginationProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var current: js.UndefOr[Double] = js.native
    
    var defaultCurrent: js.UndefOr[Double] = js.native
    
    var defaultPageSize: js.UndefOr[Double] = js.native
    
    var hideOnSinglePage: js.UndefOr[Boolean] = js.native
    
    var itemRender: js.UndefOr[
        js.Function3[/* page */ Double, /* type */ String, /* element */ ReactElement, ReactElement]
      ] = js.native
    
    var jumpNextIcon: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
    
    var jumpPrevIcon: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
    
    var locale: js.UndefOr[js.Object] = js.native
    
    var nextIcon: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
    
    var onChange: js.UndefOr[js.Function2[/* page */ Double, /* pageSize */ Double, Unit]] = js.native
    
    var onShowSizeChange: js.UndefOr[js.Function2[/* current */ Double, /* size */ Double, Unit]] = js.native
    
    var pageSize: js.UndefOr[Double] = js.native
    
    var pageSizeOptions: js.UndefOr[js.Array[String]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var prevIcon: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
    
    var selectComponentClass: js.UndefOr[ReactComponentClass[js.Object]] = js.native
    
    var selectPrefixCls: js.UndefOr[String] = js.native
    
    var showLessItems: js.UndefOr[Boolean] = js.native
    
    var showPrevNextJumpers: js.UndefOr[Boolean] = js.native
    
    var showQuickJumper: js.UndefOr[Boolean | js.Object] = js.native
    
    var showSizeChanger: js.UndefOr[Boolean] = js.native
    
    var showTitle: js.UndefOr[Boolean] = js.native
    
    var showTotal: js.UndefOr[
        js.Function2[/* total */ Double, /* range */ js.Tuple2[Double, Double], ReactElement]
      ] = js.native
    
    var simple: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var total: js.UndefOr[Double] = js.native
  }
  object PaginationProps {
    
    @scala.inline
    def apply(): PaginationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationProps]
    }
    
    @scala.inline
    implicit class PaginationPropsMutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setDefaultCurrent(value: Double): Self = StObject.set(x, "defaultCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCurrentUndefined: Self = StObject.set(x, "defaultCurrent", js.undefined)
      
      @scala.inline
      def setDefaultPageSize(value: Double): Self = StObject.set(x, "defaultPageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPageSizeUndefined: Self = StObject.set(x, "defaultPageSize", js.undefined)
      
      @scala.inline
      def setHideOnSinglePage(value: Boolean): Self = StObject.set(x, "hideOnSinglePage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnSinglePageUndefined: Self = StObject.set(x, "hideOnSinglePage", js.undefined)
      
      @scala.inline
      def setItemRender(value: (/* page */ Double, /* type */ String, /* element */ ReactElement) => ReactElement): Self = StObject.set(x, "itemRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      @scala.inline
      def setJumpNextIcon(value: ReactComponentClass[js.Object] | ReactElement): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpNextIconComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpNextIconFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpNextIconReactElement(value: ReactElement): Self = StObject.set(x, "jumpNextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpNextIconUndefined: Self = StObject.set(x, "jumpNextIcon", js.undefined)
      
      @scala.inline
      def setJumpPrevIcon(value: ReactComponentClass[js.Object] | ReactElement): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpPrevIconComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpPrevIconFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpPrevIconReactElement(value: ReactElement): Self = StObject.set(x, "jumpPrevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpPrevIconUndefined: Self = StObject.set(x, "jumpPrevIcon", js.undefined)
      
      @scala.inline
      def setLocale(value: js.Object): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setNextIcon(value: ReactComponentClass[js.Object] | ReactElement): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconReactElement(value: ReactElement): Self = StObject.set(x, "nextIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextIconUndefined: Self = StObject.set(x, "nextIcon", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* page */ Double, /* pageSize */ Double) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnShowSizeChange(value: (/* current */ Double, /* size */ Double) => Unit): Self = StObject.set(x, "onShowSizeChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnShowSizeChangeUndefined: Self = StObject.set(x, "onShowSizeChange", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeOptions(value: js.Array[String]): Self = StObject.set(x, "pageSizeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeOptionsUndefined: Self = StObject.set(x, "pageSizeOptions", js.undefined)
      
      @scala.inline
      def setPageSizeOptionsVarargs(value: String*): Self = StObject.set(x, "pageSizeOptions", js.Array(value :_*))
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPrevIcon(value: ReactComponentClass[js.Object] | ReactElement): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconReactElement(value: ReactElement): Self = StObject.set(x, "prevIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevIconUndefined: Self = StObject.set(x, "prevIcon", js.undefined)
      
      @scala.inline
      def setSelectComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "selectComponentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectComponentClassComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "selectComponentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectComponentClassFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "selectComponentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectComponentClassUndefined: Self = StObject.set(x, "selectComponentClass", js.undefined)
      
      @scala.inline
      def setSelectPrefixCls(value: String): Self = StObject.set(x, "selectPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectPrefixClsUndefined: Self = StObject.set(x, "selectPrefixCls", js.undefined)
      
      @scala.inline
      def setShowLessItems(value: Boolean): Self = StObject.set(x, "showLessItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLessItemsUndefined: Self = StObject.set(x, "showLessItems", js.undefined)
      
      @scala.inline
      def setShowPrevNextJumpers(value: Boolean): Self = StObject.set(x, "showPrevNextJumpers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPrevNextJumpersUndefined: Self = StObject.set(x, "showPrevNextJumpers", js.undefined)
      
      @scala.inline
      def setShowQuickJumper(value: Boolean | js.Object): Self = StObject.set(x, "showQuickJumper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowQuickJumperUndefined: Self = StObject.set(x, "showQuickJumper", js.undefined)
      
      @scala.inline
      def setShowSizeChanger(value: Boolean): Self = StObject.set(x, "showSizeChanger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSizeChangerUndefined: Self = StObject.set(x, "showSizeChanger", js.undefined)
      
      @scala.inline
      def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
      
      @scala.inline
      def setShowTotal(value: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => ReactElement): Self = StObject.set(x, "showTotal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShowTotalUndefined: Self = StObject.set(x, "showTotal", js.undefined)
      
      @scala.inline
      def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
