package typingsSlinky.javascriptTimeAgo

import typingsSlinky.javascriptTimeAgo.gradationMod.Gradation
import typingsSlinky.javascriptTimeAgo.gradationMod.Unit
import typingsSlinky.javascriptTimeAgo.localeMod.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleMod {
  
  type CustomFormatter = js.Function1[/* options */ CustomFormatterOptions, js.UndefOr[String]]
  
  @js.native
  trait CustomFormatterOptions extends StObject {
    
    var date: js.UndefOr[js.Date] = js.native
    
    var elapsed: Double = js.native
    
    var locale: Locale = js.native
    
    var now: Double = js.native
    
    var time: Double = js.native
  }
  object CustomFormatterOptions {
    
    @scala.inline
    def apply(elapsed: Double, locale: Locale, now: Double, time: Double): CustomFormatterOptions = {
      val __obj = js.Dynamic.literal(elapsed = elapsed.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomFormatterOptions]
    }
    
    @scala.inline
    implicit class CustomFormatterOptionsMutableBuilder[Self <: CustomFormatterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNow(value: Double): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.tiny
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time`
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.narrow
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.short
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.long
  */
  trait Flavour extends StObject
  object Flavour {
    
    @scala.inline
    def long: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.long = "long".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.long]
    
    @scala.inline
    def narrow: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.narrow = "narrow".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.narrow]
    
    @scala.inline
    def short: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.short = "short".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.short]
    
    @scala.inline
    def `short-time`: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time` = "short-time".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time`]
    
    @scala.inline
    def tiny: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.tiny = "tiny".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.tiny]
  }
  
  @js.native
  trait FormatStyle extends StObject {
    
    var custom: js.UndefOr[CustomFormatter] = js.native
    
    var flavour: js.UndefOr[js.Array[Flavour]] = js.native
    
    var format: js.UndefOr[js.Function2[/* date */ js.Date | Double, /* locale */ Locale, String]] = js.native
    
    var gradation: js.UndefOr[js.Array[Gradation]] = js.native
    
    var units: js.UndefOr[Unit] = js.native
  }
  object FormatStyle {
    
    @scala.inline
    def apply(): FormatStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatStyle]
    }
    
    @scala.inline
    implicit class FormatStyleMutableBuilder[Self <: FormatStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom(value: /* options */ CustomFormatterOptions => js.UndefOr[String]): Self = StObject.set(x, "custom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setFlavour(value: js.Array[Flavour]): Self = StObject.set(x, "flavour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlavourUndefined: Self = StObject.set(x, "flavour", js.undefined)
      
      @scala.inline
      def setFlavourVarargs(value: Flavour*): Self = StObject.set(x, "flavour", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: (/* date */ js.Date | Double, /* locale */ Locale) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGradation(value: js.Array[Gradation]): Self = StObject.set(x, "gradation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradationUndefined: Self = StObject.set(x, "gradation", js.undefined)
      
      @scala.inline
      def setGradationVarargs(value: Gradation*): Self = StObject.set(x, "gradation", js.Array(value :_*))
      
      @scala.inline
      def setUnits(value: Unit): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
}
