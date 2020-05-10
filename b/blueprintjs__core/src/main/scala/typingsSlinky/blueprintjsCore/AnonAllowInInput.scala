package typingsSlinky.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowInInput extends js.Object {
  var allowInInput: Boolean = js.native
  var disabled: Boolean = js.native
  var global: Boolean = js.native
  var preventDefault: Boolean = js.native
  var stopPropagation: Boolean = js.native
}

object AnonAllowInInput {
  @scala.inline
  def apply(
    allowInInput: Boolean,
    disabled: Boolean,
    global: Boolean,
    preventDefault: Boolean,
    stopPropagation: Boolean
  ): AnonAllowInInput = {
    val __obj = js.Dynamic.literal(allowInInput = allowInInput.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowInInput]
  }
  @scala.inline
  implicit class AnonAllowInInputOps[Self <: AnonAllowInInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowInInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopPropagation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

