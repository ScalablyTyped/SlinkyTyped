package typingsSlinky.antd.datePickerMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import slinky.core.ReactComponentClass
import typingsSlinky.antd.PickPickPickerDatePropsMo
import typingsSlinky.antd.PickPickPickerTimePropsMo
import typingsSlinky.antd.generatePickerMod.PickerProps
import typingsSlinky.moment.mod.Moment
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.GetDerivedStateFromError
import typingsSlinky.react.mod.GetDerivedStateFromProps
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/date-picker", JSImport.Default)
@js.native
class default protected ()
  extends Component[PickerProps[Moment], js.Any, js.Any] {
  def this(props: PickerProps[Moment]) = this()
  def this(props: PickerProps[Moment], context: js.Any) = this()
}

@JSImport("antd/lib/date-picker", JSImport.Default)
@js.native
object default
  extends Instantiable1[/* props */ PickerProps[Moment], ReactComponentClass[PickerProps[Moment]]]
     with Instantiable2[
      /* props */ PickerProps[Moment], 
      /* context */ js.Any, 
      ReactComponentClass[PickerProps[Moment]]
    ] {
  var MonthPicker: ReactComponentClass[PickPickPickerDatePropsMo] = js.native
  var RangePicker: ReactComponentClass[typingsSlinky.antd.generatePickerMod.RangePickerProps[Moment]] = js.native
  var TimePicker: ReactComponentClass[PickPickPickerTimePropsMo] = js.native
  var WeekPicker: ReactComponentClass[PickPickPickerDatePropsMo] = js.native
  var YearPicker: ReactComponentClass[PickPickPickerDatePropsMo] = js.native
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[Partial[PickerProps[Moment]]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[PickerProps[Moment], _]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[PickerProps[Moment], _]] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[PickerProps[Moment]]] = js.native
}

