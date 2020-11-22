package typingsSlinky.antDesignProLayout.routeContextMod

import typingsSlinky.antDesignProLayout.anon.DefaultOpenAll
import typingsSlinky.antDesignProLayout.anon.Id
import typingsSlinky.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.mix
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.side
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.top
import typingsSlinky.antDesignProLayout.defaultSettingsMod.ContentWidth
import typingsSlinky.antDesignProLayout.defaultSettingsMod.PureSettings
import typingsSlinky.antDesignProLayout.getBreadcrumbPropsMod.BreadcrumbListReturn
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.antd.menuContextMod.MenuTheme
import typingsSlinky.react.mod.Dispatch
import typingsSlinky.react.mod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.PureSettings> */
@js.native
trait RouteContextType extends js.Object {
  
  var breadcrumb: js.UndefOr[BreadcrumbListReturn] = js.native
  
  var collapsed: js.UndefOr[Boolean] = js.native
  
  var colorWeak: js.UndefOr[Boolean] = js.native
  
  var contentWidth: js.UndefOr[ContentWidth] = js.native
  
  var currentMenu: js.UndefOr[PureSettings with MenuDataItem] = js.native
  
  var fixSiderbar: js.UndefOr[Boolean] = js.native
  
  var fixedHeader: js.UndefOr[Boolean] = js.native
  
  var hasFooter: js.UndefOr[Boolean] = js.native
  
  var hasFooterToolbar: js.UndefOr[Boolean] = js.native
  
  var hasHeader: js.UndefOr[Boolean] = js.native
  
  var hasSiderMenu: js.UndefOr[Boolean] = js.native
  
  var headerHeight: js.UndefOr[Double] = js.native
  
  var headerTheme: js.UndefOr[MenuTheme] = js.native
  
  var iconfontUrl: js.UndefOr[String] = js.native
  
  var isChildrenLayout: js.UndefOr[Boolean] = js.native
  
  var isMobile: js.UndefOr[Boolean] = js.native
  
  var layout: js.UndefOr[side | top | mix] = js.native
  
  var matchMenuKeys: js.UndefOr[js.Array[String]] = js.native
  
  var matchMenus: js.UndefOr[js.Array[MenuDataItem]] = js.native
  
  var menu: js.UndefOr[DefaultOpenAll] = js.native
  
  var menuData: js.UndefOr[js.Array[MenuDataItem]] = js.native
  
  var navTheme: js.UndefOr[MenuTheme | realDark] = js.native
  
  var pageTitleInfo: js.UndefOr[Id] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var primaryColor: js.UndefOr[String] = js.native
  
  var setHasFooterToolbar: js.UndefOr[Dispatch[SetStateAction[Boolean]]] = js.native
  
  var siderWidth: js.UndefOr[Double] = js.native
  
  var splitMenus: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String | `false`] = js.native
}
object RouteContextType {
  
  @scala.inline
  def apply(): RouteContextType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteContextType]
  }
  
  @scala.inline
  implicit class RouteContextTypeOps[Self <: RouteContextType] (val x: Self) extends AnyVal {
    
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
    def setBreadcrumb(value: BreadcrumbListReturn): Self = this.set("breadcrumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreadcrumb: Self = this.set("breadcrumb", js.undefined)
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setColorWeak(value: Boolean): Self = this.set("colorWeak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorWeak: Self = this.set("colorWeak", js.undefined)
    
    @scala.inline
    def setContentWidth(value: ContentWidth): Self = this.set("contentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentWidth: Self = this.set("contentWidth", js.undefined)
    
    @scala.inline
    def setCurrentMenu(value: PureSettings with MenuDataItem): Self = this.set("currentMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentMenu: Self = this.set("currentMenu", js.undefined)
    
    @scala.inline
    def setFixSiderbar(value: Boolean): Self = this.set("fixSiderbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixSiderbar: Self = this.set("fixSiderbar", js.undefined)
    
    @scala.inline
    def setFixedHeader(value: Boolean): Self = this.set("fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedHeader: Self = this.set("fixedHeader", js.undefined)
    
    @scala.inline
    def setHasFooter(value: Boolean): Self = this.set("hasFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasFooter: Self = this.set("hasFooter", js.undefined)
    
    @scala.inline
    def setHasFooterToolbar(value: Boolean): Self = this.set("hasFooterToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasFooterToolbar: Self = this.set("hasFooterToolbar", js.undefined)
    
    @scala.inline
    def setHasHeader(value: Boolean): Self = this.set("hasHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasHeader: Self = this.set("hasHeader", js.undefined)
    
    @scala.inline
    def setHasSiderMenu(value: Boolean): Self = this.set("hasSiderMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasSiderMenu: Self = this.set("hasSiderMenu", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    
    @scala.inline
    def setHeaderTheme(value: MenuTheme): Self = this.set("headerTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTheme: Self = this.set("headerTheme", js.undefined)
    
    @scala.inline
    def setIconfontUrl(value: String): Self = this.set("iconfontUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconfontUrl: Self = this.set("iconfontUrl", js.undefined)
    
    @scala.inline
    def setIsChildrenLayout(value: Boolean): Self = this.set("isChildrenLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsChildrenLayout: Self = this.set("isChildrenLayout", js.undefined)
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = this.set("isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMobile: Self = this.set("isMobile", js.undefined)
    
    @scala.inline
    def setLayout(value: side | top | mix): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setMatchMenuKeysVarargs(value: String*): Self = this.set("matchMenuKeys", js.Array(value :_*))
    
    @scala.inline
    def setMatchMenuKeys(value: js.Array[String]): Self = this.set("matchMenuKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchMenuKeys: Self = this.set("matchMenuKeys", js.undefined)
    
    @scala.inline
    def setMatchMenusVarargs(value: MenuDataItem*): Self = this.set("matchMenus", js.Array(value :_*))
    
    @scala.inline
    def setMatchMenus(value: js.Array[MenuDataItem]): Self = this.set("matchMenus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchMenus: Self = this.set("matchMenus", js.undefined)
    
    @scala.inline
    def setMenu(value: DefaultOpenAll): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    
    @scala.inline
    def setMenuDataVarargs(value: MenuDataItem*): Self = this.set("menuData", js.Array(value :_*))
    
    @scala.inline
    def setMenuData(value: js.Array[MenuDataItem]): Self = this.set("menuData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuData: Self = this.set("menuData", js.undefined)
    
    @scala.inline
    def setNavTheme(value: MenuTheme | realDark): Self = this.set("navTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavTheme: Self = this.set("navTheme", js.undefined)
    
    @scala.inline
    def setPageTitleInfo(value: Id): Self = this.set("pageTitleInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageTitleInfo: Self = this.set("pageTitleInfo", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setPrimaryColor(value: String): Self = this.set("primaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryColor: Self = this.set("primaryColor", js.undefined)
    
    @scala.inline
    def setSetHasFooterToolbar(value: SetStateAction[Boolean] => Unit): Self = this.set("setHasFooterToolbar", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHasFooterToolbar: Self = this.set("setHasFooterToolbar", js.undefined)
    
    @scala.inline
    def setSiderWidth(value: Double): Self = this.set("siderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiderWidth: Self = this.set("siderWidth", js.undefined)
    
    @scala.inline
    def setSplitMenus(value: Boolean): Self = this.set("splitMenus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitMenus: Self = this.set("splitMenus", js.undefined)
    
    @scala.inline
    def setTitle(value: String | `false`): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
