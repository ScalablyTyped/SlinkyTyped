package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/radio/interface.RadioGroupState> */
trait PartialRadioGroupState extends js.Object {
  var prevPropValue: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrevPropValue(value: js.Any): Self = this.set("prevPropValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevPropValue: Self = this.set("prevPropValue", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

