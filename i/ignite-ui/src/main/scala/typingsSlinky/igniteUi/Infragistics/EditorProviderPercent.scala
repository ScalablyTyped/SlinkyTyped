package typingsSlinky.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorProviderPercent extends js.Object {
  def createEditor(
    callbacks: js.Object,
    key: js.Object,
    editorOptions: js.Object,
    tabIndex: js.Object,
    format: js.Object,
    element: js.Object
  ): Unit = js.native
  def destroy(): Unit = js.native
  def isValid(): Unit = js.native
  def refreshValue(): Unit = js.native
  def removeFromParent(): Unit = js.native
  def setFocus(): Unit = js.native
  def setSize(width: js.Object, height: js.Object): Unit = js.native
  def textChanged(evt: js.Object, ui: js.Object): Unit = js.native
  def validator(): Unit = js.native
}

object EditorProviderPercent {
  @scala.inline
  def apply(
    createEditor: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Unit,
    destroy: () => Unit,
    isValid: () => Unit,
    refreshValue: () => Unit,
    removeFromParent: () => Unit,
    setFocus: () => Unit,
    setSize: (js.Object, js.Object) => Unit,
    textChanged: (js.Object, js.Object) => Unit,
    validator: () => Unit
  ): EditorProviderPercent = {
    val __obj = js.Dynamic.literal(createEditor = js.Any.fromFunction6(createEditor), destroy = js.Any.fromFunction0(destroy), isValid = js.Any.fromFunction0(isValid), refreshValue = js.Any.fromFunction0(refreshValue), removeFromParent = js.Any.fromFunction0(removeFromParent), setFocus = js.Any.fromFunction0(setFocus), setSize = js.Any.fromFunction2(setSize), textChanged = js.Any.fromFunction2(textChanged), validator = js.Any.fromFunction0(validator))
    __obj.asInstanceOf[EditorProviderPercent]
  }
  @scala.inline
  implicit class EditorProviderPercentOps[Self <: EditorProviderPercent] (val x: Self) extends AnyVal {
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
    def withIsValid(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction0(value))
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
    def withTextChanged(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textChanged")(js.Any.fromFunction2(value))
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

