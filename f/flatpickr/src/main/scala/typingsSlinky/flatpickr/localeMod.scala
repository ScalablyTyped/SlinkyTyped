package typingsSlinky.flatpickr

import typingsSlinky.flatpickr.anon.Longhand
import typingsSlinky.flatpickr.anon.Shorthand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeMod {
  
  @js.native
  trait CustomLocale extends StObject {
    
    var amPM: js.UndefOr[js.Tuple2[String, String]] = js.native
    
    var daysInMonth: js.UndefOr[
        js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
      ] = js.native
    
    var firstDayOfWeek: js.UndefOr[Double] = js.native
    
    var hourAriaLabel: js.UndefOr[String] = js.native
    
    var minuteAriaLabel: js.UndefOr[String] = js.native
    
    var months: Shorthand = js.native
    
    var ordinal: js.UndefOr[js.Function1[/* nth */ Double, String]] = js.native
    
    var rangeSeparator: js.UndefOr[String] = js.native
    
    var scrollTitle: js.UndefOr[String] = js.native
    
    var time_24hr: js.UndefOr[Boolean] = js.native
    
    var toggleTitle: js.UndefOr[String] = js.native
    
    var weekAbbreviation: js.UndefOr[String] = js.native
    
    var weekdays: Longhand = js.native
    
    var yearAriaLabel: js.UndefOr[String] = js.native
  }
  object CustomLocale {
    
    @scala.inline
    def apply(months: Shorthand, weekdays: Longhand): CustomLocale = {
      val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomLocale]
    }
    
    @scala.inline
    implicit class CustomLocaleMutableBuilder[Self <: CustomLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmPM(value: js.Tuple2[String, String]): Self = StObject.set(x, "amPM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmPMUndefined: Self = StObject.set(x, "amPM", js.undefined)
      
      @scala.inline
      def setDaysInMonth(
        value: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
      ): Self = StObject.set(x, "daysInMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysInMonthUndefined: Self = StObject.set(x, "daysInMonth", js.undefined)
      
      @scala.inline
      def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      @scala.inline
      def setHourAriaLabel(value: String): Self = StObject.set(x, "hourAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourAriaLabelUndefined: Self = StObject.set(x, "hourAriaLabel", js.undefined)
      
      @scala.inline
      def setMinuteAriaLabel(value: String): Self = StObject.set(x, "minuteAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteAriaLabelUndefined: Self = StObject.set(x, "minuteAriaLabel", js.undefined)
      
      @scala.inline
      def setMonths(value: Shorthand): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrdinal(value: /* nth */ Double => String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
      
      @scala.inline
      def setRangeSeparator(value: String): Self = StObject.set(x, "rangeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeSeparatorUndefined: Self = StObject.set(x, "rangeSeparator", js.undefined)
      
      @scala.inline
      def setScrollTitle(value: String): Self = StObject.set(x, "scrollTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTitleUndefined: Self = StObject.set(x, "scrollTitle", js.undefined)
      
      @scala.inline
      def setTime_24hr(value: Boolean): Self = StObject.set(x, "time_24hr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime_24hrUndefined: Self = StObject.set(x, "time_24hr", js.undefined)
      
      @scala.inline
      def setToggleTitle(value: String): Self = StObject.set(x, "toggleTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleTitleUndefined: Self = StObject.set(x, "toggleTitle", js.undefined)
      
      @scala.inline
      def setWeekAbbreviation(value: String): Self = StObject.set(x, "weekAbbreviation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekAbbreviationUndefined: Self = StObject.set(x, "weekAbbreviation", js.undefined)
      
      @scala.inline
      def setWeekdays(value: Longhand): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearAriaLabel(value: String): Self = StObject.set(x, "yearAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearAriaLabelUndefined: Self = StObject.set(x, "yearAriaLabel", js.undefined)
    }
  }
  
  @js.native
  trait Locale extends StObject {
    
    var amPM: js.Tuple2[String, String] = js.native
    
    var daysInMonth: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double] = js.native
    
    var firstDayOfWeek: Double = js.native
    
    var hourAriaLabel: String = js.native
    
    var minuteAriaLabel: String = js.native
    
    var monthAriaLabel: String = js.native
    
    var months: Shorthand = js.native
    
    def ordinal(nth: Double): String = js.native
    
    var rangeSeparator: String = js.native
    
    var scrollTitle: String = js.native
    
    var time_24hr: Boolean = js.native
    
    var toggleTitle: String = js.native
    
    var weekAbbreviation: String = js.native
    
    var weekdays: Longhand = js.native
    
    var yearAriaLabel: String = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(
      amPM: js.Tuple2[String, String],
      daysInMonth: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double],
      firstDayOfWeek: Double,
      hourAriaLabel: String,
      minuteAriaLabel: String,
      monthAriaLabel: String,
      months: Shorthand,
      ordinal: Double => String,
      rangeSeparator: String,
      scrollTitle: String,
      time_24hr: Boolean,
      toggleTitle: String,
      weekAbbreviation: String,
      weekdays: Longhand,
      yearAriaLabel: String
    ): Locale = {
      val __obj = js.Dynamic.literal(amPM = amPM.asInstanceOf[js.Any], daysInMonth = daysInMonth.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], hourAriaLabel = hourAriaLabel.asInstanceOf[js.Any], minuteAriaLabel = minuteAriaLabel.asInstanceOf[js.Any], monthAriaLabel = monthAriaLabel.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal), rangeSeparator = rangeSeparator.asInstanceOf[js.Any], scrollTitle = scrollTitle.asInstanceOf[js.Any], time_24hr = time_24hr.asInstanceOf[js.Any], toggleTitle = toggleTitle.asInstanceOf[js.Any], weekAbbreviation = weekAbbreviation.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], yearAriaLabel = yearAriaLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmPM(value: js.Tuple2[String, String]): Self = StObject.set(x, "amPM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysInMonth(
        value: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
      ): Self = StObject.set(x, "daysInMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourAriaLabel(value: String): Self = StObject.set(x, "hourAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteAriaLabel(value: String): Self = StObject.set(x, "minuteAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthAriaLabel(value: String): Self = StObject.set(x, "monthAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonths(value: Shorthand): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrdinal(value: Double => String): Self = StObject.set(x, "ordinal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRangeSeparator(value: String): Self = StObject.set(x, "rangeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTitle(value: String): Self = StObject.set(x, "scrollTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime_24hr(value: Boolean): Self = StObject.set(x, "time_24hr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleTitle(value: String): Self = StObject.set(x, "toggleTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekAbbreviation(value: String): Self = StObject.set(x, "weekAbbreviation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdays(value: Longhand): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearAriaLabel(value: String): Self = StObject.set(x, "yearAriaLabel", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.flatpickr.flatpickrStrings.ar
    - typingsSlinky.flatpickr.flatpickrStrings.at
    - typingsSlinky.flatpickr.flatpickrStrings.az
    - typingsSlinky.flatpickr.flatpickrStrings.be
    - typingsSlinky.flatpickr.flatpickrStrings.bg
    - typingsSlinky.flatpickr.flatpickrStrings.bn
    - typingsSlinky.flatpickr.flatpickrStrings.bs
    - typingsSlinky.flatpickr.flatpickrStrings.ca
    - typingsSlinky.flatpickr.flatpickrStrings.cat
    - typingsSlinky.flatpickr.flatpickrStrings.cs
    - typingsSlinky.flatpickr.flatpickrStrings.cy
    - typingsSlinky.flatpickr.flatpickrStrings.da
    - typingsSlinky.flatpickr.flatpickrStrings.de
    - typingsSlinky.flatpickr.flatpickrStrings.default
    - typingsSlinky.flatpickr.flatpickrStrings.en
    - typingsSlinky.flatpickr.flatpickrStrings.eo
    - typingsSlinky.flatpickr.flatpickrStrings.es
    - typingsSlinky.flatpickr.flatpickrStrings.et
    - typingsSlinky.flatpickr.flatpickrStrings.fa
    - typingsSlinky.flatpickr.flatpickrStrings.fi
    - typingsSlinky.flatpickr.flatpickrStrings.fo
    - typingsSlinky.flatpickr.flatpickrStrings.fr
    - typingsSlinky.flatpickr.flatpickrStrings.gr
    - typingsSlinky.flatpickr.flatpickrStrings.he
    - typingsSlinky.flatpickr.flatpickrStrings.hi
    - typingsSlinky.flatpickr.flatpickrStrings.hr
    - typingsSlinky.flatpickr.flatpickrStrings.hu
    - typingsSlinky.flatpickr.flatpickrStrings.id
    - typingsSlinky.flatpickr.flatpickrStrings.is
    - typingsSlinky.flatpickr.flatpickrStrings.it
    - typingsSlinky.flatpickr.flatpickrStrings.ja
    - typingsSlinky.flatpickr.flatpickrStrings.ka
    - typingsSlinky.flatpickr.flatpickrStrings.ko
    - typingsSlinky.flatpickr.flatpickrStrings.km
    - typingsSlinky.flatpickr.flatpickrStrings.kz
    - typingsSlinky.flatpickr.flatpickrStrings.lt
    - typingsSlinky.flatpickr.flatpickrStrings.lv
    - typingsSlinky.flatpickr.flatpickrStrings.mk
    - typingsSlinky.flatpickr.flatpickrStrings.mn
    - typingsSlinky.flatpickr.flatpickrStrings.ms
    - typingsSlinky.flatpickr.flatpickrStrings.my
    - typingsSlinky.flatpickr.flatpickrStrings.nl
    - typingsSlinky.flatpickr.flatpickrStrings.no
    - typingsSlinky.flatpickr.flatpickrStrings.pa
    - typingsSlinky.flatpickr.flatpickrStrings.pl
    - typingsSlinky.flatpickr.flatpickrStrings.pt
    - typingsSlinky.flatpickr.flatpickrStrings.ro
    - typingsSlinky.flatpickr.flatpickrStrings.ru
    - typingsSlinky.flatpickr.flatpickrStrings.si
    - typingsSlinky.flatpickr.flatpickrStrings.sk
    - typingsSlinky.flatpickr.flatpickrStrings.sl
    - typingsSlinky.flatpickr.flatpickrStrings.sq
    - typingsSlinky.flatpickr.flatpickrStrings.sr
    - typingsSlinky.flatpickr.flatpickrStrings.sv
    - typingsSlinky.flatpickr.flatpickrStrings.th
    - typingsSlinky.flatpickr.flatpickrStrings.tr
    - typingsSlinky.flatpickr.flatpickrStrings.uk
    - typingsSlinky.flatpickr.flatpickrStrings.vn
    - typingsSlinky.flatpickr.flatpickrStrings.zh
    - typingsSlinky.flatpickr.flatpickrStrings.uz
    - typingsSlinky.flatpickr.flatpickrStrings.uz_latn
    - typingsSlinky.flatpickr.flatpickrStrings.zh_tw
  */
  trait key extends StObject
  object key {
    
    @scala.inline
    def default: typingsSlinky.flatpickr.flatpickrStrings.default = "default".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.default]
    
    @scala.inline
    def ar: typingsSlinky.flatpickr.flatpickrStrings.ar = "ar".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.ar]
    
    @scala.inline
    def at: typingsSlinky.flatpickr.flatpickrStrings.at = "at".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.at]
    
    @scala.inline
    def az: typingsSlinky.flatpickr.flatpickrStrings.az = "az".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.az]
    
    @scala.inline
    def be: typingsSlinky.flatpickr.flatpickrStrings.be = "be".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.be]
    
    @scala.inline
    def bg: typingsSlinky.flatpickr.flatpickrStrings.bg = "bg".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.bg]
    
    @scala.inline
    def bn: typingsSlinky.flatpickr.flatpickrStrings.bn = "bn".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.bn]
    
    @scala.inline
    def bs: typingsSlinky.flatpickr.flatpickrStrings.bs = "bs".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.bs]
    
    @scala.inline
    def ca: typingsSlinky.flatpickr.flatpickrStrings.ca = "ca".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.ca]
    
    @scala.inline
    def cat: typingsSlinky.flatpickr.flatpickrStrings.cat = "cat".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.cat]
    
    @scala.inline
    def cs: typingsSlinky.flatpickr.flatpickrStrings.cs = "cs".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.cs]
    
    @scala.inline
    def cy: typingsSlinky.flatpickr.flatpickrStrings.cy = "cy".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.cy]
    
    @scala.inline
    def da: typingsSlinky.flatpickr.flatpickrStrings.da = "da".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.da]
    
    @scala.inline
    def de: typingsSlinky.flatpickr.flatpickrStrings.de = "de".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.de]
    
    @scala.inline
    def en: typingsSlinky.flatpickr.flatpickrStrings.en = "en".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.en]
    
    @scala.inline
    def eo: typingsSlinky.flatpickr.flatpickrStrings.eo = "eo".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.eo]
    
    @scala.inline
    def es: typingsSlinky.flatpickr.flatpickrStrings.es = "es".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.es]
    
    @scala.inline
    def et: typingsSlinky.flatpickr.flatpickrStrings.et = "et".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.et]
    
    @scala.inline
    def fa: typingsSlinky.flatpickr.flatpickrStrings.fa = "fa".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.fa]
    
    @scala.inline
    def fi: typingsSlinky.flatpickr.flatpickrStrings.fi = "fi".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.fi]
    
    @scala.inline
    def fo: typingsSlinky.flatpickr.flatpickrStrings.fo = "fo".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.fo]
    
    @scala.inline
    def fr: typingsSlinky.flatpickr.flatpickrStrings.fr = "fr".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.fr]
    
    @scala.inline
    def gr: typingsSlinky.flatpickr.flatpickrStrings.gr = "gr".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.gr]
    
    @scala.inline
    def he: typingsSlinky.flatpickr.flatpickrStrings.he = "he".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.he]
    
    @scala.inline
    def hi: typingsSlinky.flatpickr.flatpickrStrings.hi = "hi".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.hi]
    
    @scala.inline
    def hr: typingsSlinky.flatpickr.flatpickrStrings.hr = "hr".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.hr]
    
    @scala.inline
    def hu: typingsSlinky.flatpickr.flatpickrStrings.hu = "hu".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.hu]
    
    @scala.inline
    def id: typingsSlinky.flatpickr.flatpickrStrings.id = "id".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.id]
    
    @scala.inline
    def is: typingsSlinky.flatpickr.flatpickrStrings.is = "is".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.is]
    
    @scala.inline
    def it: typingsSlinky.flatpickr.flatpickrStrings.it = "it".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.it]
    
    @scala.inline
    def ja: typingsSlinky.flatpickr.flatpickrStrings.ja = "ja".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.ja]
    
    @scala.inline
    def ka: typingsSlinky.flatpickr.flatpickrStrings.ka = "ka".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.ka]
    
    @scala.inline
    def km: typingsSlinky.flatpickr.flatpickrStrings.km = "km".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.km]
    
    @scala.inline
    def ko: typingsSlinky.flatpickr.flatpickrStrings.ko = "ko".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.ko]
    
    @scala.inline
    def kz: typingsSlinky.flatpickr.flatpickrStrings.kz = "kz".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.kz]
    
    @scala.inline
    def lt: typingsSlinky.flatpickr.flatpickrStrings.lt = "lt".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.lt]
    
    @scala.inline
    def lv: typingsSlinky.flatpickr.flatpickrStrings.lv = "lv".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.lv]
    
    @scala.inline
    def mk: typingsSlinky.flatpickr.flatpickrStrings.mk = "mk".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.mk]
    
    @scala.inline
    def mn: typingsSlinky.flatpickr.flatpickrStrings.mn = "mn".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.mn]
    
    @scala.inline
    def ms: typingsSlinky.flatpickr.flatpickrStrings.ms = "ms".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.ms]
    
    @scala.inline
    def my: typingsSlinky.flatpickr.flatpickrStrings.my = "my".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.my]
    
    @scala.inline
    def nl: typingsSlinky.flatpickr.flatpickrStrings.nl = "nl".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.nl]
    
    @scala.inline
    def no: typingsSlinky.flatpickr.flatpickrStrings.no = "no".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.no]
    
    @scala.inline
    def pa: typingsSlinky.flatpickr.flatpickrStrings.pa = "pa".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.pa]
    
    @scala.inline
    def pl: typingsSlinky.flatpickr.flatpickrStrings.pl = "pl".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.pl]
    
    @scala.inline
    def pt: typingsSlinky.flatpickr.flatpickrStrings.pt = "pt".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.pt]
    
    @scala.inline
    def ro: typingsSlinky.flatpickr.flatpickrStrings.ro = "ro".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.ro]
    
    @scala.inline
    def ru: typingsSlinky.flatpickr.flatpickrStrings.ru = "ru".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.ru]
    
    @scala.inline
    def si: typingsSlinky.flatpickr.flatpickrStrings.si = "si".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.si]
    
    @scala.inline
    def sk: typingsSlinky.flatpickr.flatpickrStrings.sk = "sk".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.sk]
    
    @scala.inline
    def sl: typingsSlinky.flatpickr.flatpickrStrings.sl = "sl".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.sl]
    
    @scala.inline
    def sq: typingsSlinky.flatpickr.flatpickrStrings.sq = "sq".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.sq]
    
    @scala.inline
    def sr: typingsSlinky.flatpickr.flatpickrStrings.sr = "sr".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.sr]
    
    @scala.inline
    def sv: typingsSlinky.flatpickr.flatpickrStrings.sv = "sv".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.sv]
    
    @scala.inline
    def th: typingsSlinky.flatpickr.flatpickrStrings.th = "th".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.th]
    
    @scala.inline
    def tr: typingsSlinky.flatpickr.flatpickrStrings.tr = "tr".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.tr]
    
    @scala.inline
    def uk: typingsSlinky.flatpickr.flatpickrStrings.uk = "uk".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.uk]
    
    @scala.inline
    def uz: typingsSlinky.flatpickr.flatpickrStrings.uz = "uz".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.uz]
    
    @scala.inline
    def uz_latn: typingsSlinky.flatpickr.flatpickrStrings.uz_latn = "uz_latn".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.uz_latn]
    
    @scala.inline
    def vn: typingsSlinky.flatpickr.flatpickrStrings.vn = "vn".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.vn]
    
    @scala.inline
    def zh: typingsSlinky.flatpickr.flatpickrStrings.zh = "zh".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.zh]
    
    @scala.inline
    def zh_tw: typingsSlinky.flatpickr.flatpickrStrings.zh_tw = "zh_tw".asInstanceOf[typingsSlinky.flatpickr.flatpickrStrings.zh_tw]
  }
}
