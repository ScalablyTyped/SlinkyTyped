package typingsSlinky.antDesignPro.pageHeaderMod

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.anon.Key
import typingsSlinky.antDesignPro.anon.Title
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageHeaderProps extends js.Object {
  
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
  implicit class PageHeaderPropsOps[Self <: PageHeaderProps] (val x: Self) extends AnyVal {
    
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
    def setItemRender(value: js.Any => ReactElement): Self = this.set("itemRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActionReactElement(value: ReactElement): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(value: ReactElement | String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setBreadcrumbListVarargs(value: Title*): Self = this.set("breadcrumbList", js.Array(value :_*))
    
    @scala.inline
    def setBreadcrumbList(value: js.Array[Title]): Self = this.set("breadcrumbList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreadcrumbList: Self = this.set("breadcrumbList", js.undefined)
    
    @scala.inline
    def setBreadcrumbNameMap(value: js.Any): Self = this.set("breadcrumbNameMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreadcrumbNameMap: Self = this.set("breadcrumbNameMap", js.undefined)
    
    @scala.inline
    def setBreadcrumbSeparatorReactElement(value: ReactElement): Self = this.set("breadcrumbSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreadcrumbSeparator(value: ReactElement): Self = this.set("breadcrumbSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreadcrumbSeparator: Self = this.set("breadcrumbSeparator", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setExtraContentReactElement(value: ReactElement): Self = this.set("extraContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraContent(value: ReactElement): Self = this.set("extraContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraContent: Self = this.set("extraContent", js.undefined)
    
    @scala.inline
    def setHiddenBreadcrumb(value: Boolean): Self = this.set("hiddenBreadcrumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenBreadcrumb: Self = this.set("hiddenBreadcrumb", js.undefined)
    
    @scala.inline
    def setHomeReactElement(value: ReactElement): Self = this.set("home", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHome(value: ReactElement): Self = this.set("home", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHome: Self = this.set("home", js.undefined)
    
    @scala.inline
    def setLinkElementReactElement(value: ReactElement): Self = this.set("linkElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkElement(value: ReactElement | String): Self = this.set("linkElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkElement: Self = this.set("linkElement", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setLocation(value: Location[LocationState]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLogoReactElement(value: ReactElement): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo(value: ReactElement | String): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    
    @scala.inline
    def setOnTabChange(value: /* key */ String => Unit): Self = this.set("onTabChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTabChange: Self = this.set("onTabChange", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: js.Any*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[_]): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabActiveKey(value: String): Self = this.set("tabActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabActiveKey: Self = this.set("tabActiveKey", js.undefined)
    
    @scala.inline
    def setTabBarExtraContentReactElement(value: ReactElement): Self = this.set("tabBarExtraContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBarExtraContent(value: ReactElement): Self = this.set("tabBarExtraContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarExtraContent: Self = this.set("tabBarExtraContent", js.undefined)
    
    @scala.inline
    def setTabDefaultActiveKey(value: String): Self = this.set("tabDefaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabDefaultActiveKey: Self = this.set("tabDefaultActiveKey", js.undefined)
    
    @scala.inline
    def setTabListVarargs(value: Key*): Self = this.set("tabList", js.Array(value :_*))
    
    @scala.inline
    def setTabList(value: js.Array[Key]): Self = this.set("tabList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabList: Self = this.set("tabList", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ReactElement | String | Double): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWide(value: Boolean): Self = this.set("wide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWide: Self = this.set("wide", js.undefined)
  }
}
