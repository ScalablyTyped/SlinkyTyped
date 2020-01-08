package typingsSlinky.atAntDashDesignProDashLayout.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atAntDashDesignProDashLayout.Anon_DefaultOpenAll
import typingsSlinky.atAntDashDesignProDashLayout.Anon_Id
import typingsSlinky.atAntDashDesignProDashLayout.MenuDataItemisUrlboolean
import typingsSlinky.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutBooleans.`false`
import typingsSlinky.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.realDark
import typingsSlinky.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.sidemenu
import typingsSlinky.atAntDashDesignProDashLayout.atAntDashDesignProDashLayoutStrings.topmenu
import typingsSlinky.atAntDashDesignProDashLayout.libBasicLayoutMod.BasicLayoutProps
import typingsSlinky.atAntDashDesignProDashLayout.libDefaultSettingsMod.ContentWidth
import typingsSlinky.atAntDashDesignProDashLayout.libGetPageTitleMod.GetPageTitleProps
import typingsSlinky.atAntDashDesignProDashLayout.libHeaderMod.HeaderViewProps
import typingsSlinky.atAntDashDesignProDashLayout.libLocalesMod.localeType
import typingsSlinky.atAntDashDesignProDashLayout.libTypingsMod.MenuDataItem
import typingsSlinky.atAntDashDesignProDashLayout.libTypingsMod.MessageDescriptor
import typingsSlinky.atAntDashDesignProDashLayout.libTypingsMod.WithFalse
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_BasicLayoutProps563681245 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  /* The following DOM/SVG props were specified: className */
  def apply(
    breadcrumbRender: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ /* routers */ js.Any => /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ js.Any = null,
    breakpoint: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SiderProps * / any['breakpoint'] */ js.Any) | `false` = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsedButtonRender: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], TagMod[Any]]] = null,
    colorWeak: js.UndefOr[Boolean] = js.undefined,
    contentStyle: CSSProperties = null,
    contentWidth: ContentWidth = null,
    disableContentMargin: js.UndefOr[Boolean] = js.undefined,
    disableMobile: js.UndefOr[Boolean] = js.undefined,
    fixSiderbar: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    footerRender: WithFalse[
      js.Function2[/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ] = null,
    formatMessage: /* message */ MessageDescriptor => String = null,
    hasSiderMenu: js.UndefOr[Boolean] = js.undefined,
    headerRender: WithFalse[
      js.Function2[/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ] = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    iconfontUrl: String = null,
    isChildrenLayout: js.UndefOr[Boolean] = js.undefined,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    itemRender: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['itemRender'] */ js.Any = null,
    layout: sidemenu | topmenu = null,
    links: js.Array[TagMod[Any]] = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    locale: localeType = null,
    logo: TagMod[Any] | WithFalse[js.Function0[TagMod[Any]]] = null,
    menu: Anon_DefaultOpenAll = null,
    menuDataRender: /* menuData */ js.Array[MenuDataItem] => js.Array[MenuDataItem] = null,
    menuHeaderRender: WithFalse[
      js.Function3[
        /* logo */ TagMod[Any], 
        /* title */ TagMod[Any], 
        /* props */ js.UndefOr[BasicLayoutProps], 
        TagMod[Any]
      ]
    ] = null,
    menuItemRender: WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ] = null,
    menuRender: WithFalse[
      js.Function2[/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ] = null,
    navTheme: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark = null,
    onCollapse: /* collapsed */ Boolean => Unit = null,
    onMenuHeaderClick: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onOpenChange: /* openKeys */ WithFalse[js.Array[String]] => Unit = null,
    pageTitleRender: WithFalse[
      js.Function3[
        /* props */ GetPageTitleProps, 
        /* defaultPageTitle */ js.UndefOr[String], 
        /* info */ js.UndefOr[Anon_Id], 
        String
      ]
    ] = null,
    primaryColor: String = null,
    rightContentRender: WithFalse[js.Function1[BasicLayoutProps, TagMod[Any]]] = null,
    siderWidth: Int | Double = null,
    style: CSSProperties = null,
    title: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (breadcrumbRender != null) __obj.updateDynamic("breadcrumbRender")(js.Any.fromFunction1(breadcrumbRender))
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (collapsedButtonRender != null) __obj.updateDynamic("collapsedButtonRender")(collapsedButtonRender.asInstanceOf[js.Any])
    if (!js.isUndefined(colorWeak)) __obj.updateDynamic("colorWeak")(colorWeak.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableContentMargin)) __obj.updateDynamic("disableContentMargin")(disableContentMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMobile)) __obj.updateDynamic("disableMobile")(disableMobile.asInstanceOf[js.Any])
    if (!js.isUndefined(fixSiderbar)) __obj.updateDynamic("fixSiderbar")(fixSiderbar.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.asInstanceOf[js.Any])
    if (footerRender != null) __obj.updateDynamic("footerRender")(footerRender.asInstanceOf[js.Any])
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1(formatMessage))
    if (!js.isUndefined(hasSiderMenu)) __obj.updateDynamic("hasSiderMenu")(hasSiderMenu.asInstanceOf[js.Any])
    if (headerRender != null) __obj.updateDynamic("headerRender")(headerRender.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (iconfontUrl != null) __obj.updateDynamic("iconfontUrl")(iconfontUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(isChildrenLayout)) __obj.updateDynamic("isChildrenLayout")(isChildrenLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.asInstanceOf[js.Any])
    if (itemRender != null) __obj.updateDynamic("itemRender")(itemRender.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (menuDataRender != null) __obj.updateDynamic("menuDataRender")(js.Any.fromFunction1(menuDataRender))
    if (menuHeaderRender != null) __obj.updateDynamic("menuHeaderRender")(menuHeaderRender.asInstanceOf[js.Any])
    if (menuItemRender != null) __obj.updateDynamic("menuItemRender")(menuItemRender.asInstanceOf[js.Any])
    if (menuRender != null) __obj.updateDynamic("menuRender")(menuRender.asInstanceOf[js.Any])
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (onMenuHeaderClick != null) __obj.updateDynamic("onMenuHeaderClick")(js.Any.fromFunction1(onMenuHeaderClick))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (pageTitleRender != null) __obj.updateDynamic("pageTitleRender")(pageTitleRender.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (rightContentRender != null) __obj.updateDynamic("rightContentRender")(rightContentRender.asInstanceOf[js.Any])
    if (siderWidth != null) __obj.updateDynamic("siderWidth")(siderWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = BasicLayoutProps
}

