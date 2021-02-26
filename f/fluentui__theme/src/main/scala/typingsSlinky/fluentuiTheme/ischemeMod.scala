package typingsSlinky.fluentuiTheme

import typingsSlinky.fluentuiTheme.ieffectsMod.IEffects
import typingsSlinky.fluentuiTheme.ifontstylesMod.IFontStyles
import typingsSlinky.fluentuiTheme.ipaletteMod.IPalette
import typingsSlinky.fluentuiTheme.isemanticcolorsMod.ISemanticColors
import typingsSlinky.fluentuiTheme.ispacingMod.ISpacing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ischemeMod {
  
  @js.native
  trait IScheme extends StObject {
    
    /**
      * This setting is for a very narrow use case and you probably don't need to worry about,
      * unless you share a environment with others that also use fabric.
      * It is used for disabling global styles on fabric components. This will prevent global
      * overrides that might have been set by other fabric users from applying to your components.
      * When you set this setting to `true` on your theme the components in the subtree of your
      * Customizer will not get the global styles applied to them.
      */
    var disableGlobalClassNames: Boolean = js.native
    
    var effects: IEffects = js.native
    
    var fonts: IFontStyles = js.native
    
    var isInverted: Boolean = js.native
    
    var palette: IPalette = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var semanticColors: ISemanticColors = js.native
    
    /**
      * @internal
      * The spacing property is still in an experimental phase. The intent is to have it
      * be used for padding and margin sizes in a future release, but it is still undergoing review.
      * Avoid using it until it is finalized.
      */
    var spacing: ISpacing = js.native
  }
  object IScheme {
    
    @scala.inline
    def apply(
      disableGlobalClassNames: Boolean,
      effects: IEffects,
      fonts: IFontStyles,
      isInverted: Boolean,
      palette: IPalette,
      semanticColors: ISemanticColors,
      spacing: ISpacing
    ): IScheme = {
      val __obj = js.Dynamic.literal(disableGlobalClassNames = disableGlobalClassNames.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], isInverted = isInverted.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], semanticColors = semanticColors.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScheme]
    }
    
    @scala.inline
    implicit class ISchemeMutableBuilder[Self <: IScheme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableGlobalClassNames(value: Boolean): Self = StObject.set(x, "disableGlobalClassNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffects(value: IEffects): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFonts(value: IFontStyles): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInverted(value: Boolean): Self = StObject.set(x, "isInverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPalette(value: IPalette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setSemanticColors(value: ISemanticColors): Self = StObject.set(x, "semanticColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacing(value: ISpacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fluentuiTheme.fluentuiThemeStrings.default
    - typingsSlinky.fluentuiTheme.fluentuiThemeStrings.neutral
    - typingsSlinky.fluentuiTheme.fluentuiThemeStrings.soft
    - typingsSlinky.fluentuiTheme.fluentuiThemeStrings.strong
  */
  trait ISchemeNames extends StObject
  object ISchemeNames {
    
    @scala.inline
    def default: typingsSlinky.fluentuiTheme.fluentuiThemeStrings.default = "default".asInstanceOf[typingsSlinky.fluentuiTheme.fluentuiThemeStrings.default]
    
    @scala.inline
    def neutral: typingsSlinky.fluentuiTheme.fluentuiThemeStrings.neutral = "neutral".asInstanceOf[typingsSlinky.fluentuiTheme.fluentuiThemeStrings.neutral]
    
    @scala.inline
    def soft: typingsSlinky.fluentuiTheme.fluentuiThemeStrings.soft = "soft".asInstanceOf[typingsSlinky.fluentuiTheme.fluentuiThemeStrings.soft]
    
    @scala.inline
    def strong: typingsSlinky.fluentuiTheme.fluentuiThemeStrings.strong = "strong".asInstanceOf[typingsSlinky.fluentuiTheme.fluentuiThemeStrings.strong]
  }
}
