package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.GoButton
import typingsSlinky.antd.antdStrings.`jump-next`
import typingsSlinky.antd.antdStrings.`jump-prev`
import typingsSlinky.antd.antdStrings.next
import typingsSlinky.antd.antdStrings.page
import typingsSlinky.antd.antdStrings.prev
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationPaginationMod extends Shortcut {
  
  @JSImport("antd/lib/pagination/Pagination", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PaginationProps] = js.native
  
  @js.native
  trait PaginationConfig extends PaginationProps {
    
    var position: js.UndefOr[PaginationPosition] = js.native
  }
  object PaginationConfig {
    
    @scala.inline
    def apply(): PaginationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationConfig]
    }
    
    @scala.inline
    implicit class PaginationConfigMutableBuilder[Self <: PaginationConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: PaginationPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  type PaginationLocale = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antd.antdStrings.top
    - typingsSlinky.antd.antdStrings.bottom
    - typingsSlinky.antd.antdStrings.both
  */
  trait PaginationPosition extends StObject
  object PaginationPosition {
    
    @scala.inline
    def both: typingsSlinky.antd.antdStrings.both = "both".asInstanceOf[typingsSlinky.antd.antdStrings.both]
    
    @scala.inline
    def bottom: typingsSlinky.antd.antdStrings.bottom = "bottom".asInstanceOf[typingsSlinky.antd.antdStrings.bottom]
    
    @scala.inline
    def top: typingsSlinky.antd.antdStrings.top = "top".asInstanceOf[typingsSlinky.antd.antdStrings.top]
  }
  
  @js.native
  trait PaginationProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var current: js.UndefOr[Double] = js.native
    
    var defaultCurrent: js.UndefOr[Double] = js.native
    
    var defaultPageSize: js.UndefOr[Double] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var hideOnSinglePage: js.UndefOr[Boolean] = js.native
    
    var itemRender: js.UndefOr[
        js.Function3[
          /* page */ Double, 
          /* type */ page | prev | next | `jump-prev` | `jump-next`, 
          /* originalElement */ ReactElement, 
          ReactElement
        ]
      ] = js.native
    
    var locale: js.UndefOr[js.Object] = js.native
    
    var onChange: js.UndefOr[js.Function2[/* page */ Double, /* pageSize */ js.UndefOr[Double], Unit]] = js.native
    
    var onShowSizeChange: js.UndefOr[js.Function2[/* current */ Double, /* size */ Double, Unit]] = js.native
    
    var pageSize: js.UndefOr[Double] = js.native
    
    var pageSizeOptions: js.UndefOr[js.Array[String]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var responsive: js.UndefOr[Boolean] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var selectPrefixCls: js.UndefOr[String] = js.native
    
    var showLessItems: js.UndefOr[Boolean] = js.native
    
    var showQuickJumper: js.UndefOr[Boolean | GoButton] = js.native
    
    var showSizeChanger: js.UndefOr[Boolean] = js.native
    
    var showTitle: js.UndefOr[Boolean] = js.native
    
    var showTotal: js.UndefOr[
        js.Function2[/* total */ Double, /* range */ js.Tuple2[Double, Double], ReactElement]
      ] = js.native
    
    var simple: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[typingsSlinky.antd.antdStrings.default | small] = js.native
    
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
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHideOnSinglePage(value: Boolean): Self = StObject.set(x, "hideOnSinglePage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnSinglePageUndefined: Self = StObject.set(x, "hideOnSinglePage", js.undefined)
      
      @scala.inline
      def setItemRender(
        value: (/* page */ Double, /* type */ page | prev | next | `jump-prev` | `jump-next`, /* originalElement */ ReactElement) => ReactElement
      ): Self = StObject.set(x, "itemRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      @scala.inline
      def setLocale(value: js.Object): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* page */ Double, /* pageSize */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
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
      def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSelectPrefixCls(value: String): Self = StObject.set(x, "selectPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectPrefixClsUndefined: Self = StObject.set(x, "selectPrefixCls", js.undefined)
      
      @scala.inline
      def setShowLessItems(value: Boolean): Self = StObject.set(x, "showLessItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLessItemsUndefined: Self = StObject.set(x, "showLessItems", js.undefined)
      
      @scala.inline
      def setShowQuickJumper(value: Boolean | GoButton): Self = StObject.set(x, "showQuickJumper", value.asInstanceOf[js.Any])
      
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
      def setSize(value: typingsSlinky.antd.antdStrings.default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
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
  
  type _To = ReactComponentClass[PaginationProps]
  
  /* This means you don't have to write `default`, but can instead just say `paginationPaginationMod.foo` */
  override def _to: ReactComponentClass[PaginationProps] = default
}
