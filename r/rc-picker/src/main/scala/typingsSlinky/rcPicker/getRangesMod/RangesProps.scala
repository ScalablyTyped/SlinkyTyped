package typingsSlinky.rcPicker.getRangesMod

import typingsSlinky.rcPicker.interfaceMod.Components
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.RangeList
import typingsSlinky.rcPicker.rcPickerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangesProps extends js.Object {
  var components: js.UndefOr[Components] = js.native
  var locale: Locale = js.native
  var needConfirmButton: Boolean = js.native
  var okDisabled: js.UndefOr[Boolean] = js.native
  var onNow: js.UndefOr[Null | js.Function0[Unit] | `false`] = js.native
  var onOk: js.UndefOr[Null | js.Function0[Unit] | `false`] = js.native
  var prefixCls: String = js.native
  var rangeList: js.UndefOr[RangeList] = js.native
}

object RangesProps {
  @scala.inline
  def apply(locale: Locale, needConfirmButton: Boolean, prefixCls: String): RangesProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], needConfirmButton = needConfirmButton.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangesProps]
  }
  @scala.inline
  implicit class RangesPropsOps[Self <: RangesProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedConfirmButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needConfirmButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponents(value: Components): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withOkDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOkDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNowFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnNow(value: js.Function0[Unit] | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnNow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNowNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNow")(null)
        ret
    }
    @scala.inline
    def withOnOkFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOk")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnOk(value: js.Function0[Unit] | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOk")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOk")(null)
        ret
    }
    @scala.inline
    def withRangeList(value: RangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeList")(js.undefined)
        ret
    }
  }
  
}

