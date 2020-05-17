package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerPickerPrefixCls extends js.Object {
  var prefixCls: String = js.native
  var timePickerPickerPrefixCls: String = js.native
  var timePickerPrefixCls: String = js.native
}

object TimePickerPickerPrefixCls {
  @scala.inline
  def apply(prefixCls: String, timePickerPickerPrefixCls: String, timePickerPrefixCls: String): TimePickerPickerPrefixCls = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], timePickerPickerPrefixCls = timePickerPickerPrefixCls.asInstanceOf[js.Any], timePickerPrefixCls = timePickerPrefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerPickerPrefixCls]
  }
  @scala.inline
  implicit class TimePickerPickerPrefixClsOps[Self <: TimePickerPickerPrefixCls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimePickerPickerPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerPickerPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimePickerPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

