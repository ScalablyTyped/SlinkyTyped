package typingsSlinky.rmcCalendar

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.rmcCalendar.anon.EndDate
import typingsSlinky.rmcCalendar.anon.ReadonlychildrenReactNode
import typingsSlinky.rmcCalendar.anon.TypeofHeader
import typingsSlinky.rmcCalendar.calendarPropsMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod {
  
  @JSImport("rmc-calendar/lib/Calendar", JSImport.Default)
  @js.native
  class default protected () extends Calendar {
    def this(props: PropsType) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rmc-calendar/lib/Calendar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-calendar/lib/Calendar", "default.DefaultHeader")
    @js.native
    def DefaultHeader: TypeofHeader = js.native
    @scala.inline
    def DefaultHeader_=(x: TypeofHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-calendar/lib/Calendar", "default.DefaultShortcut")
    @js.native
    def DefaultShortcut: Instantiable0[typingsSlinky.rmcCalendar.shortcutPanelMod.default] = js.native
    @scala.inline
    def DefaultShortcut_=(x: Instantiable0[typingsSlinky.rmcCalendar.shortcutPanelMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultShortcut")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-calendar/lib/Calendar", "default.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    @scala.inline
    def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rmc-calendar/lib/Calendar", "StateType")
  @js.native
  class StateType () extends StObject {
    
    var clientHight: js.UndefOr[Double] = js.native
    
    var disConfirmBtn: js.UndefOr[Boolean] = js.native
    
    var endDate: js.UndefOr[js.Date] = js.native
    
    var showTimePicker: Boolean = js.native
    
    var startDate: js.UndefOr[js.Date] = js.native
    
    var timePickerTitle: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait Calendar
    extends PureComponent[PropsType, StateType, js.Any] {
    
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
    def selectDate(
      date: js.Date,
      useDateTime: js.UndefOr[scala.Nothing],
      oldState: js.UndefOr[scala.Nothing],
      props: ReadonlychildrenReactNode
    ): StateType = js.native
    def selectDate(date: js.Date, useDateTime: js.UndefOr[scala.Nothing], oldState: EndDate): StateType = js.native
    def selectDate(
      date: js.Date,
      useDateTime: js.UndefOr[scala.Nothing],
      oldState: EndDate,
      props: ReadonlychildrenReactNode
    ): StateType = js.native
    def selectDate(date: js.Date, useDateTime: Boolean): StateType = js.native
    def selectDate(
      date: js.Date,
      useDateTime: Boolean,
      oldState: js.UndefOr[scala.Nothing],
      props: ReadonlychildrenReactNode
    ): StateType = js.native
    def selectDate(date: js.Date, useDateTime: Boolean, oldState: EndDate): StateType = js.native
    def selectDate(date: js.Date, useDateTime: Boolean, oldState: EndDate, props: ReadonlychildrenReactNode): StateType = js.native
    
    def setClientHeight(height: Double): Unit = js.native
    
    def shortcutSelect(startDate: js.Date, endDate: js.Date): Unit = js.native
    def shortcutSelect(startDate: js.Date, endDate: js.Date, props: ReadonlychildrenReactNode): Unit = js.native
  }
  
  type ExtraData = typingsSlinky.rmcCalendar.dataTypesMod.Models.ExtraData
}
