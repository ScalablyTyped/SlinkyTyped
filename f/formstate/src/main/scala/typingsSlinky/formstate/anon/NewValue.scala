package typingsSlinky.formstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewValue[TValue] extends js.Object {
  var newValue: TValue = js.native
  var oldValue: TValue = js.native
}

object NewValue {
  @scala.inline
  def apply[TValue](newValue: TValue, oldValue: TValue): NewValue[TValue] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValue[TValue]]
  }
  @scala.inline
  implicit class NewValueOps[Self[tvalue] <: NewValue[tvalue], TValue] (val x: Self[TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TValue] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TValue] with Other]
    @scala.inline
    def withNewValue(value: TValue): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValue(value: TValue): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

