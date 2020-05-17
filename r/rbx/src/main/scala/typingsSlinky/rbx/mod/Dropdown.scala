package typingsSlinky.rbx.mod

import slinky.core.facade.ReactElement
import typingsSlinky.rbx.anon.AsElementType
import typingsSlinky.rbx.anon.PickDropdownContainerProp
import typingsSlinky.rbx.anon.PreferHelpersPropsOverridBackgroundColor
import typingsSlinky.rbx.anon.TypeofDropdownContainer
import typingsSlinky.rbx.anon.`7`
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
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Exclude
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbx", "Dropdown")
@js.native
object Dropdown extends js.Object {
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
  def apply[TAsComponent /* <: ReactElement */](
    props: `7`[TAsComponent] with PickDropdownContainerProp with (Pick[
      ComponentProps[TAsComponent], 
      Exclude[
        /* keyof react.react.ComponentProps<TAsComponent> */ String, 
        active | hidden | up | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | align | hoverable | managed
      ]
    ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
  ): ReactElement | Null = js.native
}

