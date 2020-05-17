package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/radio/interface.RadioGroupState> */
@js.native
trait PartialRadioGroupState extends js.Object {
  var prevPropValue: js.UndefOr[js.Any] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object PartialRadioGroupState {
  @scala.inline
  def apply(): PartialRadioGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRadioGroupState]
  }
  @scala.inline
  implicit class PartialRadioGroupStateOps[Self <: PartialRadioGroupState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrevPropValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPropValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevPropValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPropValue")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

