package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorProviderObjectCombo extends js.Object {
  def createEditor(
    callbacks: js.Object,
    key: js.Object,
    editorOptions: js.Object,
    tabIndex: js.Object,
    format: js.Object,
    element: js.Object
  ): Unit = js.native
  def destroy(): Unit = js.native
  def getValue(): Unit = js.native
  def internalSelectionChanged(evt: js.Object, ui: js.Object): Unit = js.native
  def isValid(): Unit = js.native
  def keyDown(evt: js.Object, ui: js.Object): Unit = js.native
  def refreshValue(): Unit = js.native
  def removeFromParent(): Unit = js.native
  def selectionChanged(evt: js.Object, ui: js.Object): Unit = js.native
  def setFocus(): Unit = js.native
  def setSize(width: js.Object, height: js.Object): Unit = js.native
  def setValue(`val`: js.Object, fire: js.Object): Unit = js.native
  def validator(): Unit = js.native
}

object EditorProviderObjectCombo {
  @scala.inline
  def apply(
    createEditor: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Unit,
    destroy: () => Unit,
    getValue: () => Unit,
    internalSelectionChanged: (js.Object, js.Object) => Unit,
    isValid: () => Unit,
    keyDown: (js.Object, js.Object) => Unit,
    refreshValue: () => Unit,
    removeFromParent: () => Unit,
    selectionChanged: (js.Object, js.Object) => Unit,
    setFocus: () => Unit,
    setSize: (js.Object, js.Object) => Unit,
    setValue: (js.Object, js.Object) => Unit,
    validator: () => Unit
  ): EditorProviderObjectCombo = {
    val __obj = js.Dynamic.literal(createEditor = js.Any.fromFunction6(createEditor), destroy = js.Any.fromFunction0(destroy), getValue = js.Any.fromFunction0(getValue), internalSelectionChanged = js.Any.fromFunction2(internalSelectionChanged), isValid = js.Any.fromFunction0(isValid), keyDown = js.Any.fromFunction2(keyDown), refreshValue = js.Any.fromFunction0(refreshValue), removeFromParent = js.Any.fromFunction0(removeFromParent), selectionChanged = js.Any.fromFunction2(selectionChanged), setFocus = js.Any.fromFunction0(setFocus), setSize = js.Any.fromFunction2(setSize), setValue = js.Any.fromFunction2(setValue), validator = js.Any.fromFunction0(validator))
    __obj.asInstanceOf[EditorProviderObjectCombo]
  }
  @scala.inline
  implicit class EditorProviderObjectComboOps[Self <: EditorProviderObjectCombo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateEditor(value: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createEditor")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetValue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInternalSelectionChanged(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalSelectionChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsValid(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKeyDown(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRefreshValue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveFromParent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeFromParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectionChanged(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSize(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetValue(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withValidator(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

