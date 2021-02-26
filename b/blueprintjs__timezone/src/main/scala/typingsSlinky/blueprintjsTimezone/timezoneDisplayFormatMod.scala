package typingsSlinky.blueprintjsTimezone

import typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
import typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
import typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.name
import typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timezoneDisplayFormatMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
    - typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
    - typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.name
    - typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
  */
  trait TimezoneDisplayFormat extends StObject
  object TimezoneDisplayFormat {
    
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "TimezoneDisplayFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /** Abbreviation format: `"HST"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "TimezoneDisplayFormat.ABBREVIATION")
    @js.native
    def ABBREVIATION: abbreviation = js.native
    @scala.inline
    def ABBREVIATION_=(x: abbreviation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABBREVIATION")(x.asInstanceOf[js.Any])
    
    /** Composite format: `"Pacific/Honolulu (HST) -10:00"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "TimezoneDisplayFormat.COMPOSITE")
    @js.native
    def COMPOSITE: composite = js.native
    @scala.inline
    def COMPOSITE_=(x: composite): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPOSITE")(x.asInstanceOf[js.Any])
    
    /** Name format: `"Pacific/Honolulu"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "TimezoneDisplayFormat.NAME")
    @js.native
    def NAME: name = js.native
    @scala.inline
    def NAME_=(x: name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /** Offset format: `"-10:00"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "TimezoneDisplayFormat.OFFSET")
    @js.native
    def OFFSET: offset = js.native
    @scala.inline
    def OFFSET_=(x: offset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFFSET")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "formatTimezone")
  @js.native
  def formatTimezone(timezone: String, date: js.Date, displayFormat: TimezoneDisplayFormat): js.UndefOr[String] = js.native
}
