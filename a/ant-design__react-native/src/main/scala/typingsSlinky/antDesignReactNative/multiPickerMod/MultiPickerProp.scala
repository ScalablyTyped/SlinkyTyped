package typingsSlinky.antDesignReactNative.multiPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPickerProp extends js.Object {
  var getValue: js.Function = js.native
}

object MultiPickerProp {
  @scala.inline
  def apply(getValue: js.Function): MultiPickerProp = {
    val __obj = js.Dynamic.literal(getValue = getValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPickerProp]
  }
  @scala.inline
  implicit class MultiPickerPropOps[Self <: MultiPickerProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetValue(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

