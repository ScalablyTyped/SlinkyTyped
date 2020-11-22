package typingsSlinky.antDesignProLayout.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.anon.DefaultOpenAll
import typingsSlinky.antDesignProLayout.anon.Id
import typingsSlinky.antDesignProLayout.anon.MenuDataItemisUrlboolean
import typingsSlinky.antDesignProLayout.anon.Pathname
import typingsSlinky.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.lg
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.md
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.mix
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.side
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.sm
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.top
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.xl
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.xs
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.xxl
import typingsSlinky.antDesignProLayout.defaultSettingsMod.ContentWidth
import typingsSlinky.antDesignProLayout.getPageTitleMod.GetPageTitleProps
import typingsSlinky.antDesignProLayout.headerMod.HeaderViewProps
import typingsSlinky.antDesignProLayout.localesMod.LocaleType
import typingsSlinky.antDesignProLayout.siderMenuSiderMenuMod.SiderMenuProps
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.antDesignProLayout.typingsMod.MessageDescriptor
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.antd.breadcrumbBreadcrumbMod.Route
import typingsSlinky.antd.menuContextMod.MenuTheme
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactRouter.mod.StaticContext
import typingsSlinky.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_BasicLayoutProps_97420028 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def breadcrumbRender(value: /* routers */ js.UndefOr[js.Array[Route]] => js.UndefOr[js.Array[Route]]): this.type = set("breadcrumbRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def breakpoint(value: xs | sm | md | lg | xl | xxl | `false`): this.type = set("breakpoint", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
  
  @scala.inline
  def collapsedButtonRenderFunction1(value: /* collapsed */ js.UndefOr[Boolean] => ReactElement): this.type = set("collapsedButtonRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def collapsedButtonRender(value: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactElement]]): this.type = set("collapsedButtonRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def colorWeak(value: Boolean): this.type = set("colorWeak", value.asInstanceOf[js.Any])
  
  @scala.inline
  def computedMatch(value: `match`[typingsSlinky.antDesignProLayout.typingsMod.Route]): this.type = set("computedMatch", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contentStyle(value: CSSProperties): this.type = set("contentStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contentWidth(value: ContentWidth): this.type = set("contentWidth", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disableContentMargin(value: Boolean): this.type = set("disableContentMargin", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disableMobile(value: Boolean): this.type = set("disableMobile", value.asInstanceOf[js.Any])
  
  @scala.inline
  def fixSiderbar(value: Boolean): this.type = set("fixSiderbar", value.asInstanceOf[js.Any])
  
  @scala.inline
  def fixedHeader(value: Boolean): this.type = set("fixedHeader", value.asInstanceOf[js.Any])
  
  @scala.inline
  def footerRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ ReactElement) => ReactElement): this.type = set("footerRender", js.Any.fromFunction2(value))
  
  @scala.inline
  def footerRender(
    value: WithFalse[
      js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactElement, ReactElement]
    ]
  ): this.type = set("footerRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def formatMessage(value: /* message */ MessageDescriptor => String): this.type = set("formatMessage", js.Any.fromFunction1(value))
  
  @scala.inline
  def getContainer(value: `false`): this.type = set("getContainer", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hasSiderMenu(value: Boolean): this.type = set("hasSiderMenu", value.asInstanceOf[js.Any])
  
  @scala.inline
  def headerContentRenderFunction1(value: HeaderViewProps => ReactElement): this.type = set("headerContentRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def headerContentRender(value: WithFalse[js.Function1[HeaderViewProps, ReactElement]]): this.type = set("headerContentRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def headerHeight(value: Double): this.type = set("headerHeight", value.asInstanceOf[js.Any])
  
  @scala.inline
  def headerRenderFunction2(value: (HeaderViewProps, /* defaultDom */ ReactElement) => ReactElement): this.type = set("headerRender", js.Any.fromFunction2(value))
  
  @scala.inline
  def headerRender(value: WithFalse[js.Function2[HeaderViewProps, /* defaultDom */ ReactElement, ReactElement]]): this.type = set("headerRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def headerTheme(value: MenuTheme): this.type = set("headerTheme", value.asInstanceOf[js.Any])
  
  @scala.inline
  def headerTitleRenderFunction2(value: (HeaderViewProps, /* defaultDom */ ReactElement) => ReactElement): this.type = set("headerTitleRender", js.Any.fromFunction2(value))
  
  @scala.inline
  def headerTitleRender(value: WithFalse[js.Function2[HeaderViewProps, /* defaultDom */ ReactElement, ReactElement]]): this.type = set("headerTitleRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hide(value: Boolean): this.type = set("hide", value.asInstanceOf[js.Any])
  
  @scala.inline
  def history(value: History[LocationState]): this.type = set("history", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconfontUrl(value: String): this.type = set("iconfontUrl", value.asInstanceOf[js.Any])
  
  @scala.inline
  def isChildrenLayout(value: Boolean): this.type = set("isChildrenLayout", value.asInstanceOf[js.Any])
  
  @scala.inline
  def isMobile(value: Boolean): this.type = set("isMobile", value.asInstanceOf[js.Any])
  
  @scala.inline
  def itemRender(
    value: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactElement
  ): this.type = set("itemRender", js.Any.fromFunction4(value))
  
  @scala.inline
  def layout(value: side | top | mix): this.type = set("layout", value.asInstanceOf[js.Any])
  
  @scala.inline
  def linksVarargs(value: ReactElement*): this.type = set("links", js.Array(value :_*))
  
  @scala.inline
  def links(value: js.Array[ReactElement]): this.type = set("links", value.asInstanceOf[js.Any])
  
  @scala.inline
  def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
  
  @scala.inline
  def locale(value: LocaleType): this.type = set("locale", value.asInstanceOf[js.Any])
  
  @scala.inline
  def location(value: Location[LocationState] | Pathname): this.type = set("location", value.asInstanceOf[js.Any])
  
  @scala.inline
  def logoReactElement(value: ReactElement): this.type = set("logo", value.asInstanceOf[js.Any])
  
  @scala.inline
  def logo(value: ReactElement): this.type = set("logo", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `match`(value: typingsSlinky.reactRouter.mod.`match`[js.Object]): this.type = set("match", value.asInstanceOf[js.Any])
  
  @scala.inline
  def menu(value: DefaultOpenAll): this.type = set("menu", value.asInstanceOf[js.Any])
  
  @scala.inline
  def menuContentRenderFunction2(value: (SiderMenuProps, /* defaultDom */ ReactElement) => ReactElement): this.type = set("menuContentRender", js.Any.fromFunction2(value))
  
  @scala.inline
  def menuContentRender(value: WithFalse[js.Function2[SiderMenuProps, /* defaultDom */ ReactElement, ReactElement]]): this.type = set("menuContentRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def menuDataVarargs(value: MenuDataItem*): this.type = set("menuData", js.Array(value :_*))
  
  @scala.inline
  def menuData(value: js.Array[MenuDataItem]): this.type = set("menuData", value.asInstanceOf[js.Any])
  
  @scala.inline
  def menuDataRender(value: /* menuData */ js.Array[MenuDataItem] => js.Array[MenuDataItem]): this.type = set("menuDataRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def menuExtraRenderFunction1(value: SiderMenuProps => ReactElement): this.type = set("menuExtraRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def menuExtraRender(value: WithFalse[js.Function1[SiderMenuProps, ReactElement]]): this.type = set("menuExtraRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def menuFooterRenderFunction1(value: /* props */ js.UndefOr[SiderMenuProps] => ReactElement): this.type = set("menuFooterRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def menuFooterRender(value: WithFalse[js.Function1[/* props */ js.UndefOr[SiderMenuProps], ReactElement]]): this.type = set("menuFooterRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def menuHeaderRenderFunction3(
    value: (/* logo */ ReactElement, /* title */ ReactElement, /* props */ js.UndefOr[SiderMenuProps]) => ReactElement
  ): this.type = set("menuHeaderRender", js.Any.fromFunction3(value))
  
  @scala.inline
  def menuHeaderRender(
    value: WithFalse[
      js.Function3[
        /* logo */ ReactElement, 
        /* title */ ReactElement, 
        /* props */ js.UndefOr[SiderMenuProps], 
        ReactElement
      ]
    ]
  ): this.type = set("menuHeaderRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def menuItemRenderFunction2(value: (/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactElement) => ReactElement): this.type = set("menuItemRender", js.Any.fromFunction2(value))
  
  @scala.inline
  def menuItemRender(
    value: WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactElement, ReactElement]
    ]
  ): this.type = set("menuItemRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def menuRenderFunction2(value: (HeaderViewProps, /* defaultDom */ ReactElement) => ReactElement): this.type = set("menuRender", js.Any.fromFunction2(value))
  
  @scala.inline
  def menuRender(value: WithFalse[js.Function2[HeaderViewProps, /* defaultDom */ ReactElement, ReactElement]]): this.type = set("menuRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def navTheme(value: MenuTheme | realDark): this.type = set("navTheme", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onCollapse(value: /* collapsed */ Boolean => Unit): this.type = set("onCollapse", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMenuHeaderClick(value: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMenuHeaderClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onOpenChange(value: /* openKeys */ WithFalse[js.Array[String]] => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPageChange(
    value: /* location */ js.UndefOr[
      (/* import warning: importer.ImportType#apply Failed type conversion: react-router.react-router.RouteComponentProps<{}, react-router.react-router.StaticContext, history.history.LocationState>['location'] */ js.Any) | Pathname
    ] => Unit
  ): this.type = set("onPageChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def pageTitleRenderFunction3(
    value: (/* props */ GetPageTitleProps, /* defaultPageTitle */ js.UndefOr[String], /* info */ js.UndefOr[Id]) => String
  ): this.type = set("pageTitleRender", js.Any.fromFunction3(value))
  
  @scala.inline
  def pageTitleRender(
    value: WithFalse[
      js.Function3[
        /* props */ GetPageTitleProps, 
        /* defaultPageTitle */ js.UndefOr[String], 
        /* info */ js.UndefOr[Id], 
        String
      ]
    ]
  ): this.type = set("pageTitleRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def primaryColor(value: String): this.type = set("primaryColor", value.asInstanceOf[js.Any])
  
  @scala.inline
  def pure(value: Boolean): this.type = set("pure", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rightContentRenderFunction1(value: HeaderViewProps => ReactElement): this.type = set("rightContentRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def rightContentRender(value: WithFalse[js.Function1[HeaderViewProps, ReactElement]]): this.type = set("rightContentRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def route(value: typingsSlinky.antDesignProLayout.typingsMod.Route): this.type = set("route", value.asInstanceOf[js.Any])
  
  @scala.inline
  def siderWidth(value: Double): this.type = set("siderWidth", value.asInstanceOf[js.Any])
  
  @scala.inline
  def splitMenus(value: Boolean): this.type = set("splitMenus", value.asInstanceOf[js.Any])
  
  @scala.inline
  def staticContext(value: StaticContext): this.type = set("staticContext", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def title(value: String | `false`): this.type = set("title", value.asInstanceOf[js.Any])
}
