package typingsSlinky.materialUiCore

import typingsSlinky.csstype.mod.ColorProperty
import typingsSlinky.csstype.mod.FontFamilyProperty
import typingsSlinky.csstype.mod.FontSizeProperty
import typingsSlinky.csstype.mod.FontWeightProperty
import typingsSlinky.csstype.mod.LetterSpacingProperty
import typingsSlinky.csstype.mod.LineHeightProperty
import typingsSlinky.csstype.mod.TextTransformProperty
import typingsSlinky.materialUiCore.createPaletteMod.Palette
import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createTypographyMod {
  
  @JSImport("@material-ui/core/styles/createTypography", JSImport.Default)
  @js.native
  def default(palette: Palette, typography: js.Function1[/* palette */ Palette, TypographyOptions]): Typography = js.native
  @JSImport("@material-ui/core/styles/createTypography", JSImport.Default)
  @js.native
  def default(palette: Palette, typography: TypographyOptions): Typography = js.native
  
  /* Inlined parent std.Required<{  fontFamily :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontFamily'],   fontSize :number,   fontWeightLight :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight'],   fontWeightRegular :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight'],   fontWeightMedium :@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties['fontWeight']}> */
  @js.native
  trait FontStyle extends StObject {
    
    var fontFamily: FontFamilyProperty = js.native
    
    var fontSize: Double = js.native
    
    var fontWeightLight: FontWeightProperty = js.native
    
    var fontWeightMedium: FontWeightProperty = js.native
    
    var fontWeightRegular: FontWeightProperty = js.native
  }
  object FontStyle {
    
    @scala.inline
    def apply(
      fontFamily: FontFamilyProperty,
      fontSize: Double,
      fontWeightLight: FontWeightProperty,
      fontWeightMedium: FontWeightProperty,
      fontWeightRegular: FontWeightProperty
    ): FontStyle = {
      val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeightLight = fontWeightLight.asInstanceOf[js.Any], fontWeightMedium = fontWeightMedium.asInstanceOf[js.Any], fontWeightRegular = fontWeightRegular.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontStyle]
    }
    
    @scala.inline
    implicit class FontStyleMutableBuilder[Self <: FontStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: FontFamilyProperty): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightLight(value: FontWeightProperty): Self = StObject.set(x, "fontWeightLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightMedium(value: FontWeightProperty): Self = StObject.set(x, "fontWeightMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightRegular(value: FontWeightProperty): Self = StObject.set(x, "fontWeightRegular", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createTypography.FontStyle> */
  @js.native
  trait FontStyleOptions extends StObject {
    
    var allVariants: js.UndefOr[CSSProperties] = js.native
    
    var fontFamily: js.UndefOr[FontFamilyProperty] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var fontWeightLight: js.UndefOr[FontWeightProperty] = js.native
    
    var fontWeightMedium: js.UndefOr[FontWeightProperty] = js.native
    
    var fontWeightRegular: js.UndefOr[FontWeightProperty] = js.native
    
    var htmlFontSize: js.UndefOr[Double] = js.native
    
    var useNextVariants: js.UndefOr[Boolean] = js.native
  }
  object FontStyleOptions {
    
    @scala.inline
    def apply(): FontStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontStyleOptions]
    }
    
    @scala.inline
    implicit class FontStyleOptionsMutableBuilder[Self <: FontStyleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllVariants(value: CSSProperties): Self = StObject.set(x, "allVariants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllVariantsUndefined: Self = StObject.set(x, "allVariants", js.undefined)
      
      @scala.inline
      def setFontFamily(value: FontFamilyProperty): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontWeightLight(value: FontWeightProperty): Self = StObject.set(x, "fontWeightLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightLightUndefined: Self = StObject.set(x, "fontWeightLight", js.undefined)
      
      @scala.inline
      def setFontWeightMedium(value: FontWeightProperty): Self = StObject.set(x, "fontWeightMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightMediumUndefined: Self = StObject.set(x, "fontWeightMedium", js.undefined)
      
      @scala.inline
      def setFontWeightRegular(value: FontWeightProperty): Self = StObject.set(x, "fontWeightRegular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightRegularUndefined: Self = StObject.set(x, "fontWeightRegular", js.undefined)
      
      @scala.inline
      def setHtmlFontSize(value: Double): Self = StObject.set(x, "htmlFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlFontSizeUndefined: Self = StObject.set(x, "htmlFontSize", js.undefined)
      
      @scala.inline
      def setUseNextVariants(value: Boolean): Self = StObject.set(x, "useNextVariants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNextVariantsUndefined: Self = StObject.set(x, "useNextVariants", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiCore.materialUiCoreStrings.h1
    - typingsSlinky.materialUiCore.materialUiCoreStrings.h2
    - typingsSlinky.materialUiCore.materialUiCoreStrings.h3
    - typingsSlinky.materialUiCore.materialUiCoreStrings.h4
    - typingsSlinky.materialUiCore.materialUiCoreStrings.h5
    - typingsSlinky.materialUiCore.materialUiCoreStrings.h6
    - typingsSlinky.materialUiCore.materialUiCoreStrings.subtitle1
    - typingsSlinky.materialUiCore.materialUiCoreStrings.subtitle2
    - typingsSlinky.materialUiCore.materialUiCoreStrings.body1
    - typingsSlinky.materialUiCore.materialUiCoreStrings.body2
    - typingsSlinky.materialUiCore.materialUiCoreStrings.caption
    - typingsSlinky.materialUiCore.materialUiCoreStrings.button
    - typingsSlinky.materialUiCore.materialUiCoreStrings.overline
    - typingsSlinky.materialUiCore.materialUiCoreStrings.display4
    - typingsSlinky.materialUiCore.materialUiCoreStrings.display3
    - typingsSlinky.materialUiCore.materialUiCoreStrings.display2
    - typingsSlinky.materialUiCore.materialUiCoreStrings.display1
    - typingsSlinky.materialUiCore.materialUiCoreStrings.headline
    - typingsSlinky.materialUiCore.materialUiCoreStrings.title
    - typingsSlinky.materialUiCore.materialUiCoreStrings.subheading
  */
  trait ThemeStyle extends StObject
  object ThemeStyle {
    
    @scala.inline
    def body1: typingsSlinky.materialUiCore.materialUiCoreStrings.body1 = "body1".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.body1]
    
    @scala.inline
    def body2: typingsSlinky.materialUiCore.materialUiCoreStrings.body2 = "body2".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.body2]
    
    @scala.inline
    def button: typingsSlinky.materialUiCore.materialUiCoreStrings.button = "button".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.button]
    
    @scala.inline
    def caption: typingsSlinky.materialUiCore.materialUiCoreStrings.caption = "caption".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.caption]
    
    @scala.inline
    def display1: typingsSlinky.materialUiCore.materialUiCoreStrings.display1 = "display1".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.display1]
    
    @scala.inline
    def display2: typingsSlinky.materialUiCore.materialUiCoreStrings.display2 = "display2".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.display2]
    
    @scala.inline
    def display3: typingsSlinky.materialUiCore.materialUiCoreStrings.display3 = "display3".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.display3]
    
    @scala.inline
    def display4: typingsSlinky.materialUiCore.materialUiCoreStrings.display4 = "display4".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.display4]
    
    @scala.inline
    def h1: typingsSlinky.materialUiCore.materialUiCoreStrings.h1 = "h1".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.h1]
    
    @scala.inline
    def h2: typingsSlinky.materialUiCore.materialUiCoreStrings.h2 = "h2".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.h2]
    
    @scala.inline
    def h3: typingsSlinky.materialUiCore.materialUiCoreStrings.h3 = "h3".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.h3]
    
    @scala.inline
    def h4: typingsSlinky.materialUiCore.materialUiCoreStrings.h4 = "h4".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.h4]
    
    @scala.inline
    def h5: typingsSlinky.materialUiCore.materialUiCoreStrings.h5 = "h5".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.h5]
    
    @scala.inline
    def h6: typingsSlinky.materialUiCore.materialUiCoreStrings.h6 = "h6".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.h6]
    
    @scala.inline
    def headline: typingsSlinky.materialUiCore.materialUiCoreStrings.headline = "headline".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.headline]
    
    @scala.inline
    def overline: typingsSlinky.materialUiCore.materialUiCoreStrings.overline = "overline".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.overline]
    
    @scala.inline
    def subheading: typingsSlinky.materialUiCore.materialUiCoreStrings.subheading = "subheading".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.subheading]
    
    @scala.inline
    def subtitle1: typingsSlinky.materialUiCore.materialUiCoreStrings.subtitle1 = "subtitle1".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.subtitle1]
    
    @scala.inline
    def subtitle2: typingsSlinky.materialUiCore.materialUiCoreStrings.subtitle2 = "subtitle2".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.subtitle2]
    
    @scala.inline
    def title: typingsSlinky.materialUiCore.materialUiCoreStrings.title = "title".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.title]
  }
  
  /* Inlined parent std.Record<@material-ui/core.@material-ui/core/styles/createTypography.ThemeStyle, @material-ui/core.@material-ui/core/styles/createTypography.TypographyStyle> */
  /* Inlined parent @material-ui/core.@material-ui/core/styles/createTypography.FontStyle */
  /* Inlined parent @material-ui/core.@material-ui/core/styles/createTypography.TypographyUtils */
  @js.native
  trait Typography extends StObject {
    
    var body1: TypographyStyle = js.native
    
    var body2: TypographyStyle = js.native
    
    var button: TypographyStyle = js.native
    
    var caption: TypographyStyle = js.native
    
    var display1: TypographyStyle = js.native
    
    var display2: TypographyStyle = js.native
    
    var display3: TypographyStyle = js.native
    
    var display4: TypographyStyle = js.native
    
    var fontFamily: FontFamilyProperty = js.native
    
    var fontSize: Double = js.native
    
    var fontWeightLight: FontWeightProperty = js.native
    
    var fontWeightMedium: FontWeightProperty = js.native
    
    var fontWeightRegular: FontWeightProperty = js.native
    
    var h1: TypographyStyle = js.native
    
    var h2: TypographyStyle = js.native
    
    var h3: TypographyStyle = js.native
    
    var h4: TypographyStyle = js.native
    
    var h5: TypographyStyle = js.native
    
    var h6: TypographyStyle = js.native
    
    var headline: TypographyStyle = js.native
    
    var overline: TypographyStyle = js.native
    
    def pxToRem(px: Double): String = js.native
    
    var subheading: TypographyStyle = js.native
    
    var subtitle1: TypographyStyle = js.native
    
    var subtitle2: TypographyStyle = js.native
    
    var title: TypographyStyle = js.native
  }
  object Typography {
    
    @scala.inline
    def apply(
      body1: TypographyStyle,
      body2: TypographyStyle,
      button: TypographyStyle,
      caption: TypographyStyle,
      display1: TypographyStyle,
      display2: TypographyStyle,
      display3: TypographyStyle,
      display4: TypographyStyle,
      fontFamily: FontFamilyProperty,
      fontSize: Double,
      fontWeightLight: FontWeightProperty,
      fontWeightMedium: FontWeightProperty,
      fontWeightRegular: FontWeightProperty,
      h1: TypographyStyle,
      h2: TypographyStyle,
      h3: TypographyStyle,
      h4: TypographyStyle,
      h5: TypographyStyle,
      h6: TypographyStyle,
      headline: TypographyStyle,
      overline: TypographyStyle,
      pxToRem: Double => String,
      subheading: TypographyStyle,
      subtitle1: TypographyStyle,
      subtitle2: TypographyStyle,
      title: TypographyStyle
    ): Typography = {
      val __obj = js.Dynamic.literal(body1 = body1.asInstanceOf[js.Any], body2 = body2.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], display1 = display1.asInstanceOf[js.Any], display2 = display2.asInstanceOf[js.Any], display3 = display3.asInstanceOf[js.Any], display4 = display4.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeightLight = fontWeightLight.asInstanceOf[js.Any], fontWeightMedium = fontWeightMedium.asInstanceOf[js.Any], fontWeightRegular = fontWeightRegular.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], headline = headline.asInstanceOf[js.Any], overline = overline.asInstanceOf[js.Any], pxToRem = js.Any.fromFunction1(pxToRem), subheading = subheading.asInstanceOf[js.Any], subtitle1 = subtitle1.asInstanceOf[js.Any], subtitle2 = subtitle2.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typography]
    }
    
    @scala.inline
    implicit class TypographyMutableBuilder[Self <: Typography] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody1(value: TypographyStyle): Self = StObject.set(x, "body1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody2(value: TypographyStyle): Self = StObject.set(x, "body2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton(value: TypographyStyle): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption(value: TypographyStyle): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay1(value: TypographyStyle): Self = StObject.set(x, "display1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay2(value: TypographyStyle): Self = StObject.set(x, "display2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay3(value: TypographyStyle): Self = StObject.set(x, "display3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay4(value: TypographyStyle): Self = StObject.set(x, "display4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamily(value: FontFamilyProperty): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightLight(value: FontWeightProperty): Self = StObject.set(x, "fontWeightLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightMedium(value: FontWeightProperty): Self = StObject.set(x, "fontWeightMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightRegular(value: FontWeightProperty): Self = StObject.set(x, "fontWeightRegular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH1(value: TypographyStyle): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH2(value: TypographyStyle): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH3(value: TypographyStyle): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH4(value: TypographyStyle): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH5(value: TypographyStyle): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH6(value: TypographyStyle): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadline(value: TypographyStyle): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverline(value: TypographyStyle): Self = StObject.set(x, "overline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPxToRem(value: Double => String): Self = StObject.set(x, "pxToRem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubheading(value: TypographyStyle): Self = StObject.set(x, "subheading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle1(value: TypographyStyle): Self = StObject.set(x, "subtitle1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle2(value: TypographyStyle): Self = StObject.set(x, "subtitle2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: TypographyStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<std.Record<@material-ui/core.@material-ui/core/styles/createTypography.ThemeStyle, @material-ui/core.@material-ui/core/styles/createTypography.TypographyStyleOptions> & @material-ui/core.@material-ui/core/styles/createTypography.FontStyleOptions> */
  @js.native
  trait TypographyOptions extends StObject {
    
    var allVariants: js.UndefOr[CSSProperties] = js.native
    
    var body1: js.UndefOr[TypographyStyleOptions] = js.native
    
    var body2: js.UndefOr[TypographyStyleOptions] = js.native
    
    var button: js.UndefOr[TypographyStyleOptions] = js.native
    
    var caption: js.UndefOr[TypographyStyleOptions] = js.native
    
    var display1: js.UndefOr[TypographyStyleOptions] = js.native
    
    var display2: js.UndefOr[TypographyStyleOptions] = js.native
    
    var display3: js.UndefOr[TypographyStyleOptions] = js.native
    
    var display4: js.UndefOr[TypographyStyleOptions] = js.native
    
    var fontFamily: js.UndefOr[FontFamilyProperty] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var fontWeightLight: js.UndefOr[FontWeightProperty] = js.native
    
    var fontWeightMedium: js.UndefOr[FontWeightProperty] = js.native
    
    var fontWeightRegular: js.UndefOr[FontWeightProperty] = js.native
    
    var h1: js.UndefOr[TypographyStyleOptions] = js.native
    
    var h2: js.UndefOr[TypographyStyleOptions] = js.native
    
    var h3: js.UndefOr[TypographyStyleOptions] = js.native
    
    var h4: js.UndefOr[TypographyStyleOptions] = js.native
    
    var h5: js.UndefOr[TypographyStyleOptions] = js.native
    
    var h6: js.UndefOr[TypographyStyleOptions] = js.native
    
    var headline: js.UndefOr[TypographyStyleOptions] = js.native
    
    var htmlFontSize: js.UndefOr[Double] = js.native
    
    var overline: js.UndefOr[TypographyStyleOptions] = js.native
    
    var subheading: js.UndefOr[TypographyStyleOptions] = js.native
    
    var subtitle1: js.UndefOr[TypographyStyleOptions] = js.native
    
    var subtitle2: js.UndefOr[TypographyStyleOptions] = js.native
    
    var title: js.UndefOr[TypographyStyleOptions] = js.native
    
    var useNextVariants: js.UndefOr[Boolean] = js.native
  }
  object TypographyOptions {
    
    @scala.inline
    def apply(): TypographyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypographyOptions]
    }
    
    @scala.inline
    implicit class TypographyOptionsMutableBuilder[Self <: TypographyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllVariants(value: CSSProperties): Self = StObject.set(x, "allVariants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllVariantsUndefined: Self = StObject.set(x, "allVariants", js.undefined)
      
      @scala.inline
      def setBody1(value: TypographyStyleOptions): Self = StObject.set(x, "body1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody1Undefined: Self = StObject.set(x, "body1", js.undefined)
      
      @scala.inline
      def setBody2(value: TypographyStyleOptions): Self = StObject.set(x, "body2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody2Undefined: Self = StObject.set(x, "body2", js.undefined)
      
      @scala.inline
      def setButton(value: TypographyStyleOptions): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setCaption(value: TypographyStyleOptions): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setDisplay1(value: TypographyStyleOptions): Self = StObject.set(x, "display1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay1Undefined: Self = StObject.set(x, "display1", js.undefined)
      
      @scala.inline
      def setDisplay2(value: TypographyStyleOptions): Self = StObject.set(x, "display2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay2Undefined: Self = StObject.set(x, "display2", js.undefined)
      
      @scala.inline
      def setDisplay3(value: TypographyStyleOptions): Self = StObject.set(x, "display3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay3Undefined: Self = StObject.set(x, "display3", js.undefined)
      
      @scala.inline
      def setDisplay4(value: TypographyStyleOptions): Self = StObject.set(x, "display4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay4Undefined: Self = StObject.set(x, "display4", js.undefined)
      
      @scala.inline
      def setFontFamily(value: FontFamilyProperty): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontWeightLight(value: FontWeightProperty): Self = StObject.set(x, "fontWeightLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightLightUndefined: Self = StObject.set(x, "fontWeightLight", js.undefined)
      
      @scala.inline
      def setFontWeightMedium(value: FontWeightProperty): Self = StObject.set(x, "fontWeightMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightMediumUndefined: Self = StObject.set(x, "fontWeightMedium", js.undefined)
      
      @scala.inline
      def setFontWeightRegular(value: FontWeightProperty): Self = StObject.set(x, "fontWeightRegular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightRegularUndefined: Self = StObject.set(x, "fontWeightRegular", js.undefined)
      
      @scala.inline
      def setH1(value: TypographyStyleOptions): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
      
      @scala.inline
      def setH2(value: TypographyStyleOptions): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
      
      @scala.inline
      def setH3(value: TypographyStyleOptions): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
      
      @scala.inline
      def setH4(value: TypographyStyleOptions): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
      
      @scala.inline
      def setH5(value: TypographyStyleOptions): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH5Undefined: Self = StObject.set(x, "h5", js.undefined)
      
      @scala.inline
      def setH6(value: TypographyStyleOptions): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH6Undefined: Self = StObject.set(x, "h6", js.undefined)
      
      @scala.inline
      def setHeadline(value: TypographyStyleOptions): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
      
      @scala.inline
      def setHtmlFontSize(value: Double): Self = StObject.set(x, "htmlFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlFontSizeUndefined: Self = StObject.set(x, "htmlFontSize", js.undefined)
      
      @scala.inline
      def setOverline(value: TypographyStyleOptions): Self = StObject.set(x, "overline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlineUndefined: Self = StObject.set(x, "overline", js.undefined)
      
      @scala.inline
      def setSubheading(value: TypographyStyleOptions): Self = StObject.set(x, "subheading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubheadingUndefined: Self = StObject.set(x, "subheading", js.undefined)
      
      @scala.inline
      def setSubtitle1(value: TypographyStyleOptions): Self = StObject.set(x, "subtitle1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle1Undefined: Self = StObject.set(x, "subtitle1", js.undefined)
      
      @scala.inline
      def setSubtitle2(value: TypographyStyleOptions): Self = StObject.set(x, "subtitle2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle2Undefined: Self = StObject.set(x, "subtitle2", js.undefined)
      
      @scala.inline
      def setTitle(value: TypographyStyleOptions): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUseNextVariants(value: Boolean): Self = StObject.set(x, "useNextVariants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNextVariantsUndefined: Self = StObject.set(x, "useNextVariants", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties, 'fontFamily' | 'fontSize' | 'fontWeight' | 'color'>> & std.Partial<std.Pick<@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties, 'letterSpacing' | 'lineHeight' | 'textTransform'>> */
  @js.native
  trait TypographyStyle extends StObject {
    
    var color: ColorProperty = js.native
    
    var fontFamily: FontFamilyProperty = js.native
    
    var fontSize: FontSizeProperty[Double | String] = js.native
    
    var fontWeight: FontWeightProperty = js.native
    
    var letterSpacing: js.UndefOr[LetterSpacingProperty[Double | String]] = js.native
    
    var lineHeight: js.UndefOr[LineHeightProperty[Double | String]] = js.native
    
    var textTransform: js.UndefOr[TextTransformProperty] = js.native
  }
  object TypographyStyle {
    
    @scala.inline
    def apply(
      color: ColorProperty,
      fontFamily: FontFamilyProperty,
      fontSize: FontSizeProperty[Double | String],
      fontWeight: FontWeightProperty
    ): TypographyStyle = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypographyStyle]
    }
    
    @scala.inline
    implicit class TypographyStyleMutableBuilder[Self <: TypographyStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: ColorProperty): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamily(value: FontFamilyProperty): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: FontSizeProperty[Double | String]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeight(value: FontWeightProperty): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacing(value: LetterSpacingProperty[Double | String]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLineHeight(value: LineHeightProperty[Double | String]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setTextTransform(value: TextTransformProperty): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createTypography.TypographyStyle> */
  @js.native
  trait TypographyStyleOptions extends StObject {
    
    var color: js.UndefOr[ColorProperty] = js.native
    
    var fontFamily: js.UndefOr[FontFamilyProperty] = js.native
    
    var fontSize: js.UndefOr[FontSizeProperty[Double | String]] = js.native
    
    var fontWeight: js.UndefOr[FontWeightProperty] = js.native
    
    var letterSpacing: js.UndefOr[LetterSpacingProperty[Double | String]] = js.native
    
    var lineHeight: js.UndefOr[LineHeightProperty[Double | String]] = js.native
    
    var textTransform: js.UndefOr[TextTransformProperty] = js.native
  }
  object TypographyStyleOptions {
    
    @scala.inline
    def apply(): TypographyStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypographyStyleOptions]
    }
    
    @scala.inline
    implicit class TypographyStyleOptionsMutableBuilder[Self <: TypographyStyleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: ColorProperty): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: FontFamilyProperty): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: FontSizeProperty[Double | String]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeightProperty): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: LetterSpacingProperty[Double | String]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLineHeight(value: LineHeightProperty[Double | String]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setTextTransform(value: TextTransformProperty): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
    }
  }
  
  @js.native
  trait TypographyUtils extends StObject {
    
    def pxToRem(px: Double): String = js.native
  }
  object TypographyUtils {
    
    @scala.inline
    def apply(pxToRem: Double => String): TypographyUtils = {
      val __obj = js.Dynamic.literal(pxToRem = js.Any.fromFunction1(pxToRem))
      __obj.asInstanceOf[TypographyUtils]
    }
    
    @scala.inline
    implicit class TypographyUtilsMutableBuilder[Self <: TypographyUtils] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPxToRem(value: Double => String): Self = StObject.set(x, "pxToRem", js.Any.fromFunction1(value))
    }
  }
}
