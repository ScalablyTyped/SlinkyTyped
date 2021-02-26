package typingsSlinky.antDesignProLayout.anon

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.mix
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.side
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.top
import typingsSlinky.antDesignProLayout.defaultSettingsMod.ContentWidth
import typingsSlinky.antDesignProLayout.defaultSettingsMod.PureSettings
import typingsSlinky.antDesignProLayout.getBreadcrumbPropsMod.BreadcrumbListReturn
import typingsSlinky.antDesignProLayout.routeContextMod.RouteContextType
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.antd.menuContextMod.MenuTheme
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Dispatch
import typingsSlinky.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ant-design/pro-layout.@ant-design/pro-layout/lib/FooterToolbar.FooterToolbarProps & @ant-design/pro-layout.@ant-design/pro-layout.RouteContextType & {  leftWidth :string | undefined} */
@js.native
trait FooterToolbarPropsRouteCo extends StObject {
  
  var breadcrumb: js.UndefOr[BreadcrumbListReturn] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var collapsed: js.UndefOr[Boolean] = js.native
  
  var colorWeak: js.UndefOr[Boolean] = js.native
  
  var contentWidth: js.UndefOr[ContentWidth] = js.native
  
  var currentMenu: js.UndefOr[PureSettings with MenuDataItem] = js.native
  
  var extra: js.UndefOr[ReactElement] = js.native
  
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
  
  var leftWidth: js.UndefOr[String] = js.native
  
  var matchMenuKeys: js.UndefOr[js.Array[String]] = js.native
  
  var matchMenus: js.UndefOr[js.Array[MenuDataItem]] = js.native
  
  var menu: js.UndefOr[DefaultOpenAll] = js.native
  
  var menuData: js.UndefOr[js.Array[MenuDataItem]] = js.native
  
  var navTheme: js.UndefOr[MenuTheme | realDark] = js.native
  
  var pageTitleInfo: js.UndefOr[Id] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var primaryColor: js.UndefOr[String] = js.native
  
  var renderContent: js.UndefOr[
    js.Function2[
      /* props */ this.type with RouteContextType with LeftWidth, 
      ReactElement, 
      ReactElement
    ]
  ] = js.native
  
  var setHasFooterToolbar: js.UndefOr[Dispatch[SetStateAction[Boolean]]] = js.native
  
  var siderWidth: js.UndefOr[Double] = js.native
  
  var splitMenus: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var title: js.UndefOr[String | `false`] = js.native
}
object FooterToolbarPropsRouteCo {
  
  @scala.inline
  def apply(): FooterToolbarPropsRouteCo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterToolbarPropsRouteCo]
  }
  
  @scala.inline
  implicit class FooterToolbarPropsRouteCoMutableBuilder[Self <: FooterToolbarPropsRouteCo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreadcrumb(value: BreadcrumbListReturn): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreadcrumbUndefined: Self = StObject.set(x, "breadcrumb", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setColorWeak(value: Boolean): Self = StObject.set(x, "colorWeak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorWeakUndefined: Self = StObject.set(x, "colorWeak", js.undefined)
    
    @scala.inline
    def setContentWidth(value: ContentWidth): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
    
    @scala.inline
    def setCurrentMenu(value: PureSettings with MenuDataItem): Self = StObject.set(x, "currentMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentMenuUndefined: Self = StObject.set(x, "currentMenu", js.undefined)
    
    @scala.inline
    def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraReactElement(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    @scala.inline
    def setFixSiderbar(value: Boolean): Self = StObject.set(x, "fixSiderbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixSiderbarUndefined: Self = StObject.set(x, "fixSiderbar", js.undefined)
    
    @scala.inline
    def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
    
    @scala.inline
    def setHasFooter(value: Boolean): Self = StObject.set(x, "hasFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasFooterToolbar(value: Boolean): Self = StObject.set(x, "hasFooterToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasFooterToolbarUndefined: Self = StObject.set(x, "hasFooterToolbar", js.undefined)
    
    @scala.inline
    def setHasFooterUndefined: Self = StObject.set(x, "hasFooter", js.undefined)
    
    @scala.inline
    def setHasHeader(value: Boolean): Self = StObject.set(x, "hasHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasHeaderUndefined: Self = StObject.set(x, "hasHeader", js.undefined)
    
    @scala.inline
    def setHasSiderMenu(value: Boolean): Self = StObject.set(x, "hasSiderMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSiderMenuUndefined: Self = StObject.set(x, "hasSiderMenu", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
    
    @scala.inline
    def setHeaderTheme(value: MenuTheme): Self = StObject.set(x, "headerTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderThemeUndefined: Self = StObject.set(x, "headerTheme", js.undefined)
    
    @scala.inline
    def setIconfontUrl(value: String): Self = StObject.set(x, "iconfontUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconfontUrlUndefined: Self = StObject.set(x, "iconfontUrl", js.undefined)
    
    @scala.inline
    def setIsChildrenLayout(value: Boolean): Self = StObject.set(x, "isChildrenLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChildrenLayoutUndefined: Self = StObject.set(x, "isChildrenLayout", js.undefined)
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
    
    @scala.inline
    def setLayout(value: side | top | mix): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLeftWidth(value: String): Self = StObject.set(x, "leftWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftWidthUndefined: Self = StObject.set(x, "leftWidth", js.undefined)
    
    @scala.inline
    def setMatchMenuKeys(value: js.Array[String]): Self = StObject.set(x, "matchMenuKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchMenuKeysUndefined: Self = StObject.set(x, "matchMenuKeys", js.undefined)
    
    @scala.inline
    def setMatchMenuKeysVarargs(value: String*): Self = StObject.set(x, "matchMenuKeys", js.Array(value :_*))
    
    @scala.inline
    def setMatchMenus(value: js.Array[MenuDataItem]): Self = StObject.set(x, "matchMenus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchMenusUndefined: Self = StObject.set(x, "matchMenus", js.undefined)
    
    @scala.inline
    def setMatchMenusVarargs(value: MenuDataItem*): Self = StObject.set(x, "matchMenus", js.Array(value :_*))
    
    @scala.inline
    def setMenu(value: DefaultOpenAll): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuData(value: js.Array[MenuDataItem]): Self = StObject.set(x, "menuData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuDataUndefined: Self = StObject.set(x, "menuData", js.undefined)
    
    @scala.inline
    def setMenuDataVarargs(value: MenuDataItem*): Self = StObject.set(x, "menuData", js.Array(value :_*))
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    @scala.inline
    def setNavTheme(value: MenuTheme | realDark): Self = StObject.set(x, "navTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavThemeUndefined: Self = StObject.set(x, "navTheme", js.undefined)
    
    @scala.inline
    def setPageTitleInfo(value: Id): Self = StObject.set(x, "pageTitleInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTitleInfoUndefined: Self = StObject.set(x, "pageTitleInfo", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
    
    @scala.inline
    def setRenderContent(
      value: (/* props */ FooterToolbarPropsRouteCo with RouteContextType with LeftWidth, ReactElement) => ReactElement
    ): Self = StObject.set(x, "renderContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderContentUndefined: Self = StObject.set(x, "renderContent", js.undefined)
    
    @scala.inline
    def setSetHasFooterToolbar(value: SetStateAction[Boolean] => Unit): Self = StObject.set(x, "setHasFooterToolbar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHasFooterToolbarUndefined: Self = StObject.set(x, "setHasFooterToolbar", js.undefined)
    
    @scala.inline
    def setSiderWidth(value: Double): Self = StObject.set(x, "siderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiderWidthUndefined: Self = StObject.set(x, "siderWidth", js.undefined)
    
    @scala.inline
    def setSplitMenus(value: Boolean): Self = StObject.set(x, "splitMenus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitMenusUndefined: Self = StObject.set(x, "splitMenus", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: String | `false`): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
