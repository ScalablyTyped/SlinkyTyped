package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashActionsPanel extends js.Object {
  def getClassForObject(): js.Any = js.native
  def getScriptAssistMode(): js.Any = js.native
  def getSelectedText(): js.Any = js.native
  def getText(): js.Any = js.native
  def hasSelection(): js.Any = js.native
  def replaceSelectedText(): js.Any = js.native
  def setScriptAssistMode(): js.Any = js.native
  def setSelection(): js.Any = js.native
  def setText(): js.Any = js.native
}

object FlashActionsPanel {
  @scala.inline
  def apply(
    getClassForObject: () => js.Any,
    getScriptAssistMode: () => js.Any,
    getSelectedText: () => js.Any,
    getText: () => js.Any,
    hasSelection: () => js.Any,
    replaceSelectedText: () => js.Any,
    setScriptAssistMode: () => js.Any,
    setSelection: () => js.Any,
    setText: () => js.Any
  ): FlashActionsPanel = {
    val __obj = js.Dynamic.literal(getClassForObject = js.Any.fromFunction0(getClassForObject), getScriptAssistMode = js.Any.fromFunction0(getScriptAssistMode), getSelectedText = js.Any.fromFunction0(getSelectedText), getText = js.Any.fromFunction0(getText), hasSelection = js.Any.fromFunction0(hasSelection), replaceSelectedText = js.Any.fromFunction0(replaceSelectedText), setScriptAssistMode = js.Any.fromFunction0(setScriptAssistMode), setSelection = js.Any.fromFunction0(setSelection), setText = js.Any.fromFunction0(setText))
    __obj.asInstanceOf[FlashActionsPanel]
  }
  @scala.inline
  implicit class FlashActionsPanelOps[Self <: FlashActionsPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetClassForObject(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClassForObject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScriptAssistMode(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptAssistMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedText(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetText(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasSelection(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReplaceSelectedText(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceSelectedText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetScriptAssistMode(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScriptAssistMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSelection(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetText(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

