package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LocaleInfo...
  */
@js.native
trait ILocaleInfo extends StObject {
  
  /**
    * Is set to true if broken weeks are allowed in a year.
    * According to ISO 8601, no broken weeks should be allowed.
    * This property is not shown if set to false.
    * If qBrokenWeeks is set to true, qReferenceDay is irrelevant.
    * If this property has not been set in a script, the returned value comes from the Windows operating system.
    */
  var qBrokenWeeks: Double = js.native
  
  /**
    * Information about the calendar.
    */
  var qCalendarStrings: ICalenderStrings = js.native
  
  /**
    * Locale name (following language tagging convention RFC 4646):
    *
    * <language>-<REGION>
    * Where
    * language is a lowercase ISO 639 language code
    * REGION specifies an uppercase ISO 3166 country code.
    * If this property has not been set in a script, the returned value comes from the Windows operating system.
    */
  var qCollation: String = js.native
  
  /**
    * Current year.
    */
  var qCurrentYear: Double = js.native
  
  /**
    * Date format.
    * Example: YYYY-MM-DD
    */
  var qDateFmt: String = js.native
  
  /**
    * Decimal separator.
    */
  var qDecimalSep: String = js.native
  
  /**
    * First month of the year, starting from 1.
    * According to ISO 8601, Januaryis the first month of the year.
    *
    *       1  = January
    *       2  = February
    *       12 = January
    *
    * If this property has not been set in a script, the returned value comes from the Windows operating system.
    */
  var qFirstMonthOfYear: Double = js.native
  
  /**
    * First day of the week, starting from 0.
    * According to ISO 8601, Monday is the first day of the week.
    *
    *           0 = Monday
    *           1 = Tuesday
    *           ..
    *           6 = Sunday
    *
    * If this property has not been set in a script, the returned value comes from the Windows operating system.
    */
  var qFirstWeekDay: Boolean = js.native
  
  /**
    * List separator.
    */
  var qListSep: String = js.native
  
  /**
    * Money decimal separator.
    */
  var qMoneyDecimalSep: String = js.native
  
  /**
    * Money format.
    * Example: #.##0,00 kr;-#.##0,00 kr
    */
  var qMoneyFmt: String = js.native
  
  /**
    * Money thousand separator.
    */
  var qMoneyThousandSep: String = js.native
  
  /**
    * Day in the year that is always in week 1.
    * According to ISO 8601, January 4th should always be part of the first week of the year (qReferenceDay=4).
    * Recommended values are in the range 1 and 7.
    * If this property has not been set in a script, the returned value comes from the Windows operating system.
    * This property is not relevant if there are broken weeks in the year.
    */
  var qReferenceDay: Double = js.native
  
  /**
    * Thousand separator.
    */
  var qThousandSep: String = js.native
  
  /**
    * Time format.
    * Example: hh:mm:ss
    */
  var qTimeFmt: String = js.native
  
  /**
    * Time stamp format.
    * Example: YYYY-MM-DD hh:mm:ss[.fff]
    */
  var qTimestampFmt: String = js.native
}
object ILocaleInfo {
  
  @scala.inline
  def apply(
    qBrokenWeeks: Double,
    qCalendarStrings: ICalenderStrings,
    qCollation: String,
    qCurrentYear: Double,
    qDateFmt: String,
    qDecimalSep: String,
    qFirstMonthOfYear: Double,
    qFirstWeekDay: Boolean,
    qListSep: String,
    qMoneyDecimalSep: String,
    qMoneyFmt: String,
    qMoneyThousandSep: String,
    qReferenceDay: Double,
    qThousandSep: String,
    qTimeFmt: String,
    qTimestampFmt: String
  ): ILocaleInfo = {
    val __obj = js.Dynamic.literal(qBrokenWeeks = qBrokenWeeks.asInstanceOf[js.Any], qCalendarStrings = qCalendarStrings.asInstanceOf[js.Any], qCollation = qCollation.asInstanceOf[js.Any], qCurrentYear = qCurrentYear.asInstanceOf[js.Any], qDateFmt = qDateFmt.asInstanceOf[js.Any], qDecimalSep = qDecimalSep.asInstanceOf[js.Any], qFirstMonthOfYear = qFirstMonthOfYear.asInstanceOf[js.Any], qFirstWeekDay = qFirstWeekDay.asInstanceOf[js.Any], qListSep = qListSep.asInstanceOf[js.Any], qMoneyDecimalSep = qMoneyDecimalSep.asInstanceOf[js.Any], qMoneyFmt = qMoneyFmt.asInstanceOf[js.Any], qMoneyThousandSep = qMoneyThousandSep.asInstanceOf[js.Any], qReferenceDay = qReferenceDay.asInstanceOf[js.Any], qThousandSep = qThousandSep.asInstanceOf[js.Any], qTimeFmt = qTimeFmt.asInstanceOf[js.Any], qTimestampFmt = qTimestampFmt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocaleInfo]
  }
  
  @scala.inline
  implicit class ILocaleInfoMutableBuilder[Self <: ILocaleInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQBrokenWeeks(value: Double): Self = StObject.set(x, "qBrokenWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCalendarStrings(value: ICalenderStrings): Self = StObject.set(x, "qCalendarStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCollation(value: String): Self = StObject.set(x, "qCollation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCurrentYear(value: Double): Self = StObject.set(x, "qCurrentYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDateFmt(value: String): Self = StObject.set(x, "qDateFmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDecimalSep(value: String): Self = StObject.set(x, "qDecimalSep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFirstMonthOfYear(value: Double): Self = StObject.set(x, "qFirstMonthOfYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFirstWeekDay(value: Boolean): Self = StObject.set(x, "qFirstWeekDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQListSep(value: String): Self = StObject.set(x, "qListSep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMoneyDecimalSep(value: String): Self = StObject.set(x, "qMoneyDecimalSep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMoneyFmt(value: String): Self = StObject.set(x, "qMoneyFmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMoneyThousandSep(value: String): Self = StObject.set(x, "qMoneyThousandSep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQReferenceDay(value: Double): Self = StObject.set(x, "qReferenceDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQThousandSep(value: String): Self = StObject.set(x, "qThousandSep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTimeFmt(value: String): Self = StObject.set(x, "qTimeFmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTimestampFmt(value: String): Self = StObject.set(x, "qTimestampFmt", value.asInstanceOf[js.Any])
  }
}
