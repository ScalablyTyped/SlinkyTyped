package typingsSlinky.chartjsPluginColorschemes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chartjs-plugin-colorschemes", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.PluginServiceGlobalRegistration */ js.Any = js.native
  
  @js.native
  trait ColorSchemesOptions extends StObject {
    
    var custom: js.UndefOr[js.Function1[/* schemeColors */ js.Array[String], js.Array[String] | Unit]] = js.native
    
    var fillAlpha: js.UndefOr[Double] = js.native
    
    var `override`: js.UndefOr[Boolean] = js.native
    
    var reverse: js.UndefOr[Boolean] = js.native
    
    var scheme: String | js.Array[String] = js.native
  }
  object ColorSchemesOptions {
    
    @scala.inline
    def apply(scheme: String | js.Array[String]): ColorSchemesOptions = {
      val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorSchemesOptions]
    }
    
    @scala.inline
    implicit class ColorSchemesOptionsMutableBuilder[Self <: ColorSchemesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom(value: /* schemeColors */ js.Array[String] => js.Array[String] | Unit): Self = StObject.set(x, "custom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setFillAlpha(value: Double): Self = StObject.set(x, "fillAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillAlphaUndefined: Self = StObject.set(x, "fillAlpha", js.undefined)
      
      @scala.inline
      def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setScheme(value: String | js.Array[String]): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemeVarargs(value: String*): Self = StObject.set(x, "scheme", js.Array(value :_*))
    }
  }
  
  /* augmented module */
  object chartJsAugmentingMod {
    
    @js.native
    trait ChartPluginsOptions extends StObject {
      
      var colorschemes: js.UndefOr[ColorSchemesOptions] = js.native
    }
    object ChartPluginsOptions {
      
      @scala.inline
      def apply(): ChartPluginsOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChartPluginsOptions]
      }
      
      @scala.inline
      implicit class ChartPluginsOptionsMutableBuilder[Self <: ChartPluginsOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColorschemes(value: ColorSchemesOptions): Self = StObject.set(x, "colorschemes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorschemesUndefined: Self = StObject.set(x, "colorschemes", js.undefined)
      }
    }
  }
}
