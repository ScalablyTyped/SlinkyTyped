package typingsSlinky.humanizeDuration

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("humanize-duration", JSImport.Namespace)
  @js.native
  def apply(ms: Double): String = js.native
  @JSImport("humanize-duration", JSImport.Namespace)
  @js.native
  def apply(ms: Double, options: Options): String = js.native
  
  /**
    * This function won't return any new languages you define; it will only return the defaults supported by the library.
    */
  @JSImport("humanize-duration", "getSupportedLanguages")
  @js.native
  def getSupportedLanguages(): js.Array[LanguageCode] = js.native
  
  @JSImport("humanize-duration", "humanizer")
  @js.native
  def humanizer(): Humanizer_ = js.native
  @JSImport("humanize-duration", "humanizer")
  @js.native
  def humanizer(options: HumanizerOptions): Humanizer_ = js.native
  
  @js.native
  trait HumanizerOptions extends Options {
    
    var languages: js.UndefOr[StringDictionary[UnitTranslationOptions]] = js.native
  }
  object HumanizerOptions {
    
    @scala.inline
    def apply(): HumanizerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HumanizerOptions]
    }
    
    @scala.inline
    implicit class HumanizerOptionsMutableBuilder[Self <: HumanizerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguages(value: StringDictionary[UnitTranslationOptions]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    }
  }
  
  @js.native
  trait Humanizer_ extends StObject {
    
    def apply(ms: Double): String = js.native
    def apply(ms: Double, options: Options): String = js.native
    
    var languages: StringDictionary[UnitTranslationOptions] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.ar
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.bg
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.ca
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.zh_CN
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.zh_TW
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.hr
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.cs
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.da
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.nl
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.en
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.fa
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.fi
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.fr
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.de
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.el
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.hu
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.is
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.id
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.it
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.ja
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.ko
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.lo
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.lt
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.ms
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.no
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.pl
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.pt
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.ro
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.ru
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.sk
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.es
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.sv
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.tr
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.th
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.uk
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.ur
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.vi
  */
  trait LanguageCode extends StObject
  object LanguageCode {
    
    @scala.inline
    def ar: typingsSlinky.humanizeDuration.humanizeDurationStrings.ar = "ar".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.ar]
    
    @scala.inline
    def bg: typingsSlinky.humanizeDuration.humanizeDurationStrings.bg = "bg".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.bg]
    
    @scala.inline
    def ca: typingsSlinky.humanizeDuration.humanizeDurationStrings.ca = "ca".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.ca]
    
    @scala.inline
    def cs: typingsSlinky.humanizeDuration.humanizeDurationStrings.cs = "cs".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.cs]
    
    @scala.inline
    def da: typingsSlinky.humanizeDuration.humanizeDurationStrings.da = "da".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.da]
    
    @scala.inline
    def de: typingsSlinky.humanizeDuration.humanizeDurationStrings.de = "de".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.de]
    
    @scala.inline
    def el: typingsSlinky.humanizeDuration.humanizeDurationStrings.el = "el".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.el]
    
    @scala.inline
    def en: typingsSlinky.humanizeDuration.humanizeDurationStrings.en = "en".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.en]
    
    @scala.inline
    def es: typingsSlinky.humanizeDuration.humanizeDurationStrings.es = "es".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.es]
    
    @scala.inline
    def fa: typingsSlinky.humanizeDuration.humanizeDurationStrings.fa = "fa".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.fa]
    
    @scala.inline
    def fi: typingsSlinky.humanizeDuration.humanizeDurationStrings.fi = "fi".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.fi]
    
    @scala.inline
    def fr: typingsSlinky.humanizeDuration.humanizeDurationStrings.fr = "fr".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.fr]
    
    @scala.inline
    def hr: typingsSlinky.humanizeDuration.humanizeDurationStrings.hr = "hr".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.hr]
    
    @scala.inline
    def hu: typingsSlinky.humanizeDuration.humanizeDurationStrings.hu = "hu".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.hu]
    
    @scala.inline
    def id: typingsSlinky.humanizeDuration.humanizeDurationStrings.id = "id".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.id]
    
    @scala.inline
    def is: typingsSlinky.humanizeDuration.humanizeDurationStrings.is = "is".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.is]
    
    @scala.inline
    def it: typingsSlinky.humanizeDuration.humanizeDurationStrings.it = "it".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.it]
    
    @scala.inline
    def ja: typingsSlinky.humanizeDuration.humanizeDurationStrings.ja = "ja".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.ja]
    
    @scala.inline
    def ko: typingsSlinky.humanizeDuration.humanizeDurationStrings.ko = "ko".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.ko]
    
    @scala.inline
    def lo: typingsSlinky.humanizeDuration.humanizeDurationStrings.lo = "lo".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.lo]
    
    @scala.inline
    def lt: typingsSlinky.humanizeDuration.humanizeDurationStrings.lt = "lt".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.lt]
    
    @scala.inline
    def ms: typingsSlinky.humanizeDuration.humanizeDurationStrings.ms = "ms".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.ms]
    
    @scala.inline
    def nl: typingsSlinky.humanizeDuration.humanizeDurationStrings.nl = "nl".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.nl]
    
    @scala.inline
    def no: typingsSlinky.humanizeDuration.humanizeDurationStrings.no = "no".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.no]
    
    @scala.inline
    def pl: typingsSlinky.humanizeDuration.humanizeDurationStrings.pl = "pl".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.pl]
    
    @scala.inline
    def pt: typingsSlinky.humanizeDuration.humanizeDurationStrings.pt = "pt".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.pt]
    
    @scala.inline
    def ro: typingsSlinky.humanizeDuration.humanizeDurationStrings.ro = "ro".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.ro]
    
    @scala.inline
    def ru: typingsSlinky.humanizeDuration.humanizeDurationStrings.ru = "ru".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.ru]
    
    @scala.inline
    def sk: typingsSlinky.humanizeDuration.humanizeDurationStrings.sk = "sk".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.sk]
    
    @scala.inline
    def sv: typingsSlinky.humanizeDuration.humanizeDurationStrings.sv = "sv".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.sv]
    
    @scala.inline
    def th: typingsSlinky.humanizeDuration.humanizeDurationStrings.th = "th".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.th]
    
    @scala.inline
    def tr: typingsSlinky.humanizeDuration.humanizeDurationStrings.tr = "tr".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.tr]
    
    @scala.inline
    def uk: typingsSlinky.humanizeDuration.humanizeDurationStrings.uk = "uk".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.uk]
    
    @scala.inline
    def ur: typingsSlinky.humanizeDuration.humanizeDurationStrings.ur = "ur".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.ur]
    
    @scala.inline
    def vi: typingsSlinky.humanizeDuration.humanizeDurationStrings.vi = "vi".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.vi]
    
    @scala.inline
    def zh_CN: typingsSlinky.humanizeDuration.humanizeDurationStrings.zh_CN = "zh_CN".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.zh_CN]
    
    @scala.inline
    def zh_TW: typingsSlinky.humanizeDuration.humanizeDurationStrings.zh_TW = "zh_TW".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.zh_TW]
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * String to include before the final unit. You can also set serialComma to false to eliminate the final comma.
      */
    var conjunction: js.UndefOr[String] = js.native
    
    /**
      * String to substitute for the decimal point in a decimal fraction.
      */
    var decimal: js.UndefOr[String] = js.native
    
    /**
      * String to display between the previous unit and the next value.
      */
    var delimiter: js.UndefOr[String] = js.native
    
    /**
      * Fallback languages if the provided language cannot be found (accepts an ISO 639-1 code from one of the supported languages). It works from left to right.
      */
    var fallbacks: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Language for unit display (accepts an ISO 639-1 code from one of the supported languages).
      */
    var language: js.UndefOr[String] = js.native
    
    /**
      * Number representing the maximum number of units to display for the duration.
      */
    var largest: js.UndefOr[Double] = js.native
    
    /**
      * Number that defines a maximal decimal points for float values.
      */
    var maxDecimalPoints: js.UndefOr[Double] = js.native
    
    /**
      * Boolean value. Use true to round the smallest unit displayed (can be combined with largest and units).
      */
    var round: js.UndefOr[Boolean] = js.native
    
    var serialComma: js.UndefOr[Boolean] = js.native
    
    /**
      * String to display between each value and unit.
      */
    var spacer: js.UndefOr[String] = js.native
    
    /**
      * Customize the value used to calculate each unit of time.
      */
    var unitMeasures: js.UndefOr[UnitMeasuresOptions] = js.native
    
    /**
      * Array of strings to define which units are used to display the duration (if needed).
      */
    var units: js.UndefOr[js.Array[Unit]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConjunction(value: String): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConjunctionUndefined: Self = StObject.set(x, "conjunction", js.undefined)
      
      @scala.inline
      def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setFallbacks(value: js.Array[String]): Self = StObject.set(x, "fallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbacksUndefined: Self = StObject.set(x, "fallbacks", js.undefined)
      
      @scala.inline
      def setFallbacksVarargs(value: String*): Self = StObject.set(x, "fallbacks", js.Array(value :_*))
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLargest(value: Double): Self = StObject.set(x, "largest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargestUndefined: Self = StObject.set(x, "largest", js.undefined)
      
      @scala.inline
      def setMaxDecimalPoints(value: Double): Self = StObject.set(x, "maxDecimalPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDecimalPointsUndefined: Self = StObject.set(x, "maxDecimalPoints", js.undefined)
      
      @scala.inline
      def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setSerialComma(value: Boolean): Self = StObject.set(x, "serialComma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialCommaUndefined: Self = StObject.set(x, "serialComma", js.undefined)
      
      @scala.inline
      def setSpacer(value: String): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
      
      @scala.inline
      def setUnitMeasures(value: UnitMeasuresOptions): Self = StObject.set(x, "unitMeasures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitMeasuresUndefined: Self = StObject.set(x, "unitMeasures", js.undefined)
      
      @scala.inline
      def setUnits(value: js.Array[Unit]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      @scala.inline
      def setUnitsVarargs(value: Unit*): Self = StObject.set(x, "units", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.y
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.mo
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.w
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.d
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.h
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.m
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.s
    - typingsSlinky.humanizeDuration.humanizeDurationStrings.ms
  */
  trait Unit extends StObject
  object Unit {
    
    @scala.inline
    def d: typingsSlinky.humanizeDuration.humanizeDurationStrings.d = "d".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.d]
    
    @scala.inline
    def h: typingsSlinky.humanizeDuration.humanizeDurationStrings.h = "h".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.h]
    
    @scala.inline
    def m: typingsSlinky.humanizeDuration.humanizeDurationStrings.m = "m".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.m]
    
    @scala.inline
    def mo: typingsSlinky.humanizeDuration.humanizeDurationStrings.mo = "mo".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.mo]
    
    @scala.inline
    def ms: typingsSlinky.humanizeDuration.humanizeDurationStrings.ms = "ms".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.ms]
    
    @scala.inline
    def s: typingsSlinky.humanizeDuration.humanizeDurationStrings.s = "s".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.s]
    
    @scala.inline
    def w: typingsSlinky.humanizeDuration.humanizeDurationStrings.w = "w".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.w]
    
    @scala.inline
    def y: typingsSlinky.humanizeDuration.humanizeDurationStrings.y = "y".asInstanceOf[typingsSlinky.humanizeDuration.humanizeDurationStrings.y]
  }
  
  @js.native
  trait UnitMeasuresOptions extends StObject {
    
    var d: js.UndefOr[Double] = js.native
    
    var h: js.UndefOr[Double] = js.native
    
    var m: js.UndefOr[Double] = js.native
    
    var mo: js.UndefOr[Double] = js.native
    
    var ms: js.UndefOr[Double] = js.native
    
    var s: js.UndefOr[Double] = js.native
    
    var w: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object UnitMeasuresOptions {
    
    @scala.inline
    def apply(): UnitMeasuresOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnitMeasuresOptions]
    }
    
    @scala.inline
    implicit class UnitMeasuresOptionsMutableBuilder[Self <: UnitMeasuresOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      @scala.inline
      def setMo(value: Double): Self = StObject.set(x, "mo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoUndefined: Self = StObject.set(x, "mo", js.undefined)
      
      @scala.inline
      def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait UnitTranslationOptions extends StObject {
    
    var d: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
    
    var h: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
    
    var m: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
    
    var mo: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
    
    var ms: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
    
    var s: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
    
    var w: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
    
    var y: js.UndefOr[js.Function1[/* count */ js.UndefOr[Double], String]] = js.native
  }
  object UnitTranslationOptions {
    
    @scala.inline
    def apply(): UnitTranslationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnitTranslationOptions]
    }
    
    @scala.inline
    implicit class UnitTranslationOptionsMutableBuilder[Self <: UnitTranslationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "d", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      @scala.inline
      def setH(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "h", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setM(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "m", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      @scala.inline
      def setMo(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "mo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMoUndefined: Self = StObject.set(x, "mo", js.undefined)
      
      @scala.inline
      def setMs(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "ms", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
      
      @scala.inline
      def setS(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "s", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      @scala.inline
      def setW(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "w", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      @scala.inline
      def setY(value: /* count */ js.UndefOr[Double] => String): Self = StObject.set(x, "y", js.Any.fromFunction1(value))
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
