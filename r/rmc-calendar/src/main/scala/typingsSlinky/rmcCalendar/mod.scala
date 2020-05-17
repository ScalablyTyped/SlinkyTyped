package typingsSlinky.rmcCalendar

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.rmcCalendar.anon.TypeofHeader
import typingsSlinky.rmcCalendar.calendarMod.default
import typingsSlinky.rmcCalendar.calendarPropsMod.PropsType
import typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Calendar protected () extends default {
    def this(props: PropsType) = this()
  }
  
  @js.native
  class DatePicker ()
    extends typingsSlinky.rmcCalendar.datePickerMod.DatePicker
  
  /* static members */
  @js.native
  object Calendar extends js.Object {
    var DefaultHeader: TypeofHeader = js.native
    var DefaultShortcut: Instantiable0[typingsSlinky.rmcCalendar.shortcutPanelMod.default] = js.native
    var defaultProps: PropsType = js.native
  }
  
  @js.native
  object Locale extends js.Object {
    var enUS: typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale = js.native
    var zhCN: typingsSlinky.rmcCalendar.dataTypesMod.Models.Locale = js.native
  }
  
  type LocaleType = Locale
}

