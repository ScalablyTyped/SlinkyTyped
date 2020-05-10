package typingsSlinky.blueprintjsDatetime.dateInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateInputState extends js.Object {
  var isInputFocused: Boolean = js.native
  var isOpen: Boolean = js.native
  var selectedShortcutIndex: js.UndefOr[Double] = js.native
  var value: js.Date = js.native
  var valueString: String = js.native
}

object IDateInputState {
  @scala.inline
  def apply(isInputFocused: Boolean, isOpen: Boolean, value: js.Date, valueString: String): IDateInputState = {
    val __obj = js.Dynamic.literal(isInputFocused = isInputFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueString = valueString.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateInputState]
  }
  @scala.inline
  implicit class IDateInputStateOps[Self <: IDateInputState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsInputFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInputFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedShortcutIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedShortcutIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedShortcutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedShortcutIndex")(js.undefined)
        ret
    }
  }
  
}

