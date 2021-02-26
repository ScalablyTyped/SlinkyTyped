package typingsSlinky.extenso

import typingsSlinky.extenso.anon.Decimal
import typingsSlinky.extenso.anon.Type
import typingsSlinky.extenso.extensoStrings.br
import typingsSlinky.extenso.extensoStrings.currency
import typingsSlinky.extenso.extensoStrings.formal
import typingsSlinky.extenso.extensoStrings.informal
import typingsSlinky.extenso.extensoStrings.long
import typingsSlinky.extenso.extensoStrings.number
import typingsSlinky.extenso.extensoStrings.pt
import typingsSlinky.extenso.extensoStrings.short
import typingsSlinky.extenso.mod.Extenso.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("extenso", JSImport.Namespace)
  @js.native
  def apply(number: String): String = js.native
  @JSImport("extenso", JSImport.Namespace)
  @js.native
  def apply(number: String, options: Options): String = js.native
  @JSImport("extenso", JSImport.Namespace)
  @js.native
  def apply(number: Double): String = js.native
  @JSImport("extenso", JSImport.Namespace)
  @js.native
  def apply(number: Double, options: Options): String = js.native
  
  object Extenso {
    
    @js.native
    trait BaseOptions extends StObject {
      
      var locale: js.UndefOr[br | pt] = js.native
      
      var negative: js.UndefOr[formal | informal] = js.native
      
      var scale: js.UndefOr[short | long] = js.native
    }
    object BaseOptions {
      
      @scala.inline
      def apply(): BaseOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BaseOptions]
      }
      
      @scala.inline
      implicit class BaseOptionsMutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLocale(value: br | pt): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        @scala.inline
        def setNegative(value: formal | informal): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
        
        @scala.inline
        def setScale(value: short | long): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      }
    }
    
    @js.native
    trait CurrencyModeOptions
      extends BaseOptions
         with Options {
      
      var currency: js.UndefOr[Type] = js.native
      
      var mode: currency = js.native
    }
    object CurrencyModeOptions {
      
      @scala.inline
      def apply(mode: currency): CurrencyModeOptions = {
        val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
        __obj.asInstanceOf[CurrencyModeOptions]
      }
      
      @scala.inline
      implicit class CurrencyModeOptionsMutableBuilder[Self <: CurrencyModeOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurrency(value: Type): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        @scala.inline
        def setMode(value: currency): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait NumberModeOptions
      extends BaseOptions
         with Options {
      
      var mode: js.UndefOr[number] = js.native
      
      var number: js.UndefOr[Decimal] = js.native
    }
    object NumberModeOptions {
      
      @scala.inline
      def apply(): NumberModeOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NumberModeOptions]
      }
      
      @scala.inline
      implicit class NumberModeOptionsMutableBuilder[Self <: NumberModeOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMode(value: number): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        @scala.inline
        def setNumber(value: Decimal): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.extenso.mod.Extenso.NumberModeOptions
      - typingsSlinky.extenso.mod.Extenso.CurrencyModeOptions
    */
    trait Options extends StObject
    object Options {
      
      @scala.inline
      def CurrencyModeOptions(mode: currency): typingsSlinky.extenso.mod.Extenso.CurrencyModeOptions = {
        val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.extenso.mod.Extenso.CurrencyModeOptions]
      }
      
      @scala.inline
      def NumberModeOptions(): typingsSlinky.extenso.mod.Extenso.NumberModeOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.extenso.mod.Extenso.NumberModeOptions]
      }
    }
  }
}
