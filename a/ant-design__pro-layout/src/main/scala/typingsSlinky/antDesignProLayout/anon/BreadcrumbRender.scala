package typingsSlinky.antDesignProLayout.anon

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignProLayout.getPageTitleMod.GetPageTitleProps
import typingsSlinky.antDesignProLayout.headerMod.HeaderViewProps
import typingsSlinky.antDesignProLayout.localesMod.LocaleType
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.antDesignProLayout.typingsMod.MessageDescriptor
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.antd.breadcrumbBreadcrumbMod.Route
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreadcrumbRender extends StObject {
  
  var breadcrumbRender: js.UndefOr[
    js.Function1[/* routers */ js.UndefOr[js.Array[Route]], js.UndefOr[js.Array[Route]]]
  ] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var contentStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * 兼用 content的 margin
    */
  var disableContentMargin: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否禁用移动端模式，有的管理系统不需要移动端模式，此属性设置为true即可
    */
  var disableMobile: js.UndefOr[Boolean] = js.native
  
  var footerRender: js.UndefOr[
    WithFalse[
      js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactElement, ReactElement]
    ]
  ] = js.native
  
  var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.native
  
  var isChildrenLayout: js.UndefOr[Boolean] = js.native
  
  var itemRender: js.UndefOr[
    js.Function4[
      /* route */ Route, 
      /* params */ js.Any, 
      /* routes */ js.Array[Route], 
      /* paths */ js.Array[String], 
      ReactElement
    ]
  ] = js.native
  
  var loading: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[LocaleType] = js.native
  
  /**
    *@name logo url
    */
  var logo: js.UndefOr[ReactElement | WithFalse[js.Function0[ReactElement]]] = js.native
  
  var menuDataRender: js.UndefOr[js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]] = js.native
  
  var menuItemRender: js.UndefOr[
    WithFalse[
      js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactElement, ReactElement]
    ]
  ] = js.native
  
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.native
  
  /**
    *@name 页面切换的时候触发
    */
  var onPageChange: js.UndefOr[
    js.Function1[
      /* location */ js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: react-router.react-router.RouteComponentProps<{}, react-router.react-router.StaticContext, history.history.LocationState>['location'] */ js.Any) | Pathname
      ], 
      Unit
    ]
  ] = js.native
  
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
  
  var pure: js.UndefOr[Boolean] = js.native
}
object BreadcrumbRender {
  
  @scala.inline
  def apply(): BreadcrumbRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbRender]
  }
  
  @scala.inline
  implicit class BreadcrumbRenderMutableBuilder[Self <: BreadcrumbRender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreadcrumbRender(value: /* routers */ js.UndefOr[js.Array[Route]] => js.UndefOr[js.Array[Route]]): Self = StObject.set(x, "breadcrumbRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBreadcrumbRenderUndefined: Self = StObject.set(x, "breadcrumbRender", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    @scala.inline
    def setDisableContentMargin(value: Boolean): Self = StObject.set(x, "disableContentMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableContentMarginUndefined: Self = StObject.set(x, "disableContentMargin", js.undefined)
    
    @scala.inline
    def setDisableMobile(value: Boolean): Self = StObject.set(x, "disableMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMobileUndefined: Self = StObject.set(x, "disableMobile", js.undefined)
    
    @scala.inline
    def setFooterRender(
      value: WithFalse[
          js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactElement, ReactElement]
        ]
    ): Self = StObject.set(x, "footerRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ ReactElement) => ReactElement): Self = StObject.set(x, "footerRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFooterRenderUndefined: Self = StObject.set(x, "footerRender", js.undefined)
    
    @scala.inline
    def setFormatMessage(value: /* message */ MessageDescriptor => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatMessageUndefined: Self = StObject.set(x, "formatMessage", js.undefined)
    
    @scala.inline
    def setIsChildrenLayout(value: Boolean): Self = StObject.set(x, "isChildrenLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsChildrenLayoutUndefined: Self = StObject.set(x, "isChildrenLayout", js.undefined)
    
    @scala.inline
    def setItemRender(
      value: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactElement
    ): Self = StObject.set(x, "itemRender", js.Any.fromFunction4(value))
    
    @scala.inline
    def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setLocale(value: LocaleType): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setLogo(value: ReactElement | WithFalse[js.Function0[ReactElement]]): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoFunction0(value: () => ReactElement): Self = StObject.set(x, "logo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLogoReactElement(value: ReactElement): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setMenuDataRender(value: /* menuData */ js.Array[MenuDataItem] => js.Array[MenuDataItem]): Self = StObject.set(x, "menuDataRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMenuDataRenderUndefined: Self = StObject.set(x, "menuDataRender", js.undefined)
    
    @scala.inline
    def setMenuItemRender(
      value: WithFalse[
          js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactElement, ReactElement]
        ]
    ): Self = StObject.set(x, "menuItemRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemRenderFunction2(value: (/* item */ MenuDataItemisUrlboolean, /* defaultDom */ ReactElement) => ReactElement): Self = StObject.set(x, "menuItemRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMenuItemRenderUndefined: Self = StObject.set(x, "menuItemRender", js.undefined)
    
    @scala.inline
    def setOnCollapse(value: /* collapsed */ Boolean => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
    
    @scala.inline
    def setOnPageChange(
      value: /* location */ js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: react-router.react-router.RouteComponentProps<{}, react-router.react-router.StaticContext, history.history.LocationState>['location'] */ js.Any) | Pathname
        ] => Unit
    ): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
    
    @scala.inline
    def setPageTitleRender(
      value: WithFalse[
          js.Function3[
            /* props */ GetPageTitleProps, 
            /* defaultPageTitle */ js.UndefOr[String], 
            /* info */ js.UndefOr[Id], 
            String
          ]
        ]
    ): Self = StObject.set(x, "pageTitleRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTitleRenderFunction3(
      value: (/* props */ GetPageTitleProps, /* defaultPageTitle */ js.UndefOr[String], /* info */ js.UndefOr[Id]) => String
    ): Self = StObject.set(x, "pageTitleRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPageTitleRenderUndefined: Self = StObject.set(x, "pageTitleRender", js.undefined)
    
    @scala.inline
    def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
  }
}
