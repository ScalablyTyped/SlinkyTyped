package typingsSlinky.ckeditor.CKEDITOR.ui.dialog

import typingsSlinky.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait uiElement extends js.Object {
  var eventProcessors: js.Any = js.native
  def accessKeyDown(dialog: typingsSlinky.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
  def accessKeyUp(dialog: typingsSlinky.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def focus(): js.UndefOr[uiElement] = js.native
  def getDialog(): typingsSlinky.ckeditor.CKEDITOR.dialog = js.native
  def getElement(): element = js.native
  def getInputElement(): element = js.native
  def getValue(): js.Any = js.native
  def isChanged(): Boolean = js.native
  def isEnabled(): Boolean = js.native
  def isFocusable(): Boolean = js.native
  def isVisible(): Boolean = js.native
  def registerEvents(definition: typingsSlinky.ckeditor.CKEDITOR.dialog.definition.uiElement): uiElement = js.native
  def selectParentTab(): uiElement = js.native
  def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[uiElement] = js.native
}

object uiElement {
  @scala.inline
  def apply(
    accessKeyDown: (typingsSlinky.ckeditor.CKEDITOR.dialog, String) => Unit,
    accessKeyUp: (typingsSlinky.ckeditor.CKEDITOR.dialog, String) => Unit,
    disable: () => Unit,
    enable: () => Unit,
    eventProcessors: js.Any,
    focus: () => js.UndefOr[uiElement],
    getDialog: () => typingsSlinky.ckeditor.CKEDITOR.dialog,
    getElement: () => element,
    getInputElement: () => element,
    getValue: () => js.Any,
    isChanged: () => Boolean,
    isEnabled: () => Boolean,
    isFocusable: () => Boolean,
    isVisible: () => Boolean,
    registerEvents: typingsSlinky.ckeditor.CKEDITOR.dialog.definition.uiElement => uiElement,
    selectParentTab: () => uiElement,
    setValue: (js.Any, Boolean) => js.UndefOr[uiElement]
  ): uiElement = {
    val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2(accessKeyDown), accessKeyUp = js.Any.fromFunction2(accessKeyUp), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getDialog = js.Any.fromFunction0(getDialog), getElement = js.Any.fromFunction0(getElement), getInputElement = js.Any.fromFunction0(getInputElement), getValue = js.Any.fromFunction0(getValue), isChanged = js.Any.fromFunction0(isChanged), isEnabled = js.Any.fromFunction0(isEnabled), isFocusable = js.Any.fromFunction0(isFocusable), isVisible = js.Any.fromFunction0(isVisible), registerEvents = js.Any.fromFunction1(registerEvents), selectParentTab = js.Any.fromFunction0(selectParentTab), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[uiElement]
  }
  @scala.inline
  implicit class uiElementOps[Self <: uiElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKeyDown(value: (typingsSlinky.ckeditor.CKEDITOR.dialog, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKeyDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAccessKeyUp(value: (typingsSlinky.ckeditor.CKEDITOR.dialog, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKeyUp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEventProcessors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventProcessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocus(value: () => js.UndefOr[uiElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDialog(value: () => typingsSlinky.ckeditor.CKEDITOR.dialog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDialog")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetElement(value: () => element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInputElement(value: () => element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsChanged(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFocusable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocusable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterEvents(value: typingsSlinky.ckeditor.CKEDITOR.dialog.definition.uiElement => uiElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectParentTab(value: () => uiElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectParentTab")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetValue(value: (js.Any, Boolean) => js.UndefOr[uiElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

