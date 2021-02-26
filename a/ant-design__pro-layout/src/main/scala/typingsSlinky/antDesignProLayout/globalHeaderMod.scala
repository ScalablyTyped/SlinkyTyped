package typingsSlinky.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antDesignProLayout.anon.DefaultOpenAll
import typingsSlinky.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.mix
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.side
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.top
import typingsSlinky.antDesignProLayout.defaultSettingsMod.ContentWidth
import typingsSlinky.antDesignProLayout.headerMod.HeaderViewProps
import typingsSlinky.antDesignProLayout.siderMenuSiderMenuMod.PrivateSiderMenuProps
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.antd.menuContextMod.MenuTheme
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalHeaderMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/GlobalHeader", JSImport.Default)
  @js.native
  val default: ReactComponentClass[GlobalHeaderProps with PrivateSiderMenuProps] = js.native
  
  /* Inlined parent std.Partial<@ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.PureSettings> */
  @js.native
  trait GlobalHeaderProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var collapsed: js.UndefOr[Boolean] = js.native
    
    var collapsedButtonRender: js.UndefOr[WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactElement]]] = js.native
    
    var colorWeak: js.UndefOr[Boolean] = js.native
    
    var contentWidth: js.UndefOr[ContentWidth] = js.native
    
    var fixSiderbar: js.UndefOr[Boolean] = js.native
    
    var fixedHeader: js.UndefOr[Boolean] = js.native
    
    var headerHeight: js.UndefOr[Double] = js.native
    
    var headerTheme: js.UndefOr[MenuTheme] = js.native
    
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
        WithFalse[
          js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactElement, ReactElement]
        ]
      ] = js.native
    
    var navTheme: js.UndefOr[MenuTheme | realDark] = js.native
    
    var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.native
    
    var onMenuHeaderClick: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var primaryColor: js.UndefOr[String] = js.native
    
    var rightContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ HeaderViewProps, ReactElement]]] = js.native
    
    var splitMenus: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[String | `false`] = js.native
  }
  object GlobalHeaderProps {
    
    @scala.inline
    def apply(): GlobalHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalHeaderProps]
    }
    
    @scala.inline
    implicit class GlobalHeaderPropsMutableBuilder[Self <: GlobalHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedButtonRender(value: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactElement]]): Self = StObject.set(x, "collapsedButtonRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedButtonRenderFunction1(value: /* collapsed */ js.UndefOr[Boolean] => ReactElement): Self = StObject.set(x, "collapsedButtonRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCollapsedButtonRenderUndefined: Self = StObject.set(x, "collapsedButtonRender", js.undefined)
      
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
      def setFixSiderbar(value: Boolean): Self = StObject.set(x, "fixSiderbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixSiderbarUndefined: Self = StObject.set(x, "fixSiderbar", js.undefined)
      
      @scala.inline
      def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
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
      def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
      
      @scala.inline
      def setLayout(value: side | top | mix): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLogo(value: ReactElement): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoReactElement(value: ReactElement): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      @scala.inline
      def setMenu(value: DefaultOpenAll): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuData(value: js.Array[MenuDataItem]): Self = StObject.set(x, "menuData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuDataUndefined: Self = StObject.set(x, "menuData", js.undefined)
      
      @scala.inline
      def setMenuDataVarargs(value: MenuDataItem*): Self = StObject.set(x, "menuData", js.Array(value :_*))
      
      @scala.inline
      def setMenuHeaderRender(
        value: WithFalse[
              js.Function3[
                /* logo */ ReactElement, 
                /* title */ ReactElement, 
                /* props */ js.UndefOr[GlobalHeaderProps], 
                ReactElement
              ]
            ]
      ): Self = StObject.set(x, "menuHeaderRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHeaderRenderFunction3(
        value: (/* logo */ ReactElement, /* title */ ReactElement, /* props */ js.UndefOr[GlobalHeaderProps]) => ReactElement
      ): Self = StObject.set(x, "menuHeaderRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMenuHeaderRenderUndefined: Self = StObject.set(x, "menuHeaderRender", js.undefined)
      
      @scala.inline
      def setMenuRender(
        value: WithFalse[
              js.Function2[/* props */ HeaderViewProps, /* defaultDom */ ReactElement, ReactElement]
            ]
      ): Self = StObject.set(x, "menuRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuRenderFunction2(value: (/* props */ HeaderViewProps, /* defaultDom */ ReactElement) => ReactElement): Self = StObject.set(x, "menuRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMenuRenderUndefined: Self = StObject.set(x, "menuRender", js.undefined)
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setNavTheme(value: MenuTheme | realDark): Self = StObject.set(x, "navTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavThemeUndefined: Self = StObject.set(x, "navTheme", js.undefined)
      
      @scala.inline
      def setOnCollapse(value: /* collapsed */ Boolean => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      @scala.inline
      def setOnMenuHeaderClick(value: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMenuHeaderClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMenuHeaderClickUndefined: Self = StObject.set(x, "onMenuHeaderClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      @scala.inline
      def setRightContentRender(value: WithFalse[js.Function1[/* props */ HeaderViewProps, ReactElement]]): Self = StObject.set(x, "rightContentRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightContentRenderFunction1(value: /* props */ HeaderViewProps => ReactElement): Self = StObject.set(x, "rightContentRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRightContentRenderUndefined: Self = StObject.set(x, "rightContentRender", js.undefined)
      
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
  
  type _To = ReactComponentClass[GlobalHeaderProps with PrivateSiderMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `globalHeaderMod.foo` */
  override def _to: ReactComponentClass[GlobalHeaderProps with PrivateSiderMenuProps] = default
}
