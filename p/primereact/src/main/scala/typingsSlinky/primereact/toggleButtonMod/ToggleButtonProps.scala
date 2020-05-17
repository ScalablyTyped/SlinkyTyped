package typingsSlinky.primereact.toggleButtonMod

import typingsSlinky.primereact.anon.ValueBoolean
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToggleButtonProps extends js.Object {
  var ariaLabelledBy: js.UndefOr[String] = js.native
  var checked: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var offIcon: js.UndefOr[String] = js.native
  var offLabel: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.Function1[/* e */ ValueBoolean, Unit]] = js.native
  var onIcon: js.UndefOr[String] = js.native
  var onLabel: js.UndefOr[String] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var tooltip: js.UndefOr[js.Any] = js.native
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
}

object ToggleButtonProps {
  @scala.inline
  def apply(): ToggleButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToggleButtonProps]
  }
  @scala.inline
  implicit class ToggleButtonPropsOps[Self <: ToggleButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaLabelledBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelledBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(js.undefined)
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withOffIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOffLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* e */ ValueBoolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipOptions(value: TooltipOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipOptions")(js.undefined)
        ret
    }
  }
  
}

