package typingsSlinky.materialUiCore.createMuiThemeMod

import typingsSlinky.materialUiCore.createBreakpointsMod.Breakpoints
import typingsSlinky.materialUiCore.createMixinsMod.Mixins
import typingsSlinky.materialUiCore.createPaletteMod.Palette
import typingsSlinky.materialUiCore.createTypographyMod.Typography
import typingsSlinky.materialUiCore.overridesMod.Overrides
import typingsSlinky.materialUiCore.propsMod.ComponentsProps
import typingsSlinky.materialUiCore.shadowsMod.Shadows
import typingsSlinky.materialUiCore.shapeMod.Shape
import typingsSlinky.materialUiCore.spacingMod.Spacing
import typingsSlinky.materialUiCore.transitionsMod.Transitions
import typingsSlinky.materialUiCore.zIndexMod.ZIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme extends js.Object {
  var breakpoints: Breakpoints = js.native
  var direction: Direction = js.native
  var mixins: Mixins = js.native
  var overrides: js.UndefOr[Overrides] = js.native
  var palette: Palette = js.native
  var props: js.UndefOr[ComponentsProps] = js.native
  var shadows: Shadows = js.native
  var shape: Shape = js.native
  var spacing: Spacing = js.native
  var transitions: Transitions = js.native
  var typography: Typography = js.native
  var zIndex: ZIndex = js.native
}

object Theme {
  @scala.inline
  def apply(
    breakpoints: Breakpoints,
    direction: Direction,
    mixins: Mixins,
    palette: Palette,
    shadows: Shadows,
    shape: Shape,
    spacing: Spacing,
    transitions: Transitions,
    typography: Typography,
    zIndex: ZIndex,
    overrides: Overrides = null,
    props: ComponentsProps = null
  ): Theme = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
}

