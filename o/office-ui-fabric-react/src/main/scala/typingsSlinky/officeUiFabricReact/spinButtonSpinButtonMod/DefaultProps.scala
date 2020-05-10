package typingsSlinky.officeUiFabricReact.spinButtonSpinButtonMod

import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.positioningTypesMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/SpinButton/SpinButton.types.ISpinButtonProps, 'step' | 'min' | 'max' | 'disabled' | 'labelPosition' | 'label' | 'incrementButtonIcon' | 'decrementButtonIcon'>> */
@js.native
trait DefaultProps extends js.Object {
  var decrementButtonIcon: IIconProps = js.native
  var disabled: Boolean = js.native
  var incrementButtonIcon: IIconProps = js.native
  var label: String = js.native
  var labelPosition: Position = js.native
  var max: Double = js.native
  var min: Double = js.native
  var step: Double = js.native
}

object DefaultProps {
  @scala.inline
  def apply(
    decrementButtonIcon: IIconProps,
    disabled: Boolean,
    incrementButtonIcon: IIconProps,
    label: String,
    labelPosition: Position,
    max: Double,
    min: Double,
    step: Double
  ): DefaultProps = {
    val __obj = js.Dynamic.literal(decrementButtonIcon = decrementButtonIcon.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], incrementButtonIcon = incrementButtonIcon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps]
  }
  @scala.inline
  implicit class DefaultPropsOps[Self <: DefaultProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecrementButtonIcon(value: IIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrementButtonIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncrementButtonIcon(value: IIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementButtonIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

