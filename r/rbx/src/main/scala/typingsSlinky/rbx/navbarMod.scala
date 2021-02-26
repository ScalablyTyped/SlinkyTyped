package typingsSlinky.rbx

import slinky.core.facade.ReactElement
import typingsSlinky.rbx.anon.AsElementType
import typingsSlinky.rbx.anon.NoneTAsComponentextendsElContainer
import typingsSlinky.rbx.anon.PickNavbarContainerPropsf
import typingsSlinky.rbx.anon.PreferHelpersPropsOverridBackgroundColor
import typingsSlinky.rbx.anon.TypeofNavbarContainer
import typingsSlinky.rbx.anon.`6`
import typingsSlinky.rbx.exoticMod.ForwardRefAsExoticComponent
import typingsSlinky.rbx.exoticMod.FromReactType
import typingsSlinky.rbx.navbarBurgerMod.NavbarBurgerProps
import typingsSlinky.rbx.navbarContainerMod.NavbarContainer
import typingsSlinky.rbx.navbarContainerMod.NavbarContainerProps
import typingsSlinky.rbx.navbarContextMod.NavbarContextValue
import typingsSlinky.rbx.navbarDropdownMod.NavbarDropdownProps
import typingsSlinky.rbx.navbarLinkMod.NavbarLinkProps
import typingsSlinky.rbx.navbarSegmentMod.NavbarSegmentProps
import typingsSlinky.rbx.rbxStrings.active
import typingsSlinky.rbx.rbxStrings.as
import typingsSlinky.rbx.rbxStrings.backgroundColor
import typingsSlinky.rbx.rbxStrings.badge
import typingsSlinky.rbx.rbxStrings.badgeColor
import typingsSlinky.rbx.rbxStrings.badgeOutlined
import typingsSlinky.rbx.rbxStrings.badgeRounded
import typingsSlinky.rbx.rbxStrings.badgeSize
import typingsSlinky.rbx.rbxStrings.className
import typingsSlinky.rbx.rbxStrings.clearfix
import typingsSlinky.rbx.rbxStrings.clipped
import typingsSlinky.rbx.rbxStrings.color
import typingsSlinky.rbx.rbxStrings.document
import typingsSlinky.rbx.rbxStrings.fixed
import typingsSlinky.rbx.rbxStrings.hidden
import typingsSlinky.rbx.rbxStrings.invisible
import typingsSlinky.rbx.rbxStrings.italic
import typingsSlinky.rbx.rbxStrings.managed
import typingsSlinky.rbx.rbxStrings.marginless
import typingsSlinky.rbx.rbxStrings.overlay
import typingsSlinky.rbx.rbxStrings.paddingless
import typingsSlinky.rbx.rbxStrings.pull
import typingsSlinky.rbx.rbxStrings.radiusless
import typingsSlinky.rbx.rbxStrings.relative
import typingsSlinky.rbx.rbxStrings.responsive
import typingsSlinky.rbx.rbxStrings.shadowless
import typingsSlinky.rbx.rbxStrings.srOnly
import typingsSlinky.rbx.rbxStrings.textAlign
import typingsSlinky.rbx.rbxStrings.textColor
import typingsSlinky.rbx.rbxStrings.textSize
import typingsSlinky.rbx.rbxStrings.textTransform
import typingsSlinky.rbx.rbxStrings.textWeight
import typingsSlinky.rbx.rbxStrings.tooltip
import typingsSlinky.rbx.rbxStrings.tooltipActive
import typingsSlinky.rbx.rbxStrings.tooltipColor
import typingsSlinky.rbx.rbxStrings.tooltipMultiline
import typingsSlinky.rbx.rbxStrings.tooltipPosition
import typingsSlinky.rbx.rbxStrings.tooltipResponsive
import typingsSlinky.rbx.rbxStrings.transparent
import typingsSlinky.rbx.rbxStrings.unselectable
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Exclude
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarMod {
  
  /* Inlined {None <TAsComponent extends react.react.ElementType<any> = react.react.ElementType<any>>(props : {  as :TAsComponent | undefined} & std.Pick<rbx.rbx/components/navbar/navbar-container.NavbarContainerProps, 'fixed' | 'transparent' | 'active' | 'hidden' | 'document' | 'color' | 'overlay' | 'italic' | 'relative' | 'tooltip' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'managed'> & std.Pick<react.react.ComponentProps<TAsComponent>, std.Exclude<keyof react.react.ComponentProps<TAsComponent>, 'fixed' | 'transparent' | 'active' | 'hidden' | 'document' | 'color' | 'overlay' | 'italic' | 'relative' | 'tooltip' | 'as' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'managed'>> & react.react.RefAttributes<TAsComponent extends 'symbol' | 'object' | 'big' | 'link' | 'small' | 'sub' | 'sup' | 'track' | 'progress' | 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'source' | 'span' | 'strong' | 'style' | 'summary' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'svg' | 'switch' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' | 'menuitem' | 'keygen' | 'noindex' | 'webview' | 'animate' | 'animateMotion' | 'animateTransform' | 'feDropShadow' | 'mpath' ? rbx.rbx/base/exotic.FromReactType<TAsComponent> : TAsComponent>): react.react.<global>.JSX.Element | null,   defaultProps :{  as :react.react.ElementType<any>} & std.Partial<std.Pick<rbx.rbx/components/navbar/navbar-container.NavbarContainerProps, 'fixed' | 'transparent' | 'active' | 'hidden' | 'document' | 'color' | 'overlay' | 'italic' | 'relative' | 'tooltip' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'managed'> & std.Pick<any, string | number | symbol>>,   displayName :string,   propTypes :react.react.WeakValidationMap<{[x: string] : any, [x: number] : any}>,   Brand :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/types.Prefer<rbx.rbx/base/helpers.HelpersPropsOverrides, rbx.rbx/base/helpers/badge.BadgeHelpersProps & rbx.rbx/base/helpers/float.FloatHelpersProps & rbx.rbx/base/helpers/overflow.OverflowHelpersProps & rbx.rbx/base/helpers/overlay.OverlayHelpersProps & rbx.rbx/base/helpers/tooltip.TooltipHelpersProps & rbx.rbx/base/helpers/typography.TypographyHelpersProps & rbx.rbx/base/helpers/visibility.VisibilityHelpersProps & rbx.rbx/base/helpers/other.OtherHelpersProps & rbx.rbx/base/helpers/responsive.ResponsiveHelpersProps & {  className :string | undefined}>, react.react.ElementType<any>>,   Burger :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/components/navbar/navbar-burger.NavbarBurgerProps, react.react.ElementType<any>>,   Container :{  defaultProps :{  transparent :boolean},   displayName :string, new (props : rbx.rbx/components/navbar/navbar-container.NavbarContainerProps): rbx.rbx/components/navbar/navbar-container.NavbarContainer},   Context :react.react.Context<rbx.rbx/components/navbar/navbar-context.NavbarContextValue>,   Divider :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/types.Prefer<rbx.rbx/base/helpers.HelpersPropsOverrides, rbx.rbx/base/helpers/badge.BadgeHelpersProps & rbx.rbx/base/helpers/float.FloatHelpersProps & rbx.rbx/base/helpers/overflow.OverflowHelpersProps & rbx.rbx/base/helpers/overlay.OverlayHelpersProps & rbx.rbx/base/helpers/tooltip.TooltipHelpersProps & rbx.rbx/base/helpers/typography.TypographyHelpersProps & rbx.rbx/base/helpers/visibility.VisibilityHelpersProps & rbx.rbx/base/helpers/other.OtherHelpersProps & rbx.rbx/base/helpers/responsive.ResponsiveHelpersProps & {  className :string | undefined}>, react.react.ElementType<any>>,   Dropdown :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/components/navbar/navbar-dropdown.NavbarDropdownProps, react.react.ElementType<any>>,   Item :{None <TAsComponent extends react.react.ElementType<any> = react.react.ElementType<any>>(props : {  as :TAsComponent | undefined} & std.Pick<rbx.rbx/components/navbar/navbar-item-container.NavbarItemContainerProps, 'active' | 'hidden' | 'up' | 'overlay' | 'expanded' | 'italic' | 'relative' | 'tab' | 'tooltip' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'hoverable' | 'managed' | 'dropdown' | 'onClick'> & std.Pick<react.react.ComponentProps<TAsComponent>, std.Exclude<keyof react.react.ComponentProps<TAsComponent>, 'active' | 'hidden' | 'up' | 'overlay' | 'expanded' | 'italic' | 'relative' | 'tab' | 'tooltip' | 'as' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'hoverable' | 'managed' | 'dropdown' | 'onClick'>> & react.react.RefAttributes<TAsComponent extends 'symbol' | 'object' | 'big' | 'link' | 'small' | 'sub' | 'sup' | 'track' | 'progress' | 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'source' | 'span' | 'strong' | 'style' | 'summary' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'svg' | 'switch' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' | 'menuitem' | 'keygen' | 'noindex' | 'webview' | 'animate' | 'animateMotion' | 'animateTransform' | 'feDropShadow' | 'mpath' ? rbx.rbx/base/exotic.FromReactType<TAsComponent> : TAsComponent>): react.react.<global>.JSX.Element | null,   defaultProps :{  as :react.react.ElementType<any>} & std.Partial<std.Pick<rbx.rbx/components/navbar/navbar-item-container.NavbarItemContainerProps, 'active' | 'hidden' | 'up' | 'overlay' | 'expanded' | 'italic' | 'relative' | 'tab' | 'tooltip' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'hoverable' | 'managed' | 'dropdown' | 'onClick'> & std.Pick<any, string | number | symbol>>,   displayName :string,   propTypes :react.react.WeakValidationMap<{[x: string] : any, [x: number] : any}>,   Container :{  displayName :string, new (props : rbx.rbx/components/navbar/navbar-item-container.NavbarItemContainerProps): rbx.rbx/components/navbar/navbar-item-container.NavbarItemContainer}} & std.Pick<react.react.ForwardRefExoticComponent<react.react.ElementType<any>>, 'displayName' | '$$typeof'>,   Link :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/components/navbar/navbar-link.NavbarLinkProps, react.react.ElementType<any>>,   Menu :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/types.Prefer<rbx.rbx/base/helpers.HelpersPropsOverrides, rbx.rbx/base/helpers/badge.BadgeHelpersProps & rbx.rbx/base/helpers/float.FloatHelpersProps & rbx.rbx/base/helpers/overflow.OverflowHelpersProps & rbx.rbx/base/helpers/overlay.OverlayHelpersProps & rbx.rbx/base/helpers/tooltip.TooltipHelpersProps & rbx.rbx/base/helpers/typography.TypographyHelpersProps & rbx.rbx/base/helpers/visibility.VisibilityHelpersProps & rbx.rbx/base/helpers/other.OtherHelpersProps & rbx.rbx/base/helpers/responsive.ResponsiveHelpersProps & {  className :string | undefined}>, react.react.ElementType<any>>,   Segment :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/components/navbar/navbar-segment.NavbarSegmentProps, react.react.ElementType<any>>} & std.Pick<react.react.ForwardRefExoticComponent<react.react.ElementType<any>>, 'displayName' | '$$typeof'> */
  object Navbar {
    
    @JSImport("rbx/components/navbar", "Navbar")
    @js.native
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with PickNavbarContainerPropsf with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            fixed | transparent | active | hidden | document | color | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | managed
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
    @JSImport("rbx/components/navbar", "Navbar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rbx/components/navbar", "Navbar.Brand")
    @js.native
    def Brand: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    @scala.inline
    def Brand_=(x: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Brand")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/components/navbar", "Navbar.Burger")
    @js.native
    def Burger: ForwardRefAsExoticComponent[NavbarBurgerProps, ReactElement] = js.native
    @scala.inline
    def Burger_=(x: ForwardRefAsExoticComponent[NavbarBurgerProps, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Burger")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rbx/components/navbar", "Navbar.Container")
    @js.native
    class Container protected () extends NavbarContainer {
      def this(props: NavbarContainerProps) = this()
    }
    @JSImport("rbx/components/navbar", "Navbar.Container")
    @js.native
    def Container: TypeofNavbarContainer = js.native
    @scala.inline
    def Container_=(x: TypeofNavbarContainer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Container")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/components/navbar", "Navbar.Context")
    @js.native
    def Context: typingsSlinky.react.mod.Context[NavbarContextValue] = js.native
    @scala.inline
    def Context_=(x: Context[NavbarContextValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/components/navbar", "Navbar.Divider")
    @js.native
    def Divider: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    @scala.inline
    def Divider_=(x: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/components/navbar", "Navbar.Dropdown")
    @js.native
    def Dropdown: ForwardRefAsExoticComponent[NavbarDropdownProps, ReactElement] = js.native
    @scala.inline
    def Dropdown_=(x: ForwardRefAsExoticComponent[NavbarDropdownProps, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dropdown")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/components/navbar", "Navbar.Item")
    @js.native
    def Item: NoneTAsComponentextendsElContainer = js.native
    @scala.inline
    def Item_=(x: NoneTAsComponentextendsElContainer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/components/navbar", "Navbar.Link")
    @js.native
    def Link: ForwardRefAsExoticComponent[NavbarLinkProps, ReactElement] = js.native
    @scala.inline
    def Link_=(x: ForwardRefAsExoticComponent[NavbarLinkProps, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/components/navbar", "Navbar.Menu")
    @js.native
    def Menu: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    @scala.inline
    def Menu_=(x: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Menu")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/components/navbar", "Navbar.Segment")
    @js.native
    def Segment: ForwardRefAsExoticComponent[NavbarSegmentProps, ReactElement] = js.native
    @scala.inline
    def Segment_=(x: ForwardRefAsExoticComponent[NavbarSegmentProps, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Segment")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/components/navbar", "Navbar.defaultProps")
    @js.native
    def defaultProps: AsElementType with (Partial[PickNavbarContainerPropsf with (Pick[_, String | Double | js.Symbol])]) = js.native
    @scala.inline
    def defaultProps_=(
      x: AsElementType with (Partial[PickNavbarContainerPropsf with (Pick[_, String | Double | js.Symbol])])
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/components/navbar", "Navbar.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/components/navbar", "Navbar.$$typeof")
    @js.native
    def typeof: js.Symbol = js.native
    
    @scala.inline
    def typeof_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$$typeof")(x.asInstanceOf[js.Any])
    
    /* Inlined react.react.WeakValidationMap<{[x: string] : any, [x: number] : any}> */
    object propTypes
  }
}
