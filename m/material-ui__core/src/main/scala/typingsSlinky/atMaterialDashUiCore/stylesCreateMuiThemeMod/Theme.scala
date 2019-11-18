package typingsSlinky.atMaterialDashUiCore.stylesCreateMuiThemeMod

import typingsSlinky.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoints
import typingsSlinky.atMaterialDashUiCore.stylesCreateMixinsMod.Mixins
import typingsSlinky.atMaterialDashUiCore.stylesCreatePaletteMod.Palette
import typingsSlinky.atMaterialDashUiCore.stylesCreateTypographyMod.Typography
import typingsSlinky.atMaterialDashUiCore.stylesOverridesMod.Overrides
import typingsSlinky.atMaterialDashUiCore.stylesPropsMod.ComponentsProps
import typingsSlinky.atMaterialDashUiCore.stylesShadowsMod.Shadows
import typingsSlinky.atMaterialDashUiCore.stylesShapeMod.Shape
import typingsSlinky.atMaterialDashUiCore.stylesSpacingMod.Spacing
import typingsSlinky.atMaterialDashUiCore.stylesTransitionsMod.Transitions
import typingsSlinky.atMaterialDashUiCore.stylesZIndexMod.ZIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var breakpoints: Breakpoints
  var direction: Direction
  var mixins: Mixins
  var overrides: js.UndefOr[Overrides] = js.undefined
  var palette: Palette
  var props: js.UndefOr[ComponentsProps] = js.undefined
  var shadows: Shadows
  var shape: Shape
  var spacing: Spacing
  var transitions: Transitions
  var typography: Typography
  var zIndex: ZIndex
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

