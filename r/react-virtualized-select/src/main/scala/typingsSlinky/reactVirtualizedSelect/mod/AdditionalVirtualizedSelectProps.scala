package typingsSlinky.reactVirtualizedSelect.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactVirtualizedSelect.AnonOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalVirtualizedSelectProps[TValue] extends js.Object {
  var maxHeight: js.UndefOr[Double] = js.undefined
  var optionHeight: js.UndefOr[Double | (js.Function1[/* options */ AnonOption[TValue], Double])] = js.undefined
  var optionRenderer: js.UndefOr[js.Function1[/* options */ VirtualizedOptionRenderOptions[TValue], ReactElement]] = js.undefined
  var selectComponent: js.UndefOr[ReactComponentClass[_]] = js.undefined
}

object AdditionalVirtualizedSelectProps {
  @scala.inline
  def apply[TValue](
    maxHeight: Int | Double = null,
    optionHeight: Double | (js.Function1[/* options */ AnonOption[TValue], Double]) = null,
    optionRenderer: /* options */ VirtualizedOptionRenderOptions[TValue] => ReactElement = null,
    selectComponent: ReactComponentClass[_] = null
  ): AdditionalVirtualizedSelectProps[TValue] = {
    val __obj = js.Dynamic.literal()
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (optionHeight != null) __obj.updateDynamic("optionHeight")(optionHeight.asInstanceOf[js.Any])
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1(optionRenderer))
    if (selectComponent != null) __obj.updateDynamic("selectComponent")(selectComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalVirtualizedSelectProps[TValue]]
  }
}

