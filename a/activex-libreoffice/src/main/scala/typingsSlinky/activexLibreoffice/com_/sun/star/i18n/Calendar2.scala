package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link Calendar} items as returned in a sequence by {@link XLocaleData3.getAllCalendars2()} .
  *
  * Similar to {@link com.sun.star.i18n.Calendar} this provides additional members with a sequence of possessive (genitive case) and partitive case month
  * names for locales that use them, for example Slavic locales. If a locale does not provide the possessive form in {@link GenitiveMonths} , the names
  * are identical to the nominative case nouns in {@link Calendar.Months} . If a locale does not provide the partitive case in {@link PartitiveMonths} ,
  * the names are identical to {@link GenitiveMonths} .
  *
  * The sequences are of type {@link com.sun.star.i18n.CalendarItem2} instead of {@link com.sun.star.i18n.CalendarItem} , with the additional NarrowName
  * member.
  * @see XLocaleData for links to DTD of XML locale data files.
  * @since LibreOffice 3.5
  */
@js.native
trait Calendar2 extends StObject {
  
  var Days: SafeArray[CalendarItem2] = js.native
  
  var Default: Boolean = js.native
  
  var Eras: SafeArray[CalendarItem2] = js.native
  
  var GenitiveMonths: SafeArray[CalendarItem2] = js.native
  
  var MinimumNumberOfDaysForFirstWeek: Double = js.native
  
  var Months: SafeArray[CalendarItem2] = js.native
  
  var Name: String = js.native
  
  var PartitiveMonths: SafeArray[CalendarItem2] = js.native
  
  var StartOfWeek: String = js.native
}
object Calendar2 {
  
  @scala.inline
  def apply(
    Days: SafeArray[CalendarItem2],
    Default: Boolean,
    Eras: SafeArray[CalendarItem2],
    GenitiveMonths: SafeArray[CalendarItem2],
    MinimumNumberOfDaysForFirstWeek: Double,
    Months: SafeArray[CalendarItem2],
    Name: String,
    PartitiveMonths: SafeArray[CalendarItem2],
    StartOfWeek: String
  ): Calendar2 = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], Eras = Eras.asInstanceOf[js.Any], GenitiveMonths = GenitiveMonths.asInstanceOf[js.Any], MinimumNumberOfDaysForFirstWeek = MinimumNumberOfDaysForFirstWeek.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PartitiveMonths = PartitiveMonths.asInstanceOf[js.Any], StartOfWeek = StartOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar2]
  }
  
  @scala.inline
  implicit class Calendar2MutableBuilder[Self <: Calendar2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDays(value: SafeArray[CalendarItem2]): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "Default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEras(value: SafeArray[CalendarItem2]): Self = StObject.set(x, "Eras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenitiveMonths(value: SafeArray[CalendarItem2]): Self = StObject.set(x, "GenitiveMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumNumberOfDaysForFirstWeek(value: Double): Self = StObject.set(x, "MinimumNumberOfDaysForFirstWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonths(value: SafeArray[CalendarItem2]): Self = StObject.set(x, "Months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitiveMonths(value: SafeArray[CalendarItem2]): Self = StObject.set(x, "PartitiveMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOfWeek(value: String): Self = StObject.set(x, "StartOfWeek", value.asInstanceOf[js.Any])
  }
}
