package typingsSlinky.antd.timePickerMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.PartialTimePickerPropsRef
import typingsSlinky.antd.anon.WeakValidationMapTimePick
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ForwardRefExoticComponent<antd.antd/lib/time-picker.TimePickerProps & react.react.RefAttributes<any>> & {  RangePicker :react.react.ForwardRefExoticComponent<antd.antd/lib/time-picker.TimeRangePickerProps & react.react.RefAttributes<any>>} */
@js.native
trait MergedTimePicker extends js.Object {
  
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: TimePickerProps with RefAttributes[_]): ReactElement | Null = js.native
  
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  
  var RangePicker: ForwardRefExoticComponent[TimeRangePickerProps with RefAttributes[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialTimePickerPropsRef] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapTimePick] = js.native
}
