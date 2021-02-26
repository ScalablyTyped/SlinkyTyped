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

object mod {
  
  object Classes {
    
    @JSImport("@blueprintjs/timezone", "Classes.TIMEZONE_PICKER")
    @js.native
    val TIMEZONE_PICKER: String = js.native
    
    @JSImport("@blueprintjs/timezone", "Classes.TIMEZONE_PICKER_POPOVER")
    @js.native
    val TIMEZONE_PICKER_POPOVER: String = js.native
  }
  
  object TimezoneDisplayFormat {
    
    @JSImport("@blueprintjs/timezone", "TimezoneDisplayFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /** Abbreviation format: `"HST"` */
    @JSImport("@blueprintjs/timezone", "TimezoneDisplayFormat.ABBREVIATION")
    @js.native
    def ABBREVIATION: abbreviation = js.native
    @scala.inline
    def ABBREVIATION_=(x: abbreviation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABBREVIATION")(x.asInstanceOf[js.Any])
    
    /** Composite format: `"Pacific/Honolulu (HST) -10:00"` */
    @JSImport("@blueprintjs/timezone", "TimezoneDisplayFormat.COMPOSITE")
    @js.native
    def COMPOSITE: composite = js.native
    @scala.inline
    def COMPOSITE_=(x: composite): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPOSITE")(x.asInstanceOf[js.Any])
    
    /** Name format: `"Pacific/Honolulu"` */
    @JSImport("@blueprintjs/timezone", "TimezoneDisplayFormat.NAME")
    @js.native
    def NAME: name = js.native
    @scala.inline
    def NAME_=(x: name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /** Offset format: `"-10:00"` */
    @JSImport("@blueprintjs/timezone", "TimezoneDisplayFormat.OFFSET")
    @js.native
    def OFFSET: offset = js.native
    @scala.inline
    def OFFSET_=(x: offset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFFSET")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/timezone", "TimezonePicker")
  @js.native
  class TimezonePicker protected ()
    extends typingsSlinky.blueprintjsTimezone.componentsMod.TimezonePicker {
    def this(props: ITimezonePickerProps) = this()
    def this(props: ITimezonePickerProps, context: js.Any) = this()
  }
  /* static members */
  object TimezonePicker {
    
    @JSImport("@blueprintjs/timezone", "TimezonePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/timezone", "TimezonePicker.defaultProps")
    @js.native
    def defaultProps: PartialITimezonePickerPro = js.native
    @scala.inline
    def defaultProps_=(x: PartialITimezonePickerPro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/timezone", "TimezonePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/timezone", "getTimezoneMetadata")
  @js.native
  def getTimezoneMetadata(timezone: String): ITimezoneMetadata = js.native
  @JSImport("@blueprintjs/timezone", "getTimezoneMetadata")
  @js.native
  def getTimezoneMetadata(timezone: String, date: js.Date): ITimezoneMetadata = js.native
}
