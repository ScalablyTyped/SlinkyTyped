package typingsSlinky.rcPicker.getRangesMod

import typingsSlinky.rcPicker.anon.Label
import typingsSlinky.rcPicker.interfaceMod.Components
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.interfaceMod.RangeList
import typingsSlinky.rcPicker.rcPickerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangesProps extends js.Object {
  var components: js.UndefOr[Components] = js.undefined
  var locale: Locale
  var needConfirmButton: Boolean
  var okDisabled: js.UndefOr[Boolean] = js.undefined
  var onNow: js.UndefOr[Null | js.Function0[Unit] | `false`] = js.undefined
  var onOk: js.UndefOr[Null | js.Function0[Unit] | `false`] = js.undefined
  var prefixCls: String
  var rangeList: js.UndefOr[RangeList] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setNeedConfirmButton(value: Boolean): Self = this.set("needConfirmButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponents(value: Components): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    @scala.inline
    def setOkDisabled(value: Boolean): Self = this.set("okDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkDisabled: Self = this.set("okDisabled", js.undefined)
    @scala.inline
    def setOnNowFunction0(value: () => Unit): Self = this.set("onNow", js.Any.fromFunction0(value))
    @scala.inline
    def setOnNow(value: js.Function0[Unit] | `false`): Self = this.set("onNow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnNow: Self = this.set("onNow", js.undefined)
    @scala.inline
    def setOnNowNull: Self = this.set("onNow", null)
    @scala.inline
    def setOnOkFunction0(value: () => Unit): Self = this.set("onOk", js.Any.fromFunction0(value))
    @scala.inline
    def setOnOk(value: js.Function0[Unit] | `false`): Self = this.set("onOk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOk: Self = this.set("onOk", js.undefined)
    @scala.inline
    def setOnOkNull: Self = this.set("onOk", null)
    @scala.inline
    def setRangeListVarargs(value: Label*): Self = this.set("rangeList", js.Array(value :_*))
    @scala.inline
    def setRangeList(value: RangeList): Self = this.set("rangeList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeList: Self = this.set("rangeList", js.undefined)
  }
  
}

