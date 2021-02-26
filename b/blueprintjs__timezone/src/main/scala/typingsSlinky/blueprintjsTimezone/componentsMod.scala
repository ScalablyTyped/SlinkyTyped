package typingsSlinky.blueprintjsTimezone

import typingsSlinky.blueprintjsTimezone.anon.PartialITimezonePickerPro
import typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
import typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
import typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.name
import typingsSlinky.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
import typingsSlinky.blueprintjsTimezone.timezoneMetadataMod.ITimezoneMetadata
import typingsSlinky.blueprintjsTimezone.timezonePickerMod.ITimezonePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  object TimezoneDisplayFormat {
    
    @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezoneDisplayFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /** Abbreviation format: `"HST"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezoneDisplayFormat.ABBREVIATION")
    @js.native
    def ABBREVIATION: abbreviation = js.native
    @scala.inline
    def ABBREVIATION_=(x: abbreviation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABBREVIATION")(x.asInstanceOf[js.Any])
    
    /** Composite format: `"Pacific/Honolulu (HST) -10:00"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezoneDisplayFormat.COMPOSITE")
    @js.native
    def COMPOSITE: composite = js.native
    @scala.inline
    def COMPOSITE_=(x: composite): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPOSITE")(x.asInstanceOf[js.Any])
    
    /** Name format: `"Pacific/Honolulu"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezoneDisplayFormat.NAME")
    @js.native
    def NAME: name = js.native
    @scala.inline
    def NAME_=(x: name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /** Offset format: `"-10:00"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezoneDisplayFormat.OFFSET")
    @js.native
    def OFFSET: offset = js.native
    @scala.inline
    def OFFSET_=(x: offset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFFSET")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezonePicker")
  @js.native
  class TimezonePicker protected ()
    extends typingsSlinky.blueprintjsTimezone.timezonePickerMod.TimezonePicker {
    def this(props: ITimezonePickerProps) = this()
    def this(props: ITimezonePickerProps, context: js.Any) = this()
  }
  /* static members */
  object TimezonePicker {
    
    @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezonePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezonePicker.defaultProps")
    @js.native
    def defaultProps: PartialITimezonePickerPro = js.native
    @scala.inline
    def defaultProps_=(x: PartialITimezonePickerPro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezonePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/timezone/lib/esm/components", "getTimezoneMetadata")
  @js.native
  def getTimezoneMetadata(timezone: String): ITimezoneMetadata = js.native
  @JSImport("@blueprintjs/timezone/lib/esm/components", "getTimezoneMetadata")
  @js.native
  def getTimezoneMetadata(timezone: String, date: js.Date): ITimezoneMetadata = js.native
}
