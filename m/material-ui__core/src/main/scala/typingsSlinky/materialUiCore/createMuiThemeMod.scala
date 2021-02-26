package typingsSlinky.materialUiCore

import typingsSlinky.materialUiCore.createBreakpointsMod.Breakpoints
import typingsSlinky.materialUiCore.createBreakpointsMod.BreakpointsOptions
import typingsSlinky.materialUiCore.createMixinsMod.Mixins
import typingsSlinky.materialUiCore.createMixinsMod.MixinsOptions
import typingsSlinky.materialUiCore.createPaletteMod.Palette
import typingsSlinky.materialUiCore.createPaletteMod.PaletteOptions
import typingsSlinky.materialUiCore.createTypographyMod.Typography
import typingsSlinky.materialUiCore.createTypographyMod.TypographyOptions
import typingsSlinky.materialUiCore.overridesMod.Overrides
import typingsSlinky.materialUiCore.propsMod.ComponentsProps
import typingsSlinky.materialUiCore.shadowsMod.Shadows
import typingsSlinky.materialUiCore.shapeMod.Shape
import typingsSlinky.materialUiCore.shapeMod.ShapeOptions
import typingsSlinky.materialUiCore.spacingMod.Spacing
import typingsSlinky.materialUiCore.spacingMod.SpacingOptions
import typingsSlinky.materialUiCore.transitionsMod.Transitions
import typingsSlinky.materialUiCore.transitionsMod.TransitionsOptions
import typingsSlinky.materialUiCore.zIndexMod.ZIndex
import typingsSlinky.materialUiCore.zIndexMod.ZIndexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMuiThemeMod {
  
  @JSImport("@material-ui/core/styles/createMuiTheme", JSImport.Default)
  @js.native
  def default(): Theme = js.native
  @JSImport("@material-ui/core/styles/createMuiTheme", JSImport.Default)
  @js.native
  def default(options: ThemeOptions): Theme = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiCore.materialUiCoreStrings.ltr
    - typingsSlinky.materialUiCore.materialUiCoreStrings.rtl
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def ltr: typingsSlinky.materialUiCore.materialUiCoreStrings.ltr = "ltr".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.ltr]
    
    @scala.inline
    def rtl: typingsSlinky.materialUiCore.materialUiCoreStrings.rtl = "rtl".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.rtl]
  }
  
  @js.native
  trait Theme extends StObject {
    
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
      zIndex: ZIndex
    ): Theme = {
      val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoints(value: Breakpoints): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixins(value: Mixins): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrides(value: Overrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setPalette(value: Palette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: ComponentsProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setShadows(value: Shadows): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowsVarargs(value: js.Any*): Self = StObject.set(x, "shadows", js.Array(value :_*))
      
      @scala.inline
      def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacing(value: Spacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitions(value: Transitions): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypography(value: Typography): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndex(value: ZIndex): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ThemeOptions extends StObject {
    
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
    implicit class ThemeOptionsMutableBuilder[Self <: ThemeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoints(value: BreakpointsOptions): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setMixins(value: MixinsOptions): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      @scala.inline
      def setOverrides(value: Overrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setPalette(value: PaletteOptions): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      @scala.inline
      def setProps(value: ComponentsProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setShadows(value: Shadows): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      @scala.inline
      def setShadowsVarargs(value: js.Any*): Self = StObject.set(x, "shadows", js.Array(value :_*))
      
      @scala.inline
      def setShape(value: ShapeOptions): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSpacing(value: SpacingOptions): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      @scala.inline
      def setTransitions(value: TransitionsOptions): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      @scala.inline
      def setTypography(value: TypographyOptions | (js.Function1[/* palette */ Palette, TypographyOptions])): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypographyFunction1(value: /* palette */ Palette => TypographyOptions): Self = StObject.set(x, "typography", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
      
      @scala.inline
      def setZIndex(value: ZIndexOptions): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
