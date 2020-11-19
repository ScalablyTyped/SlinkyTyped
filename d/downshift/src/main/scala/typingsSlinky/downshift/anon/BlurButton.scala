package typingsSlinky.downshift.anon

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlurButton extends js.Object {
  
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
object BlurButton {
  
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
  ): BlurButton = {
    val __obj = js.Dynamic.literal(blurButton = blurButton.asInstanceOf[js.Any], blurInput = blurInput.asInstanceOf[js.Any], changeInput = changeInput.asInstanceOf[js.Any], clickButton = clickButton.asInstanceOf[js.Any], clickItem = clickItem.asInstanceOf[js.Any], controlledPropUpdatedSelectedItem = controlledPropUpdatedSelectedItem.asInstanceOf[js.Any], itemMouseEnter = itemMouseEnter.asInstanceOf[js.Any], keyDownArrowDown = keyDownArrowDown.asInstanceOf[js.Any], keyDownArrowUp = keyDownArrowUp.asInstanceOf[js.Any], keyDownEnter = keyDownEnter.asInstanceOf[js.Any], keyDownEscape = keyDownEscape.asInstanceOf[js.Any], keyDownSpaceButton = keyDownSpaceButton.asInstanceOf[js.Any], mouseUp = mouseUp.asInstanceOf[js.Any], touchEnd = touchEnd.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurButton]
  }
  
  @scala.inline
  implicit class BlurButtonOps[Self <: BlurButton] (val x: Self) extends AnyVal {
    
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
    def setBlurButton(value: blurButton): Self = this.set("blurButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurInput(value: blurInput): Self = this.set("blurInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeInput(value: changeInput): Self = this.set("changeInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickButton(value: clickButton): Self = this.set("clickButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickItem(value: clickItem): Self = this.set("clickItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlledPropUpdatedSelectedItem(value: controlledPropUpdatedSelectedItem): Self = this.set("controlledPropUpdatedSelectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemMouseEnter(value: itemMouseEnter): Self = this.set("itemMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyDownArrowDown(value: keyDownArrowDown): Self = this.set("keyDownArrowDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyDownArrowUp(value: keyDownArrowUp): Self = this.set("keyDownArrowUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyDownEnter(value: keyDownEnter): Self = this.set("keyDownEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyDownEscape(value: keyDownEscape): Self = this.set("keyDownEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyDownSpaceButton(value: keyDownSpaceButton): Self = this.set("keyDownSpaceButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseUp(value: mouseUp): Self = this.set("mouseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchEnd(value: touchEnd): Self = this.set("touchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown(value: unknown): Self = this.set("unknown", value.asInstanceOf[js.Any])
  }
}
