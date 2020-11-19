package typingsSlinky.antDesignProLayout.headerMod

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignProLayout.anon.DefaultOpenAll
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.mix
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.side
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.top
import typingsSlinky.antDesignProLayout.defaultSettingsMod.ContentWidth
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.antd.menuContextMod.MenuTheme
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.PureSettings> & @ant-design/pro-layout.@ant-design/pro-layout/lib/GlobalHeader.GlobalHeaderProps & {  isMobile :boolean | undefined,   collapsed :boolean | undefined,   logo :react.react.ReactNode | undefined,   headerRender :@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.WithFalse<(props : @ant-design/pro-layout.@ant-design/pro-layout/lib/Header.HeaderViewProps, defaultDom : react.react.ReactNode): react.react.ReactNode> | undefined,   headerTitleRender :@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.WithFalse<(props : @ant-design/pro-layout.@ant-design/pro-layout/lib/Header.HeaderViewProps, defaultDom : react.react.ReactNode): react.react.ReactNode> | undefined,   headerContentRender :@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.WithFalse<(props : @ant-design/pro-layout.@ant-design/pro-layout/lib/Header.HeaderViewProps): react.react.ReactNode> | undefined,   siderWidth :number | undefined,   hasSiderMenu :boolean | undefined} */
@js.native
trait HeaderViewProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var collapsed: js.UndefOr[Boolean] = js.native
  
  var collapsedButtonRender: js.UndefOr[WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactElement]]] = js.native
  
  var colorWeak: js.UndefOr[Boolean] = js.native
  
  var contentWidth: js.UndefOr[ContentWidth] = js.native
  
  var fixSiderbar: js.UndefOr[Boolean] = js.native
  
  var fixedHeader: js.UndefOr[Boolean] = js.native
  
  var hasSiderMenu: js.UndefOr[Boolean] = js.native
  
  var headerContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, ReactElement]]] = js.native
  
  var headerHeight: js.UndefOr[Double] = js.native
  
  var headerRender: js.UndefOr[
    WithFalse[js.Function2[/* props */ this.type, /* defaultDom */ ReactElement, ReactElement]]
  ] = js.native
  
  var headerTitleRender: js.UndefOr[
    WithFalse[js.Function2[/* props */ this.type, /* defaultDom */ ReactElement, ReactElement]]
  ] = js.native
  
  var iconfontUrl: js.UndefOr[String] = js.native
  
  var isMobile: js.UndefOr[Boolean] = js.native
  
  var layout: js.UndefOr[side | top | mix] = js.native
  
  var logo: js.UndefOr[ReactElement] = js.native
  
  var menu: js.UndefOr[DefaultOpenAll] = js.native
  
  var menuData: js.UndefOr[js.Array[MenuDataItem]] = js.native
  
  var menuHeaderRender: js.UndefOr[
    WithFalse[
      js.Function3[
        /* logo */ ReactElement, 
        /* title */ ReactElement, 
        /* props */ js.UndefOr[this.type], 
        ReactElement
      ]
    ]
  ] = js.native
  
  var menuRender: js.UndefOr[
    WithFalse[js.Function2[/* props */ this.type, /* defaultDom */ ReactElement, ReactElement]]
  ] = js.native
  
  var navTheme: js.UndefOr[MenuTheme | realDark] = js.native
  
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var primaryColor: js.UndefOr[String] = js.native
  
  var rightContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, ReactElement]]] = js.native
  
  var siderWidth: js.UndefOr[Double] = js.native
  
  var splitMenus: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object HeaderViewProps {
  
  @scala.inline
  def apply(): HeaderViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderViewProps]
  }
  
  @scala.inline
  implicit class HeaderViewPropsOps[Self <: HeaderViewProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setCollapsedButtonRenderFunction1(value: /* collapsed */ js.UndefOr[Boolean] => ReactElement): Self = this.set("collapsedButtonRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollapsedButtonRender(value: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactElement]]): Self = this.set("collapsedButtonRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsedButtonRender: Self = this.set("collapsedButtonRender", js.undefined)
    
    @scala.inline
    def setColorWeak(value: Boolean): Self = this.set("colorWeak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorWeak: Self = this.set("colorWeak", js.undefined)
    
    @scala.inline
    def setContentWidth(value: ContentWidth): Self = this.set("contentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentWidth: Self = this.set("contentWidth", js.undefined)
    
    @scala.inline
    def setFixSiderbar(value: Boolean): Self = this.set("fixSiderbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixSiderbar: Self = this.set("fixSiderbar", js.undefined)
    
    @scala.inline
    def setFixedHeader(value: Boolean): Self = this.set("fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedHeader: Self = this.set("fixedHeader", js.undefined)
    
    @scala.inline
    def setHasSiderMenu(value: Boolean): Self = this.set("hasSiderMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasSiderMenu: Self = this.set("hasSiderMenu", js.undefined)
    
    @scala.inline
    def setHeaderContentRenderFunction1(value: HeaderViewProps => ReactElement): Self = this.set("headerContentRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeaderContentRender(value: WithFalse[js.Function1[HeaderViewProps, ReactElement]]): Self = this.set("headerContentRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderContentRender: Self = this.set("headerContentRender", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    
    @scala.inline
    def setHeaderRenderFunction2(value: (HeaderViewProps, /* defaultDom */ ReactElement) => ReactElement): Self = this.set("headerRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHeaderRender(value: WithFalse[js.Function2[HeaderViewProps, /* defaultDom */ ReactElement, ReactElement]]): Self = this.set("headerRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderRender: Self = this.set("headerRender", js.undefined)
    
    @scala.inline
    def setHeaderTitleRenderFunction2(value: (HeaderViewProps, /* defaultDom */ ReactElement) => ReactElement): Self = this.set("headerTitleRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHeaderTitleRender(value: WithFalse[js.Function2[HeaderViewProps, /* defaultDom */ ReactElement, ReactElement]]): Self = this.set("headerTitleRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTitleRender: Self = this.set("headerTitleRender", js.undefined)
    
    @scala.inline
    def setIconfontUrl(value: String): Self = this.set("iconfontUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconfontUrl: Self = this.set("iconfontUrl", js.undefined)
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = this.set("isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMobile: Self = this.set("isMobile", js.undefined)
    
    @scala.inline
    def setLayout(value: side | top | mix): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLogoReactElement(value: ReactElement): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo(value: ReactElement): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    
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
    def setMenuHeaderRenderFunction3(
      value: (/* logo */ ReactElement, /* title */ ReactElement, /* props */ js.UndefOr[HeaderViewProps]) => ReactElement
    ): Self = this.set("menuHeaderRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMenuHeaderRender(
      value: WithFalse[
          js.Function3[
            /* logo */ ReactElement, 
            /* title */ ReactElement, 
            /* props */ js.UndefOr[HeaderViewProps], 
            ReactElement
          ]
        ]
    ): Self = this.set("menuHeaderRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuHeaderRender: Self = this.set("menuHeaderRender", js.undefined)
    
    @scala.inline
    def setMenuRenderFunction2(value: (HeaderViewProps, /* defaultDom */ ReactElement) => ReactElement): Self = this.set("menuRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMenuRender(value: WithFalse[js.Function2[HeaderViewProps, /* defaultDom */ ReactElement, ReactElement]]): Self = this.set("menuRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuRender: Self = this.set("menuRender", js.undefined)
    
    @scala.inline
    def setNavTheme(value: MenuTheme | realDark): Self = this.set("navTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavTheme: Self = this.set("navTheme", js.undefined)
    
    @scala.inline
    def setOnCollapse(value: /* collapsed */ Boolean => Unit): Self = this.set("onCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCollapse: Self = this.set("onCollapse", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setPrimaryColor(value: String): Self = this.set("primaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryColor: Self = this.set("primaryColor", js.undefined)
    
    @scala.inline
    def setRightContentRenderFunction1(value: HeaderViewProps => ReactElement): Self = this.set("rightContentRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRightContentRender(value: WithFalse[js.Function1[HeaderViewProps, ReactElement]]): Self = this.set("rightContentRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightContentRender: Self = this.set("rightContentRender", js.undefined)
    
    @scala.inline
    def setSiderWidth(value: Double): Self = this.set("siderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiderWidth: Self = this.set("siderWidth", js.undefined)
    
    @scala.inline
    def setSplitMenus(value: Boolean): Self = this.set("splitMenus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitMenus: Self = this.set("splitMenus", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
