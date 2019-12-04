package typingsSlinky.antd

import typingsSlinky.antd.libDateDashPickerInterfaceMod.RangePickerValue
import typingsSlinky.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShowDate extends js.Object {
  var showDate: js.UndefOr[
    js.Array[js.UndefOr[Moment]] | (js.Tuple2[js.UndefOr[Moment], js.UndefOr[Moment]])
  ] = js.undefined
  var value: RangePickerValue
}

object Anon_ShowDate {
  @scala.inline
  def apply(
    value: RangePickerValue,
    showDate: js.Array[js.UndefOr[Moment]] | (js.Tuple2[js.UndefOr[Moment], js.UndefOr[Moment]]) = null
  ): Anon_ShowDate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (showDate != null) __obj.updateDynamic("showDate")(showDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ShowDate]
  }
}

