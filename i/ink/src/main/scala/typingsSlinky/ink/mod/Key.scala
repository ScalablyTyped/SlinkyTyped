package typingsSlinky.ink.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
  var ctrl: Boolean = js.native
  var downArrow: Boolean = js.native
  var escape: Boolean = js.native
  var leftArrow: Boolean = js.native
  var meta: Boolean = js.native
  var `return`: Boolean = js.native
  var rightArrow: Boolean = js.native
  var shift: Boolean = js.native
  var upArrow: Boolean = js.native
}

object Key {
  @scala.inline
  def apply(
    ctrl: Boolean,
    downArrow: Boolean,
    escape: Boolean,
    leftArrow: Boolean,
    meta: Boolean,
    `return`: Boolean,
    rightArrow: Boolean,
    shift: Boolean,
    upArrow: Boolean
  ): Key = {
    val __obj = js.Dynamic.literal(ctrl = ctrl.asInstanceOf[js.Any], downArrow = downArrow.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], leftArrow = leftArrow.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], rightArrow = rightArrow.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any], upArrow = upArrow.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCtrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShift(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upArrow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

