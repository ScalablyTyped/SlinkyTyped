package typingsSlinky.rcPicker.getRangesMod

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
  def apply(
    locale: Locale,
    needConfirmButton: Boolean,
    prefixCls: String,
    components: Components = null,
    okDisabled: js.UndefOr[Boolean] = js.undefined,
    onNow: js.UndefOr[Null | js.Function0[Unit] | `false`] = js.undefined,
    onOk: js.UndefOr[Null | js.Function0[Unit] | `false`] = js.undefined,
    rangeList: RangeList = null
  ): RangesProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], needConfirmButton = needConfirmButton.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (!js.isUndefined(okDisabled)) __obj.updateDynamic("okDisabled")(okDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onNow)) __obj.updateDynamic("onNow")(onNow.asInstanceOf[js.Any])
    if (!js.isUndefined(onOk)) __obj.updateDynamic("onOk")(onOk.asInstanceOf[js.Any])
    if (rangeList != null) __obj.updateDynamic("rangeList")(rangeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangesProps]
  }
}

