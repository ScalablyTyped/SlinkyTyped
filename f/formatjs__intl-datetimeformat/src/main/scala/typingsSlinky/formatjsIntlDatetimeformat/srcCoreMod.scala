package typingsSlinky.formatjsIntlDatetimeformat

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatLocaleInternalData
import typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatOptions
import typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.UnpackedZoneData
import typingsSlinky.formatjsIntlDatetimeformat.anon.PickDateTimeFormatOptions
import typingsSlinky.formatjsIntlDatetimeformat.srcTypesMod.PackedData
import typingsSlinky.formatjsIntlDatetimeformat.srcTypesMod.RawDateTimeLocaleData
import typingsSlinky.std.Record
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl-datetimeformat/src/core", JSImport.Namespace)
@js.native
object srcCoreMod extends js.Object {
  
  @js.native
  class DateTimeFormat ()
    extends typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions) = this()
    def this(locales: String, options: DateTimeFormatOptions) = this()
    def this(locales: js.Array[String], options: DateTimeFormatOptions) = this()
  }
  @js.native
  object DateTimeFormat extends TopLevel[DateTimeFormatConstructor]
  
  @js.native
  trait DateTimeFormatConstructor
    extends Instantiable0[typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat]
       with Instantiable1[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
        ]
       with Instantiable2[
          js.UndefOr[(/* locales */ js.Array[String]) | (/* locales */ String)], 
          /* options */ DateTimeFormatOptions, 
          typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
        ] {
    
    def apply(): typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat = js.native
    def apply(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat = js.native
    def apply(locales: String): typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat = js.native
    def apply(locales: String, options: DateTimeFormatOptions): typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat = js.native
    def apply(locales: js.Array[String]): typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat = js.native
    def apply(locales: js.Array[String], options: DateTimeFormatOptions): typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat = js.native
    
    def __addLocaleData(data: RawDateTimeLocaleData*): Unit = js.native
    
    def __addTZData(d: PackedData): Unit = js.native
    
    var __defaultLocale: String = js.native
    
    var __defaultTimeZone: String = js.native
    
    def __setDefaultTimeZone(tz: String): Unit = js.native
    
    var availableLocales: Set[String] = js.native
    
    def getDefaultLocale(): String = js.native
    
    def getDefaultTimeZone(): String = js.native
    
    var localeData: Record[String, DateTimeFormatLocaleInternalData] = js.native
    
    var polyfilled: Boolean = js.native
    
    var relevantExtensionKeys: js.Array[String] = js.native
    
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: PickDateTimeFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: PickDateTimeFormatOptions): js.Array[String] = js.native
    
    var tzData: Record[String, js.Array[UnpackedZoneData]] = js.native
  }
}
