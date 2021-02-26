package typingsSlinky.formatjsEcma402Abstract

import typingsSlinky.formatjsEcma402Abstract.dateTimeFormatToLocalTimeMod.ToLocalTimeImplDetails
import typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatLocaleInternalData
import typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.IntlDateTimeFormatInternal
import typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.IntlDateTimeFormatPart
import typingsSlinky.std.Intl.DateTimeFormat
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeFormatFormatDateTimePatternMod {
  
  @JSImport("@formatjs/ecma402-abstract/DateTimeFormat/FormatDateTimePattern", "FormatDateTimePattern")
  @js.native
  def FormatDateTimePattern(
    dtf: DateTimeFormat,
    patternParts: js.Array[IntlDateTimeFormatPart],
    x: Double,
    hasGetInternalSlotsLocaleDataGetDefaultTimeZoneTzData: FormatDateTimePatternImplDetails with ToLocalTimeImplDetails
  ): js.Array[IntlDateTimeFormatPart] = js.native
  
  @js.native
  trait FormatDateTimePatternImplDetails extends StObject {
    
    def getDefaultTimeZone(): String = js.native
    
    def getInternalSlots(dtf: DateTimeFormat): IntlDateTimeFormatInternal = js.native
    
    var localeData: Record[String, DateTimeFormatLocaleInternalData] = js.native
  }
  object FormatDateTimePatternImplDetails {
    
    @scala.inline
    def apply(
      getDefaultTimeZone: () => String,
      getInternalSlots: DateTimeFormat => IntlDateTimeFormatInternal,
      localeData: Record[String, DateTimeFormatLocaleInternalData]
    ): FormatDateTimePatternImplDetails = {
      val __obj = js.Dynamic.literal(getDefaultTimeZone = js.Any.fromFunction0(getDefaultTimeZone), getInternalSlots = js.Any.fromFunction1(getInternalSlots), localeData = localeData.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatDateTimePatternImplDetails]
    }
    
    @scala.inline
    implicit class FormatDateTimePatternImplDetailsMutableBuilder[Self <: FormatDateTimePatternImplDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDefaultTimeZone(value: () => String): Self = StObject.set(x, "getDefaultTimeZone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInternalSlots(value: DateTimeFormat => IntlDateTimeFormatInternal): Self = StObject.set(x, "getInternalSlots", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLocaleData(value: Record[String, DateTimeFormatLocaleInternalData]): Self = StObject.set(x, "localeData", value.asInstanceOf[js.Any])
    }
  }
}
