package typingsSlinky.rbx

import slinky.core.facade.ReactElement
import typingsSlinky.rbx.anon.AsElementType
import typingsSlinky.rbx.anon.PickBadgeHelpersPropsFloa
import typingsSlinky.rbx.anon.PreferHelpersPropsOverrid
import typingsSlinky.rbx.anon.PreferHelpersPropsOverridBackgroundColor
import typingsSlinky.rbx.anon.`6`
import typingsSlinky.rbx.dividerDividerMod.DividerProps
import typingsSlinky.rbx.exoticMod.ForwardRefAsExoticComponent
import typingsSlinky.rbx.exoticMod.FromReactType
import typingsSlinky.rbx.helpersMod.HelpersPropsOverrides
import typingsSlinky.rbx.heroHeroMod.HeroModifierProps
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
import typingsSlinky.rbx.rbxStrings.gradient
import typingsSlinky.rbx.rbxStrings.hidden
import typingsSlinky.rbx.rbxStrings.invisible
import typingsSlinky.rbx.rbxStrings.italic
import typingsSlinky.rbx.rbxStrings.marginless
import typingsSlinky.rbx.rbxStrings.overlay
import typingsSlinky.rbx.rbxStrings.paddingless
import typingsSlinky.rbx.rbxStrings.pull
import typingsSlinky.rbx.rbxStrings.radiusless
import typingsSlinky.rbx.rbxStrings.relative
import typingsSlinky.rbx.rbxStrings.responsive
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
import typingsSlinky.rbx.rbxStrings.unselectable
import typingsSlinky.rbx.sectionSectionMod.SectionProps
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Exclude
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rbx/layout", JSImport.Namespace)
@js.native
object layoutMod extends js.Object {
  
  val Divider: ForwardRefAsExoticComponent[DividerProps, ReactElement] = js.native
  
  val Footer: ForwardRefAsExoticComponent[PreferHelpersPropsOverrid, ReactElement] = js.native
  
  val Section: ForwardRefAsExoticComponent[SectionProps, ReactElement] = js.native
  
  @js.native
  object Hero extends js.Object {
    
    def apply[TAsComponent /* <: ReactElement */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with HeroModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | color | overlay | size | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | gradient
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): ReactElement | Null = js.native
    
    var Body: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    
    var Foot: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    var Head: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ReactElement] = js.native
    
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with HeroModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
}
