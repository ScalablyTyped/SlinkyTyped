package typingsSlinky.rbx

import slinky.core.facade.ReactElement
import typingsSlinky.rbx.anon.Active
import typingsSlinky.rbx.anon.AsElementType
import typingsSlinky.rbx.anon.NoneTAsComponentextendsEl
import typingsSlinky.rbx.anon.NoneTAsComponentextendsElBody
import typingsSlinky.rbx.anon.NoneTAsComponentextendsElCall
import typingsSlinky.rbx.anon.NoneTAsComponentextendsElContainer
import typingsSlinky.rbx.anon.NoneTAsComponentextendsElDefaultProps
import typingsSlinky.rbx.anon.NoneTAsComponentextendsElDisplayName
import typingsSlinky.rbx.anon.PickBadgeHelpersPropsFloa
import typingsSlinky.rbx.anon.PickDropdownContainerProp
import typingsSlinky.rbx.anon.PickModalContainerPropsac
import typingsSlinky.rbx.anon.PickNavbarContainerPropsf
import typingsSlinky.rbx.anon.PreferHelpersPropsOverridBackgroundColor
import typingsSlinky.rbx.anon.TypeofDropdownContainer
import typingsSlinky.rbx.anon.TypeofModalContainer
import typingsSlinky.rbx.anon.TypeofModalPortal
import typingsSlinky.rbx.anon.TypeofNavbarContainer
import typingsSlinky.rbx.anon.`6`
import typingsSlinky.rbx.breadcrumbBreadcrumbMod.BreadcrumbModifierProps
import typingsSlinky.rbx.breadcrumbItemMod.BreadcrumbItemProps
import typingsSlinky.rbx.dropdownContextMod.DropdownContextValue
import typingsSlinky.rbx.dropdownItemMod.DropdownItemProps
import typingsSlinky.rbx.dropdownTriggerMod.DropdownTriggerProps
import typingsSlinky.rbx.exoticMod.ForwardRefAsExoticComponent
import typingsSlinky.rbx.exoticMod.FromReactType
import typingsSlinky.rbx.helpersMod.HelpersPropsOverrides
import typingsSlinky.rbx.levelItemMod.LevelItemProps
import typingsSlinky.rbx.levelLevelMod.LevelModifierProps
import typingsSlinky.rbx.listItemMod.ListItemProps
import typingsSlinky.rbx.mediaItemMod.MediaItemProps
import typingsSlinky.rbx.messageMessageMod.MessageModifierProps
import typingsSlinky.rbx.modalBackgroundMod.ModalBackgroundProps
import typingsSlinky.rbx.modalCloseMod.ModalCloseProps
import typingsSlinky.rbx.modalContextMod.ModalContextValue
import typingsSlinky.rbx.navbarBurgerMod.NavbarBurgerProps
import typingsSlinky.rbx.navbarContextMod.NavbarContextValue
import typingsSlinky.rbx.navbarDropdownMod.NavbarDropdownProps
import typingsSlinky.rbx.navbarLinkMod.NavbarLinkProps
import typingsSlinky.rbx.navbarSegmentMod.NavbarSegmentProps
import typingsSlinky.rbx.paginationLinkMod.PaginationLinkProps
import typingsSlinky.rbx.paginationPaginationMod.PaginationModifiers
import typingsSlinky.rbx.paginationStepMod.PaginationStepProps
import typingsSlinky.rbx.panelBlockMod.PanelBlockProps
import typingsSlinky.rbx.rbxStrings.active
import typingsSlinky.rbx.rbxStrings.align
import typingsSlinky.rbx.rbxStrings.as
import typingsSlinky.rbx.rbxStrings.backgroundColor
import typingsSlinky.rbx.rbxStrings.badge
import typingsSlinky.rbx.rbxStrings.badgeColor
import typingsSlinky.rbx.rbxStrings.badgeOutlined
import typingsSlinky.rbx.rbxStrings.badgeRounded
import typingsSlinky.rbx.rbxStrings.badgeSize
import typingsSlinky.rbx.rbxStrings.breakpoint
import typingsSlinky.rbx.rbxStrings.children
import typingsSlinky.rbx.rbxStrings.className
import typingsSlinky.rbx.rbxStrings.clearfix
import typingsSlinky.rbx.rbxStrings.clipped
import typingsSlinky.rbx.rbxStrings.closeOnBlur
import typingsSlinky.rbx.rbxStrings.closeOnEsc
import typingsSlinky.rbx.rbxStrings.color
import typingsSlinky.rbx.rbxStrings.containerClassName
import typingsSlinky.rbx.rbxStrings.document
import typingsSlinky.rbx.rbxStrings.fixed
import typingsSlinky.rbx.rbxStrings.hidden
import typingsSlinky.rbx.rbxStrings.hoverable
import typingsSlinky.rbx.rbxStrings.invisible
import typingsSlinky.rbx.rbxStrings.italic
import typingsSlinky.rbx.rbxStrings.managed
import typingsSlinky.rbx.rbxStrings.marginless
import typingsSlinky.rbx.rbxStrings.onClose
import typingsSlinky.rbx.rbxStrings.overlay
import typingsSlinky.rbx.rbxStrings.paddingless
import typingsSlinky.rbx.rbxStrings.pull
import typingsSlinky.rbx.rbxStrings.radiusless
import typingsSlinky.rbx.rbxStrings.relative
import typingsSlinky.rbx.rbxStrings.responsive
import typingsSlinky.rbx.rbxStrings.rounded
import typingsSlinky.rbx.rbxStrings.separator
import typingsSlinky.rbx.rbxStrings.shadowless
import typingsSlinky.rbx.rbxStrings.size
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
import typingsSlinky.rbx.rbxStrings.up
import typingsSlinky.rbx.tabGroupMod.TabGroupProps
import typingsSlinky.rbx.tabTabMod.TabModifierProps
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Exclude
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rbx/components", JSImport.Namespace)
@js.native
object componentsMod extends js.Object {
  
  @js.native
  object Breadcrumb extends js.Object {
    
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with BreadcrumbModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | size | italic | relative | separator | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | align
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var Item: ForwardRefAsExoticComponent[BreadcrumbItemProps, ReactElement] = js.native
    
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with BreadcrumbModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  @js.native
  object Card extends js.Object {
    
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
    
    var Content: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var Footer: NoneTAsComponentextendsEl = js.native
    
    var Header: NoneTAsComponentextendsElCall = js.native
    
    var Image: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  @js.native
  object Dropdown extends js.Object {
    
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with PickDropdownContainerProp with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            active | hidden | up | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | align | hoverable | managed
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
    
    var Container: TypeofDropdownContainer = js.native
    
    var Content: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    var Context: typingsSlinky.react.mod.Context[DropdownContextValue] = js.native
    
    var Divider: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var Item: ForwardRefAsExoticComponent[DropdownItemProps, ReactElement] = js.native
    
    var Menu: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    var Trigger: ForwardRefAsExoticComponent[DropdownTriggerProps, ReactElement] = js.native
    
    var defaultProps: AsElementType with (Partial[PickDropdownContainerProp with (Pick[_, String | Double | js.Symbol])]) = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  @js.native
  object Level extends js.Object {
    
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with LevelModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | breakpoint
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var Item: ForwardRefAsExoticComponent[LevelItemProps, ReactElement] = js.native
    
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with LevelModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  @js.native
  object List extends js.Object {
    
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var Item: ForwardRefAsExoticComponent[ListItemProps, ReactElement] = js.native
    
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  @js.native
  object Media extends js.Object {
    
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var Item: ForwardRefAsExoticComponent[MediaItemProps, ReactElement] = js.native
    
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  @js.native
  object Menu extends js.Object {
    
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var Label: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    var List: NoneTAsComponentextendsElDefaultProps = js.native
    
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  @js.native
  object Message extends js.Object {
    
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with MessageModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | color | overlay | size | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
    
    var Body: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var Header: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with MessageModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  @js.native
  object Modal extends js.Object {
    
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with PickModalContainerPropsac with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            active | document | children | as | clipped | closeOnBlur | closeOnEsc | onClose | containerClassName
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
    
    var Background: ForwardRefAsExoticComponent[ModalBackgroundProps, ReactElement] = js.native
    
    var Card: NoneTAsComponentextendsElBody = js.native
    
    var Close: ForwardRefAsExoticComponent[ModalCloseProps, ReactElement] = js.native
    
    var Container: TypeofModalContainer = js.native
    
    var Content: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    var Context: typingsSlinky.react.mod.Context[ModalContextValue] = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var Portal: TypeofModalPortal = js.native
    
    var defaultProps: AsElementType with (Partial[PickModalContainerPropsac with (Pick[_, String | Double | js.Symbol])]) = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var propTypes: Active = js.native
  }
  
  @js.native
  object Navbar extends js.Object {
    
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with PickNavbarContainerPropsf with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            fixed | transparent | active | hidden | document | color | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | managed
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
    
    var Brand: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    var Burger: ForwardRefAsExoticComponent[NavbarBurgerProps, ReactElement] = js.native
    
    var Container: TypeofNavbarContainer = js.native
    
    var Context: typingsSlinky.react.mod.Context[NavbarContextValue] = js.native
    
    var Divider: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var Dropdown: ForwardRefAsExoticComponent[NavbarDropdownProps, ReactElement] = js.native
    
    var Item: NoneTAsComponentextendsElContainer = js.native
    
    var Link: ForwardRefAsExoticComponent[NavbarLinkProps, ReactElement] = js.native
    
    var Menu: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    var Segment: ForwardRefAsExoticComponent[NavbarSegmentProps, ReactElement] = js.native
    
    var defaultProps: AsElementType with (Partial[PickNavbarContainerPropsf with (Pick[_, String | Double | js.Symbol])]) = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  @js.native
  object Pagination extends js.Object {
    
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with PaginationModifiers with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | size | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | align | rounded
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var Ellipsis: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    var Link: ForwardRefAsExoticComponent[PaginationLinkProps, ReactElement] = js.native
    
    var List: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    var Step: ForwardRefAsExoticComponent[PaginationStepProps, ReactElement] = js.native
    
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with PaginationModifiers with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  @js.native
  object Panel extends js.Object {
    
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
    
    var Block: ForwardRefAsExoticComponent[PanelBlockProps, ReactElement] = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var Heading: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    var Icon: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    var Tab: NoneTAsComponentextendsElDisplayName = js.native
    
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  @js.native
  object Tab extends js.Object {
    
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with TabModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            active | hidden | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var Group: ForwardRefAsExoticComponent[TabGroupProps, ReactElement] = js.native
    
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with TabModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
}
