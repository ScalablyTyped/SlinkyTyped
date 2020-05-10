package typingsSlinky.brace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyBinding extends js.Object {
  def addKeyboardHandler(kb: js.Any, pos: js.Any): Unit = js.native
  def getKeyboardHandler(): js.Any = js.native
  def onCommandKey(e: js.Any, hashId: js.Any, keyCode: js.Any): Unit = js.native
  def onTextInput(text: js.Any): Unit = js.native
  def removeKeyboardHandler(kb: js.Any): Boolean = js.native
  def setDefaultHandler(kb: js.Any): Unit = js.native
  def setKeyboardHandler(kb: js.Any): Unit = js.native
}

object KeyBinding {
  @scala.inline
  def apply(
    addKeyboardHandler: (js.Any, js.Any) => Unit,
    getKeyboardHandler: () => js.Any,
    onCommandKey: (js.Any, js.Any, js.Any) => Unit,
    onTextInput: js.Any => Unit,
    removeKeyboardHandler: js.Any => Boolean,
    setDefaultHandler: js.Any => Unit,
    setKeyboardHandler: js.Any => Unit
  ): KeyBinding = {
    val __obj = js.Dynamic.literal(addKeyboardHandler = js.Any.fromFunction2(addKeyboardHandler), getKeyboardHandler = js.Any.fromFunction0(getKeyboardHandler), onCommandKey = js.Any.fromFunction3(onCommandKey), onTextInput = js.Any.fromFunction1(onTextInput), removeKeyboardHandler = js.Any.fromFunction1(removeKeyboardHandler), setDefaultHandler = js.Any.fromFunction1(setDefaultHandler), setKeyboardHandler = js.Any.fromFunction1(setKeyboardHandler))
    __obj.asInstanceOf[KeyBinding]
  }
  @scala.inline
  implicit class KeyBindingOps[Self <: KeyBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddKeyboardHandler(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addKeyboardHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetKeyboardHandler(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeyboardHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnCommandKey(value: (js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCommandKey")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnTextInput(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTextInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveKeyboardHandler(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeKeyboardHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDefaultHandler(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetKeyboardHandler(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setKeyboardHandler")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

