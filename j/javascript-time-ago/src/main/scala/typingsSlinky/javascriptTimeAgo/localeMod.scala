package typingsSlinky.javascriptTimeAgo

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.two
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.long
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.short
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.narrow
  */
  trait DefaultFormats extends StObject
  object DefaultFormats {
    
    @scala.inline
    def long: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.long = "long".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.long]
    
    @scala.inline
    def narrow: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.narrow = "narrow".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.narrow]
    
    @scala.inline
    def short: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.short = "short".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.short]
  }
  
  @js.native
  trait Duration extends StObject {
    
    var day: Tense = js.native
    
    var flavour: js.UndefOr[Formats] = js.native
    
    var hour: Tense = js.native
    
    var minute: Tense = js.native
    
    var month: Tense = js.native
    
    var quarter: Tense = js.native
    
    var second: Tense = js.native
    
    var week: Tense = js.native
    
    var year: Tense = js.native
  }
  object Duration {
    
    @scala.inline
    def apply(
      day: Tense,
      hour: Tense,
      minute: Tense,
      month: Tense,
      quarter: Tense,
      second: Tense,
      week: Tense,
      year: Tense
    ): Duration = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], quarter = quarter.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Duration]
    }
    
    @scala.inline
    implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: Tense): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlavour(value: Formats): Self = StObject.set(x, "flavour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlavourUndefined: Self = StObject.set(x, "flavour", js.undefined)
      
      @scala.inline
      def setHour(value: Tense): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinute(value: Tense): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: Tense): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuarter(value: Tense): Self = StObject.set(x, "quarter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecond(value: Tense): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeek(value: Tense): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: Tense): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.tiny
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time`
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-convenient`
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`long-time`
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`long-convenient`
  */
  trait ExtendedFormats extends StObject
  object ExtendedFormats {
    
    @scala.inline
    def `long-convenient`: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`long-convenient` = "long-convenient".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`long-convenient`]
    
    @scala.inline
    def `long-time`: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`long-time` = "long-time".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`long-time`]
    
    @scala.inline
    def `short-convenient`: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-convenient` = "short-convenient".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-convenient`]
    
    @scala.inline
    def `short-time`: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time` = "short-time".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time`]
    
    @scala.inline
    def tiny: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.tiny = "tiny".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.long
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.short
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.narrow
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.tiny
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time`
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-convenient`
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`long-time`
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`long-convenient`
  */
  trait Formats extends StObject
  object Formats {
    
    @scala.inline
    def long: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.long = "long".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.long]
    
    @scala.inline
    def `long-convenient`: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`long-convenient` = "long-convenient".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`long-convenient`]
    
    @scala.inline
    def `long-time`: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`long-time` = "long-time".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`long-time`]
    
    @scala.inline
    def narrow: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.narrow = "narrow".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.narrow]
    
    @scala.inline
    def short: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.short = "short".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.short]
    
    @scala.inline
    def `short-convenient`: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-convenient` = "short-convenient".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-convenient`]
    
    @scala.inline
    def `short-time`: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time` = "short-time".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time`]
    
    @scala.inline
    def tiny: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.tiny = "tiny".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.tiny]
  }
  
  @js.native
  trait Locale extends StObject {
    
    var locale: String = js.native
    
    var long: js.UndefOr[Duration] = js.native
    
    var `long-convenient`: js.UndefOr[Duration] = js.native
    
    var `long-time`: js.UndefOr[Duration] = js.native
    
    var narrow: js.UndefOr[Duration] = js.native
    
    def quantify(n: Double): one | two | few | other = js.native
    
    var short: js.UndefOr[Duration] = js.native
    
    var `short-convenient`: js.UndefOr[Duration] = js.native
    
    var `short-time`: js.UndefOr[Duration] = js.native
    
    var tiny: js.UndefOr[Duration] = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(locale: String, quantify: Double => one | two | few | other): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify))
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLong(value: Duration): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLong-convenient`(value: Duration): Self = StObject.set(x, "long-convenient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLong-convenientUndefined`: Self = StObject.set(x, "long-convenient", js.undefined)
      
      @scala.inline
      def `setLong-time`(value: Duration): Self = StObject.set(x, "long-time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLong-timeUndefined`: Self = StObject.set(x, "long-time", js.undefined)
      
      @scala.inline
      def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
      
      @scala.inline
      def setNarrow(value: Duration): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNarrowUndefined: Self = StObject.set(x, "narrow", js.undefined)
      
      @scala.inline
      def setQuantify(value: Double => one | two | few | other): Self = StObject.set(x, "quantify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShort(value: Duration): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setShort-convenient`(value: Duration): Self = StObject.set(x, "short-convenient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setShort-convenientUndefined`: Self = StObject.set(x, "short-convenient", js.undefined)
      
      @scala.inline
      def `setShort-time`(value: Duration): Self = StObject.set(x, "short-time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setShort-timeUndefined`: Self = StObject.set(x, "short-time", js.undefined)
      
      @scala.inline
      def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
      
      @scala.inline
      def setTiny(value: Duration): Self = StObject.set(x, "tiny", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTinyUndefined: Self = StObject.set(x, "tiny", js.undefined)
    }
  }
  
  @js.native
  trait QuantifyType extends StObject {
    
    var few: js.UndefOr[String] = js.native
    
    var one: String = js.native
    
    var other: String = js.native
    
    var two: js.UndefOr[String] = js.native
  }
  object QuantifyType {
    
    @scala.inline
    def apply(one: String, other: String): QuantifyType = {
      val __obj = js.Dynamic.literal(one = one.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuantifyType]
    }
    
    @scala.inline
    implicit class QuantifyTypeMutableBuilder[Self <: QuantifyType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFew(value: String): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
      
      @scala.inline
      def setOne(value: String): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwo(value: String): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
    }
  }
  
  @js.native
  trait RTFFormatter extends StObject {
    
    var locale: String = js.native
    
    var localeMatcher: String = js.native
    
    var numberFormat: StringDictionary[js.Any] = js.native
    
    var numeric: String = js.native
    
    var style: DefaultFormats = js.native
  }
  object RTFFormatter {
    
    @scala.inline
    def apply(
      locale: String,
      localeMatcher: String,
      numberFormat: StringDictionary[js.Any],
      numeric: String,
      style: DefaultFormats
    ): RTFFormatter = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], localeMatcher = localeMatcher.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[RTFFormatter]
    }
    
    @scala.inline
    implicit class RTFFormatterMutableBuilder[Self <: RTFFormatter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcher(value: String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberFormat(value: StringDictionary[js.Any]): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumeric(value: String): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: DefaultFormats): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tense extends StObject {
    
    var current: js.UndefOr[QuantifyType | String] = js.native
    
    var future: js.UndefOr[QuantifyType | String] = js.native
    
    var next: js.UndefOr[QuantifyType | String] = js.native
    
    var past: js.UndefOr[QuantifyType | String] = js.native
    
    var previous: js.UndefOr[QuantifyType | String] = js.native
  }
  object Tense {
    
    @scala.inline
    def apply(): Tense = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tense]
    }
    
    @scala.inline
    implicit class TenseMutableBuilder[Self <: Tense] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: QuantifyType | String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setFuture(value: QuantifyType | String): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFutureUndefined: Self = StObject.set(x, "future", js.undefined)
      
      @scala.inline
      def setNext(value: QuantifyType | String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPast(value: QuantifyType | String): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPastUndefined: Self = StObject.set(x, "past", js.undefined)
      
      @scala.inline
      def setPrevious(value: QuantifyType | String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.now
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.second
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.minute
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.hour
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.day
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.week
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.month
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.quarter
    - typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.year
  */
  trait TimeUnit extends StObject
  object TimeUnit {
    
    @scala.inline
    def day: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.day = "day".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.day]
    
    @scala.inline
    def hour: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.hour = "hour".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.hour]
    
    @scala.inline
    def minute: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.minute = "minute".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.minute]
    
    @scala.inline
    def month: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.month = "month".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.month]
    
    @scala.inline
    def now: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.now = "now".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.now]
    
    @scala.inline
    def quarter: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.quarter = "quarter".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.quarter]
    
    @scala.inline
    def second: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.second = "second".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.second]
    
    @scala.inline
    def week: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.week = "week".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.week]
    
    @scala.inline
    def year: typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.year = "year".asInstanceOf[typingsSlinky.javascriptTimeAgo.javascriptTimeAgoStrings.year]
  }
}
