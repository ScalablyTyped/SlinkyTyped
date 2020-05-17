package typingsSlinky.antDesignProLayout.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.anon.DefaultOpenAll
import typingsSlinky.antDesignProLayout.anon.Id
import typingsSlinky.antDesignProLayout.anon.MenuDataItemisUrlboolean
import typingsSlinky.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.sidemenu
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.topmenu
import typingsSlinky.antDesignProLayout.basicLayoutMod.BasicLayoutProps
import typingsSlinky.antDesignProLayout.defaultSettingsMod.ContentWidth
import typingsSlinky.antDesignProLayout.getPageTitleMod.GetPageTitleProps
import typingsSlinky.antDesignProLayout.headerMod.HeaderViewProps
import typingsSlinky.antDesignProLayout.localesMod.localeType
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.antDesignProLayout.typingsMod.MessageDescriptor
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_BasicLayoutProps_97420028 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def breadcrumbRender(
    value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ /* routers */ js.Any => /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ js.Any
  ): this.type = set("breadcrumbRender", js.Any.fromFunction1(value))
  @scala.inline
  def breakpoint(
    value: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SiderProps * / any['breakpoint'] */ js.Any) | `false`
  ): this.type = set("breakpoint", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
  @scala.inline
  def collapsedButtonRenderFunction1(value: /* collapsed */ js.UndefOr[Boolean] => TagMod[Any]): this.type = set("collapsedButtonRender", js.Any.fromFunction1(value))
  @scala.inline
  def collapsedButtonRender(value: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], TagMod[Any]]]): this.type = set("collapsedButtonRender", value.asInstanceOf[js.Any])
  @scala.inline
  def colorWeak(value: Boolean): this.type = set("colorWeak", value.asInstanceOf[js.Any])
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
  def footerRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any]) => TagMod[Any]): this.type = set("footerRender", js.Any.fromFunction2(value))
  @scala.inline
  def footerRender(
    value: WithFalse[
      js.Function2[/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ]
  ): this.type = set("footerRender", value.asInstanceOf[js.Any])
  @scala.inline
  def formatMessage(value: /* message */ MessageDescriptor => String): this.type = set("formatMessage", js.Any.fromFunction1(value))
  @scala.inline
  def hasSiderMenu(value: Boolean): this.type = set("hasSiderMenu", value.asInstanceOf[js.Any])
  @scala.inline
  def headerRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any]) => TagMod[Any]): this.type = set("headerRender", js.Any.fromFunction2(value))
  @scala.inline
  def headerRender(
    value: WithFalse[
      js.Function2[/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ]
  ): this.type = set("headerRender", value.asInstanceOf[js.Any])
  @scala.inline
  def hide(value: Boolean): this.type = set("hide", value.asInstanceOf[js.Any])
  @scala.inline
  def iconfontUrl(value: String): this.type = set("iconfontUrl", value.asInstanceOf[js.Any])
  @scala.inline
  def isChildrenLayout(value: Boolean): this.type = set("isChildrenLayout", value.asInstanceOf[js.Any])
  @scala.inline
  def isMobile(value: Boolean): this.type = set("isMobile", value.asInstanceOf[js.Any])
  @scala.inline
  def itemRender(
    value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['itemRender'] */ js.Any
  ): this.type = set("itemRender", value.asInstanceOf[js.Any])
  @scala.inline
  def layout(value: sidemenu | topmenu): this.type = set("layout", value.asInstanceOf[js.Any])
  @scala.inline
  def links(value: js.Array[TagMod[Any]]): this.type = set("links", value.asInstanceOf[js.Any])
  @scala.inline
  def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
  @scala.inline
  def locale(value: localeType): this.type = set("locale", value.asInstanceOf[js.Any])
  @scala.inline
  def logoReactElement(value: ReactElement): this.type = set("logo", value.asInstanceOf[js.Any])
  @scala.inline
  def logoFunction0(value: () => TagMod[Any]): this.type = set("logo", js.Any.fromFunction0(value))
  @scala.inline
  def logo(value: TagMod[Any] | WithFalse[js.Function0[TagMod[Any]]]): this.type = set("logo", value.asInstanceOf[js.Any])
  @scala.inline
  def menu(value: DefaultOpenAll): this.type = set("menu", value.asInstanceOf[js.Any])
  @scala.inline
  def menuDataRender(value: /* menuData */ js.Array[MenuDataItem] => js.Array[MenuDataItem]): this.type = set("menuDataRender", js.Any.fromFunction1(value))
  @scala.inline
  def menuHeaderRenderFunction3(
    value: (/* logo */ TagMod[Any], /* title */ TagMod[Any], /* props */ js.UndefOr[BasicLayoutProps]) => TagMod[Any]
  ): this.type = set("menuHeaderRender", js.Any.fromFunction3(value))
  @scala.inline
  def menuHeaderRender(
    value: WithFalse[
      js.Function3[
        /* logo */ TagMod[Any], 
        /* title */ TagMod[Any], 
        /* props */ js.UndefOr[BasicLayoutProps], 
        TagMod[Any]
      ]
    ]
  ): this.type = set("menuHeaderRender", value.asInstanceOf[js.Any])
  @scala.inline
  def menuItemRenderFunction2(value: (/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any]) => TagMod[Any]): this.type = set("menuItemRender", js.Any.fromFunction2(value))
  @scala.inline
  def menuItemRender(
    value: WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ]
  ): this.type = set("menuItemRender", value.asInstanceOf[js.Any])
  @scala.inline
  def menuRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any]) => TagMod[Any]): this.type = set("menuRender", js.Any.fromFunction2(value))
  @scala.inline
  def menuRender(
    value: WithFalse[
      js.Function2[/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ]
  ): this.type = set("menuRender", value.asInstanceOf[js.Any])
  @scala.inline
  def navTheme(
    value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark
  ): this.type = set("navTheme", value.asInstanceOf[js.Any])
  @scala.inline
  def onCollapse(value: /* collapsed */ Boolean => Unit): this.type = set("onCollapse", js.Any.fromFunction1(value))
  @scala.inline
  def onMenuHeaderClick(value: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMenuHeaderClick", js.Any.fromFunction1(value))
  @scala.inline
  def onOpenChange(value: /* openKeys */ WithFalse[js.Array[String]] => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
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
  def primaryColor(value: String): this.type = set("primaryColor", value.asInstanceOf[js.Any])
  @scala.inline
  def rightContentRenderFunction1(value: BasicLayoutProps => TagMod[Any]): this.type = set("rightContentRender", js.Any.fromFunction1(value))
  @scala.inline
  def rightContentRender(value: WithFalse[js.Function1[BasicLayoutProps, TagMod[Any]]]): this.type = set("rightContentRender", value.asInstanceOf[js.Any])
  @scala.inline
  def siderWidth(value: Double): this.type = set("siderWidth", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
}

