package typingsSlinky.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.lg
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.md
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.sm
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.xl
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.xs
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.xxl
import typingsSlinky.antDesignProLayout.typingsMod.WithFalse
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siderMenuSiderMenuMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/SiderMenu/SiderMenu", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SiderMenuProps with PrivateSiderMenuProps] = js.native
  
  @JSImport("@ant-design/pro-layout/lib/SiderMenu/SiderMenu", "defaultRenderCollapsedButton")
  @js.native
  def defaultRenderCollapsedButton(): ReactElement = js.native
  @JSImport("@ant-design/pro-layout/lib/SiderMenu/SiderMenu", "defaultRenderCollapsedButton")
  @js.native
  def defaultRenderCollapsedButton(collapsed: Boolean): ReactElement = js.native
  
  @JSImport("@ant-design/pro-layout/lib/SiderMenu/SiderMenu", "defaultRenderLogo")
  @js.native
  def defaultRenderLogo(logo: ReactElement): ReactElement = js.native
  
  @JSImport("@ant-design/pro-layout/lib/SiderMenu/SiderMenu", "defaultRenderLogoAndTitle")
  @js.native
  def defaultRenderLogoAndTitle(props: SiderMenuProps): ReactElement = js.native
  @JSImport("@ant-design/pro-layout/lib/SiderMenu/SiderMenu", "defaultRenderLogoAndTitle")
  @js.native
  def defaultRenderLogoAndTitle(props: SiderMenuProps, renderKey: String): ReactElement = js.native
  
  @js.native
  trait PrivateSiderMenuProps extends StObject {
    
    var matchMenuKeys: js.Array[String] = js.native
  }
  object PrivateSiderMenuProps {
    
    @scala.inline
    def apply(matchMenuKeys: js.Array[String]): PrivateSiderMenuProps = {
      val __obj = js.Dynamic.literal(matchMenuKeys = matchMenuKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrivateSiderMenuProps]
    }
    
    @scala.inline
    implicit class PrivateSiderMenuPropsMutableBuilder[Self <: PrivateSiderMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatchMenuKeys(value: js.Array[String]): Self = StObject.set(x, "matchMenuKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchMenuKeysVarargs(value: String*): Self = StObject.set(x, "matchMenuKeys", js.Array(value :_*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<'className' | 'defaultCollapsed' | 'collapsed' | 'splitMenus' | 'isMobile' | 'menuData' | 'mode' | 'onCollapse' | 'openKeys' | 'handleOpenChange' | 'menuProps' | 'style' | 'theme' | 'formatMessage' | 'subMenuItemRender' | 'menuItemRender' | 'postMenuData' | 'location' | 'match' | 'staticContext' | 'history' | 'computedMatch' | 'route' | 'siderCollapsed' | 'translate' | 'inlist' | 'itemIcon' | 'aria-activedescendant' | 'onMouseEnter' | 'onLoadedData' | 'unselectable' | 'placeholder' | 'aria-multiselectable' | 'overflowedIndicator' | 'slot' | 'onClick' | 'onTouchStart' | 'level' | 'onDrop' | 'aria-grabbed' | 'children' | 'prefixCls' | 'onDragOver' | 'selectable' | 'autoSave' | 'onAnimationIteration' | 'spellCheck' | 'role' | 'forceSubMenuRender' | 'aria-multiline' | 'expandIcon' | 'about' | 'dir' | 'onPlaying' | 'aria-current' | 'itemType' | 'aria-relevant' | 'aria-placeholder' | 'autoCorrect' | 'onPointerMove' | 'aria-label' | 'aria-rowcount' | 'onPaste' | 'aria-busy' | 'resource' | 'onSeeked' | 'tabIndex' | 'onError' | 'onTimeUpdate' | 'aria-roledescription' | 'color' | 'onEnded' | 'onPointerCancel' | 'autoCapitalize' | 'inputMode' | 'onCompositionUpdate' | 'onMouseMove' | 'onSelect' | 'onStalled' | 'onPointerOut' | 'onAuxClick' | 'aria-autocomplete' | 'onCopy' | 'aria-live' | 'aria-keyshortcuts' | 'onDurationChange' | 'aria-orientation' | 'inlineCollapsed' | 'onVolumeChange' | 'lang' | 'aria-owns' | 'defaultMotions' | 'aria-atomic' | 'aria-dropeffect' | 'openTransitionName' | 'property' | 'is' | 'onLoadedMetadata' | 'aria-labelledby' | 'subMenuCloseDelay' | 'defaultOpenKeys' | 'onTransitionEnd' | 'onMouseOver' | 'onChange' | 'datatype' | 'onDragStart' | 'onSeeking' | 'aria-flowto' | 'onAnimationEnd' | 'onCanPlay' | 'aria-readonly' | 'onMouseOut' | 'onKeyDown' | 'aria-pressed' | 'onMouseLeave' | 'contextMenu' | 'onProgress' | 'aria-level' | 'contentEditable' | 'onPointerLeave' | 'onMouseUp' | 'multiple' | 'onInput' | 'itemRef' | 'results' | 'accessKey' | 'aria-haspopup' | 'aria-posinset' | 'onInvalid' | 'aria-required' | 'vocab' | 'aria-describedby' | 'onSuspend' | 'onLoad' | 'onTouchCancel' | 'onAnimationStart' | 'onTouchMove' | 'onPointerEnter' | 'selectedKeys' | 'aria-controls' | 'openAnimation' | 'focusable' | 'aria-modal' | 'onDragEnter' | 'direction' | 'onPointerOver' | 'onWaiting' | 'defaultActiveFirst' | 'onReset' | 'aria-selected' | 'onPlay' | 'onKeyUp' | 'onMouseDown' | 'radioGroup' | 'onSubmit' | 'onBeforeInput' | 'aria-disabled' | 'aria-sort' | 'onCompositionStart' | 'itemProp' | 'security' | 'aria-valuemin' | 'dangerouslySetInnerHTML' | 'aria-colcount' | 'onFocus' | 'onCanPlayThrough' | 'aria-invalid' | 'onBlur' | 'onDoubleClick' | 'aria-valuemax' | 'aria-details' | 'onContextMenu' | 'defaultValue' | 'suppressHydrationWarning' | 'aria-setsize' | 'onDragLeave' | 'getPopupContainer' | 'onTouchEnd' | 'onPause' | 'aria-checked' | 'defaultChecked' | 'builtinPlacements' | 'aria-valuetext' | 'prefix' | 'onEmptied' | 'onDeselect' | 'onPointerUp' | 'onCompositionEnd' | 'aria-colspan' | 'hidden' | 'collapsedWidth' | 'aria-errormessage' | 'onScroll' | 'activeKey' | 'subMenuOpenDelay' | 'onPointerDown' | 'aria-colindex' | 'onCut' | 'inlineIndent' | 'suppressContentEditableWarning' | 'aria-hidden' | 'onAbort' | 'onDragExit' | 'aria-valuenow' | 'id' | 'onWheel' | 'motion' | 'typeof' | 'triggerSubMenuAction' | 'onDrag' | 'aria-expanded' | 'defaultSelectedKeys' | 'draggable' | 'onEncrypted' | 'onDragEnd' | 'onDestroy' | 'aria-rowindex' | 'itemScope' | 'onRateChange' | 'onKeyPress' | 'onLoadStart' | 'itemID' | 'aria-rowspan' | 'title' | 'iconfontUrl' | 'menu' | 'fixSiderbar' | 'layout' | 'headerTheme' | 'navTheme' | 'fixedHeader' | 'colorWeak' | 'contentWidth' | 'primaryColor' | 'headerHeight', ['onCollapse']> ]: @ant-design/pro-layout.@ant-design/pro-layout/lib/SiderMenu/BaseMenu.BaseMenuProps[P]} */ @js.native
  trait SiderMenuProps extends StObject {
    
    var breakpoint: js.UndefOr[xs | sm | md | lg | xl | xxl | `false`] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var collapsedButtonRender: js.UndefOr[WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactElement]]] = js.native
    
    var getContainer: js.UndefOr[`false`] = js.native
    
    var hide: js.UndefOr[Boolean] = js.native
    
    var links: js.UndefOr[js.Array[ReactElement]] = js.native
    
    var logo: js.UndefOr[ReactElement] = js.native
    
    var menuContentRender: js.UndefOr[
        WithFalse[js.Function2[/* props */ this.type, /* defaultDom */ ReactElement, ReactElement]]
      ] = js.native
    
    var menuExtraRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, ReactElement]]] = js.native
    
    var menuFooterRender: js.UndefOr[WithFalse[js.Function1[/* props */ js.UndefOr[this.type], ReactElement]]] = js.native
    
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
    
    var onMenuHeaderClick: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.native
    
    var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ WithFalse[js.Array[String]], Unit]] = js.native
    
    var siderWidth: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object SiderMenuProps {
    
    @scala.inline
    def apply(): SiderMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiderMenuProps]
    }
    
    @scala.inline
    implicit class SiderMenuPropsMutableBuilder[Self <: SiderMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoint(value: xs | sm | md | lg | xl | xxl | `false`): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapsedButtonRender(value: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], ReactElement]]): Self = StObject.set(x, "collapsedButtonRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedButtonRenderFunction1(value: /* collapsed */ js.UndefOr[Boolean] => ReactElement): Self = StObject.set(x, "collapsedButtonRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCollapsedButtonRenderUndefined: Self = StObject.set(x, "collapsedButtonRender", js.undefined)
      
      @scala.inline
      def setGetContainer(value: `false`): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setLinks(value: js.Array[ReactElement]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      @scala.inline
      def setLinksVarargs(value: ReactElement*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      @scala.inline
      def setLogo(value: ReactElement): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoReactElement(value: ReactElement): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      @scala.inline
      def setMenuContentRender(value: WithFalse[js.Function2[SiderMenuProps, /* defaultDom */ ReactElement, ReactElement]]): Self = StObject.set(x, "menuContentRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuContentRenderFunction2(value: (SiderMenuProps, /* defaultDom */ ReactElement) => ReactElement): Self = StObject.set(x, "menuContentRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMenuContentRenderUndefined: Self = StObject.set(x, "menuContentRender", js.undefined)
      
      @scala.inline
      def setMenuExtraRender(value: WithFalse[js.Function1[SiderMenuProps, ReactElement]]): Self = StObject.set(x, "menuExtraRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuExtraRenderFunction1(value: SiderMenuProps => ReactElement): Self = StObject.set(x, "menuExtraRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMenuExtraRenderUndefined: Self = StObject.set(x, "menuExtraRender", js.undefined)
      
      @scala.inline
      def setMenuFooterRender(value: WithFalse[js.Function1[/* props */ js.UndefOr[SiderMenuProps], ReactElement]]): Self = StObject.set(x, "menuFooterRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuFooterRenderFunction1(value: /* props */ js.UndefOr[SiderMenuProps] => ReactElement): Self = StObject.set(x, "menuFooterRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMenuFooterRenderUndefined: Self = StObject.set(x, "menuFooterRender", js.undefined)
      
      @scala.inline
      def setMenuHeaderRender(
        value: WithFalse[
              js.Function3[
                /* logo */ ReactElement, 
                /* title */ ReactElement, 
                /* props */ js.UndefOr[SiderMenuProps], 
                ReactElement
              ]
            ]
      ): Self = StObject.set(x, "menuHeaderRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuHeaderRenderFunction3(
        value: (/* logo */ ReactElement, /* title */ ReactElement, /* props */ js.UndefOr[SiderMenuProps]) => ReactElement
      ): Self = StObject.set(x, "menuHeaderRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMenuHeaderRenderUndefined: Self = StObject.set(x, "menuHeaderRender", js.undefined)
      
      @scala.inline
      def setOnMenuHeaderClick(value: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMenuHeaderClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMenuHeaderClickUndefined: Self = StObject.set(x, "onMenuHeaderClick", js.undefined)
      
      @scala.inline
      def setOnOpenChange(value: /* openKeys */ WithFalse[js.Array[String]] => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      @scala.inline
      def setSiderWidth(value: Double): Self = StObject.set(x, "siderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiderWidthUndefined: Self = StObject.set(x, "siderWidth", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SiderMenuProps with PrivateSiderMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `siderMenuSiderMenuMod.foo` */
  override def _to: ReactComponentClass[SiderMenuProps with PrivateSiderMenuProps] = default
}
