package typingsSlinky.rmcCascader.popupMod

import slinky.core.facade.ReactElement
import typingsSlinky.rmcCascader.cascaderTypesMod.CascaderValue
import typingsSlinky.rmcPicker.popupPickerTypesMod.IPopupPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopupCascaderProps extends IPopupPickerProps {
  var cascader: ReactElement = js.native
  var onChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[CascaderValue], Unit]] = js.native
}

object IPopupCascaderProps {
  @scala.inline
  def apply(cascader: ReactElement): IPopupCascaderProps = {
    val __obj = js.Dynamic.literal(cascader = cascader.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopupCascaderProps]
  }
  @scala.inline
  implicit class IPopupCascaderPropsOps[Self <: IPopupCascaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCascader(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: /* date */ js.UndefOr[CascaderValue] => Unit): Self = {
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
  }
  
}

