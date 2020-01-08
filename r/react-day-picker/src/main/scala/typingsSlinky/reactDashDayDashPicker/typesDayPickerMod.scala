package typingsSlinky.reactDashDayDashPicker

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashDayDashPicker.typesPropsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-day-picker/types/DayPicker", JSImport.Namespace)
@js.native
object typesDayPickerMod extends js.Object {
  @js.native
  trait DayPicker
    extends Component[DayPickerProps, js.Any, js.Any] {
    val dayPicker: HTMLDivElement = js.native
    def focus(): Unit = js.native
    def showMonth(month: js.Date): Unit = js.native
    def showNextMonth(): Unit = js.native
    def showNextYear(): Unit = js.native
    def showPreviousMonth(): Unit = js.native
    def showPreviousYear(): Unit = js.native
  }
  
  @js.native
  class default () extends DayPicker
  
  /* static members */
  @js.native
  object default extends js.Object {
    var DateUtils: Anon_AddDayToRange = js.native
    var DayModifiers: typingsSlinky.reactDashDayDashPicker.typesCommonMod.DayModifiers = js.native
    var LocaleUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = js.native
    var Modifiers: typingsSlinky.reactDashDayDashPicker.typesCommonMod.Modifiers = js.native
    var ModifiersUtils: Anon_Day = js.native
    var VERSION: String = js.native
  }
  
}

