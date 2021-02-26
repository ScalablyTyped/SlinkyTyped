package typingsSlinky.rbx.mod

import slinky.core.facade.ReactElement
import typingsSlinky.rbx.anon.AsElementType
import typingsSlinky.rbx.anon.PickDropdownContainerProp
import typingsSlinky.rbx.anon.PreferHelpersPropsOverridBackgroundColor
import typingsSlinky.rbx.anon.TypeofDropdownContainer
import typingsSlinky.rbx.anon.`6`
import typingsSlinky.rbx.dropdownContainerMod.DropdownContainer
import typingsSlinky.rbx.dropdownContainerMod.DropdownContainerProps
import typingsSlinky.rbx.dropdownContextMod.DropdownContextValue
import typingsSlinky.rbx.dropdownItemMod.DropdownItemProps
import typingsSlinky.rbx.dropdownTriggerMod.DropdownTriggerProps
import typingsSlinky.rbx.exoticMod.ForwardRefAsExoticComponent
import typingsSlinky.rbx.exoticMod.FromReactType
import typingsSlinky.rbx.rbxStrings.active
import typingsSlinky.rbx.rbxStrings.align
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
import typingsSlinky.rbx.rbxStrings.hidden
import typingsSlinky.rbx.rbxStrings.hoverable
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
import typingsSlinky.rbx.rbxStrings.unselectable
import typingsSlinky.rbx.rbxStrings.up
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

/* Inlined {None <TAsComponent extends react.react.ElementType<any> = react.react.ElementType<any>>(props : {  as :TAsComponent | undefined} & std.Pick<rbx.rbx/components/dropdown/dropdown-container.DropdownContainerProps, 'active' | 'hidden' | 'up' | 'overlay' | 'italic' | 'relative' | 'tooltip' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'align' | 'hoverable' | 'managed'> & std.Pick<react.react.ComponentProps<TAsComponent>, std.Exclude<keyof react.react.ComponentProps<TAsComponent>, 'active' | 'hidden' | 'up' | 'overlay' | 'italic' | 'relative' | 'tooltip' | 'as' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'align' | 'hoverable' | 'managed'>> & react.react.RefAttributes<TAsComponent extends 'symbol' | 'object' | 'big' | 'link' | 'small' | 'sub' | 'sup' | 'track' | 'progress' | 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'source' | 'span' | 'strong' | 'style' | 'summary' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'svg' | 'switch' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' | 'menuitem' | 'keygen' | 'noindex' | 'webview' | 'animate' | 'animateMotion' | 'animateTransform' | 'feDropShadow' | 'mpath' ? rbx.rbx/base/exotic.FromReactType<TAsComponent> : TAsComponent>): react.react.<global>.JSX.Element | null,   defaultProps :{  as :react.react.ElementType<any>} & std.Partial<std.Pick<rbx.rbx/components/dropdown/dropdown-container.DropdownContainerProps, 'active' | 'hidden' | 'up' | 'overlay' | 'italic' | 'relative' | 'tooltip' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'align' | 'hoverable' | 'managed'> & std.Pick<any, string | number | symbol>>,   displayName :string,   propTypes :react.react.WeakValidationMap<{[x: string] : any, [x: number] : any}>,   Container :{  displayName :string, new (props : rbx.rbx/components/dropdown/dropdown-container.DropdownContainerProps): rbx.rbx/components/dropdown/dropdown-container.DropdownContainer},   Content :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/types.Prefer<rbx.rbx/base/helpers.HelpersPropsOverrides, rbx.rbx/base/helpers/badge.BadgeHelpersProps & rbx.rbx/base/helpers/float.FloatHelpersProps & rbx.rbx/base/helpers/overflow.OverflowHelpersProps & rbx.rbx/base/helpers/overlay.OverlayHelpersProps & rbx.rbx/base/helpers/tooltip.TooltipHelpersProps & rbx.rbx/base/helpers/typography.TypographyHelpersProps & rbx.rbx/base/helpers/visibility.VisibilityHelpersProps & rbx.rbx/base/helpers/other.OtherHelpersProps & rbx.rbx/base/helpers/responsive.ResponsiveHelpersProps & {  className :string | undefined}>, react.react.ElementType<any>>,   Context :react.react.Context<rbx.rbx/components/dropdown/dropdown-context.DropdownContextValue>,   Divider :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/types.Prefer<rbx.rbx/base/helpers.HelpersPropsOverrides, rbx.rbx/base/helpers/badge.BadgeHelpersProps & rbx.rbx/base/helpers/float.FloatHelpersProps & rbx.rbx/base/helpers/overflow.OverflowHelpersProps & rbx.rbx/base/helpers/overlay.OverlayHelpersProps & rbx.rbx/base/helpers/tooltip.TooltipHelpersProps & rbx.rbx/base/helpers/typography.TypographyHelpersProps & rbx.rbx/base/helpers/visibility.VisibilityHelpersProps & rbx.rbx/base/helpers/other.OtherHelpersProps & rbx.rbx/base/helpers/responsive.ResponsiveHelpersProps & {  className :string | undefined}>, react.react.ElementType<any>>,   Item :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/components/dropdown/dropdown-item.DropdownItemProps, react.react.ElementType<any>>,   Menu :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/types.Prefer<rbx.rbx/base/helpers.HelpersPropsOverrides, rbx.rbx/base/helpers/badge.BadgeHelpersProps & rbx.rbx/base/helpers/float.FloatHelpersProps & rbx.rbx/base/helpers/overflow.OverflowHelpersProps & rbx.rbx/base/helpers/overlay.OverlayHelpersProps & rbx.rbx/base/helpers/tooltip.TooltipHelpersProps & rbx.rbx/base/helpers/typography.TypographyHelpersProps & rbx.rbx/base/helpers/visibility.VisibilityHelpersProps & rbx.rbx/base/helpers/other.OtherHelpersProps & rbx.rbx/base/helpers/responsive.ResponsiveHelpersProps & {  className :string | undefined}>, react.react.ElementType<any>>,   Trigger :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/components/dropdown/dropdown-trigger.DropdownTriggerProps, react.react.ElementType<any>>} & std.Pick<react.react.ForwardRefExoticComponent<react.react.ElementType<any>>, 'displayName' | '$$typeof'> */
object Dropdown {
  
  @JSImport("rbx", "Dropdown")
  @js.native
  def apply[TAsComponent /* <: ReactElement */](
    props: `6`[TAsComponent] with PickDropdownContainerProp with (Pick[
      ComponentProps[TAsComponent], 
      Exclude[
        /* keyof react.react.ComponentProps<TAsComponent> */ String, 
        active | hidden | up | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | align | hoverable | managed
      ]
    ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
  ): ReactElement | Null = js.native
  @JSImport("rbx", "Dropdown")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rbx", "Dropdown.Container")
  @js.native
  class Container protected () extends DropdownContainer {
    def this(props: DropdownContainerProps) = this()
  }
  @JSImport("rbx", "Dropdown.Container")
  @js.native
  def Container: TypeofDropdownContainer = js.native
  @scala.inline
  def Container_=(x: TypeofDropdownContainer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Container")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Dropdown.Content")
  @js.native
  def Content: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
  @scala.inline
  def Content_=(x: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Dropdown.Context")
  @js.native
  def Context: typingsSlinky.react.mod.Context[DropdownContextValue] = js.native
  @scala.inline
  def Context_=(x: Context[DropdownContextValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Dropdown.Divider")
  @js.native
  def Divider: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
  @scala.inline
  def Divider_=(x: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Dropdown.Item")
  @js.native
  def Item: ForwardRefAsExoticComponent[DropdownItemProps, ReactElement] = js.native
  @scala.inline
  def Item_=(x: ForwardRefAsExoticComponent[DropdownItemProps, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Dropdown.Menu")
  @js.native
  def Menu: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
  @scala.inline
  def Menu_=(x: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Menu")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Dropdown.Trigger")
  @js.native
  def Trigger: ForwardRefAsExoticComponent[DropdownTriggerProps, ReactElement] = js.native
  @scala.inline
  def Trigger_=(x: ForwardRefAsExoticComponent[DropdownTriggerProps, ReactElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Trigger")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Dropdown.defaultProps")
  @js.native
  def defaultProps: AsElementType with (Partial[PickDropdownContainerProp with (Pick[_, String | Double | js.Symbol])]) = js.native
  @scala.inline
  def defaultProps_=(
    x: AsElementType with (Partial[PickDropdownContainerProp with (Pick[_, String | Double | js.Symbol])])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Dropdown.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Dropdown.$$typeof")
  @js.native
  def typeof: js.Symbol = js.native
  
  @scala.inline
  def typeof_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$$typeof")(x.asInstanceOf[js.Any])
  
  /* Inlined react.react.WeakValidationMap<{[x: string] : any, [x: number] : any}> */
  object propTypes
}
