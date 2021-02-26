package typingsSlinky.antDesignPro

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.anon.Key
import typingsSlinky.antDesignPro.anon.Title
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageHeaderMod {
  
  @JSImport("ant-design-pro/lib/PageHeader", JSImport.Default)
  @js.native
  class default ()
    extends Component[PageHeaderProps, js.Any, js.Any]
  
  type PageHeader = ReactComponentClass[PageHeaderProps]
  
  @js.native
  trait PageHeaderProps extends StObject {
    
    var action: js.UndefOr[ReactElement | String] = js.native
    
    var breadcrumbList: js.UndefOr[js.Array[Title]] = js.native
    
    var breadcrumbNameMap: js.UndefOr[js.Any] = js.native
    
    var breadcrumbSeparator: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[ReactElement] = js.native
    
    var extraContent: js.UndefOr[ReactElement] = js.native
    
    var hiddenBreadcrumb: js.UndefOr[Boolean] = js.native
    
    var home: js.UndefOr[ReactElement] = js.native
    
    def itemRender(menuItem: js.Any): ReactElement = js.native
    
    var linkElement: js.UndefOr[ReactElement | String] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var location: js.UndefOr[Location[LocationState]] = js.native
    
    var logo: js.UndefOr[ReactElement | String] = js.native
    
    var onTabChange: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
    
    var params: js.UndefOr[js.Any] = js.native
    
    var routes: js.UndefOr[js.Array[_]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabActiveKey: js.UndefOr[String] = js.native
    
    var tabBarExtraContent: js.UndefOr[ReactElement] = js.native
    
    var tabDefaultActiveKey: js.UndefOr[String] = js.native
    
    var tabList: js.UndefOr[js.Array[Key]] = js.native
    
    var title: js.UndefOr[ReactElement | String | Double] = js.native
    
    var wide: js.UndefOr[Boolean] = js.native
  }
  object PageHeaderProps {
    
    @scala.inline
    def apply(itemRender: js.Any => ReactElement): PageHeaderProps = {
      val __obj = js.Dynamic.literal(itemRender = js.Any.fromFunction1(itemRender))
      __obj.asInstanceOf[PageHeaderProps]
    }
    
    @scala.inline
    implicit class PageHeaderPropsMutableBuilder[Self <: PageHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: ReactElement | String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionReactElement(value: ReactElement): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setBreadcrumbList(value: js.Array[Title]): Self = StObject.set(x, "breadcrumbList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbListUndefined: Self = StObject.set(x, "breadcrumbList", js.undefined)
      
      @scala.inline
      def setBreadcrumbListVarargs(value: Title*): Self = StObject.set(x, "breadcrumbList", js.Array(value :_*))
      
      @scala.inline
      def setBreadcrumbNameMap(value: js.Any): Self = StObject.set(x, "breadcrumbNameMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbNameMapUndefined: Self = StObject.set(x, "breadcrumbNameMap", js.undefined)
      
      @scala.inline
      def setBreadcrumbSeparator(value: ReactElement): Self = StObject.set(x, "breadcrumbSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbSeparatorReactElement(value: ReactElement): Self = StObject.set(x, "breadcrumbSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreadcrumbSeparatorUndefined: Self = StObject.set(x, "breadcrumbSeparator", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setExtraContent(value: ReactElement): Self = StObject.set(x, "extraContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraContentReactElement(value: ReactElement): Self = StObject.set(x, "extraContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraContentUndefined: Self = StObject.set(x, "extraContent", js.undefined)
      
      @scala.inline
      def setHiddenBreadcrumb(value: Boolean): Self = StObject.set(x, "hiddenBreadcrumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenBreadcrumbUndefined: Self = StObject.set(x, "hiddenBreadcrumb", js.undefined)
      
      @scala.inline
      def setHome(value: ReactElement): Self = StObject.set(x, "home", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeReactElement(value: ReactElement): Self = StObject.set(x, "home", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeUndefined: Self = StObject.set(x, "home", js.undefined)
      
      @scala.inline
      def setItemRender(value: js.Any => ReactElement): Self = StObject.set(x, "itemRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLinkElement(value: ReactElement | String): Self = StObject.set(x, "linkElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkElementReactElement(value: ReactElement): Self = StObject.set(x, "linkElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkElementUndefined: Self = StObject.set(x, "linkElement", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setLocation(value: Location[LocationState]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setLogo(value: ReactElement | String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoReactElement(value: ReactElement): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      @scala.inline
      def setOnTabChange(value: /* key */ String => Unit): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setRoutes(value: js.Array[_]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      @scala.inline
      def setRoutesVarargs(value: js.Any*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabActiveKey(value: String): Self = StObject.set(x, "tabActiveKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabActiveKeyUndefined: Self = StObject.set(x, "tabActiveKey", js.undefined)
      
      @scala.inline
      def setTabBarExtraContent(value: ReactElement): Self = StObject.set(x, "tabBarExtraContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarExtraContentReactElement(value: ReactElement): Self = StObject.set(x, "tabBarExtraContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabBarExtraContentUndefined: Self = StObject.set(x, "tabBarExtraContent", js.undefined)
      
      @scala.inline
      def setTabDefaultActiveKey(value: String): Self = StObject.set(x, "tabDefaultActiveKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabDefaultActiveKeyUndefined: Self = StObject.set(x, "tabDefaultActiveKey", js.undefined)
      
      @scala.inline
      def setTabList(value: js.Array[Key]): Self = StObject.set(x, "tabList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabListUndefined: Self = StObject.set(x, "tabList", js.undefined)
      
      @scala.inline
      def setTabListVarargs(value: Key*): Self = StObject.set(x, "tabList", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: ReactElement | String | Double): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWide(value: Boolean): Self = StObject.set(x, "wide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWideUndefined: Self = StObject.set(x, "wide", js.undefined)
    }
  }
}
