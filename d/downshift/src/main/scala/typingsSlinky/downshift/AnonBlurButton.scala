package typingsSlinky.downshift

import typingsSlinky.downshift.mod.StateChangeTypes.blurButton
import typingsSlinky.downshift.mod.StateChangeTypes.blurInput
import typingsSlinky.downshift.mod.StateChangeTypes.changeInput
import typingsSlinky.downshift.mod.StateChangeTypes.clickButton
import typingsSlinky.downshift.mod.StateChangeTypes.clickItem
import typingsSlinky.downshift.mod.StateChangeTypes.controlledPropUpdatedSelectedItem
import typingsSlinky.downshift.mod.StateChangeTypes.itemMouseEnter
import typingsSlinky.downshift.mod.StateChangeTypes.keyDownArrowDown
import typingsSlinky.downshift.mod.StateChangeTypes.keyDownArrowUp
import typingsSlinky.downshift.mod.StateChangeTypes.keyDownEnter
import typingsSlinky.downshift.mod.StateChangeTypes.keyDownEscape
import typingsSlinky.downshift.mod.StateChangeTypes.keyDownSpaceButton
import typingsSlinky.downshift.mod.StateChangeTypes.mouseUp
import typingsSlinky.downshift.mod.StateChangeTypes.touchEnd
import typingsSlinky.downshift.mod.StateChangeTypes.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlurButton extends js.Object {
  var blurButton: typingsSlinky.downshift.mod.StateChangeTypes.blurButton = js.native
  var blurInput: typingsSlinky.downshift.mod.StateChangeTypes.blurInput = js.native
  var changeInput: typingsSlinky.downshift.mod.StateChangeTypes.changeInput = js.native
  var clickButton: typingsSlinky.downshift.mod.StateChangeTypes.clickButton = js.native
  var clickItem: typingsSlinky.downshift.mod.StateChangeTypes.clickItem = js.native
  var controlledPropUpdatedSelectedItem: typingsSlinky.downshift.mod.StateChangeTypes.controlledPropUpdatedSelectedItem = js.native
  var itemMouseEnter: typingsSlinky.downshift.mod.StateChangeTypes.itemMouseEnter = js.native
  var keyDownArrowDown: typingsSlinky.downshift.mod.StateChangeTypes.keyDownArrowDown = js.native
  var keyDownArrowUp: typingsSlinky.downshift.mod.StateChangeTypes.keyDownArrowUp = js.native
  var keyDownEnter: typingsSlinky.downshift.mod.StateChangeTypes.keyDownEnter = js.native
  var keyDownEscape: typingsSlinky.downshift.mod.StateChangeTypes.keyDownEscape = js.native
  var keyDownSpaceButton: typingsSlinky.downshift.mod.StateChangeTypes.keyDownSpaceButton = js.native
  var mouseUp: typingsSlinky.downshift.mod.StateChangeTypes.mouseUp = js.native
  var touchEnd: typingsSlinky.downshift.mod.StateChangeTypes.touchEnd = js.native
  var unknown: typingsSlinky.downshift.mod.StateChangeTypes.unknown = js.native
}

object AnonBlurButton {
  @scala.inline
  def apply(
    blurButton: blurButton,
    blurInput: blurInput,
    changeInput: changeInput,
    clickButton: clickButton,
    clickItem: clickItem,
    controlledPropUpdatedSelectedItem: controlledPropUpdatedSelectedItem,
    itemMouseEnter: itemMouseEnter,
    keyDownArrowDown: keyDownArrowDown,
    keyDownArrowUp: keyDownArrowUp,
    keyDownEnter: keyDownEnter,
    keyDownEscape: keyDownEscape,
    keyDownSpaceButton: keyDownSpaceButton,
    mouseUp: mouseUp,
    touchEnd: touchEnd,
    unknown: unknown
  ): AnonBlurButton = {
    val __obj = js.Dynamic.literal(blurButton = blurButton.asInstanceOf[js.Any], blurInput = blurInput.asInstanceOf[js.Any], changeInput = changeInput.asInstanceOf[js.Any], clickButton = clickButton.asInstanceOf[js.Any], clickItem = clickItem.asInstanceOf[js.Any], controlledPropUpdatedSelectedItem = controlledPropUpdatedSelectedItem.asInstanceOf[js.Any], itemMouseEnter = itemMouseEnter.asInstanceOf[js.Any], keyDownArrowDown = keyDownArrowDown.asInstanceOf[js.Any], keyDownArrowUp = keyDownArrowUp.asInstanceOf[js.Any], keyDownEnter = keyDownEnter.asInstanceOf[js.Any], keyDownEscape = keyDownEscape.asInstanceOf[js.Any], keyDownSpaceButton = keyDownSpaceButton.asInstanceOf[js.Any], mouseUp = mouseUp.asInstanceOf[js.Any], touchEnd = touchEnd.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlurButton]
  }
  @scala.inline
  implicit class AnonBlurButtonOps[Self <: AnonBlurButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlurButton(value: blurButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlurInput(value: blurInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeInput(value: changeInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClickButton(value: clickButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClickItem(value: clickItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlledPropUpdatedSelectedItem(value: controlledPropUpdatedSelectedItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlledPropUpdatedSelectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemMouseEnter(value: itemMouseEnter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMouseEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyDownArrowDown(value: keyDownArrowDown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDownArrowDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyDownArrowUp(value: keyDownArrowUp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDownArrowUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyDownEnter(value: keyDownEnter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDownEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyDownEscape(value: keyDownEscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDownEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyDownSpaceButton(value: keyDownSpaceButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDownSpaceButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseUp(value: mouseUp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchEnd(value: touchEnd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: unknown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

