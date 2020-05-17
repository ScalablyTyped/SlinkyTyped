package typingsSlinky.rbx.columnMod

import slinky.core.facade.ReactElement
import typingsSlinky.rbx.anon.AsElementType
import typingsSlinky.rbx.anon.ColumnGroupPropsBackgroundColor
import typingsSlinky.rbx.anon.Desktop
import typingsSlinky.rbx.anon.Fullhd
import typingsSlinky.rbx.anon.PickBadgeHelpersPropsFloa
import typingsSlinky.rbx.exoticMod.ForwardRefAsExoticComponent
import typingsSlinky.rbx.exoticMod.FromReactType
import typingsSlinky.rbx.helpersMod.HelpersPropsOverrides
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
import typingsSlinky.rbx.rbxStrings.desktop
import typingsSlinky.rbx.rbxStrings.fullhd
import typingsSlinky.rbx.rbxStrings.hidden
import typingsSlinky.rbx.rbxStrings.invisible
import typingsSlinky.rbx.rbxStrings.italic
import typingsSlinky.rbx.rbxStrings.marginless
import typingsSlinky.rbx.rbxStrings.mobile
import typingsSlinky.rbx.rbxStrings.narrow
import typingsSlinky.rbx.rbxStrings.offset
import typingsSlinky.rbx.rbxStrings.overlay
import typingsSlinky.rbx.rbxStrings.paddingless
import typingsSlinky.rbx.rbxStrings.pull
import typingsSlinky.rbx.rbxStrings.radiusless
import typingsSlinky.rbx.rbxStrings.relative
import typingsSlinky.rbx.rbxStrings.responsive
import typingsSlinky.rbx.rbxStrings.shadowless
import typingsSlinky.rbx.rbxStrings.size
import typingsSlinky.rbx.rbxStrings.srOnly
import typingsSlinky.rbx.rbxStrings.tablet
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
import typingsSlinky.rbx.rbxStrings.touch
import typingsSlinky.rbx.rbxStrings.unselectable
import typingsSlinky.rbx.rbxStrings.widescreen
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.std.Exclude
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbx/grid/columns/column", "Column")
@js.native
object Column extends js.Object {
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol = js.native
  var Group: ForwardRefAsExoticComponent[ColumnGroupPropsBackgroundColor, ReactElement] = js.native
  var defaultProps: AsElementType with (Partial[
    HelpersPropsOverrides with PickBadgeHelpersPropsFloa with Fullhd with ColumnBreakpointOptions with (Pick[_, String | Double | js.Symbol])
  ]) = js.native
  var displayName: js.UndefOr[String] = js.native
  def apply[TAsComponent /* <: ReactElement */](
    props: Desktop[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with ColumnBreakpointOptions with (Pick[
      ComponentProps[TAsComponent], 
      Exclude[
        /* keyof react.react.ComponentProps<TAsComponent> */ String, 
        hidden | overlay | size | italic | relative | tooltip | touch | as | mobile | tablet | desktop | widescreen | fullhd | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | narrow | offset
      ]
    ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
  ): ReactElement | Null = js.native
}

