package typingsSlinky.rcPicker.rangeContextMod

import typingsSlinky.rcPicker.interfaceMod.NullableDateType
import typingsSlinky.rcPicker.interfaceMod.RangeValue
import typingsSlinky.rcPicker.rcPickerBooleans.`false`
import typingsSlinky.rcPicker.rcPickerStrings.left
import typingsSlinky.rcPicker.rcPickerStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeContextProps extends js.Object {
  var hoverRangedValue: js.UndefOr[RangeValue[_]] = js.native
  var inRange: js.UndefOr[Boolean] = js.native
  var panelPosition: js.UndefOr[left | right | `false`] = js.native
  /**
    * Set displayed range value style.
    * Panel only has one value, this is only style effect.
    */
  var rangedValue: js.UndefOr[(js.Tuple2[NullableDateType[_], NullableDateType[_]]) | Null] = js.native
}

object RangeContextProps {
  @scala.inline
  def apply(): RangeContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeContextProps]
  }
  @scala.inline
  implicit class RangeContextPropsOps[Self <: RangeContextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHoverRangedValue(value: RangeValue[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRangedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverRangedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRangedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverRangedValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRangedValue")(null)
        ret
    }
    @scala.inline
    def withInRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inRange")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelPosition(value: left | right | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withRangedValue(value: js.Tuple2[NullableDateType[_], NullableDateType[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withRangedValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedValue")(null)
        ret
    }
  }
  
}

