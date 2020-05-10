package typingsSlinky.materialUiCore.createMuiThemeMod

import typingsSlinky.materialUiCore.createBreakpointsMod.BreakpointsOptions
import typingsSlinky.materialUiCore.createMixinsMod.MixinsOptions
import typingsSlinky.materialUiCore.createPaletteMod.Palette
import typingsSlinky.materialUiCore.createPaletteMod.PaletteOptions
import typingsSlinky.materialUiCore.createTypographyMod.TypographyOptions
import typingsSlinky.materialUiCore.overridesMod.Overrides
import typingsSlinky.materialUiCore.propsMod.ComponentsProps
import typingsSlinky.materialUiCore.shadowsMod.Shadows
import typingsSlinky.materialUiCore.shapeMod.ShapeOptions
import typingsSlinky.materialUiCore.spacingMod.SpacingOptions
import typingsSlinky.materialUiCore.transitionsMod.TransitionsOptions
import typingsSlinky.materialUiCore.zIndexMod.ZIndexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeOptions extends js.Object {
  var breakpoints: js.UndefOr[BreakpointsOptions] = js.native
  var direction: js.UndefOr[Direction] = js.native
  var mixins: js.UndefOr[MixinsOptions] = js.native
  var overrides: js.UndefOr[Overrides] = js.native
  var palette: js.UndefOr[PaletteOptions] = js.native
  var props: js.UndefOr[ComponentsProps] = js.native
  var shadows: js.UndefOr[Shadows] = js.native
  var shape: js.UndefOr[ShapeOptions] = js.native
  var spacing: js.UndefOr[SpacingOptions] = js.native
  var transitions: js.UndefOr[TransitionsOptions] = js.native
  var typography: js.UndefOr[TypographyOptions | (js.Function1[/* palette */ Palette, TypographyOptions])] = js.native
  var zIndex: js.UndefOr[ZIndexOptions] = js.native
}

object ThemeOptions {
  @scala.inline
  def apply(): ThemeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeOptions]
  }
  @scala.inline
  implicit class ThemeOptionsOps[Self <: ThemeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakpoints(value: BreakpointsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: Direction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withMixins(value: MixinsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMixins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: Overrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(value: PaletteOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(js.undefined)
        ret
    }
    @scala.inline
    def withProps(value: ComponentsProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
    @scala.inline
    def withShadows(value: Shadows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: ShapeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: SpacingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitions(value: TransitionsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(js.undefined)
        ret
    }
    @scala.inline
    def withTypographyFunction1(value: /* palette */ Palette => TypographyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typography")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTypography(value: TypographyOptions | (js.Function1[/* palette */ Palette, TypographyOptions])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typography")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypography: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typography")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: ZIndexOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

