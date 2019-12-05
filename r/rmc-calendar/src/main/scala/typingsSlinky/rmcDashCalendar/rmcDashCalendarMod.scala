package typingsSlinky.rmcDashCalendar

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.rmcDashCalendar.libCalendarMod.default
import typingsSlinky.rmcDashCalendar.libCalendarPropsMod.PropsType
import typingsSlinky.rmcDashCalendar.libDateDataTypesMod.Models.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar", JSImport.Namespace)
@js.native
object rmcDashCalendarMod extends js.Object {
  @js.native
  class Calendar protected () extends default {
    def this(props: PropsType) = this()
  }
  
  @js.native
  class DatePicker ()
    extends typingsSlinky.rmcDashCalendar.libDatePickerMod.DatePicker
  
  /* static members */
  @js.native
  object Calendar extends js.Object {
    var DefaultHeader: TypeofClassHeader = js.native
    var DefaultShortcut: Instantiable0[typingsSlinky.rmcDashCalendar.libCalendarShortcutPanelMod.default] = js.native
    var defaultProps: PropsType = js.native
  }
  
  @js.native
  object Locale extends js.Object {
    var enUS: typingsSlinky.rmcDashCalendar.libDateDataTypesMod.Models.Locale = js.native
    var zhCN: typingsSlinky.rmcDashCalendar.libDateDataTypesMod.Models.Locale = js.native
  }
  
  type LocaleType = Locale
}

