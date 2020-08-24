package typingsSlinky.rbx.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rbx.anon.Desktop
import typingsSlinky.rbx.anon.PickBadgeHelpersPropsFloa
import typingsSlinky.rbx.columnMod.ColumnBreakpointOptions
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
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.rbx.anon.Desktop[TAsComponent] with typingsSlinky.rbx.helpersMod.HelpersPropsOverrides with typingsSlinky.rbx.anon.PickBadgeHelpersPropsFloa with typingsSlinky.rbx.columnMod.ColumnBreakpointOptions with (typingsSlinky.std.Pick[
typingsSlinky.react.mod.ComponentProps[TAsComponent], 
typingsSlinky.std.Exclude[
  / * keyof react.react.ComponentProps<TAsComponent> * / java.lang.String, 
  typingsSlinky.rbx.rbxStrings.hidden | typingsSlinky.rbx.rbxStrings.overlay | typingsSlinky.rbx.rbxStrings.size | typingsSlinky.rbx.rbxStrings.italic | typingsSlinky.rbx.rbxStrings.relative | typingsSlinky.rbx.rbxStrings.tooltip | typingsSlinky.rbx.rbxStrings.touch | typingsSlinky.rbx.rbxStrings.as | typingsSlinky.rbx.rbxStrings.mobile | typingsSlinky.rbx.rbxStrings.tablet | typingsSlinky.rbx.rbxStrings.desktop | typingsSlinky.rbx.rbxStrings.widescreen | typingsSlinky.rbx.rbxStrings.fullhd | typingsSlinky.rbx.rbxStrings.className | typingsSlinky.rbx.rbxStrings.badge | typingsSlinky.rbx.rbxStrings.badgeColor | typingsSlinky.rbx.rbxStrings.badgeOutlined | typingsSlinky.rbx.rbxStrings.badgeRounded | typingsSlinky.rbx.rbxStrings.badgeSize | typingsSlinky.rbx.rbxStrings.clearfix | typingsSlinky.rbx.rbxStrings.pull | typingsSlinky.rbx.rbxStrings.marginless | typingsSlinky.rbx.rbxStrings.paddingless | typingsSlinky.rbx.rbxStrings.radiusless | typingsSlinky.rbx.rbxStrings.shadowless | typingsSlinky.rbx.rbxStrings.unselectable | typingsSlinky.rbx.rbxStrings.clipped | typingsSlinky.rbx.rbxStrings.responsive | typingsSlinky.rbx.rbxStrings.textAlign | typingsSlinky.rbx.rbxStrings.textSize | typingsSlinky.rbx.rbxStrings.tooltipActive | typingsSlinky.rbx.rbxStrings.tooltipColor | typingsSlinky.rbx.rbxStrings.tooltipMultiline | typingsSlinky.rbx.rbxStrings.tooltipPosition | typingsSlinky.rbx.rbxStrings.tooltipResponsive | typingsSlinky.rbx.rbxStrings.backgroundColor | typingsSlinky.rbx.rbxStrings.textColor | typingsSlinky.rbx.rbxStrings.textTransform | typingsSlinky.rbx.rbxStrings.textWeight | typingsSlinky.rbx.rbxStrings.invisible | typingsSlinky.rbx.rbxStrings.srOnly | typingsSlinky.rbx.rbxStrings.narrow | typingsSlinky.rbx.rbxStrings.offset
]]) with (typingsSlinky.react.mod.RefAttributes[TAsComponent | typingsSlinky.rbx.exoticMod.FromReactType[TAsComponent]]) because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object Column {
  @JSImport("rbx", "Column")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.react.mod.ElementType[js.Any] */ TAsComponent] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object]
  
  def apply[/* <: typingsSlinky.react.mod.ElementType[js.Any] */ TAsComponent](
    p: Desktop[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with ColumnBreakpointOptions with (Pick[
      ComponentProps[TAsComponent], 
      Exclude[
        /* keyof react.react.ComponentProps<TAsComponent> */ String, 
        hidden | overlay | size | italic | relative | tooltip | touch | as | mobile | tablet | desktop | widescreen | fullhd | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | narrow | offset
      ]
    ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
  ): Builder[TAsComponent] = new Builder[TAsComponent](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: typingsSlinky.react.mod.ElementType[js.Any] */ TAsComponent](companion: Column.type): Builder[TAsComponent] = new Builder[TAsComponent](js.Array(this.component, js.Dictionary.empty))()
}

