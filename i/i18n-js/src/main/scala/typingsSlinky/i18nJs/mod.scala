package typingsSlinky.i18nJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.i18nJs.anon.Message
import typingsSlinky.i18nJs.i18nJsStrings.currency
import typingsSlinky.i18nJs.i18nJsStrings.guess
import typingsSlinky.i18nJs.i18nJsStrings.message
import typingsSlinky.i18nJs.i18nJsStrings.number
import typingsSlinky.i18nJs.i18nJsStrings.percentage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i18n-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("i18n-js", "currentLocale")
  @js.native
  def currentLocale(): String = js.native
  
  @JSImport("i18n-js", "defaultLocale")
  @js.native
  def defaultLocale: String = js.native
  @scala.inline
  def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
  
  @JSImport("i18n-js", "defaultSeparator")
  @js.native
  def defaultSeparator: String = js.native
  @scala.inline
  def defaultSeparator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSeparator")(x.asInstanceOf[js.Any])
  
  @JSImport("i18n-js", "fallbacks")
  @js.native
  def fallbacks: Boolean | String | (StringDictionary[String | js.Array[String]]) = js.native
  @scala.inline
  def fallbacks_=(x: Boolean | String | (StringDictionary[String | js.Array[String]])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallbacks")(x.asInstanceOf[js.Any])
  
  // tslint:disable-next-line prefer-declare-function
  @JSImport("i18n-js", "getFullScope")
  @js.native
  def getFullScope: js.Function2[
    /* scope */ String | js.Array[String], 
    /* options */ js.UndefOr[TranslateOptions], 
    String
  ] = js.native
  @scala.inline
  def getFullScope_=(
    x: js.Function2[
      /* scope */ String | js.Array[String], 
      /* options */ js.UndefOr[TranslateOptions], 
      String
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFullScope")(x.asInstanceOf[js.Any])
  
  @JSImport("i18n-js", "l")
  @js.native
  def l(scope: Scope, value: String): String = js.native
  @JSImport("i18n-js", "l")
  @js.native
  def l(scope: Scope, value: String, options: InterpolateOptions): String = js.native
  @JSImport("i18n-js", "l")
  @js.native
  def l(scope: Scope, value: js.Date): String = js.native
  @JSImport("i18n-js", "l")
  @js.native
  def l(scope: Scope, value: js.Date, options: InterpolateOptions): String = js.native
  @JSImport("i18n-js", "l")
  @js.native
  def l(scope: Scope, value: Double): String = js.native
  @JSImport("i18n-js", "l")
  @js.native
  def l(scope: Scope, value: Double, options: InterpolateOptions): String = js.native
  @JSImport("i18n-js", "l")
  @js.native
  def l_currency(scope: currency, value: Double): String = js.native
  @JSImport("i18n-js", "l")
  @js.native
  def l_currency(scope: currency, value: Double, options: InterpolateOptions): String = js.native
  @JSImport("i18n-js", "l")
  @js.native
  def l_number(scope: number, value: Double): String = js.native
  @JSImport("i18n-js", "l")
  @js.native
  def l_number(scope: number, value: Double, options: InterpolateOptions): String = js.native
  @JSImport("i18n-js", "l")
  @js.native
  def l_percentage(scope: percentage, value: Double): String = js.native
  @JSImport("i18n-js", "l")
  @js.native
  def l_percentage(scope: percentage, value: Double, options: InterpolateOptions): String = js.native
  
  @JSImport("i18n-js", "locale")
  @js.native
  def locale: String = js.native
  @scala.inline
  def locale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
  
  @JSImport("i18n-js", "localize")
  @js.native
  def localize(scope: Scope, value: String): String = js.native
  @JSImport("i18n-js", "localize")
  @js.native
  def localize(scope: Scope, value: String, options: InterpolateOptions): String = js.native
  @JSImport("i18n-js", "localize")
  @js.native
  def localize(scope: Scope, value: js.Date): String = js.native
  @JSImport("i18n-js", "localize")
  @js.native
  def localize(scope: Scope, value: js.Date, options: InterpolateOptions): String = js.native
  @JSImport("i18n-js", "localize")
  @js.native
  def localize(scope: Scope, value: Double): String = js.native
  @JSImport("i18n-js", "localize")
  @js.native
  def localize(scope: Scope, value: Double, options: InterpolateOptions): String = js.native
  @JSImport("i18n-js", "localize")
  @js.native
  def localize_currency(scope: currency, value: Double): String = js.native
  @JSImport("i18n-js", "localize")
  @js.native
  def localize_currency(scope: currency, value: Double, options: InterpolateOptions): String = js.native
  @JSImport("i18n-js", "localize")
  @js.native
  def localize_number(scope: number, value: Double): String = js.native
  @JSImport("i18n-js", "localize")
  @js.native
  def localize_number(scope: number, value: Double, options: InterpolateOptions): String = js.native
  @JSImport("i18n-js", "localize")
  @js.native
  def localize_percentage(scope: percentage, value: Double): String = js.native
  @JSImport("i18n-js", "localize")
  @js.native
  def localize_percentage(scope: percentage, value: Double, options: InterpolateOptions): String = js.native
  
  @JSImport("i18n-js", "missingBehaviour")
  @js.native
  def missingBehaviour: message | guess = js.native
  @scala.inline
  def missingBehaviour_=(x: message | guess): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingBehaviour")(x.asInstanceOf[js.Any])
  
  // tslint:disable-next-line prefer-declare-function
  @JSImport("i18n-js", "missingPlaceholder")
  @js.native
  def missingPlaceholder: js.Function3[
    /* placeholder */ String, 
    /* message */ String, 
    /* options */ js.UndefOr[InterpolateOptions], 
    js.UndefOr[String | Null]
  ] = js.native
  @scala.inline
  def missingPlaceholder_=(
    x: js.Function3[
      /* placeholder */ String, 
      /* message */ String, 
      /* options */ js.UndefOr[InterpolateOptions], 
      js.UndefOr[String | Null]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingPlaceholder")(x.asInstanceOf[js.Any])
  
  // tslint:disable-next-line prefer-declare-function
  @JSImport("i18n-js", "missingTranslation")
  @js.native
  def missingTranslation: js.Function2[
    /* scope */ String, 
    /* options */ js.UndefOr[TranslateOptions], 
    js.UndefOr[String | Null]
  ] = js.native
  
  @JSImport("i18n-js", "missingTranslationPrefix")
  @js.native
  def missingTranslationPrefix: String = js.native
  @scala.inline
  def missingTranslationPrefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingTranslationPrefix")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def missingTranslation_=(
    x: js.Function2[
      /* scope */ String, 
      /* options */ js.UndefOr[TranslateOptions], 
      js.UndefOr[String | Null]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingTranslation")(x.asInstanceOf[js.Any])
  
  // tslint:disable-next-line prefer-declare-function
  @JSImport("i18n-js", "nullPlaceholder")
  @js.native
  def nullPlaceholder: js.Function3[
    /* placeholder */ String, 
    /* message */ String, 
    /* options */ js.UndefOr[InterpolateOptions], 
    js.UndefOr[String | Null]
  ] = js.native
  @scala.inline
  def nullPlaceholder_=(
    x: js.Function3[
      /* placeholder */ String, 
      /* message */ String, 
      /* options */ js.UndefOr[InterpolateOptions], 
      js.UndefOr[String | Null]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nullPlaceholder")(x.asInstanceOf[js.Any])
  
  @JSImport("i18n-js", "placeholder")
  @js.native
  def placeholder: js.RegExp = js.native
  @scala.inline
  def placeholder_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
  
  @JSImport("i18n-js", "reset")
  @js.native
  def reset(): Unit = js.native
  
  @JSImport("i18n-js", "strftime")
  @js.native
  def strftime(date: js.Date, format: String): String = js.native
  
  @JSImport("i18n-js", "t")
  @js.native
  def t(scope: Scope): String = js.native
  @JSImport("i18n-js", "t")
  @js.native
  def t(scope: Scope, options: TranslateOptions): String = js.native
  
  @JSImport("i18n-js", "toCurrency")
  @js.native
  def toCurrency(num: Double): String = js.native
  @JSImport("i18n-js", "toCurrency")
  @js.native
  def toCurrency(num: Double, options: ToCurrencyOptions): String = js.native
  
  @JSImport("i18n-js", "toHumanSize")
  @js.native
  def toHumanSize(num: Double): String = js.native
  @JSImport("i18n-js", "toHumanSize")
  @js.native
  def toHumanSize(num: Double, options: ToHumanSizeOptions): String = js.native
  
  @JSImport("i18n-js", "toNumber")
  @js.native
  def toNumber(num: Double): String = js.native
  @JSImport("i18n-js", "toNumber")
  @js.native
  def toNumber(num: Double, options: ToNumberOptions): String = js.native
  
  @JSImport("i18n-js", "toPercentage")
  @js.native
  def toPercentage(num: Double): String = js.native
  @JSImport("i18n-js", "toPercentage")
  @js.native
  def toPercentage(num: Double, options: ToPercentageOptions): String = js.native
  
  @JSImport("i18n-js", "toTime")
  @js.native
  def toTime(scope: Scope, value: String): String = js.native
  @JSImport("i18n-js", "toTime")
  @js.native
  def toTime(scope: Scope, value: js.Date): String = js.native
  @JSImport("i18n-js", "toTime")
  @js.native
  def toTime(scope: Scope, value: Double): String = js.native
  
  @JSImport("i18n-js", "translate")
  @js.native
  def translate(scope: Scope): String = js.native
  @JSImport("i18n-js", "translate")
  @js.native
  def translate(scope: Scope, options: TranslateOptions): String = js.native
  
  type InterpolateOptions = StringDictionary[js.Any]
  
  type Scope = String | js.Array[String]
  
  @js.native
  trait ToCurrencyOptions extends ToNumberOptions {
    
    var format: js.UndefOr[String] = js.native
    
    var sign_first: js.UndefOr[Boolean] = js.native
    
    var unit: js.UndefOr[String] = js.native
  }
  object ToCurrencyOptions {
    
    @scala.inline
    def apply(): ToCurrencyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToCurrencyOptions]
    }
    
    @scala.inline
    implicit class ToCurrencyOptionsMutableBuilder[Self <: ToCurrencyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setSign_first(value: Boolean): Self = StObject.set(x, "sign_first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSign_firstUndefined: Self = StObject.set(x, "sign_first", js.undefined)
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  @js.native
  trait ToHumanSizeOptions extends ToNumberOptions {
    
    var format: js.UndefOr[String] = js.native
  }
  object ToHumanSizeOptions {
    
    @scala.inline
    def apply(): ToHumanSizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToHumanSizeOptions]
    }
    
    @scala.inline
    implicit class ToHumanSizeOptionsMutableBuilder[Self <: ToHumanSizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  @js.native
  trait ToNumberOptions extends StObject {
    
    var delimiter: js.UndefOr[String] = js.native
    
    var precision: js.UndefOr[Double] = js.native
    
    var separator: js.UndefOr[String] = js.native
    
    var strip_insignificant_zeros: js.UndefOr[Boolean] = js.native
  }
  object ToNumberOptions {
    
    @scala.inline
    def apply(): ToNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToNumberOptions]
    }
    
    @scala.inline
    implicit class ToNumberOptionsMutableBuilder[Self <: ToNumberOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setStrip_insignificant_zeros(value: Boolean): Self = StObject.set(x, "strip_insignificant_zeros", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrip_insignificant_zerosUndefined: Self = StObject.set(x, "strip_insignificant_zeros", js.undefined)
    }
  }
  
  type ToPercentageOptions = ToNumberOptions
  
  @js.native
  trait TranslateOptions extends InterpolateOptions {
    
    var defaultValue: js.UndefOr[String] = js.native
    
    var defaults: js.UndefOr[js.Array[Message | typingsSlinky.i18nJs.anon.Scope]] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[Scope] = js.native
  }
  object TranslateOptions {
    
    @scala.inline
    def apply(): TranslateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TranslateOptions]
    }
    
    @scala.inline
    implicit class TranslateOptionsMutableBuilder[Self <: TranslateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaults(value: js.Array[Message | typingsSlinky.i18nJs.anon.Scope]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setDefaultsVarargs(value: (Message | typingsSlinky.i18nJs.anon.Scope)*): Self = StObject.set(x, "defaults", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
}
