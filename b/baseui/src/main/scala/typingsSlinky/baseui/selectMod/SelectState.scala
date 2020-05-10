package typingsSlinky.baseui.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectState extends js.Object {
  var activeDescendant: String | Null = js.native
  var inputValue: String = js.native
  var isFocused: Boolean = js.native
  var isOpen: Boolean = js.native
  var isPseudoFocused: Boolean = js.native
}

object SelectState {
  @scala.inline
  def apply(inputValue: String, isFocused: Boolean, isOpen: Boolean, isPseudoFocused: Boolean): SelectState = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isPseudoFocused = isPseudoFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectState]
  }
  @scala.inline
  implicit class SelectStateOps[Self <: SelectState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPseudoFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPseudoFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveDescendant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDescendant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveDescendantNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDescendant")(null)
        ret
    }
  }
  
}

