package typingsSlinky.antDesignProLayout.basicLayoutMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignProLayout.anon.DefaultOpenAll
import typingsSlinky.antDesignProLayout.anon.Id
import typingsSlinky.antDesignProLayout.anon.MenuDataItemisUrlboolean
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.sidemenu
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.topmenu
import typingsSlinky.antDesignProLayout.defaultSettingsMod.ContentWidth
import typingsSlinky.antDesignProLayout.getPageTitleMod.GetPageTitleProps
import typingsSlinky.antDesignProLayout.headerMod.HeaderViewProps
import typingsSlinky.antDesignProLayout.localesMod.localeType
import typingsSlinky.antDesignProLayout.siderMenuSiderMenuMod.SiderMenuProps
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.antDesignProLayout.typingsMod.MessageDescriptor
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @ant-design/pro-layout.@ant-design/pro-layout/lib/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.Route> ]:? @ant-design/pro-layout.@ant-design/pro-layout/lib/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.Route>[P]}
- Dropped {[ P in keyof @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings ]:? @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings[P]} */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.antDesignProLayout.headerMod.HeaderViewProps because var conflicts: className, logo, menuHeaderRender, siderWidth, style. Inlined isMobile, collapsed, menuRender, headerRender, rightContentRender, hasSiderMenu, fixSiderbar, layout, fixedHeader, menu, contentWidth, iconfontUrl, primaryColor, colorWeak, navTheme, title, collapsedButtonRender, onCollapse */ @js.native
trait BasicLayoutProps extends SiderMenuProps {
  var breadcrumbRender: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ /* routers */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ js.Any
    ]
  ] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var collapsedButtonRender: js.UndefOr[WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], TagMod[Any]]]] = js.native
  var colorWeak: js.UndefOr[Boolean] = js.native
  var contentStyle: js.UndefOr[CSSProperties] = js.native
  var contentWidth: js.UndefOr[ContentWidth] = js.native
  /**
    * 兼用 content的 margin
    */
  var disableContentMargin: js.UndefOr[Boolean] = js.native
  /**
    * 是否禁用移动端模式，有的管理系统不需要移动端模式，此属性设置为true即可
    */
  var disableMobile: js.UndefOr[Boolean] = js.native
  var fixSiderbar: js.UndefOr[Boolean] = js.native
  var fixedHeader: js.UndefOr[Boolean] = js.native
  var footerRender: js.UndefOr[
    WithFalse[
      js.Function2[/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ]
  ] = js.native
  var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.native
  var hasSiderMenu: js.UndefOr[Boolean] = js.native
  var headerRender: js.UndefOr[
    WithFalse[
      js.Function2[/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ]
  ] = js.native
  var iconfontUrl: js.UndefOr[String] = js.native
  var isChildrenLayout: js.UndefOr[Boolean] = js.native
  var isMobile: js.UndefOr[Boolean] = js.native
  var itemRender: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['itemRender'] */ js.Any
  ] = js.native
  var layout: js.UndefOr[sidemenu | topmenu] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[localeType] = js.native
  /**
    * logo url
    */
  @JSName("logo")
  var logo_BasicLayoutProps: js.UndefOr[TagMod[Any] | WithFalse[js.Function0[TagMod[Any]]]] = js.native
  var menu: js.UndefOr[DefaultOpenAll] = js.native
  var menuDataRender: js.UndefOr[js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]] = js.native
  var menuItemRender: js.UndefOr[
    WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ]
  ] = js.native
  var menuRender: js.UndefOr[
    WithFalse[
      js.Function2[/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any], TagMod[Any]]
    ]
  ] = js.native
  var navTheme: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark
  ] = js.native
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.native
  var pageTitleRender: js.UndefOr[
    WithFalse[
      js.Function3[
        /* props */ GetPageTitleProps, 
        /* defaultPageTitle */ js.UndefOr[String], 
        /* info */ js.UndefOr[Id], 
        String
      ]
    ]
  ] = js.native
  var primaryColor: js.UndefOr[String] = js.native
  var rightContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, TagMod[Any]]]] = js.native
  var title: js.UndefOr[String] = js.native
}

object BasicLayoutProps {
  @scala.inline
  def apply(): BasicLayoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicLayoutProps]
  }
  @scala.inline
  implicit class BasicLayoutPropsOps[Self <: BasicLayoutProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreadcrumbRender(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ /* routers */ js.Any => /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumbRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBreadcrumbRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumbRender")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsedButtonRenderFunction1(value: /* collapsed */ js.UndefOr[Boolean] => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedButtonRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCollapsedButtonRender(value: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], TagMod[Any]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedButtonRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsedButtonRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedButtonRender")(js.undefined)
        ret
    }
    @scala.inline
    def withColorWeak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorWeak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorWeak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorWeak")(js.undefined)
        ret
    }
    @scala.inline
    def withContentStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContentWidth(value: ContentWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableContentMargin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableContentMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableContentMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableContentMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMobile")(js.undefined)
        ret
    }
    @scala.inline
    def withFixSiderbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixSiderbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixSiderbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixSiderbar")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any]) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFooterRender(
      value: WithFalse[
          js.Function2[/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any], TagMod[Any]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRender")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatMessage(value: /* message */ MessageDescriptor => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withHasSiderMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSiderMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasSiderMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSiderMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any]) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHeaderRender(
      value: WithFalse[
          js.Function2[/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any], TagMod[Any]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRender")(js.undefined)
        ret
    }
    @scala.inline
    def withIconfontUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconfontUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconfontUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconfontUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIsChildrenLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChildrenLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsChildrenLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChildrenLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(js.undefined)
        ret
    }
    @scala.inline
    def withItemRender(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['itemRender'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRender")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: sidemenu | topmenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: localeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogoFunction0(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogo(value: TagMod[Any] | WithFalse[js.Function0[TagMod[Any]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(js.undefined)
        ret
    }
    @scala.inline
    def withMenu(value: DefaultOpenAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuDataRender(value: /* menuData */ js.Array[MenuDataItem] => js.Array[MenuDataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuDataRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMenuDataRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuDataRender")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuItemRenderFunction2(value: (/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any]) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMenuItemRender(
      value: WithFalse[
          js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ TagMod[Any], TagMod[Any]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuItemRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemRender")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any]) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMenuRender(
      value: WithFalse[
          js.Function2[/* props */ HeaderViewProps, /* defaultDom */ TagMod[Any], TagMod[Any]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuRender")(js.undefined)
        ret
    }
    @scala.inline
    def withNavTheme(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCollapse(value: /* collapsed */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withPageTitleRenderFunction3(
      value: (/* props */ GetPageTitleProps, /* defaultPageTitle */ js.UndefOr[String], /* info */ js.UndefOr[Id]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTitleRender")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPageTitleRender(
      value: WithFalse[
          js.Function3[
            /* props */ GetPageTitleProps, 
            /* defaultPageTitle */ js.UndefOr[String], 
            /* info */ js.UndefOr[Id], 
            String
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTitleRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageTitleRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTitleRender")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRightContentRenderFunction1(value: BasicLayoutProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContentRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRightContentRender(value: WithFalse[js.Function1[BasicLayoutProps, TagMod[Any]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContentRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightContentRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightContentRender")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

