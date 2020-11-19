package typingsSlinky.rmcDatePicker

import typingsSlinky.react.mod.Component
import typingsSlinky.rmcDatePicker.anon.Cols
import typingsSlinky.rmcDatePicker.anon.Date
import typingsSlinky.rmcDatePicker.anon.Disabled
import typingsSlinky.rmcDatePicker.anon.Key
import typingsSlinky.rmcDatePicker.anon.Value
import typingsSlinky.rmcDatePicker.idatepickerpropsMod.IDatePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rmc-date-picker/lib/DatePicker", JSImport.Namespace)
@js.native
object datePickerMod extends js.Object {
  
  @js.native
  trait DatePicker
    extends Component[IDatePickerProps, js.Any, js.Any] {
    
    def clipDate(date: js.Any): js.Any = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MDatePicker(nextProps: js.Any): Unit = js.native
    
    var defaultMaxDate: js.Any = js.native
    
    var defaultMinDate: js.Any = js.native
    
    def getDate(): js.Any = js.native
    
    def getDateData(): js.Array[Key] = js.native
    
    def getDefaultMaxDate(): js.Any = js.native
    
    def getDefaultMinDate(): js.Any = js.native
    
    def getDisplayHour(rawHour: js.Any): js.Any = js.native
    
    def getMaxDate(): js.Any = js.native
    
    def getMaxDay(): js.Any = js.native
    
    def getMaxHour(): js.Any = js.native
    
    def getMaxMinute(): js.Any = js.native
    
    def getMaxMonth(): js.Any = js.native
    
    def getMaxYear(): js.Any = js.native
    
    def getMinDate(): js.Any = js.native
    
    def getMinDay(): js.Any = js.native
    
    def getMinHour(): js.Any = js.native
    
    def getMinMinute(): js.Any = js.native
    
    def getMinMonth(): js.Any = js.native
    
    def getMinYear(): js.Any = js.native
    
    def getNewDate(values: js.Any, index: js.Any): js.Any = js.native
    
    def getTimeData(date: js.Any): Cols = js.native
    
    def getValue(): js.Any = js.native
    
    def getValueCols(): Value = js.native
    
    def onScrollChange(values: js.Any, index: js.Any): Unit = js.native
    
    def onValueChange(values: js.Any, index: js.Any): Unit = js.native
    
    def setAmPm(date: js.Any, index: js.Any): Unit = js.native
    
    def setHours(date: js.Any, hour: js.Any): Unit = js.native
    
    @JSName("state")
    var state_DatePicker: Date = js.native
  }
  
  @js.native
  class default () extends DatePicker
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: Disabled = js.native
  }
}
