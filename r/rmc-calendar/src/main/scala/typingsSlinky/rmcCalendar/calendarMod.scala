package typingsSlinky.rmcCalendar

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.react.mod.Component
import typingsSlinky.rmcCalendar.anon.EndDate
import typingsSlinky.rmcCalendar.anon.ReadonlychildrenReactNode
import typingsSlinky.rmcCalendar.anon.TypeofHeader
import typingsSlinky.rmcCalendar.calendarPropsMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-calendar/lib/Calendar", JSImport.Namespace)
@js.native
object calendarMod extends js.Object {
  @js.native
  trait Calendar
    extends Component[PropsType, StateType, js.Any] {
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MCalendar(nextProps: PropsType): Unit = js.native
    def onCancel(): Unit = js.native
    def onClear(): Unit = js.native
    def onClose(): Unit = js.native
    def onConfirm(): Unit = js.native
    def onSelectHasDisableDate(date: js.Array[js.Date]): Unit = js.native
    def onSelectedDate(date: js.Date): Unit = js.native
    def onTimeChange(date: js.Date): Unit = js.native
    def selectDate(date: js.Date): StateType = js.native
    def selectDate(date: js.Date, useDateTime: Boolean): StateType = js.native
    def selectDate(date: js.Date, useDateTime: Boolean, oldState: EndDate): StateType = js.native
    def selectDate(date: js.Date, useDateTime: Boolean, oldState: EndDate, props: ReadonlychildrenReactNode): StateType = js.native
    def setClientHeight(height: Double): Unit = js.native
    def shortcutSelect(startDate: js.Date, endDate: js.Date): Unit = js.native
    def shortcutSelect(startDate: js.Date, endDate: js.Date, props: ReadonlychildrenReactNode): Unit = js.native
  }
  
  @js.native
  class StateType () extends js.Object {
    var clientHight: js.UndefOr[Double] = js.native
    var disConfirmBtn: js.UndefOr[Boolean] = js.native
    var endDate: js.UndefOr[js.Date] = js.native
    var showTimePicker: Boolean = js.native
    var startDate: js.UndefOr[js.Date] = js.native
    var timePickerTitle: js.UndefOr[String] = js.native
  }
  
  @js.native
  class default protected () extends Calendar {
    def this(props: PropsType) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var DefaultHeader: TypeofHeader = js.native
    var DefaultShortcut: Instantiable0[typingsSlinky.rmcCalendar.shortcutPanelMod.default] = js.native
    var defaultProps: PropsType = js.native
  }
  
  type ExtraData = typingsSlinky.rmcCalendar.dataTypesMod.Models.ExtraData
}

